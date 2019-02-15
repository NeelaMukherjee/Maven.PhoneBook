package com.zipcodewilmington.phonebook;

import java.util.TreeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;


/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    //TreeMap<String, String> entries;

    TreeMap<String, ArrayList<String>> entries = new TreeMap<String, ArrayList<String>>();

    ArrayList <String> phoneNumber = new ArrayList<String>();




    //Constructor
    public PhoneBook() {

    }

//    // has Entry
//
//    public Boolean hasEntry(String name) {
//
//        return entries.containsKey(name);}



    // Add an entry to the phone book
    public void add(String name, ArrayList phoneNumber) {

        if(entries.containsKey(name)){

            phoneNumber.add(phoneNumber);
            entries.put(name, phoneNumber);
        }
        else {

            entries.put(name, phoneNumber);
        }
    }


    //Removes an entry from the phone book
    public void removeAll(String name) {


        entries.remove(name);

    }

    // returns a phone number for the respective input name
    public ArrayList<String> lookup(String name) {

        return entries.get(name);
    }

    //returns a name for the respective input phoneNumber
    public String reverseLookup(String ph1) {
        String name = "";
        Set set = entries.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {

            Map.Entry<String, ArrayList<String>> mentry = (Map.Entry) iterator.next();
            ArrayList<String> phoneNumbers = mentry.getValue();

            if (phoneNumbers.contains(ph1)) {
                name = mentry.getKey();
                break;
            }
        }


        return name;
    }

    //print a human-readable list of all entries (names and phone numbers) in alphabetical order.
    public void display() {


        Set set = entries.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print(mentry.getKey()+ " ");
            System.out.println(mentry.getValue());

        }

    }

    // removes a phone number and do not delete the entry
    public void remove(String ph9){

        String name1 =reverseLookup(ph9);
        ArrayList phoneNum = new ArrayList <String>();

        phoneNum = lookup(name1);

        phoneNum.remove(ph9);


    }


}



