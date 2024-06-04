import java.sql.*;
import java.util.Scanner;

public class JDBCDEMO {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "Aarush123";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Database Name: ");
        String dbname = scanner.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String selectSQL = String.format("SELECT * FROM employees where firstname = ? ");
            //Statement stmt = connection.createStatement();
            PreparedStatement  stmt = connection.prepareStatement(selectSQL);
            stmt.setString(1, dbname);
            ResultSet result =  stmt.executeQuery();
            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstName");
                String lname  = result.getString("lastName");
                String  jobtitle  = result.getString("job_title");
                System.out.println(EmployeeID +" | " + fname + " | "+ lname+ " | " + jobtitle );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
