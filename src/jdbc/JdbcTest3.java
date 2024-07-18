package jdbc;

//DEPT,SALGRADE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest3 {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:mysql://localhost:3306/edudb";
        String username = "jdbctest";
        String password = "jdbctest";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//동적인 드라이브 로딩
            Connection connection= DriverManager.getConnection(jdbcurl, username, password);
            System.out.println("Database connection established");
            System.out.println( selectDept(connection));
        }catch (Exception e){
            System.out.println("Could not establish database connection");
            e.printStackTrace();
        }

    }//main
    public static List<DeptDto> selectDept( Connection connection){
        //연결객체
        StringBuilder sb=new StringBuilder();
        sb.append("select deptno,dname,loc ");
        sb.append("from dept ");
        List<DeptDto> deptList=new ArrayList<DeptDto>();
        try {
            //운반객체
            PreparedStatement preparedStatement= connection.prepareStatement(sb.toString());
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                DeptDto deptDto=new DeptDto();
                deptDto.setDeptno(resultSet.getInt("deptno"));
                deptDto.setDname(resultSet.getString("dname"));
                deptDto.setLoc(resultSet.getString("loc"));
                deptList.add(deptDto);
            }//while
            resultSet.close();
            preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return deptList;
    }
}

