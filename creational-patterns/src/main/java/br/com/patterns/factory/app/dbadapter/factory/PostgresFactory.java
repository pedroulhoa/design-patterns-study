package br.com.patterns.factory.app.dbadapter.factory;

import br.com.patterns.factory.app.dbadapter.db.DB;
import br.com.patterns.factory.app.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
