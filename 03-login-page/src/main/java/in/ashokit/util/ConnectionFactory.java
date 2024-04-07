package in.ashokit.util;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {

	private static DataSource ds = null;

	public static Connection getconnection() throws Exception {
		if (ds == null) {

			File f = new File("D:\\Servlet\\03-login-page\\build\\classes\\in\\ashokit\\util\\dbconfig.properties");
			FileInputStream fis = new FileInputStream(f);

			Properties p = new Properties();
			p.load(fis);

			String url = p.getProperty("db.url");
			String uname = p.getProperty("db.uname");
			String pwd = p.getProperty("db.pwd");
			String driver = p.getProperty("db.driver");

			HikariConfig config = new HikariConfig();

			config.setJdbcUrl(url);
			config.setUsername(uname);
			config.setPassword(pwd);
			config.setDriverClassName(driver);

			ds = new HikariDataSource(config);
		}
		return ds.getConnection();
	}

}
