package com.timbuchalka;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
