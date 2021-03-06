package controller;
// Generated 23/11/2014 10:45:47 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer cusCod;
     private User user;
     private String name;
     private String cpf;
     private String cnpj;
     private String phone;
     private String street;
     private Integer number;
     private String district;
     private String city;
     private String state;
     private String country;
     private Set advertisements = new HashSet(0);

    public Customer() {
    }

    public Customer(User user, String name, String cpf, String cnpj, String phone, String street, Integer number, String district, String city, String state, String country, Set advertisements) {
       this.user = user;
       this.name = name;
       this.cpf = cpf;
       this.cnpj = cnpj;
       this.phone = phone;
       this.street = street;
       this.number = number;
       this.district = district;
       this.city = city;
       this.state = state;
       this.country = country;
       this.advertisements = advertisements;
    }
   
    public Integer getCusCod() {
        return this.cusCod;
    }
    
    public void setCusCod(Integer cusCod) {
        this.cusCod = cusCod;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public Set getAdvertisements() {
        return this.advertisements;
    }
    
    public void setAdvertisements(Set advertisements) {
        this.advertisements = advertisements;
    }




}


