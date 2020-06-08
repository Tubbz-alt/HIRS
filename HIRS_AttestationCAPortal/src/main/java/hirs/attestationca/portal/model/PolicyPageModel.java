package hirs.attestationca.portal.model;

import hirs.data.persist.SupplyChainPolicy;

/**
 * PolicyPage model object to demonstrate data exchange between policy.jsp page
 * form form and controller.
 */
public class PolicyPageModel {

    // Variables to communicate policy settings to page
    private boolean enableEcValidation;
    private boolean enablePcCertificateValidation;
    private boolean enablePcCertificateAttributeValidation;
    private boolean enableFirmwareValidation;
private boolean issueAttestationCertificate;
    private boolean generateOnExpiration;

    // Variables to get policy settings from page
    private String pcValidate;
    private String pcAttributeValidate;
    private String ecValidate;
    private String fmValidate;
    private String attestationCertificateIssued;
    private String numOfValidDays;

    /**
     * Constructor. Sets fields from policy.
     *
     * @param policy The supply chain policy
     */
    public PolicyPageModel(final SupplyChainPolicy policy) {
        this.enableEcValidation = policy.isEcValidationEnabled();
        this.enablePcCertificateValidation = policy.isPcValidationEnabled();
        this.enablePcCertificateAttributeValidation = policy.isPcAttributeValidationEnabled();
        this.enableFirmwareValidation = policy.isFirmwareValidationEnabled();
this.issueAttestationCertificate = policy.isIssueAttestationCertificate();
        this.generateOnExpiration = policy.isGenerateOnExpiration();
        this.numOfValidDays = policy.getValidityDays();
    }

    /**
     * Default constructor required by Spring.
     */
    public PolicyPageModel() {
    }

    /**
     * Gets the EC Validation state.
     *
     * @return the validation state.
     */
    public boolean getEnableEcValidation() {
        return enableEcValidation;
    }

    /**
     * Gets the Platform Certificate Validation state.
     *
     * @return the validation state.
     */
    public boolean getEnablePcCertificateValidation() {
        return enablePcCertificateValidation;
    }

    /**
     * Gets the Platform Certificate AttributeValidation state.
     *
     * @return the validation state.
     */
    public boolean getEnablePcCertificateAttributeValidation() {
        return enablePcCertificateAttributeValidation;
    }

    /**
     * Gets the Firmware Validation state.
     *
     * @return the validation state.
     */
    public boolean getEnableFirmwareValidation() {
        return enableFirmwareValidation;
    }/**
     * Gets the Attestation Certificate issued State.
     * @return the issued state.
     */
    public boolean isIssueAttestationCertificate() {
        return issueAttestationCertificate;
    }

    /**
     * Gets the state of generating a certificate.
     * @return true or false
     */
    public boolean isGenerateOnExpiration() {
        return generateOnExpiration;
    }

    /**
     * Gets the EC Validation value.
     *
     * @return the model string representation of this field (checked or unchecked)
     */
    public String getEcValidate() {
        return ecValidate;
    }

    /**
     * Gets the Platform Certificate Validation value.
     *
     * @return the model string representation of this field (checked or unchecked)
     */
    public String getPcValidate() {
        return pcValidate;
    }

    /**
     * Gets the platform certificate attribute validation value.
     *
     * @return the model string representation of this field (checked or unchecked)
     */
    public String getPcAttributeValidate() {
        return pcAttributeValidate;
    }

    /**
     * Gets the Firmware Validation value.
     *
     * @return the model string representation of this field (checked or unchecked)
     */
    public String getFmValidate() {
        return fmValidate;
    }/**
     * Gets the attestation certificate issued state.
     * @return the model string representation of this field.
     */
    public String getAttestationCertificateIssued() {
        return attestationCertificateIssued;
    }

    /**
     * Gets the number of selected valid days.
     *
     * @return the number of the days for validity
     */
    public String getNumOfValidDays() {
        return numOfValidDays;
    }

    /**
     * Sets the EC Validation state.
     *
     * @param enableEcValidation true if performing validation, false otherwise
     */
    public void setEnableEcValidation(final boolean enableEcValidation) {
        this.enableEcValidation = enableEcValidation;
    }

    /**
     * Sets the Platform Certificate Validation state.
     *
     * @param enablePcCertificateValidation true if performing validation, false otherwise
     */
    public void setEnablePcCertificateValidation(final boolean enablePcCertificateValidation) {
        this.enablePcCertificateValidation = enablePcCertificateValidation;
    }

    /**
     * Sets the Platform Certificate Attribute Validation state.
     *
     * @param enablePcCertificateAttributeValidation true if performing validation, false otherwise
     */
    public void setEnablePcCertificateAttributeValidation(
            final boolean enablePcCertificateAttributeValidation) {
        this.enablePcCertificateAttributeValidation = enablePcCertificateAttributeValidation;
    }

    /**
     * Sets the Firmware Validation state.
     *
     * @param enableFirmwareValidation true if performing validation, false otherwise
     */
    public void setEnableFirmwareValidation(final boolean enableFirmwareValidation) {
        this.enableFirmwareValidation = enableFirmwareValidation;
    }
/**
     * Sets the Attestation Certificate Issued state.
     * @param issueAttestationCertificate true if generating Certificates.
     */
    public void setIssueAttestationCertificate(
            final boolean issueAttestationCertificate) {
        this.issueAttestationCertificate = issueAttestationCertificate;
    }

    /**
     * Setter for the state of generating a certificate.
     * @param generateOnExpiration true or false
     */
    public void setGenerateOnExpiration(final boolean generateOnExpiration) {
        this.generateOnExpiration = generateOnExpiration;
    }

    /**
     * Sets the Platform Certificate Validation state.
     *
     * @param pcValidate "checked" if enabling validation, false otherwise
     */
    public void setPcValidate(final String pcValidate) {
        this.pcValidate = pcValidate;
    }

    /**
     * Sets the EC Validation state.
     *
     * @param ecValidate "checked" if enabling validation, false otherwise
     */
    public void setEcValidate(final String ecValidate) {
        this.ecValidate = ecValidate;
    }

    /**
     * Sets the PC Attribute Validation state.
     *
     * @param pcAttributeValidate "checked" if enabling validation, false otherwise
     */
    public void setPcAttributeValidate(final String pcAttributeValidate) {
        this.pcAttributeValidate = pcAttributeValidate;
    }

    /**
     * Sets the Firmware state.
     *
     * @param fmValidate "checked" if enabling validation, false otherwise
     */
    public void setFmValidate(final String fmValidate) {
        this.fmValidate = fmValidate;
    }
/**
     * Sets the Issued Attestation Certificate state.
     *
     * @param attestationCertificateIssued "checked" if generating certificates.
     */
    public void setAttestationCertificateIssued(
            final String attestationCertificateIssued) {
        this.attestationCertificateIssued = attestationCertificateIssued;
    }

    @Override
    public String toString() {
        return "PolicyPageModel{"
                + "enableEcValidation=" + enableEcValidation
                + ", enablePcCertificateValidation=" + enablePcCertificateValidation
                + ", enablePcCertificateAttributeValidation="
                + enablePcCertificateAttributeValidation
                + ", enableFirmwareValidation=" + enableFirmwareValidation + ", issueAttestationCertificate="
                + issueAttestationCertificate
                + ", generateOnExpiration="
                + generateOnExpiration
                + ", numOfValidDays=" + numOfValidDays + "}";
    }
}
