package tn.AutoEcoleMAa.jwt.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;


@Entity 
public class StudentConduite extends Student{;
    private int ConduiteNumberHours;
    private boolean ConduiteTestPass;
    @ElementCollection
    private Set<LocalDate> ConduiteTestDates;
    @ElementCollection
    private Set<Integer> ConduiteTestNumberList;
    private boolean ConduiteTestPaid;
    
    
    
    public StudentConduite() {}
    
    
    public StudentConduite(String userName, String userFirstName, String userLastName, String userPassword,
            Set<Role> role, String studentCin, LocalDate studentDateCin, String studentAddress, String studentPhone, int ConduiteNumberHours, boolean ConduiteTestPass, Set<LocalDate> ConduiteTestDates, Set<Integer> ConduiteTestNumberList, boolean ConduiteTestPaid) {

        super(userName, userFirstName, userLastName, userPassword, role, studentCin, studentDateCin, studentAddress,studentPhone);
        this.ConduiteNumberHours = ConduiteNumberHours;
        this.ConduiteTestPass = ConduiteTestPass;
        this.ConduiteTestDates = ConduiteTestDates;
        this.ConduiteTestNumberList = ConduiteTestNumberList;
        this.ConduiteTestPaid = ConduiteTestPaid;
    }
    
    
    
	public int getConduiteNumberHours() {
		return ConduiteNumberHours;
	}
	public void setConduiteNumberHours(int conduiteNumberHours) {
		ConduiteNumberHours = conduiteNumberHours;
	}
	public boolean isConduiteTestPass() {
		return ConduiteTestPass;
	}
	public void setConduiteTestPass(boolean conduiteTestPass) {
		ConduiteTestPass = conduiteTestPass;
	}
	public Set<LocalDate> getConduiteTestDates() {
		return ConduiteTestDates;
	}
	public void setConduiteTestDates(Set<LocalDate> conduiteTestDates) {
		ConduiteTestDates = conduiteTestDates;
	}
	public Set<Integer> getConduiteTestNumberList() {
		return ConduiteTestNumberList;
	}
	public void setConduiteTestNumberList(Set<Integer> conduiteTestNumberList) {
		ConduiteTestNumberList = conduiteTestNumberList;
	}
	public boolean isConduiteTestPaid() {
		return ConduiteTestPaid;
	}
	public void setConduiteTestPaid(boolean conduiteTestPaid) {
		ConduiteTestPaid = conduiteTestPaid;
	}

}
