package jcolibri.evaluation.util;

import java.io.IOException;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Clase encargada de cargar una configuraci�n sobre la GUI, que es un editor de
 * las configuraciones.
 */
public class LoadFromXML {

	private static HashMap<String,String> parameters = new HashMap<String,String>();

	private static String ident;

	private static String evaluatorClassName;

	private static String cycleEvaluatorClassName;


	/**
	 * La carga de la configuraci�n se hace a trav�s de un documento XML, que no
	 * es mas que un tipo de representaci�n en forma de �rbol. Vamos accediendo
	 * a los nodos del �rbol cuyas hojas contendr�n toda la info necesaria para
	 * cargar la configuraci�n. Como resultado tendremos almacenado el
	 * identificador, el EvaluatorClass y los par�metros de configuraci�n
	 * 
	 * Para ello creamos primero el parser que nos permite acceder al documento
	 * en forma de �rbol. d�nde la ra�z del mismo es el elemento Document, y sus
	 * nodos son del tipo Node
	 */
	public static void load(String archivo) {
		if (archivo != null) {
			try {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document document = db.parse(archivo);

				// leemos el DOM
				Node evaluation = document.getElementsByTagName(SaveToXML.JCOLIBRI_EVALUATION).item(0);
                
				NodeList list = evaluation.getChildNodes();
				for (int i = 0; i < list.getLength(); i++) {
					Node hijo = list.item(i);
					if (hijo.getNodeName().equals(SaveToXML.ID)) {
						// Tenemos el identificador (nombre) del Evaluador
						ident = hijo.getFirstChild().getNodeValue();
					} else if (hijo.getNodeName().equals(SaveToXML.EVALUATOR_CLASS)) {
						evaluatorClassName = hijo.getFirstChild().getNodeValue();
					}else if (hijo.getNodeName().equals(SaveToXML.CYCLE_EVALUATOR_CLASS)) {
					    cycleEvaluatorClassName = hijo.getFirstChild().getNodeValue();
                    }else if (hijo.getNodeName().equals(SaveToXML.PARAMETERS)) {
                        loadParameters(hijo);
                    }
				}
				

			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null,
						"No se puede cargar el fichero seleccionado" + '\n'
								+ ex);
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null,
						"No se puede cargar el fichero seleccionado" + '\n'
								+ ex);
			}
		}
	}


	// ------------------------------------------------------------------------------
	/**
	 * M�todo encargado de cargar los par�metros de configuraci�n del Evaluador.
	 * 
	 * @param parametros,
	 *            es de tipo Node, es un nodo del �rbol que representa el
	 *            fichero XML, cuyos hijos son los par�metros.
	 */
	private static void loadParameters(org.w3c.dom.Node parametros) {
		// Accedo a la lista de par�metros
		NodeList listaParams = parametros.getChildNodes();
		int numParams = listaParams.getLength();
		for (int i = 0; i < numParams; i++) {
			Node parametro = listaParams.item(i);
			if (parametro.getNodeName().equals(SaveToXML.PARAMETER)) {
			    String paramName = "";
                String paramValue = "";
                NodeList plist = parametro.getChildNodes();
                for(int j = 0; j<plist.getLength(); j++)
                {
                    Node p = plist.item(j);
                    if (p.getNodeName().equals(SaveToXML.PARAMETER_NAME)) 
                        paramName = p.getFirstChild().getNodeValue();
                    else if(p.getNodeName().equals(SaveToXML.PARAMETER_VALUE))
                        paramValue = p.getFirstChild().getNodeValue();
                }
                parameters.put(paramName,paramValue);
			}
		}
	}

	// ------------------------------------------------------------------------------
	public static HashMap<String, String> getParametros() {
		return parameters;
	}

	// ------------------------------------------------------------------------------
	public static String getIdEvaluator() {
		return ident;
	}
	// ------------------------------------------------------------------------------
	/*
	 * public Vector getNombreParametros() { return nombreParams; }
	 */
	// ------------------------------------------------------------------------------
	public static String getEvaluatorClassName() {
		return evaluatorClassName;
	}

	// ------------------------------------------------------------------------------
	public static String getCycleEvaluatorClassName() {
		return cycleEvaluatorClassName;
	}


}