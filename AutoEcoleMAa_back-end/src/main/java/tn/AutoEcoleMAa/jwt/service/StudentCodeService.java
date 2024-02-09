package tn.AutoEcoleMAa.jwt.service;

import tn.AutoEcoleMAa.jwt.dao.StudentCodeDao;

import tn.AutoEcoleMAa.jwt.entity.StudentCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCodeService {

    @Autowired
    private StudentCodeDao studentCodeDao;


    public StudentCode registerNewStudentCode(StudentCode studentCode) {
       
        return studentCodeDao.save(studentCode);
    }

    
}
