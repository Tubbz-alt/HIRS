//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 08:11:19 AM EDT 
//

package hirs.swid.xjc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Entity complex type.
 * </p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * </p>
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19770/-2/2015/schema.xsd}BaseElement"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Meta" type="{http://standards.iso.org/iso/19770/-2/2015/schema.xsd}Meta"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="regid" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://invalid.unavailable" /&gt;
 *       &lt;attribute name="role" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" /&gt;
 *       &lt;attribute name="thumbprint" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", namespace = "http://standards.iso.org/iso/19770/-2/2015/schema.xsd", propOrder = { "meta" })
public class Entity extends BaseElement {

	@XmlElement(name = "Meta")
	protected List<Meta> meta;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "regid")
	@XmlSchemaType(name = "anyURI")
	protected String regid;
	@XmlAttribute(name = "role", required = true)
	@XmlSchemaType(name = "NMTOKENS")
	protected List<String> role;
	@XmlAttribute(name = "thumbprint")
	protected String thumbprint;

	/**
	 * Gets the value of the meta property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the meta property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMeta().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Meta }
	 * 
	 * 
	 */
	public List<Meta> getMeta() {
		if (meta == null) {
			meta = new ArrayList<Meta>();
		}
		return this.meta;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the regid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegid() {
		if (regid == null) {
			return "http://invalid.unavailable";
		} else {
			return regid;
		}
	}

	/**
	 * Sets the value of the regid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegid(String value) {
		this.regid = value;
	}

	/**
	 * Gets the value of the role property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the role property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRole().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getRole() {
		if (role == null) {
			role = new ArrayList<String>();
		}
		return this.role;
	}

	/**
	 * Gets the value of the thumbprint property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getThumbprint() {
		return thumbprint;
	}

	/**
	 * Sets the value of the thumbprint property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setThumbprint(String value) {
		this.thumbprint = value;
	}

}
