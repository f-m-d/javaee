/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3.beanvalidation;

import javax.validation.constraints.NotNull;

/**
 *
 * @author dauri
 */
public class Address {
    
    
    @NotNull
    private String street1;
    private String street2;
    
    @NotNull
    private String city;
    private String state;
    
    @NotNull @ZipCode
    private String zipCode;
    private String county;

    public Address() {
    }

    public Address(String street1, String city, String zipCode) {
        this.street1 = street1;
        this.city = city;
        this.zipCode = zipCode;
    }



    
    
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    
    
}
