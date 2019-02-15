package com.zipcodewilmington.phonebook;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

  PhoneBook phoneBook = new PhoneBook();

// @Before
//
//      public void setup() {
//
//   phoneBook.add ("Neela", "212-905-9087");


//  @After
//
//  public void tearDown() {
//
//    entries.clear();
//}

  @Test

  public void addTest () {//String name, String phoneNumber){

  //Given

    String name = "Neela";
    String ph1 = "210-567-6759";
    String ph2 = "565-765-8765";
    ArrayList phoneNumber = new ArrayList <String>();
    phoneNumber.add(ph1);
    phoneNumber.add(ph2);


//     String name = "Adrish";
//     ArrayList phoneNumber = "212-567-6754";
    //When
    phoneBook.add (name, phoneNumber);
    ArrayList actual = phoneBook.lookup(name);
    //Boolean bool = phoneBook.hasEntry(name);

    //Then
    //Assert.assertTrue(bool);
    Assert.assertEquals(phoneNumber, actual);

  }

  @Test

  public void addTest2 () {//String name, String phoneNumber){

    //Given

    String name = "Neela";
    String ph1 = "210-567-8888";
    String ph2 = "565-765-6666";
    ArrayList phoneNumber = new ArrayList <String>();
    phoneNumber.add(ph1);
    phoneNumber.add(ph2);


//     String name = "Adrish";
//     ArrayList phoneNumber = "212-567-6754";
    //When
    phoneBook.add (name, phoneNumber);
    ArrayList actual = phoneBook.lookup(name);
    //Boolean bool = phoneBook.hasEntry(name);

    //Then
    //Assert.assertTrue(bool);
    Assert.assertEquals(phoneNumber, actual);

  }

  @Test

  public void removeAllTest () {

    //Given

    String name = "Mike";
    String ph1 = "210-567-6758";
    String ph2 = "565-765-8065";
    ArrayList phoneNumber = new ArrayList <String>();

//    String name = "Mike";
//    ArrayList phoneNumber = "216-567-6759";

    phoneBook.add (name, phoneNumber);
    //When
    phoneBook.removeAll(name);
    ArrayList actual = phoneBook.lookup(name);


    //Then

    Assert.assertNull(actual);

  }

  @Test

  public void lookupTest () {

    //Given

    String name = "David";
    String ph1 = "219-567-6758";
    String ph2 = "561-765-8065";
    ArrayList phoneNumber = new ArrayList <String>();

//    String name = "David";
//    ArrayList phoneNumber = "219-567-6759";

    phoneBook.add (name, phoneNumber);
    //When

    ArrayList actual = phoneBook.lookup(name);


    //Then

    Assert.assertEquals(phoneNumber, actual);

  }

  @Test

  public void reverseLookupTest () {

    //Given

    String name = "Neela";
    //ArrayList phoneNumber ;
    String ph1 = "210-567-6759";
    String ph2 = "565-765-8765";
    ArrayList phoneNumber = new ArrayList <String>();
    phoneNumber.add(ph1);
    phoneNumber.add(ph2);

    phoneBook.add (name, phoneNumber);
    //When

    String actual = phoneBook.reverseLookup(ph2);


    //Then

    Assert.assertEquals(name, actual);

  }

  @Test
  public void displayTest () {

    //Given

    String name = "Neela";
    String ph1 = "210-567-6759";
    String ph2 = "565-765-8765";
    String ph3 = "777-777-7777";
    ArrayList phoneNumber = new ArrayList <String>();
    phoneNumber.add(ph1);
    phoneNumber.add(ph2);

    phoneBook.add (name, phoneNumber);
    phoneNumber.add(ph3);
    //phoneBook .add(name, phoneNumber);
    //phoneBook.add ( "Adrish", "243-765-7654");
    //When

    phoneBook.display();

    //Then

    //Assert.assertEquals(name, actual);

  }

  @Test

  public void removeTest () {

    //Given

    String name = "Mike";
    String ph1 = "210-567-6758";
    String ph2 = "565-765-8065";
    ArrayList phoneNumber = new ArrayList <String>();
    phoneNumber.add(ph1);
    phoneNumber.add(ph2);

//    String name = "Mike";
//    ArrayList phoneNumber = "216-567-6759";

    phoneBook.add (name, phoneNumber);

    phoneBook.display();

    //When

    phoneBook.remove(ph1);


    //Then



    phoneBook.display();

  }










}


