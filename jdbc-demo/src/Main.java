import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
         // git
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update stu set money = 2000 where id = 1";
        Statement statement = conn.createStatement();
        int update = statement.executeUpdate(sql);
        System.out.println(update);
        statement.close();
        conn.close();
    }
}