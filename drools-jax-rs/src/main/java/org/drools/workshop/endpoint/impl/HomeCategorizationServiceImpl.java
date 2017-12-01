package org.drools.workshop.endpoint.impl;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.drools.workshop.model.*;
import org.kie.api.runtime.rule.FactHandle;
import org.drools.workshop.endpoint.api.HomeCategorizationService;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;


@ApplicationScoped
public class HomeCategorizationServiceImpl implements HomeCategorizationService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public HomeCategorizationServiceImpl() {
    }

    //--------------------- Aire Acondicionado -----------------------------------------
    @Override
    public AireCondicionado setAire(AireCondicionado aire) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Aire: " + aire);
        kSession.insert(aire);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return aire;

    }

    @Override
    public List<AireCondicionado> getAires() {
        List<AireCondicionado> aires = new ArrayList<AireCondicionado>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof AireCondicionado) {
                aires.add((AireCondicionado) o);
            }
        }
        return aires;
    }

    @Override
    public AireCondicionado deleteAire(String name) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof AireCondicionado) {
                AireCondicionado other_aire = (AireCondicionado) o;
                if(other_aire.getName() == name) {
                    FactHandle handle = kSession.insert(other_aire);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    //--------------------- Focos -----------------------------------------
    @Override
    public Foco setFoco(Foco foco) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Foco: " + foco);
        kSession.insert(foco);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return foco;

    }

    @Override
    public List<Foco> getFocos() {
        List<Foco> focos = new ArrayList<Foco>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Foco) {
                focos.add((Foco) o);
            }
        }
        return focos;
    }

    @Override
    public Foco deleteFoco(String name) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof Foco) {
                Foco other_foco = (Foco) o;
                if(other_foco.getName() == name) {
                    FactHandle handle = kSession.insert(other_foco);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    //--------------------- Sensores de Temperatura -----------------------------------------
    @Override
    public SensorTemperatura setSensorTemp(SensorTemperatura sensorTemp) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Sensor: " + sensorTemp);
        kSession.insert(sensorTemp);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorTemp;

    }

    @Override
    public List<SensorTemperatura> getsensoresTemp() {
        List<SensorTemperatura> sensoresTemp = new ArrayList<SensorTemperatura>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorTemperatura) {
                sensoresTemp.add((SensorTemperatura) o);
            }
        }
        return sensoresTemp;
    }

    @Override
    public SensorTemperatura deleteSensorTemp   (String name) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof SensorTemperatura) {
                SensorTemperatura other_sensorTemp = (SensorTemperatura) o;
                if(other_sensorTemp.getName() == name) {
                    FactHandle handle = kSession.insert(other_sensorTemp);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    //--------------------- Sensores de Presencia -----------------------------------------
    @Override
    public SensorPresencia setSensorPre(SensorPresencia sensorPre) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Sensor de Presencia: " + sensorPre);
        kSession.insert(sensorPre);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensorPre;

    }

    @Override
    public List<SensorPresencia> getSensoresPre() {
        List<SensorPresencia> sensores = new ArrayList<SensorPresencia>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof SensorPresencia) {
                sensores.add((SensorPresencia) o);
            }
        }
        return sensores;
    }

    @Override
    public SensorPresencia deleteSensorPre  (String name) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof SensorPresencia) {
                SensorPresencia other_sensorPre = (SensorPresencia) o;
                if(other_sensorPre.getName() == name) {
                    FactHandle handle = kSession.insert(other_sensorPre);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    //--------------------- Sensores -----------------------------------------
    @Override
    public Sensor setSensor(Sensor sensor) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Sensor de Presencia: " + sensor);
        kSession.insert(sensor);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return sensor;

    }

    @Override
    public List<Sensor> getSensores() {
        List<Sensor> sensores = new ArrayList<Sensor>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Sensor) {
                sensores.add((Sensor) o);
            }
        }
        return sensores;
    }

    @Override
    public Sensor deleteSensor  (String name) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof Sensor) {
                Sensor other_sensor = (Sensor) o;
                if(other_sensor.getName() == name) {
                    FactHandle handle = kSession.insert(other_sensor);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    //--------------------- Lugares -----------------------------------------
    @Override
    public Place setplace(Place place) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Place: " + place);
        kSession.insert(place);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return place;

    }

    @Override
    public Place deleteplace(Integer id) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof Place) {
                Place other_place = (Place) o;
                if(other_place.getId() == id) {
                    FactHandle handle = kSession.insert(other_place);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    @Override
    public List<Place> getplaces() {
        List<Place> places = new ArrayList<Place>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Place) {
                places.add((Place) o);
            }
        }
        return places;
    }

    //--------------------- Object -----------------------------------------
    @Override
    public Home_object setobject(Home_object object) {
        System.out.println(">> kSession: " + kSession);
        printKieSessionAllFacts(kSession);
        System.out.println(">> Object: " + object);
        kSession.insert(object);
        int fired = kSession.fireAllRules();
        System.out.println(">> Fired: " + fired);
        return object;

    }

    @Override
    public Home_object deleteobject(Integer id) {
        for (Object o : kSession.getObjects()) {
            if ( o instanceof Home_object) {
                Home_object other_object = (Home_object) o;
                if(other_object.getId() == id) {
                    FactHandle handle = kSession.insert(other_object);
                    kSession.delete(handle);
                    kSession.fireAllRules();
                    return null;
                }
            }
        }   return null;
    }

    @Override
    public List<Home_object> getobjects() {
        List<Home_object> objects = new ArrayList<Home_object>();
        for (Object o : kSession.getObjects()) {
            if (o instanceof Home_object) {
                objects.add((Home_object) o);
            }
        }
        return objects;
    }

    private void printKieSessionAllFacts(KieSession kSession) {
        System.out.println(" >> Start - Printing All Facts in the Kie Session");
        for (Object o : kSession.getObjects()) {
            System.out.println(">> Fact: " + o);
        }
        System.out.println(" >> End - Printing All Facts in the Kie Session");
    }

}
