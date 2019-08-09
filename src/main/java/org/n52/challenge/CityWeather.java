/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.n52.challenge;

import java.util.Date;

/**
 *
 * @author mohammed
 */
public class CityWeather {
    
    
    private Data data;
    private String city;
    private Date time;
    

    public CityWeather() {
    }
    
    public CityWeather(Data data, Date time, String city) {
        this.data = data;
        this.time = time;
        this.city = city;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
}
