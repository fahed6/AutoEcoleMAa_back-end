package tn.AutoEcoleMAa.jwt.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;


@Entity
public class StudentCode extends Student {
	
	@ElementCollection
    private Set<Integer> codeTestScores;
    private int codeNumberHours;
    private boolean codeTestPass;
    @ElementCollection
    private Set<LocalDate> codeTestDates;
    @ElementCollection
    private Set<Integer> CodeTestNumberList;
    private boolean CodeTestPaid;

    public StudentCode() {
        // Default constructor
    }

    public StudentCode(String userName, String userFirstName, String userLastName, String userPassword,
            Set<Role> role, String studentCin, LocalDate studentDateCin, String studentAddress, String studentPhone,
            Set<Integer> codeTestScores, int codeNumberHours, boolean codeTestPass, Set<LocalDate> codeTestDates,
            Set<Integer> CodeTestNumberList, boolean CodeTestPaid) {

        super(userName, userFirstName, userLastName, userPassword, role, studentCin, studentDateCin, studentAddress,
                studentPhone);
        this.codeTestScores = codeTestScores;
        this.codeNumberHours = codeNumberHours;
        this.codeTestPass = codeTestPass;
        this.codeTestDates = codeTestDates;
        this.CodeTestNumberList = CodeTestNumberList;
        this.CodeTestPaid = CodeTestPaid;
    }

	
	
	public Set<Integer> getCodeTestScores() {
		return codeTestScores;
	}
	public void setCodeTestScores(Set<Integer> codeTestScores) {
		this.codeTestScores = codeTestScores;
	}
	public int getCodeNumberHours() {
		return codeNumberHours;
	}
	public void setCodeNumberHours(int codeNumberHours) {
		this.codeNumberHours = codeNumberHours;
	}
	public boolean isCodeTestPass() {
		return codeTestPass;
	}
	public void setCodeTestPass(boolean codeTestPass) {
		this.codeTestPass = codeTestPass;
	}
	public Set<LocalDate> getCodeTestDates() {
		return codeTestDates;
	}
	public void setCodeTestDates(Set<LocalDate> codeTestDates) {
		this.codeTestDates = codeTestDates;
	}
	public Set<Integer> getCodeTestNumberList() {
		return CodeTestNumberList;
	}
	public void setCodeTestNumberList(Set<Integer> codeTestNumberList) {
		CodeTestNumberList = codeTestNumberList;
	}
	public boolean isCodeTestPaid() {
		return CodeTestPaid;
	}
	public void setCodeTestPaid(boolean codeTestPaid) {
		CodeTestPaid = codeTestPaid;
	}
	
}
