package sql_Databases_Tutorial.com.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {

    public static Connection getConnection () {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}