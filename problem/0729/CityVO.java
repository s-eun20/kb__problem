package com.multi.mvc02.web02;
import lombok.Data;

@Data
public class CityVO {
    private int ID;
    private String name;
    private String CountryCode;
    private String District;
    private int Population;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return District;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public int getPopulation() {
        return Population;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "CityVO{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}
