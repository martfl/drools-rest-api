package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AireCondicionado {
    
    public String name;
    public Integer instensity;
    public String place;
    public float energyThreshold;
    public Integer temperature;
    
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

   public void setTemperature(Integer temperature) {
      this.temperature = temperature;
   }

   public Integer getTemperature() {
      return temperature;
   }
    
    @Override
    public String toString() {
        return "AireCondicionado{" + "Nombre=" + name'}';
    }
    
    public AireCondicionado(String name, Integer instensity, String place, float energyThreshold, Integer temperature){
        this.name = name;
        this.instensity = instensity;
        this.place = place;
        this.energyThreshold = energyThreshold;
        this.temperature = temperature;
    }
    
    
    
}
