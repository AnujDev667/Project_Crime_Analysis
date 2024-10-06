package entity;

import java.util.Date;

public class Suspect {
    private int suspectID;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String contactInfo;

    // Default constructor
    public Suspect() {}

    // Parameterized constructor
    public Suspect(int suspectID, String firstName, String lastName, Date dateOfBirth, 
                   String gender, String contactInfo) {
        this.suspectID = suspectID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public int getSuspectID() { return suspectID; }
    public void setSuspectID(int suspectID) { this.suspectID = suspectID; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}
