/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Home_object {
    
    public String name;
    public Integer place;
    public Integer id;
    public String category;
    public float energy;
    public boolean state;
    public float temp;
    public float illumination;

    public Home_object() {
    }

    public Home_object(String name,
                        Integer place,
                        Integer id,
                        String category,
                        float energy,
                        boolean state,
                        float temp,
                        float illumination) {
        this.name = name;
        this.place = place;
        this.id = id;
        this.category = category;
        this.energy = energy;
        this.state = state;
        this.temp = temp;
        this.illumination = illumination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer id) {
        this.id = id;
    }

    public Integer getPlace() {
        return id;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public float getIllumination() {
        return illumination;
    }

    public void setIllumination(float illumination) {
        this.illumination = illumination;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Object{" + "name=" + name + ", id=" + id + ", category=" + category + '}';
    }

   
    
    
}
