package solutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class SalRpt1 {
    public static void main(String args[]) {
        String url = "jdbc:derby://localhost:1527/java";
        String sqltxt;        
        sqltxt = "SELECT firstname, lastname, salary FROM employee";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sqltxt);) {

            String name;
            float salary;
            float totalsalary = 0.0F;

            while (rs.next()) {
                name = rs.getString(1) + " " + rs.getString(2);
                salary = rs.getFloat(3);
                totalsalary += salary;
                System.out.printf("%1s \t %2.2f %n", name, salary);
            }
            System.out.println("----------\nTotal salary: "
                    + totalsalary);
        }
        catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
}