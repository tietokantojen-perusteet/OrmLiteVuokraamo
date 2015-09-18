package tikape;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.util.List;
import tikape.pojo.Varaus;

public class Main {

    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        ConnectionSource connectionSource
                = new JdbcConnectionSource("jdbc:sqlite:vuokraamo.db");

        Dao<Varaus, String> varausDao
                = DaoManager.createDao(connectionSource, Varaus.class);

        List<Varaus> varaukset = varausDao.queryForAll();
        for (Varaus varaus : varaukset) {
            System.out.println(varaus.getPyora().getRekisterinumero() + ", alkaa " + varaus.getVarausAlkaa());
        }
    }
}
