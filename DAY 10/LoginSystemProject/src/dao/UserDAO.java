package dao;
import model.User;
import db.DBConnection;
import java.sql.*;


public class UserDAO {

    public void registerUser(String username, String password) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(username,password) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean loginUser(String username, String password) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}