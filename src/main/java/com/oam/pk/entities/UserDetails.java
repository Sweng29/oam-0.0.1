package com.oam.pk.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
@Table
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Min(value = 3, message = "Username should be more or equal to 3 characters.")
    @Column(unique = true, nullable = false, updatable = false)
    private String username;
    @Min(value = 3, message = "First name should be more or equal to 3 characters.")
    private String firstName;
    private String middleName;
    private String lastName;
    @Email
    @Column(nullable = false, unique = true, updatable = false)
    private String email;
    @Min(value = 6, message = "Password length should be more then 5 characters.")
    private String password;
    private Date dateOfBirth;
    private Short isActive = 1;

    public UserDetails() {
    }

    public UserDetails(Long userId, String username, String firstName, String middleName, String lastName, String email, String password, Date dateOfBirth, Short isActive) {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.isActive = isActive;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
