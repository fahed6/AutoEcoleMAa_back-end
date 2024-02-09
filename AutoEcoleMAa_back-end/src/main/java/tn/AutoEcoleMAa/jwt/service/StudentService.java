package tn.AutoEcoleMAa.jwt.service;

import tn.AutoEcoleMAa.jwt.dao.StudentDao;
import tn.AutoEcoleMAa.jwt.dao.UserDao;
import tn.AutoEcoleMAa.jwt.entity.Role;
import tn.AutoEcoleMAa.jwt.entity.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
     StudentDao studentDao;
    @Autowired
     UserDao userDao;
    @Autowired
     UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
     


    public Student registerNewStudent(Student student) {
    	student.setUserName(student.getStudentCin());
        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        student.setRole(userRoles);
        student.setUserPassword(getEncodedPassword(student.getUserPassword()));

        return studentDao.save(student);
    }
    
    
    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
    
    public List<Student> getAllStudents(){
    	
    	return studentDao.findAll();
    }
    
    public void deleteStudent(String UserName) {
    	
    	studentDao.deleteById(UserName);
    }
    
    public Student getStudentDetailsById(String UserName) {
    	return studentDao.findById(UserName).get();
    }
    


}