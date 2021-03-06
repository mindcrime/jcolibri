package jcolibri.gui;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import jcolibri.cbrcore.CBRContext;
import jcolibri.cbrcore.CBRCore;
import jcolibri.cbrcore.CBRMethod;
import jcolibri.cbrcore.CBRState;
import jcolibri.cbrcore.CBRTask;
import jcolibri.cbrcore.CBRTaskNode;
import jcolibri.cbrcore.MethodType;
import jcolibri.cbrcore.event.StateChangeEvent;
import jcolibri.cbrcore.event.StateChangeListener;
import jcolibri.gui.model.TaskTreeNode;
import jcolibri.util.CBRLogger;
import jcolibri.util.ImagesContainer;

/**
 * 
 * @author Juan Jos� Bello
 */
public class CBRConfigurationFrame extends javax.swing.JInternalFrame {
	private static final long serialVersionUID = 1L;

	private CBRState cbrstate;

	private CBRCore core;

	private CBRArmGUI parent;

	/** Creates new form CBRConfigurationFrame */
	public CBRConfigurationFrame() {
		initComponents();

	}

	/** Creates new form CBRConfigurationFrame */
	public CBRConfigurationFrame(CBRCore core, CBRArmGUI _parent) {
		this();
		this.core = core;
		cbrstate = core.getCBRState();
		parent = _parent;
		myInitComponents();
	}

	public void doDefaultCloseAction() {
		if (parent.CloseAppFrame())
			super.doDefaultCloseAction();
	}

	/**
	 * This method is called from within the constructor and after
	 * initComponents method to initialize the form.
	 */
	private void myInitComponents() {
		// Tree configuration
		MouseListener ml = new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int selRow = configurationTree.getRowForLocation(e.getX(), e
						.getY());
				TreePath selPath = configurationTree.getPathForLocation(e
						.getX(), e.getY());
				if (selRow != -1) {
					if (e.getClickCount() == 2) {
						doubleClickOnTreeNode(selPath);
					}
				}
			}
		};
		configurationTree.addMouseListener(ml);
		configurationTree.setShowsRootHandles(true);
		TaskTreeNode mainNode = new TaskTreeNode(cbrstate.getRootTask());
		// DefaultTreeModel model = new DefaultTreeModel(mainNode);
		// mainNode.register(cbrstate,model);
		MyTreeModel model = new MyTreeModel(mainNode, cbrstate);
		configurationTree.setModel(model);
		configurationTree
				.setCellRenderer(new CBRConfigurationFrame.MyRenderer());
		ToolTipManager.sharedInstance().registerComponent(configurationTree);
		// End tree initialization
		this.setTitle("CBR - " + core.getName());
	}

	private void doubleClickOnTreeNode(TreePath selPath) {
		Object node = selPath.getLastPathComponent();
		jcolibri.gui.model.TaskTreeNode taskNode = (jcolibri.gui.model.TaskTreeNode) node;

		ViewEditTaskFrame taskFrame = new ViewEditTaskFrame(taskNode
				.getCBRTaskNode().getTask(), core);
		configDesktopPane.add(taskFrame);
		taskFrame.show();
		try {
			taskFrame.setMaximum(true);
		} catch (java.beans.PropertyVetoException pve) {
			pve.printStackTrace();
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {// GEN-BEGIN:initComponents
		mainSplitPane = new javax.swing.JSplitPane();
		mainSplitPane.setDividerLocation(250);
		treeScrollPane = new javax.swing.JScrollPane();
		configurationTree = new javax.swing.JTree();
		configDesktopPane = new javax.swing.JDesktopPane();
		toolbar = new javax.swing.JToolBar();
		partialExecButton = new javax.swing.JButton();

        setFrameIcon(ImagesContainer.CBRSYSTEM);
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setResizable(true);
		setTitle("CBR");
		mainSplitPane.setDividerSize(5);
		treeScrollPane.setViewportView(configurationTree);

		mainSplitPane.setLeftComponent(treeScrollPane);

		mainSplitPane.setRightComponent(configDesktopPane);

		getContentPane().add(mainSplitPane, java.awt.BorderLayout.CENTER);

		toolbar.setFloatable(false);
		toolbar.setRollover(true);
		partialExecButton.setIcon(ImagesContainer.PARTIAL_EXEC);
		partialExecButton.setToolTipText("Solve to...");
		partialExecButton.setEnabled(true);
		partialExecButton.setPreferredSize(new java.awt.Dimension(20, 20));
		partialExecButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						partialExecButtonActionPerformed(evt);
					}
				});

		toolbar.add(partialExecButton);

		getContentPane().add(toolbar, java.awt.BorderLayout.NORTH);

		pack();
	}// GEN-END:initComponents

	private void partialExecButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_partialExecButtonActionPerformed
		TreePath[] paths = configurationTree.getSelectionPaths();
		CBRTask[] tasks = new CBRTask[paths.length];
		for (int i = 0; i < paths.length; i++) {
			tasks[i] = ((TaskTreeNode) paths[i].getLastPathComponent())
					.getCBRTaskNode().getTask();
		}

		TextAreaFrame textFrame = new TextAreaFrame();

		try {
			CBRLogger.addListener(textFrame);
			configDesktopPane.add(textFrame);
			textFrame.show();
			textFrame.setMaximum(true);

		} catch (Exception e) {
			CBRLogger.log(this.getClass(), CBRLogger.ERROR, e.getMessage());
		}

		String result;
		CBRContext context = null;
		try {
			core.executeTasks(tasks);
			context = core.getContext();
			result = context.toString();

		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}

		textFrame.getTextArea().append("\n" + result);
		CBRLogger.removeListener(textFrame);

	}// GEN-LAST:event_partialExecButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JDesktopPane configDesktopPane;

	private javax.swing.JTree configurationTree;

	private javax.swing.JSplitPane mainSplitPane;

	private javax.swing.JButton partialExecButton;

	private javax.swing.JToolBar toolbar;

	private javax.swing.JScrollPane treeScrollPane;

	// End of variables declaration//GEN-END:variables

	class MyTreeModel extends DefaultTreeModel implements StateChangeListener {
		private static final long serialVersionUID = 1L;

		public MyTreeModel(TreeNode node, CBRState state) {
			super(node);
			state.addStateChangeListener(this);
		}

		public void stateChanged(final StateChangeEvent event) {
			// mega chapuza
			final TaskTreeNode node = (TaskTreeNode) TaskTreeNode.childrenMap
					.get((CBRTaskNode) event.getSource());

			nodeStructureChanged(node);

		}
	}

	class MyRenderer extends DefaultTreeCellRenderer {
		private static final long serialVersionUID = 1L;

		ImageIcon taskExecIcon = new ImageIcon(getClass().getResource(
				"/jcolibri/resources/task_exec.gif"));

		ImageIcon taskDecomDep = new ImageIcon(getClass().getResource(
				"/jcolibri/resources/task_decom_deploy.gif"));

		ImageIcon taskDecomUndep = new ImageIcon(getClass().getResource(
				"/jcolibri/resources/task_decom_undeploy.gif"));

		public MyRenderer() {
		}

		public Component getTreeCellRendererComponent(JTree tree, Object value,
				boolean sel, boolean expanded, boolean leaf, int row,
				boolean hasFocus) {

			super.getTreeCellRendererComponent(tree, value, sel, expanded,
					leaf, row, hasFocus);

			CBRTask task = ((TaskTreeNode) value).getCBRTaskNode().getTask();
			if (task.getMethodInstance() != null) {
				CBRMethod method = task.getMethodInstance();
				if (method.getMethodType().equals(MethodType.DECOMPOSITION)) {
					setIcon(taskDecomDep);
					setToolTipText("Descomposed task");
				} else {
					setIcon(taskExecIcon);
					setToolTipText("Task ready to be solved");
				}
			} else {
				setIcon(taskDecomUndep);
				setToolTipText("Task not yet associated to a method");
			}

			return this;
		}
	}
}
