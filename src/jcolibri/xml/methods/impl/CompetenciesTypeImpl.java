//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.27 at 10:46:52 CEST 
//

package jcolibri.xml.methods.impl;

public class CompetenciesTypeImpl implements
		jcolibri.xml.methods.CompetenciesType,
		com.sun.xml.bind.unmarshaller.UnmarshallableObject,
		com.sun.xml.bind.serializer.XMLSerializable,
		com.sun.xml.bind.validator.ValidatableObject {

	protected com.sun.xml.bind.util.ListImpl _Competence = new com.sun.xml.bind.util.ListImpl(
			new java.util.ArrayList());

	private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer
			.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0001\u00bf\u00c5\u001appsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0001\u00bf\u00c5\u0017pp\u0000sr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u00bf\u00c5\fppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0012L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u0000.com.sun.msv.datatype.xsd.WhiteSpaceProcessor$1\u0013JMoI\u00db\u00a4G\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0012L\u0000\fnamespaceURIq\u0000~\u0000\u0012xpq\u0000~\u0000\u0016q\u0000~\u0000\u0015sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0012L\u0000\fnamespaceURIq\u0000~\u0000\u0012xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\nCompetencet\u0000\u0000sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000$[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0001\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpq\u0000~\u0000\u0005ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp");

	private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
		return jcolibri.xml.methods.CompetenciesType.class;
	}

	public java.util.List getCompetence() {
		return _Competence;
	}

	public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(
			com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
		return new jcolibri.xml.methods.impl.CompetenciesTypeImpl.Unmarshaller(
				context);
	}

	public java.lang.Class getPrimaryInterfaceClass() {
		return PRIMARY_INTERFACE_CLASS();
	}

	public void serializeElements(
			com.sun.xml.bind.serializer.XMLSerializer context)
			throws org.xml.sax.SAXException {
		int idx1 = 0;
		final int len1 = _Competence.size();
		while (idx1 != len1) {
			context.startElement("", "Competence");
			int idx_0 = idx1;
			try {
				idx_0 += 1;
			} catch (java.lang.Exception e) {
				com.sun.xml.bind.marshaller.Util
						.handlePrintConversionException(this, e, context);
			}
			context.endAttributes();
			try {
				context.text(((java.lang.String) _Competence.get(idx1++)));
			} catch (java.lang.Exception e) {
				com.sun.xml.bind.marshaller.Util
						.handlePrintConversionException(this, e, context);
			}
			context.endElement();
		}
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
		return (jcolibri.xml.methods.CompetenciesType.class);
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
			return jcolibri.xml.methods.impl.CompetenciesTypeImpl.this;
		}

		public void enterElement(java.lang.String ___uri,
				java.lang.String ___local, org.xml.sax.Attributes __atts)
				throws com.sun.xml.bind.unmarshaller.UnreportedException {
			switch (state) {
			case 3:
				if (("" == ___uri) && ("Competence" == ___local)) {
					context.pushAttributes(__atts);
					state = 1;
					return;
				}
				revertToParentFromEnterElement(___uri, ___local, __atts);
				return;
			case 0:
				if (("" == ___uri) && ("Competence" == ___local)) {
					context.pushAttributes(__atts);
					state = 1;
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
				if (("" == ___uri) && ("Competence" == ___local)) {
					context.popAttributes();
					state = 3;
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
				case 1:
					try {
						_Competence.add(value);
					} catch (java.lang.Exception e) {
						handleParseConversionException(e);
					}
					state = 2;
					return;
				}
			} catch (java.lang.RuntimeException e) {
				handleUnexpectedTextException(value, e);
			}
		}

	}

}
