package com.bootcoding.oops.exercise2;

import java.io.OptionalDataException;

public class Faculty {

    public static void startProjector(String name) {
        System.out.println("Projector has been started");
    }
    public static void stopProjector(String name){
        System.out.println("Projector has been stopped");
    }

    public void removeProjector(Projector[] projectors) {
        System.out.println("Projector has been removed!!");

        for(int i = 0; i < projectors.length; i++){
            System.out.println("Removed " + projectors[i].name);


        }


    }

    }

