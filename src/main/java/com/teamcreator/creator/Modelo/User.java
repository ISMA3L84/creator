package com.teamcreator.creator.Modelo;

import javax.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", updatable = false, nullable = false)
    private UUID uuid;

    @Column(name = "name")
    private String userName;

    @Column(name = "surname")
    private String userSurname;

    @Column(name = "dni")
    private String userDni;

    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate userBirthDate;//solo fecha

    @Email
    @Column(name = "email")
    private String emailUser;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "phone")
    private int userPhone;

    @Column(name = "address")
    private String userAddress;

    @Column(name = "city")
    private String userCity;

    @Column(name = "country")
    private String userCountry;

    @Column(name = "postal_code")
    private int userPostalCode;

    @Column(name = "role")
    private String userRole;

    @Column(name = "weigth")
    private double userWeigth;

    @Column(name = "height")
    private double userHeight;

    @Column(name = "consent")
    private boolean userConsent;

    @Column(name = "date_consent")
    private LocalDateTime userDateConsent;

    @Column(name = "active")
    private boolean userActive;

    @Column(name = "created_at")
    private LocalDateTime userCreatedAt;

    //Constructors
    public User() {
        this.uuid = UUID.randomUUID();
    }    

    public User(Long id, UUID uuid, String userName, String userSurname, String userDni, LocalDate userBirthDate,
            @Email String emailUser, String userPassword, int userPhone, String userAddress, String userCity,
            String userCountry, int userPostalCode, String userRole, double userWeigth, double userHeight,
            boolean userConsent, LocalDateTime userDateConsent, boolean userActive, LocalDateTime userCreatedAt) {
        this.id = id;
        this.uuid = UUID.randomUUID();
        this.userName = userName;
        this.userSurname = userSurname;
        this.userDni = userDni;
        this.userBirthDate = userBirthDate;
        this.emailUser = emailUser;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userCountry = userCountry;
        this.userPostalCode = userPostalCode;
        this.userRole = userRole;
        this.userWeigth = userWeigth;
        this.userHeight = userHeight;
        this.userConsent = userConsent;
        this.userDateConsent = userDateConsent;
        this.userActive = userActive;
        this.userCreatedAt = userCreatedAt;
    }

    //methods
    public boolean checkPassword(String rawPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, this.userPassword);
    }

    @Component
    public class StringToLocalDateTimeConverter implements Converter<String, LocalDateTime> {
    
        private static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    
        @Override
        public LocalDateTime convert(String source) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
            return LocalDateTime.parse(source, formatter);
        }
    }
    

    // Getters y setters
    public void setPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.userPassword = passwordEncoder.encode(password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserDni() {
        return userDni;
    }

    public void setUserDni(String userDni) {
        this.userDni = userDni;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public void setUserBirthDate(LocalDate userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public int getUserPostalCode() {
        return userPostalCode;
    }

    public void setUserPostalCode(int userPostalCode) {
        this.userPostalCode = userPostalCode;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public double getUserWeigth() {
        return userWeigth;
    }

    public void setUserWeigth(double userWeigth) {
        this.userWeigth = userWeigth;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public boolean isUserConsent() {
        return userConsent;
    }

    public void setUserConsent(boolean userConsent) {
        this.userConsent = userConsent;
    }

    public LocalDateTime getUserDateConsent() {
        return userDateConsent;
    }

    public void setUserDateConsent(LocalDateTime userDateConsent) {
        this.userDateConsent = userDateConsent;
    }

    public boolean isUserActive() {
        return userActive;
    }

    public void setUserActive(boolean userActive) {
        this.userActive = userActive;
    }

    public LocalDateTime getUserCreatedAt() {
        return userCreatedAt;
    }

    public void setUserCreatedAt(LocalDateTime userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

  // toString 
    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", userSurname=" + userSurname + ", userDni=" + userDni
                + ", userBirthDate=" + userBirthDate + ", emailUser=" + emailUser + ", userPassword=" + userPassword
                + ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", userCity=" + userCity
                + ", userCountry=" + userCountry + ", userPostalCode=" + userPostalCode + ", userRole=" + userRole
                + ", userWeigth=" + userWeigth + ", userHeight=" + userHeight + ", userConsent=" + userConsent
                + ", userDateConsent=" + userDateConsent + ", userActive=" + userActive + ", userCreatedAt="
                + userCreatedAt + "]";
    }
   
}
