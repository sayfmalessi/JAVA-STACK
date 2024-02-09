package com.caresoft.clinicapp;
import java.util.ArrayList;
public interface HIPAACompliantAdmin {
	abstract ArrayList<String> reportSecurityIncidents();
    
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("pass");
        }
        else {
            System.out.println("faiil");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
}
