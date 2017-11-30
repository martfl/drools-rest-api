package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Foco {

	public String name;
    public Integer instensity;
    public String place;
    public boolean state;
    public float energyThreshold;
    
    public AireCondicionado() {
    }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setIntensity(Integer instensity) {
      this.instensity = instensity;
   }

   public Integer getIntensity() {
      return instensity;
   }

   public void setPlace(String place) {
      this.place = place;
   }

   public String getPlace() {
      return place;
   }

   public void setEnergyThreshold(float energyThreshold) {
      this.energyThreshold = energyThreshold;
   }

   public float getEnergyThreshold() {
      return energyThreshold;
   }

   public void setState(boolean state) {
      this.state = state;
   }

   public boolean getState() {
      return state;
   }
    
    @Override
    public String toString() {
        return "Foco{" + "Nombre=" + name + ", estado=" + state +'}';
    }
    
    public AireCondicionado(String name, Integer instensity, String place, boolean state, float energyThreshold){
        this.name = name;
        this.instensity = instensity;
        this.place = place;
        this.state = state;
        this.energyThreshold = energyThreshold;
    }

}