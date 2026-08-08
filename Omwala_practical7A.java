package omwala_practical6;
import java.sql.*;

public class Omwala_practical7A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/om";
        String user = "root";
        String password = "root";
        
        String query = "SELECT * FROM test_db";
        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String department = rs.getString("department");
                System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nDepartment: " + department);
            }
        } catch (SQLException e) {e.printStackTrace();
        }
    }
}

