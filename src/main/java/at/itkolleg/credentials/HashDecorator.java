package at.itkolleg.credentials;

import java.util.List;

public class HashDecorator extends CsvExporter{

    public HashDecorator(CsvExporter csvExporter) {
        super();
    }

    @Override
    public void export(List<Credentials> credentialsList) {
        for (int i = 0; i < credentialsList.size(); i++) {
           String hashPW =  credentialsList.get(i).getPwd();
           credentialsList.get(i).setPwd("Test");
        }
        super.export(credentialsList);
    }
}
