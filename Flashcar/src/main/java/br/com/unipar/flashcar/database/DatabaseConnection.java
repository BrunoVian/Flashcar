
package br.com.unipar.flashcar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(
                "jdbc:h2:C:\\Users\\bruno\\Documents\\h2Banco\\flashcar","","");
    }
    
}