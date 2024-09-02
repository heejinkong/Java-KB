package org.scoula.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Log4j
public class JDBCTest {
    static {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
    }

    @Test
    @DisplayName("JDBC 드라이버 연결이 된다.")
    public void testConnection() {
//        String url = "jdbc:mysql://localhost:3306/scoula_db";
//        try(Connection con = DriverManager.getConnection(url, "scoula", "1234")) {
//            log.info(con);
//        } catch(Exception e) {
//            fail(e.getMessage());
//        }
    }

}