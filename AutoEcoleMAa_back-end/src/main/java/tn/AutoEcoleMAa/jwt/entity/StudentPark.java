package tn.AutoEcoleMAa.jwt.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class StudentPark extends Student {
    private int ParkNumberHours;
    private boolean ParkTestPass;
    @ElementCollection
    private Set<LocalDate>ParkTestDates;
    @ElementCollection
    private Set<Integer> ParkTestNumberList;
    private boolean ParkTestPaid;
    
    
    
    public StudentPark() {}

    public StudentPark(String userName, String userFirstName, String userLastName, String userPassword,
            Set<Role> role, String studentCin, LocalDate studentDateCin, String studentAddress, String studentPhone, int ParkNumberHours, boolean ParkTestPass, Set<LocalDate> ParkTestDates, Set<Integer> ParkTestNumberList, boolean ParkTestPaid) {

        super(userName, userFirstName, userLastName, userPassword, role, studentCin, studentDateCin, studentAddress,
                studentPhone);
        
        this.ParkNumberHours = ParkNumberHours;
        this.ParkTestPass = ParkTestPass;
        this.ParkTestDates = ParkTestDates;
        this.ParkTestNumberList = ParkTestNumberList;
        this.ParkTestPaid = ParkTestPaid;
    }
    
    
    
	public int getParkNumberHours() {
		return ParkNumberHours;
	}
	public void setParkNumberHours(int parkNumberHours) {
		ParkNumberHours = parkNumberHours;
	}
	public boolean isParkTestPass() {
		return ParkTestPass;
	}
	public void setParkTestPass(boolean parkTestPass) {
		ParkTestPass = parkTestPass;
	}
	public Set<LocalDate> getParkTestDates() {
		return ParkTestDates;
	}
	public void setParkTestDates(Set<LocalDate> parkTestDates) {
		ParkTestDates = parkTestDates;
	}
	public Set<Integer> getParkTestNumberList() {
		return ParkTestNumberList;
	}
	public void setParkTestNumberList(Set<Integer> parkTestNumberList) {
		ParkTestNumberList = parkTestNumberList;
	}
	public boolean isParkTestPaid() {
		return ParkTestPaid;
	}
	public void setParkTestPaid(boolean parkTestPaid) {
		ParkTestPaid = parkTestPaid;
	}
}
