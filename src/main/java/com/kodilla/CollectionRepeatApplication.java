package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CollectionRepeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectionRepeatApplication.class, args);

        String CompaniesList = "";

        ArrayList<String> companies = new ArrayList<String>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        for(int i=0; i <= companies.size()-1; i++) {
            if (i < companies.size()-1) {
                CompaniesList+=companies.get(i)+", ";
            }
            else {
                CompaniesList+=companies.get(i);
            }
        }

        System.out.println(CompaniesList);

    }

}
