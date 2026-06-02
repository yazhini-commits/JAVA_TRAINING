import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String user = "root";
        String password = "yAzhu@21";

        try {
            Connection con =
                    DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}