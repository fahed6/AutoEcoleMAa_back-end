package tn.AutoEcoleMAa.jwt.controller;


import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;


import tn.AutoEcoleMAa.jwt.entity.ImageModel;
import tn.AutoEcoleMAa.jwt.entity.Student;

import tn.AutoEcoleMAa.jwt.service.StudentService;



@RestController
public class StudentController {
	@Autowired
    private StudentService studentService;


	@PostMapping(value = {"/registerNewStudent"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public Student registerNewStudent(@RequestPart("student") Student student,
	                             @RequestPart("imageFile") MultipartFile[] file) {
	    try {
	    	Set<ImageModel> images = uploadImage(file);
	        student.setStudentImage(images);
	        return studentService.registerNewStudent(student);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	        return null;
	    }
	}

    public Set<ImageModel> uploadImage(MultipartFile[] multipartFiles) throws IOException {
        Set<ImageModel> imageModels = new HashSet<>();

        for (MultipartFile file: multipartFiles) {
            ImageModel imageModel = new ImageModel(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes()
            );
            imageModels.add(imageModel);
        }

        return imageModels;
    }
    
    
    @GetMapping({"/getAllStudents"})
    public List<Student> getAllProducts() {
        return studentService.getAllStudents();
        
    }
    
    @DeleteMapping({"/deleteStudent/{userName}"})
    public void deleteStudentDetails(@PathVariable("userName") String userName) {
    	studentService.deleteStudent(userName);
    }
    
    
    @GetMapping({"/getStudentDetailsById/{userName}"})
    public Student getStudentDetailsById(@PathVariable("userName")String UserName) {
		return studentService.getStudentDetailsById(UserName);
    	
    }

}



