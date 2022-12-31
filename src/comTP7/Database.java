package comTP7;
import java.sql.*;

public class Database {
    String URL = "jdbc:mysql://localhost:3306/tpJava";


    public void connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, "root", "");
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void disconnect() {
        try {
            Connection conn = DriverManager.getConnection(URL, " ", " ");
            conn.close();
            System.out.println("Disconnected from the database!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void execute(String sql) {
        try {
            Connection conn = DriverManager.getConnection(URL, " ", " ");
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("Query executed!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}
