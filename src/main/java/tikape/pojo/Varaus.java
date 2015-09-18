package tikape.pojo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.Timestamp;

@DatabaseTable(tableName = "Varaus")
public class Varaus {

    @DatabaseField(id = true)
    private Integer varaustunnus;
    @DatabaseField(columnName = "pyora", canBeNull = false, foreign = true)
    private Pyora pyora;
    private Varaaja varaaja;
    @DatabaseField(columnName = "varaus_alkaa")
    private Timestamp varausAlkaa;
    @DatabaseField(columnName = "varaus_loppuu")
    private Timestamp varausLoppuu;

    public Varaus() {
    }

    public Varaus(Integer varaustunnus, Timestamp varausAlkaa, Timestamp varausLoppuu) {
        this.varaustunnus = varaustunnus;
        this.varausAlkaa = varausAlkaa;
        this.varausLoppuu = varausLoppuu;
    }

    public Varaus(Integer varaustunnus, Pyora pyora, Varaaja varaaja, Timestamp varausAlkaa, Timestamp varausLoppuu) {
        this(varaustunnus, varausAlkaa, varausLoppuu);
        this.pyora = pyora;
        this.varaaja = varaaja;
    }

    public Integer getVaraustunnus() {
        return varaustunnus;
    }

    public void setVaraustunnus(Integer varaustunnus) {
        this.varaustunnus = varaustunnus;
    }

    public Pyora getPyora() {
        return pyora;
    }

    public void setPyora(Pyora pyora) {
        this.pyora = pyora;
    }

    public Varaaja getVaraaja() {
        return varaaja;
    }

    public void setVaraaja(Varaaja varaaja) {
        this.varaaja = varaaja;
    }

    public Timestamp getVarausAlkaa() {
        return varausAlkaa;
    }

    public void setVarausAlkaa(Timestamp varausAlkaa) {
        this.varausAlkaa = varausAlkaa;
    }

    public Timestamp getVarausLoppuu() {
        return varausLoppuu;
    }

    public void setVarausLoppuu(Timestamp varausLoppuu) {
        this.varausLoppuu = varausLoppuu;
    }

}
