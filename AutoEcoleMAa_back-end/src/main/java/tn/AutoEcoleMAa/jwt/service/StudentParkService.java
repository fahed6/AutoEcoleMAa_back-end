package tn.AutoEcoleMAa.jwt.service;


import tn.AutoEcoleMAa.jwt.dao.StudentParkDao;

import tn.AutoEcoleMAa.jwt.entity.StudentPark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentParkService{

    @Autowired
    private StudentParkDao studentParkDao;


    public StudentPark registerNewStudentPark(StudentPark studentPark) {
       
        return studentParkDao.save(studentPark);
    }
}
