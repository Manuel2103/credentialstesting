package at.itkolleg.credentials;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Credentials> credentialsList = new ArrayList<>();
        credentialsList.add(new Credentials("www.gmx.at","123zuesss", "a.iller"));
        credentialsList.add(new Credentials("www.hotmail.com","asdfjköljk", "corban.nerum"));
        credentialsList.add(new Credentials("www.xyz.net","9fas8dfu9ee", "bobba.fett"));
        ExportCredentials exportCredentials =  new CsvExporter();
        exportCredentials.export(credentialsList);

        System.out.println("------------Decorator------------");
        ExportCredentials exp = new HashDecorator(new CsvExporter());
        exp.export(credentialsList);
    }
}
