package br.com.patterns.factory.app.dbadapter;

import br.com.patterns.factory.app.dbadapter.db.DB;
import br.com.patterns.factory.app.dbadapter.db.OracleDB;
import br.com.patterns.factory.app.dbadapter.db.PostgresDB;

public class Client {

	public static void main(String[] args) {

		DB oracleDB = new OracleDB();
		DB postgresDB = new PostgresDB();

		// Oracle
		oracleDB.query("SELECT * FROM users");
		oracleDB.update("INSERT INTO...");

		//Postgres
		postgresDB.query("SELECT * FROM users");
		postgresDB.update("INSERT INTO...");

	}
}
