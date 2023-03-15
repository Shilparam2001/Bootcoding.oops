package com.bootcoding.oops.exercise2;

public class Application {
    public static void main(String[] args) {


        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        faculty.startProjector(projector.toString());
        faculty.stopProjector(projector.toString());
        Projector[] p = new Projector[3];
        for (int i = 0; i < p.length; i++) {
            Projector ps = new Projector();
            ps.name = "Projector" + i;
            p[i] = ps;

        }
        faculty.removeProjector(p);
    }
}
