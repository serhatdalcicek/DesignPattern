package org.example.creational.protoype;

public class Main {
    public static void main(String[] args) {

        Sheep originalSheep = new Sheep("Lorry");
        System.out.println(originalSheep);
        System.out.println(originalSheep.name);

        Sheep cloneSheep = (Sheep) originalSheep.makeCopy();


        System.out.println(cloneSheep);
        System.out.println(cloneSheep.name);

        Sheep sheep2 = originalSheep;
        sheep2 = originalSheep;
        System.out.println(sheep2);
        System.out.println(sheep2.name);

    }
}
