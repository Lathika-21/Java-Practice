package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void add(Student s) {
        dao.addStudent(s);
    }

    public void showAll() {
        dao.getAllStudents();
    }
}