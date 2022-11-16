package at.itkolleg.credentials;

import at.itkolleg.credentials.ExportCredentials;

import java.util.List;

public class CsvExporter implements ExportCredentials {

    public void export(List<Credentials> credentialsList) {
        String exportString = "";
        for (int i = 0; i < credentialsList.size(); i++) {
            Credentials credentials = credentialsList.get(i);
            exportString += credentials.getHost() + ";" + credentials.getUser() + ";" + credentials.getPwd();
            if (i < credentialsList.size() - 1) {
                exportString += "\n";
            }
        }
        System.out.println(exportString);
    }
}
