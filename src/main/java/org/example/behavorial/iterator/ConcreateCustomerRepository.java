package org.example.behavorial.iterator;

public class ConcreateCustomerRepository implements CustomerRepository{
    private String customers[] = {"Halit","Musa","Serhat","Filiz","Mavi"};

    @Override
    public Iterator getIterator() {
        return new CustomerIterator(customers);
    }
}
