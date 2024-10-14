package org.amazon.lab3_06.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;
    public Name(String firstName, String lastName, String middleName, String salutation) {}

    public Name() {

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getSalutation() {
        return salutation;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                '}';
    }
}
