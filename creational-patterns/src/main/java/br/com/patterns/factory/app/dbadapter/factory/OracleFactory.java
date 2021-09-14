package br.com.patterns.factory.app.dbadapter.factory;

import br.com.patterns.factory.app.dbadapter.db.DB;
import br.com.patterns.factory.app.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
