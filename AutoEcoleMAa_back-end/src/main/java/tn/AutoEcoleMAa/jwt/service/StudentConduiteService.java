package tn.AutoEcoleMAa.jwt.service;

import tn.AutoEcoleMAa.jwt.dao.StudentConduiteDao;

import tn.AutoEcoleMAa.jwt.entity.StudentConduite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentConduiteService{

    @Autowired
    private StudentConduiteDao studentConduiteDao;


    public StudentConduite registerNewStudentConduite(StudentConduite studentConduite) {

        return studentConduiteDao.save(studentConduite);
    }


}
