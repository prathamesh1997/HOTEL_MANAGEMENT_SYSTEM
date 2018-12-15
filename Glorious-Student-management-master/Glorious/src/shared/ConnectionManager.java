
package Shared;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {

    public Connection getConnection() {
        final String driver = "oracle.jdbc.OracleDriver";
       // final String url = "jdbc:oracle:thin:@192.168.0.138:1521:XE";
        final String url = "jdbc:oracle:thin:@localhost:1521:orcl1";
        final String username = "hr";
        final String password = "hr";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
