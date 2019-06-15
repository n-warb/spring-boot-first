package com.timenowsoftware.demo.service;

import com.timenowsoftware.demo.dao.StudentDao;
import com.timenowsoftware.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int persistNewStudent(UUID studentId, Student student) {
        UUID uuid = (studentId == null) ? UUID.randomUUID() : studentId;
        student.setId(uuid);
        return studentDao.insertNewStudent(uuid, student);
    }

    public Student getStudentById(UUID studentId) {
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int updateStudentByUUID(UUID studentId, Student updateStudent) {
        return studentDao.updateStudentByUUID(studentId, updateStudent);
    }

    public int deleteStudentByID(UUID studentId) {
        return studentDao.deleteStudentByID(studentId);
    }
}
