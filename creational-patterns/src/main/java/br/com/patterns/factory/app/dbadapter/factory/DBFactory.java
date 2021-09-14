package br.com.patterns.factory.app.dbadapter.factory;

import br.com.patterns.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
