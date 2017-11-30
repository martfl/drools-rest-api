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

/**
 *
 * @author salaboy
 */
@ApplicationScoped
public class HomeCategorizationServiceImpl implements HomeCategorizationService {

    @Inject
    @KReleaseId(groupId = "org.drools.workshop", artifactId = "drools-user-kjar", version = "1.0-SNAPSHOT")
    @KSession
    private KieSession kSession;

    public HomeCategorizationServiceImpl() {
    }

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
