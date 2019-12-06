package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//LIST TO STREAM
//        List<Contact> contacts = new ArrayList<Contact>();
//
//        contacts.add(new Contact(1,"Jakub","774724982"));
//        contacts.add(new Contact(1,"Lukas","798654321"));
//        contacts.add(new Contact(1,"Petr","159465375"));
//        contacts.add(new Contact(1,"Frantisek","321489657"));
//
////        contacts.forEach(System.out::println); //this makes the same but I am not able to filter
//        contacts.stream().filter(contact -> contact.getNumber().startsWith("7")).forEach(System.out::println);
//        System.out.println(contacts.stream().count()); // print number of items in the stream

//MAP TO STREAM
//        Map<Integer,Contact> map = new HashMap<>();
//        map.put(1,new Contact(1,"Jakub","774724982"));
//        map.put(2,new Contact(2,"Lukas","645879321"));
//        map.put(3,new Contact(3,"Petr","789465123"));
//
//        map

        var array = new int[]{1,2,3,4,5,1,2,3,5,7,8,3,2,4,2,3,2,4,22};
        Arrays.stream(array).distinct().sorted().forEach(System.out::println);
        System.out.println();
        Arrays.stream(array).distinct().sorted().map(number -> 2*number).forEach(System.out::println);
        //Arrays.stream(array).min(Comparator.comparingInt());
    }
}
