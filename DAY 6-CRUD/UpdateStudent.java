import java.sql.*;

public class UpdateStudent {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String query =
                    "UPDATE students SET department='AIDS' WHERE id=4";

            Statement st = con.createStatement();

            int rows = st.executeUpdate(query);

            System.out.println(rows + " record updated");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}