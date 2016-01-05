package solutions;

import java.sql.*;

public class PutMeIn {
    public static void main(String args[]) {
        String URL = "jdbc:derby://localhost:1527/java";
        String sqltxt;
        sqltxt = "INSERT INTO EMPLOYEE (ID, FIRSTNAME, LASTNAME, "
                + "TITLE, DEPARTMENT_CODE, SUPERVISOR_ID, HIRE_DATE, "
                + "SALARY) VALUES (9999, 'Rob', 'Roselius', "
                + "'Lord High Coder', 'RD', NULL, '2012-11-30', "
                + "450000.00 )";
        
        try (Connection conn = DriverManager.getConnection(URL);
                Statement stmt = conn.createStatement();) {
            int uc = stmt.executeUpdate(sqltxt);
            System.out.println("\n" + uc + " row(s) updated.");
        }
        catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
