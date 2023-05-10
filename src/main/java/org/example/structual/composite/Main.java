package org.example.structual.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Serhat", "Dalcicek", 5000);
        Employee headOfSoftware = new Employee("Cem" , "Gündüz", 2000);
        Employee headOfSales = new Employee("Ayşe" , "Leke", 2000);

        Employee softwareDeveloper = new Employee("Ceylin","Doğan", 1000);
        Employee sales = new Employee("Furkan","Yağcı",500);

        CEO.add(headOfSoftware);
        CEO.add(headOfSales);

        headOfSoftware.add(softwareDeveloper);
        headOfSales.add(sales);

        System.out.println(CEO.toString());
        for (Employee head:CEO.subordinates){
           System.out.println(head.toString());
            for (Employee employee:head.subordinates){
                System.out.println(employee.toString());
            }
        }

    }
}
