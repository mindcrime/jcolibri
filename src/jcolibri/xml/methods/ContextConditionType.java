//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2004.07.27 at 10:46:52 CEST 
//

package jcolibri.xml.methods;

/**
 * Java content class for ContextConditionType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this java content object.
 * <p>
 * 
 * <pre>
 *   &lt;complexType name=&quot;ContextConditionType&quot;&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base=&quot;{http://www.w3.org/2001/XMLSchema}anyType&quot;&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name=&quot;MaxOccurrences&quot; type=&quot;{}OccurrenceType&quot;/&gt;
 *             &lt;element name=&quot;MinOccurrences&quot; type=&quot;{}OccurrenceType&quot;/&gt;
 *             &lt;element name=&quot;CBRTerm&quot; type=&quot;{}CBRTermType&quot;/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref=&quot;{}Parameter&quot;/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * </pre>
 * 
 */
public interface ContextConditionType {

	java.lang.String getCBRTerm();

	void setCBRTerm(java.lang.String value);

	java.lang.String getMaxOccurrences();

	void setMaxOccurrences(java.lang.String value);

	java.lang.String getMinOccurrences();

	void setMinOccurrences(java.lang.String value);

	jcolibri.xml.methods.ParameterType getParameter();

	void setParameter(jcolibri.xml.methods.ParameterType value);

}
