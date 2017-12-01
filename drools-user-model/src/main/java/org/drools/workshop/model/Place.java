/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Place {
    
    private String name;
    private Integer id;
    private float temp_threshold;
    private float actual_temp;
    private float max_temp;
    private float min_temp;
    private float energy_threshold;
    private float actual_energy;
    private boolean movement;
    private float humidity;
    private float light;

    public Place() {
    }

    public Place(String name,
                Integer id,
                float temp_threshold,
                float actual_temp,
                float max_temp,
                float min_temp,
                float energy_threshold,
                float actual_energy,
                boolean movement,
                float humidity,
                float light) {
        this.name = name;
        this.id = id;
        this.temp_threshold = temp_threshold;
        this.actual_temp = actual_temp;
        this.max_temp = max_temp;
        this.min_temp = min_temp;
        this.energy_threshold = energy_threshold;
        this.actual_energy = actual_energy;
        this.movement = movement;
        this.humidity = humidity;
        this.light = light;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTemp_threshold() {
        return temp_threshold;
    }

    public void setTemp_threshold(float temp) {
        this.temp_threshold = temp;
    }

    public float getActual_temp() {
        return actual_temp;
    }

    public void setActual_temp(float temp) {
        this.actual_temp = temp;
    }

    public float getEnergy_threshold() {
        return energy_threshold;
    }

    public void setEnergy_threshold(float energy) {
        this.energy_threshold = energy;
    }

    public float getActual_energy() {
        return actual_energy;
    }

    public void setActual_energy(float energy) {
        this.actual_energy = energy;
    }

    public boolean getMovement() {
        return movement;
    }

    public void setMovement(boolean mov) {
        this.movement = mov;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humid) {
        this.humidity = humid;
    }

    public float getLight() {
        return light;
    }

    public void setLight(float lighght) {
        this.light = lighght;
    }

    public float getMinTemp() {
        return min_temp;
    }

    public void setMinTemp(float min_temp) {
        this.min_temp = min_temp;
    }

    public float getMaxTemp() {
        return max_temp;
    }

    public void setMaxTemp(float max_temp) {
        this.max_temp = max_temp;
    }

    @Override
    public String toString() {
        return "Place{" + "name=" + name + ", id=" + id + ", temp=" + actual_temp + '}';
    }

   
    
    
}
