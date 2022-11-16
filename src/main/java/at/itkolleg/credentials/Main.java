package at.itkolleg.credentials;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Credentials> credentialsList = new ArrayList<>();
        credentialsList.add(new Credentials("www.gmx.at", "123zuesss", "a.iller"));
        credentialsList.add(new Credentials("www.hotmail.com", "asdfjköljk", "corban.nerum"));
        credentialsList.add(new Credentials("www.xyz.net", "9fas8dfu9ee", "bobba.fett"));
        ExportCredentials exportCredentials = new CsvExporter();
        exportCredentials.export(credentialsList);

        System.out.println("------------Decorator------------");
        /**
         * In der Main wird die Funktionalität des Decorators getestet.
         * Dabei wird ein die bestehende Liste von Credentials verwendet und danach eine erweiterte.
         */
        ExportCredentials exp = new HashDecorator(new CsvExporter());
        exp.export(credentialsList);

        credentialsList.add(new Credentials("manuel@gmail.com", "test", "m.foidl"));
        System.out.println("------------Liste mit einem weiteren Beispiel------------");
        exp.export(credentialsList);

    }
}
