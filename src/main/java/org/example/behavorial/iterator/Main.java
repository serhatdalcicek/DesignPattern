package org.example.behavorial.iterator;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new ConcreateCustomerRepository();
        Iterator iterator = customerRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println((iterator.getNext()));
        }
    }
}
