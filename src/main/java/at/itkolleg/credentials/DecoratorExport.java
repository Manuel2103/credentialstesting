package at.itkolleg.credentials;

import java.util.List;

/**
 * Dient als Basisklasse für die konkreten Dekorierer.
 */
public class DecoratorExport implements ExportCredentials {

    ExportCredentials exportCredentials;

    /**
     * Der Konstruktor wird dazu verwendet das zu dekorierende Objekt anzugeben.
     * @param exportCredentials Liste von Credentials
     */
    public DecoratorExport(ExportCredentials exportCredentials) {
        this.exportCredentials = exportCredentials;
    }

    /**
     * Wird vom Interface ExportCredentials bereitgestellt und muss implementiert werden.
     * @param credentialsList Liste von Credentials
     */
    @Override
    public void export(List<Credentials> credentialsList) {
        exportCredentials.export(credentialsList);

    }
}
