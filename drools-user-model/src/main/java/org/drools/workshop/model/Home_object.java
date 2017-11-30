/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Home_object {
    
    private String name;
    private Integer place;
    private Integer id;
    private String category;
    private float energy;
    private boolean state;

    public Home_object() {
    }

    public Home_object(String name,
                        Integer place,
                        Integer id,
                        String category,
                        float energy,
                        boolean state) {
        this.name = name;
        this.place = place;
        this.id = id;
        this.category = category;
        this.energy = energy;
        this.state = state;
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

    @Override
    public String toString() {
        return "Object{" + "name=" + name + ", id=" + id + ", category=" + category + '}';
    }

   
    
    
}
