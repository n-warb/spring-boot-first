package com.timenowsoftware.demo.dao;

import com.timenowsoftware.demo.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentDao {
    int insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentByUUID(UUID studentId, Student updateStudent);

    int deleteStudentByID(UUID studentId);
}
