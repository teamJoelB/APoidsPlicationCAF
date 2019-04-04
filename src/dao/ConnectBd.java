
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectBd {
    protected static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    protected static final String DB_NAME = "apoidsplicationcaf";
    protected static final String URL = "jdbc:mysql://127.0.0.1/" + DB_NAME;
    protected static final String USER = "root";
    protected static final String PASSWORD = "";
    
    public static Connection getConnection()
            throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
