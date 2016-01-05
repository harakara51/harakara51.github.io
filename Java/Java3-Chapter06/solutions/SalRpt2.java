package solutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SalRpt2 {
    public static void main(String args[]) {
        String url = "jdbc:derby://localhost:1527/java";
        String sqltxt;
        sqltxt = "SELECT firstname, lastname, salary, department_name "
                + "FROM employee, department  "
                + "WHERE employee.department_code ="
                + "  department.department_code";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sqltxt);) {

            String name;
            String dept;
            float salary;
            float totalsalary = 0.0F;
            float tempsal;
            Map<String, Float> map = new HashMap<>();

            while (rs.next()) {
                name = rs.getString(1) + " " + rs.getString(2);
                salary = rs.getFloat(3);
                totalsalary += salary;

                System.out.printf("%1s \t %2.2f %n", name, salary);
                dept = rs.getString(4);

                if (map.containsKey(dept)) {
                    tempsal = map.get(dept);
                }
                else {
                    tempsal = 0.0F;
                }
                map.put(dept, new Float(tempsal + salary));
            }

            System.out.printf("------%nTotal salary: %1.2f %n",
                    totalsalary);
            stmt.close();
            conn.close();

            System.out.println("\nTotal Salary for Department");
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.printf("%1.2f \t %2s %n", map.get(key),
                        key);
            }
        }
        catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }
}