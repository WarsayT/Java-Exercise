package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        MobilePhone contactList = new MobilePhone("980980980");
        Contact contact1 = Contact.createContact("Warsay", "052328328");
        Contact contact2 = Contact.createContact("abiel", "86736478");
        Contact contact3 = Contact.createContact("Warsayq", "876757657");
        Contact contact4 = Contact.createContact("Haben", "90843433");
        Contact contact5 = Contact.createContact("Sien", "342355454");
        contactList.addNewContact(contact1);
        contactList.addNewContact(contact2);
        contactList.addNewContact(contact3);
        contactList.addNewContact(contact4);
        contactList.addNewContact(contact5);

        contactList.printContacts();
        System.out.println(contactList.queryContact("Sien").getPhoneNumber());

//        System.out.println(contactList.queryContact("Warsay"));

    }
}