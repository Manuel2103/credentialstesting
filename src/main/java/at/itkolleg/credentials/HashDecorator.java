package at.itkolleg.credentials;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class HashDecorator extends CsvExporter{

    public HashDecorator(CsvExporter csvExporter) {
        super();
    }

    @Override
    public void export(List<Credentials> credentialsList) {
        for (int i = 0; i < credentialsList.size(); i++) {

            String hashPW = Hashing.sha256()
                    .hashString(credentialsList.get(i).getPwd(), StandardCharsets.UTF_8)
                    .toString();
            credentialsList.get(i).setPwd(hashPW);

        }
        super.export(credentialsList);
    }
}
