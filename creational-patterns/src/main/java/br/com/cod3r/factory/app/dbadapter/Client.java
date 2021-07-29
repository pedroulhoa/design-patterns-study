package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

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
