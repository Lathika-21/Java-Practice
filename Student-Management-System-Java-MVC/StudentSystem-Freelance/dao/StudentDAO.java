package dao;

import java.sql.*;
import model.Student;
import db.DBConnection;

public class StudentDAO {

    public void addStudent(Student s) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getDepartment());
            ps.setInt(4, s.getMarks());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM student";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}