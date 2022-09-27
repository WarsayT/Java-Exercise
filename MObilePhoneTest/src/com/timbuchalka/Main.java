package com.timbuchalka;

public class Main {
    public static void main(String[] args) {

        MobilePhone myContactList = new MobilePhone();
        Contact contact3 = new Contact("SIem", "4543545345");
        Contact contact1 = new Contact("Warsay", "353532523");
        Contact contact2 = new Contact("Wars", "34245435");
////        Contact.createContact("Warsay", "3432542532");
        myContactList.addNewContact(contact1);
        myContactList.addNewContact(contact2);
        myContactList.addNewContact(contact3);
//        myContactList.addNewContact(Contact.createContact("Siem", "23423434"));
////        myContactList.queryContact("Wars");
        myContactList.printContacts();
//        System.out.println(contact1);
    }
}