package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//CREATE DATABASE edudb;
//CREATE USER 'jdbctest'@'%' IDENTIFIED BY 'jdbctest';
//GRANT ALL ON *.* TO 'jdbctest'@'%';
//FLUSH PRIVILEGES;
//SHOW DATABASES;`
public class JdbcTest1 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/edudb";
        String username = "root";
        String password = "1234";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Database connection established");

        }catch (Exception e){
            System.out.println("Could not establish database connection");
            e.printStackTrace();
        }
    }
}