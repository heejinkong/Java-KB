package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest2 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/edudb";
        String username = "root";
        String password = "1234";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Database connection established");
            selectEmp(connection);

        }catch (Exception e){
            System.out.println("Could not establish database connection");
            e.printStackTrace();
        }
    } //main
    public static void selectEmp(Connection connection){
        //연결객체
        //System.out.println(connection); 연결객체 확인
        String sql = "select EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO from emp";
        try{
            //운반객체
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           ResultSet resultSet = preparedStatement.executeQuery();
           while(resultSet.next()) {
               EmpVO empVO = new EmpVO();
                empVO.setEmpno(resultSet.getInt("empno"));
                empVO.setEname(resultSet.getString("ename"));
                empVO.setJob(resultSet.getString("job"));
                empVO.setMgr(resultSet.getInt("mgr"));
                empVO.setHiredate(resultSet.getString("hiredate"));
                empVO.setSal(resultSet.getInt("sal"));
                empVO.setComm(resultSet.getInt("comm"));
                empVO.setDeptno(resultSet.getInt("deptno"));
                System.out.println(empVO);

//               if(resultSet.next()) {
//                   int empno = resultSet.getInt(1);
//                   String ename = resultSet.getString(2);
//                   int sal = resultSet.getInt(6);
//                   System.out.println(empno);
//                   System.out.println(ename);
//                   System.out.println(sal);
//               }
           }
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
