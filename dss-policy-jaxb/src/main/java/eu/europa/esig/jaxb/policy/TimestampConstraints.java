//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 09:29:07 AM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimestampConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimestampConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimestampDelay" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/&gt;
 *         &lt;element name="MessageImprintDataFound" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="MessageImprintDataIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="RevocationTimeAgainstBestSignatureTime" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="BestSignatureTimeBeforeIssuanceDateOfSigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="SigningCertificateValidityAtBestSignatureTime" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="AlgorithmReliableAtBestSignatureTime" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="Coherence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/&gt;
 *         &lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampConstraints", propOrder = {
    "timestampDelay",
    "messageImprintDataFound",
    "messageImprintDataIntact",
    "revocationTimeAgainstBestSignatureTime",
    "bestSignatureTimeBeforeIssuanceDateOfSigningCertificate",
    "signingCertificateValidityAtBestSignatureTime",
    "algorithmReliableAtBestSignatureTime",
    "coherence",
    "basicSignatureConstraints"
})
public class TimestampConstraints {

    @XmlElement(name = "TimestampDelay")
    protected TimeConstraint timestampDelay;
    @XmlElement(name = "MessageImprintDataFound")
    protected LevelConstraint messageImprintDataFound;
    @XmlElement(name = "MessageImprintDataIntact")
    protected LevelConstraint messageImprintDataIntact;
    @XmlElement(name = "RevocationTimeAgainstBestSignatureTime")
    protected LevelConstraint revocationTimeAgainstBestSignatureTime;
    @XmlElement(name = "BestSignatureTimeBeforeIssuanceDateOfSigningCertificate")
    protected LevelConstraint bestSignatureTimeBeforeIssuanceDateOfSigningCertificate;
    @XmlElement(name = "SigningCertificateValidityAtBestSignatureTime")
    protected LevelConstraint signingCertificateValidityAtBestSignatureTime;
    @XmlElement(name = "AlgorithmReliableAtBestSignatureTime")
    protected LevelConstraint algorithmReliableAtBestSignatureTime;
    @XmlElement(name = "Coherence")
    protected LevelConstraint coherence;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;

    /**
     * Gets the value of the timestampDelay property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getTimestampDelay() {
        return timestampDelay;
    }

    /**
     * Sets the value of the timestampDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setTimestampDelay(TimeConstraint value) {
        this.timestampDelay = value;
    }

    /**
     * Gets the value of the messageImprintDataFound property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getMessageImprintDataFound() {
        return messageImprintDataFound;
    }

    /**
     * Sets the value of the messageImprintDataFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setMessageImprintDataFound(LevelConstraint value) {
        this.messageImprintDataFound = value;
    }

    /**
     * Gets the value of the messageImprintDataIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getMessageImprintDataIntact() {
        return messageImprintDataIntact;
    }

    /**
     * Sets the value of the messageImprintDataIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setMessageImprintDataIntact(LevelConstraint value) {
        this.messageImprintDataIntact = value;
    }

    /**
     * Gets the value of the revocationTimeAgainstBestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getRevocationTimeAgainstBestSignatureTime() {
        return revocationTimeAgainstBestSignatureTime;
    }

    /**
     * Sets the value of the revocationTimeAgainstBestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setRevocationTimeAgainstBestSignatureTime(LevelConstraint value) {
        this.revocationTimeAgainstBestSignatureTime = value;
    }

    /**
     * Gets the value of the bestSignatureTimeBeforeIssuanceDateOfSigningCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getBestSignatureTimeBeforeIssuanceDateOfSigningCertificate() {
        return bestSignatureTimeBeforeIssuanceDateOfSigningCertificate;
    }

    /**
     * Sets the value of the bestSignatureTimeBeforeIssuanceDateOfSigningCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setBestSignatureTimeBeforeIssuanceDateOfSigningCertificate(LevelConstraint value) {
        this.bestSignatureTimeBeforeIssuanceDateOfSigningCertificate = value;
    }

    /**
     * Gets the value of the signingCertificateValidityAtBestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSigningCertificateValidityAtBestSignatureTime() {
        return signingCertificateValidityAtBestSignatureTime;
    }

    /**
     * Sets the value of the signingCertificateValidityAtBestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSigningCertificateValidityAtBestSignatureTime(LevelConstraint value) {
        this.signingCertificateValidityAtBestSignatureTime = value;
    }

    /**
     * Gets the value of the algorithmReliableAtBestSignatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getAlgorithmReliableAtBestSignatureTime() {
        return algorithmReliableAtBestSignatureTime;
    }

    /**
     * Sets the value of the algorithmReliableAtBestSignatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setAlgorithmReliableAtBestSignatureTime(LevelConstraint value) {
        this.algorithmReliableAtBestSignatureTime = value;
    }

    /**
     * Gets the value of the coherence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getCoherence() {
        return coherence;
    }

    /**
     * Sets the value of the coherence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setCoherence(LevelConstraint value) {
        this.coherence = value;
    }

    /**
     * Gets the value of the basicSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public BasicSignatureConstraints getBasicSignatureConstraints() {
        return basicSignatureConstraints;
    }

    /**
     * Sets the value of the basicSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public void setBasicSignatureConstraints(BasicSignatureConstraints value) {
        this.basicSignatureConstraints = value;
    }

}
