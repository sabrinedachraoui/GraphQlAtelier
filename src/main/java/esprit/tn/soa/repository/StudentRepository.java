package esprit.tn.soa.repository;

import esprit.tn.soa.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> Students;
    public List<Student> getAllStudents;


    public StudentRepository() {
        Students = new ArrayList<>();


    }
}
