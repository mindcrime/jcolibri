//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.09.17 at 10:12:57 CEST 
//

package jcolibri.xml.tasks.impl;

public class TasksImpl extends jcolibri.xml.tasks.impl.TasksTypeImpl implements
		jcolibri.xml.tasks.Tasks, com.sun.xml.bind.RIElement,
		com.sun.xml.bind.unmarshaller.UnmarshallableObject,
		com.sun.xml.bind.serializer.XMLSerializable,
		com.sun.xml.bind.validator.ValidatableObject {

	private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer
			.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0002\u00db\\\\pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0002\u00db\\Qppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0002\u00db\\Fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0007\u0002\u00db\\Cq\u0000~\u0000\u000epsq\u0000~\u0000\u0000\u0001m\u00ae&q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0000\u0001m\u00ae\u001bpp\u0000sq\u0000~\u0000\u0007\u0001m\u00ae\u0010ppsq\u0000~\u0000\n\u0001m\u00ae\u0005q\u0000~\u0000\u000epsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0001m\u00ae\u0002q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\r\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u0018psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000\u0019cbrarm.xml.tasks.TaskTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001et\u0000\u0004Taskt\u0000\u0000sq\u0000~\u0000\u0000\u0001m\u00ae\u001bq\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007\u0001m\u00ae\u0010ppsq\u0000~\u0000\n\u0001m\u00ae\u0005q\u0000~\u0000\u000epsq\u0000~\u0000\u0014\u0001m\u00ae\u0002q\u0000~\u0000\u000epq\u0000~\u0000\u0017q\u0000~\u0000\u001bq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0015cbrarm.xml.tasks.Taskq\u0000~\u0000\"q\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0005Tasksq\u0000~\u0000%sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000/[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0007\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0013q\u0000~\u0000(pppppppppq\u0000~\u0000\u0012q\u0000~\u0000\'pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u000fppq\u0000~\u0000\fppppppppppq\u0000~\u0000\tppppppppppppppppppppppppppppppppppppppppppppp");

	public java.lang.String ____jaxb_ri____getNamespaceURI() {
		return "";
	}

	public java.lang.String ____jaxb_ri____getLocalName() {
		return "Tasks";
	}

	private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
		return jcolibri.xml.tasks.Tasks.class;
	}

	public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(
			com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
		return new jcolibri.xml.tasks.impl.TasksImpl.Unmarshaller(context);
	}

	public java.lang.Class getPrimaryInterfaceClass() {
		return PRIMARY_INTERFACE_CLASS();
	}

	public void serializeElements(
			com.sun.xml.bind.serializer.XMLSerializer context)
			throws org.xml.sax.SAXException {
		context.startElement("", "Tasks");
		super.serializeAttributes(context);
		context.endAttributes();
		super.serializeElements(context);
		context.endElement();
	}

	public void serializeAttributes(
			com.sun.xml.bind.serializer.XMLSerializer context)
			throws org.xml.sax.SAXException {
	}

	public void serializeAttributeBodies(
			com.sun.xml.bind.serializer.XMLSerializer context)
			throws org.xml.sax.SAXException {
	}

	public java.lang.Class getPrimaryInterface() {
		return (jcolibri.xml.tasks.Tasks.class);
	}

	public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
		return new com.sun.msv.verifier.regexp.REDocumentDeclaration(
				schemaFragment);
	}

	public class Unmarshaller extends
			com.sun.xml.bind.unmarshaller.ContentHandlerEx {

		public Unmarshaller(
				com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
			super(context, "----");
		}

		protected com.sun.xml.bind.unmarshaller.UnmarshallableObject owner() {
			return jcolibri.xml.tasks.impl.TasksImpl.this;
		}

		public void enterElement(java.lang.String ___uri,
				java.lang.String ___local, org.xml.sax.Attributes __atts)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (state) {
			case 3:
				revertToParentFromEnterElement(___uri, ___local, __atts);
				return;
			case 0:
				if (("" == ___uri) && ("Tasks" == ___local)) {
					context.pushAttributes(__atts);
					state = 1;
					return;
				}
				break;
			case 1:
				if (("" == ___uri) && ("Task" == ___local)) {
					spawnSuperClassFromEnterElement(
							(((jcolibri.xml.tasks.impl.TasksTypeImpl) jcolibri.xml.tasks.impl.TasksImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local, __atts);
					return;
				}
				break;
			}
			super.enterElement(___uri, ___local, __atts);
		}

		public void leaveElement(java.lang.String ___uri,
				java.lang.String ___local)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (state) {
			case 3:
				revertToParentFromLeaveElement(___uri, ___local);
				return;
			case 2:
				if (("" == ___uri) && ("Tasks" == ___local)) {
					context.popAttributes();
					state = 3;
					return;
				}
				break;
			case 1:
				if (("" == ___uri) && ("Tasks" == ___local)) {
					spawnSuperClassFromLeaveElement(
							(((jcolibri.xml.tasks.impl.TasksTypeImpl) jcolibri.xml.tasks.impl.TasksImpl.this).new Unmarshaller(
									context)), 2, ___uri, ___local);
					return;
				}
				break;
			}
			super.leaveElement(___uri, ___local);
		}

		public void enterAttribute(java.lang.String ___uri,
				java.lang.String ___local)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (state) {
			case 3:
				revertToParentFromEnterAttribute(___uri, ___local);
				return;
			}
			super.enterAttribute(___uri, ___local);
		}

		public void leaveAttribute(java.lang.String ___uri,
				java.lang.String ___local)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (state) {
			case 3:
				revertToParentFromLeaveAttribute(___uri, ___local);
				return;
			}
			super.leaveAttribute(___uri, ___local);
		}

		public void text(java.lang.String value)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			try {
				switch (state) {
				case 3:
					revertToParentFromText(value);
					return;
				}
			} catch (java.lang.RuntimeException e) {
				handleUnexpectedTextException(value, e);
			}
		}

		public void leaveChild(int nextState)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (nextState) {
			case 2:
				state = 2;
				return;
			}
			super.leaveChild(nextState);
		}

	}

}
