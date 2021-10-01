package br.com.patterns.bridge.mvc;

import br.com.patterns.bridge.mvc.dao.UserMongoDao;
import br.com.patterns.bridge.mvc.dao.UserMysqlDao;
import br.com.patterns.bridge.mvc.dao.UserOracleDao;
import br.com.patterns.bridge.mvc.dao.UserPostgresDao;
import br.com.patterns.bridge.mvc.model.User;
import br.com.patterns.bridge.mvc.services.UserEJB;
import br.com.patterns.bridge.mvc.services.UserRest;
import br.com.patterns.bridge.mvc.services.UserService;
import br.com.patterns.bridge.mvc.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);

	}
}
