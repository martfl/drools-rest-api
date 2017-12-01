package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class SensorTemperatura {

	public String place;
    public boolean state;
    public boolean connected;
    public float temperature;
    public String name;
    public String person;

    public SensorTemperatura() {
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state= state;
    }

    public boolean getConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected= connected;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature= temperature;
    }

    public void setPerson(String person) {
    	this.person = person;
    }

    public String getPerson() {
    	return person;
    }

    @Override
    public String toString() {
        return "Sensor{" + "Persona =" + person + "se encuentra en =" + place + '}';
    }
    
    public SensorTemperatura(String place, boolean state, boolean connected, float temperature, String name, String person){
        this.place = place;
        this.state = state;
    	this.temperature = temperature;
    	this.name = name;
    	this.person = person;
    }

}