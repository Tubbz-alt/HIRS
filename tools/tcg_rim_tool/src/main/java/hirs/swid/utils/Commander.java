package hirs.swid.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import com.beust.jcommander.Parameter;

/**
 * Commander is a class that handles the command line arguments for the SWID
 * Tags gateway by implementing the JCommander package.
 */
public class Commander {

    @Parameter(names = {"-h", "--help"}, help = true, description = "Print this help text.")
    private boolean help;
    @Parameter(names = {"-c", "--create \"base\""}, order = 0,
            description = "The type of RIM to create. A base RIM will be created by default.")
    private String createType = "";//other possible values: "eventlog" and "pcr"
    @Parameter(names = {"-a", "--attributes <path>"}, order = 1,
            description = "The configuration file holding attributes to populate the base RIM with.")
    private String attributesFile = "";
    @Parameter(names = {"-o", "--out <path>"}, order = 2,
            description = "The file to write the RIM out to. The RIM will be written to stdout by default.")
    private String outFile = "";
    @Parameter(names = {"-v", "--verify <path>"}, order = 3,
            description = "Specify a RIM file to verify.")
    private String verifyFile = "";
    @Parameter(names = {"-k", "--privateKeyFile <path>"}, order = 4,
            description = "File containing the private key used to sign the base RIM created by the create function.")
    private String privateKeyFile = "";
    @Parameter(names = {"-p", "--publicCertificate <path>"}, order = 5,
            description = "The public key certificate used to verify a RIM file or to embed in a signed RIM. " +
                    "A signed RIM generated by this tool by default will not show the signing certificate without this parameter present.")
    private String publicCertificate = "";
/*
    @Parameter(names = {"-l", "--rimel <path>"}, order = 6,
            description = "The TCG eventlog file to use as a support RIM. By default the last system eventlog will be used.")
    private String rimEventLog = "";
    @Parameter(names = {"-t", "--rimpcr <path>"}, order = 7,
            description = "The file containing TPM PCR values to use as a support RIM. By default the current platform TPM will be used.")
    private String rimPcrs = "";
    //@Parameter(names = {}, order = 8, description = "")
    private String toBeSigned = "";
    @Parameter(names = {"-s", "--addSignatureData <originalBaseRIM> <signatureFile> <outputFile>"}, order = 8,
            description = "The signature data in <signatureFile> will be combined with the data in <originalBaseRIM>" +
                    "and written to <outputFile>, or will overwrite <originalBaseRIM> if <outputFile> is not given.")
    private String signatureData = "";
*/
    public boolean isHelp() {
        return help;
    }

    public String getCreateType() {
        return createType;
    }

    public String getAttributesFile() {
        return attributesFile;
    }

    public String getOutFile() {
        return outFile;
    }

    public String getVerifyFile() {
        return verifyFile;
    }

    public String getPrivateKeyFile() {
        return privateKeyFile;
    }

    public String getPublicCertificate() {
        return publicCertificate;
    }
/*
    public String getRimEventLog() {
        return rimEventLog;
    }

    public String getRimPcrs() {
        return rimPcrs;
    }

    public String getToBeSigned() {
        return toBeSigned;
    }

    public String getSignatureData() {
        return signatureData;
    }
*/
    public String printHelpExamples() {
        StringBuilder sb = new StringBuilder();
        sb.append("Create a base RIM using the values in attributes.json; " +
                "sign it with the default keystore, alias, and password;\n");
        sb.append("and write the data to base_rim.swidtag:\n\n");
        sb.append("\t\t-c base -a attributes.json -o base_rim.swidtag\n\n\n");
        sb.append("Create a base RIM using the default attribute values; sign it using privateKey.pem;\n");
        sb.append("and write the data to console output, to include cert.pem in the signature block:\n\n");
        sb.append("\t\t-c base -k privateKey.pem -p cert.pem\n\n\n");

        return sb.toString();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Creating: " + getCreateType() + System.lineSeparator());
        sb.append("Using attributes file: " + getAttributesFile() + System.lineSeparator());
        sb.append("Write to: " + getOutFile() + System.lineSeparator());
        sb.append("Verify file: " + getVerifyFile() + System.lineSeparator());
        sb.append("Private key file: " + getPrivateKeyFile() + System.lineSeparator());
        sb.append("Public certificate: " + getPublicCertificate() + System.lineSeparator());
/*
        sb.append("Event log support RIM: " + getRimEventLog() + System.lineSeparator());
        sb.append("TPM PCRs support RIM: " + getRimPcrs() + System.lineSeparator());
        sb.append("Base RIM to be signed: " + getToBeSigned() + System.lineSeparator());
        sb.append("External signature file: " + getSignatureData() + System.lineSeparator());
*/
        return sb.toString();
    }
}
