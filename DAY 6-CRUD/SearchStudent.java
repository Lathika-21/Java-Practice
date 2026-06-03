import java.sql.*;

public class SearchStudent {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery(
                            "SELECT * FROM students WHERE id=1");

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