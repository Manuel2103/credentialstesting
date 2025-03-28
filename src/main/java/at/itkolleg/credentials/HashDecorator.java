package at.itkolleg.credentials;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * HashDecorator erbt von der Klasse DecoratorExport.
 * Die Methode export wird überschrieben und mit einer Funktionalität erweitert.
 */
public class HashDecorator extends DecoratorExport {

    ExportCredentials exportCredentials;

    /**
     * Konstruktor der Mutterklasse
     * @param exportCredentials das zu dekorierende Objekt
     */
    public HashDecorator(ExportCredentials exportCredentials) {
        super(exportCredentials);
    }


    /**
     * Die Methode export wird überschrieben und mit der Hash-Funktionalität erweitert.
     * Dabei wird die Liste von Credentials durchiteriert und bei jedem Credential das PWD gehasht.
     * Dies wird ermöglicht, indem Getter und Setter von Pwd verwendet wird.
     *
     * @param credentialsList Liste von Credentials mit (Host, PWD, User)
     */
    @Override
    public void export(List<Credentials> credentialsList) {
        String hashPW;
        for (int i = 0; i < credentialsList.size(); i++) {

            hashPW = Hashing.sha256()
                    .hashString(credentialsList.get(i).getPwd(), StandardCharsets.UTF_8)
                    .toString();
            credentialsList.get(i).setPwd(hashPW);

        }
       super.export(credentialsList);
    }
}
