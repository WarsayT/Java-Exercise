package com.timbuchalka;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public MobilePhone() {

    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        } else {
            return myContacts.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) == -1) {
            return false;
        }
        return myContacts.remove(oldContact) && myContacts.add(newContact);

    }

    public boolean removeContact(Contact contact) {
        return findContact(contact) != -1 && myContacts.remove(contact);
    }
    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }
    private int findContact(String name) {
        for (int i = 0; i<myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public  Contact queryContact(String name){
        int pos=findContact(name);
        if(pos>=0){
            return this.myContacts.get(pos);
        }
        return null;

    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i< myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
