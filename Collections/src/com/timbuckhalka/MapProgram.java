package com.timbuckhalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Python", "an interpreted high level, object-oriented programming language with dynamic semantics.");
        if (languages.containsKey("Java")) {
            System.out.println(languages.get("Java already exist in the map"));

        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language.");
            System.out.println("Java added to the map");
        }
        languages.put("Algol", "an algorithmic language.");
        languages.put("BASIC", "Beginners ALL Purposes Symbolic Instruction Code.");
        languages.put("Lisp", "Therein lies madness.");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java.");
            System.out.println(languages.get("Java has been added"));
        }

        System.out.println("========================================");
        System.out.println("before removing");
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
        System.out.println("===========================================");
        System.out.println("After removing");
//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language.")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        if (languages.replace("Lisp", "Therein lies madness.","A functional programming language.")) {
            System.out.println("Lisp was replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "this wont be added"));
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
