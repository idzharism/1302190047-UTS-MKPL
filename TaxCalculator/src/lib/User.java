package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
    private boolean isForeigner;
	private boolean gender; //true = Laki-laki, false = Perempuan


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsForeigner() {
        return this.isForeigner;
    }

    public boolean getIsForeigner() {
        return this.isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public boolean isGender() {
        return this.gender;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}