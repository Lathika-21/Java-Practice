import java.sql.*;

public class FetchStudents {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("department"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}