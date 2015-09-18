package tikape.pojo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Pyora")
public class Pyora {

    @DatabaseField(id = true, columnName = "rekisterinumero")
    private String rekisterinumero;
    @DatabaseField(columnName = "rekisterinumero")
    private String merkki;

    public Pyora() {
    }

    public Pyora(String rekisterinumero, String merkki) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        this.rekisterinumero = rekisterinumero;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
}
