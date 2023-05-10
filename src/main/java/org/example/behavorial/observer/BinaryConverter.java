package org.example.behavorial.observer;

public class BinaryConverter extends Observer{
    public BinaryConverter (Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("Değişen yeni değerin Binary Değeri : " + Integer.toBinaryString(number));

    }
}
