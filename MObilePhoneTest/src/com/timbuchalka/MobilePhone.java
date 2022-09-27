package com.timbuchalka;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<Contact>();
    }

    public MobilePhone() {

    }


    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println(contact.getName()+" already exists");
            return false;
        }
        Contact.createContact(contact.getName(), contact.getPhoneNumber());
        myContacts.add(contact);
        return true;
    }

    public  boolean updateContact(Contact oldData,Contact newData){
        int pos=findContact(oldData);
        if(pos < 0){
//            System.out.println(oldData.getName()+" already exist.Cannot update");
            return false;
        }
        this.myContacts.set(pos,newData);
//        System.out.println(oldData.getName()+" was replaced with "+newData.getName());
        return true;
    }

    public boolean removeContact(Contact removeData){
        int pos=findContact(removeData);
        if(pos>=0){
            this.myContacts.remove(pos);
//            System.out.println(removeData.getName()+" removed successfully");
            return true;
        }
//        System.out.println("contact not found");
        return false;
    }

    private  int findContact(Contact contact){
        int position=this.myContacts.indexOf(contact);
        return position;
    }
    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if((contact.getName()).equals(name)){
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
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println(this.myContacts.get(i).getName()+" -> "+this.myContacts.get(i).getPhoneNumber());
        }

    }

}
