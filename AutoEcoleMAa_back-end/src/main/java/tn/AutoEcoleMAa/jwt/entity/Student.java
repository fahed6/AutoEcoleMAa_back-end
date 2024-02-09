package tn.AutoEcoleMAa.jwt.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Student extends User {
	private String studentCin;
	private LocalDate studentDateCin;
	private String studentAddress;
	private String studentPhone;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinTable(name = "student_images",
     joinColumns = {
             @JoinColumn(name = "student_id")
     },
     inverseJoinColumns = {
             @JoinColumn(name = "image_id")
     }
)
	 private Set<ImageModel> StudentImage;

	   


	
	public Student() {}
	
	
	public Student (String userName, String userFirstName, String userLastName, String userPassword,Set<Role> role,String studentCin,LocalDate studentDateCin,String studentAddress,String studentPhone){
		
		super(userName,userFirstName,userLastName,userPassword,role);
		this.studentCin=studentCin;
		this.studentDateCin=studentDateCin;
		this.studentAddress=studentAddress;
		this.studentPhone=studentPhone;
	}
	
	
	 public Set<ImageModel> getStudentImage() {
	        return StudentImage;
	    }

	 public void setStudentImage(Set<ImageModel> StudentImage) {
	        this.StudentImage = StudentImage;
	    }
	
	
	public String getStudentCin() {
		return studentCin;
	}
	public void setStudentCin(String studentcin) {
		this.studentCin = studentcin;
	}
	public LocalDate getStudentDateCin() {
		return studentDateCin;
	}
	public void setStudentDateCin(LocalDate studentDateCin) {
		this.studentDateCin = studentDateCin;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
}
