import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Lathika@2004");

            String query =
                    "INSERT INTO students VALUES (4,'Arun','AIML')";

            Statement st = con.createStatement();

            int rows = st.executeUpdate(query);

            System.out.println(rows + " record inserted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}