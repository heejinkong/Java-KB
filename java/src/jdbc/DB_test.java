package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class DB_test {
    public static void main(String [] args) {
        String url = "jdbc:mysql://localhost:3306/shop";
        String user = "root";
        String password = "1234";
        try {
            Class. forName("com.mysql.cj.jdbc.Driver");
            System. out.println("Connecting to database...");
            Connection conn = DriverManager. getConnection(url, user, password);
            System. out.println("Connected to database...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}