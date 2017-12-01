package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class SensorPresencia {

	public String place;
    public boolean state;
    public boolean connected;
    public boolean presence;
    public String name;
    public String person;
    
    public SensorPresencia() {
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

    public boolean getPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence= presence;
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
    
    public SensorPresencia(String place, boolean state, boolean connected, boolean presence, String name, String person){
        this.place = place;
        this.state = state;
    	this.connected = connected;
    	this.presence = presence;
    	this.name = name;
    	this.person = person;
    }

}