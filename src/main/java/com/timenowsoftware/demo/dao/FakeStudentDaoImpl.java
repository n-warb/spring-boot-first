package com.timenowsoftware.demo.dao;

import com.timenowsoftware.demo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeStudentDaoImpl implements StudentDao {

    private final Map<UUID, Student> database;

    public FakeStudentDaoImpl() {
        database = new HashMap<>();
        final UUID key = UUID.randomUUID();
        database.put(key, new Student(key, 43, "Fred", "Warburton", "Mathematics"));
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentByUUID(UUID studentId, Student updateStudent) {
        database.put(studentId, updateStudent);
        return 1;
    }

    @Override
    public int deleteStudentByID(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
