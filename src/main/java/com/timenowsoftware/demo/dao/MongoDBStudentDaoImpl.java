package com.timenowsoftware.demo.dao;

import com.timenowsoftware.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class MongoDBStudentDaoImpl implements StudentDao {
    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return null;
    }

    @Override
    public int updateStudentByUUID(UUID studentId, Student updateStudent) {
        return 0;
    }

    @Override
    public int deleteStudentByID(UUID studentId) {
        return 0;
    }
}
