package Task3;

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
    customers.add(new Customer("Luis","Henrique","Tass",50));
    customers.add(new Customer("Jakob","Husen","JHH",45));
    customers.add(new Customer("Bokaj","Nesuh","BNH",40));
    customers.add(new Customer("Steen","Jørgensen","Stone",30));
    customers.add(new Customer("Ghita","Egonson","Nørby",25));

    printCustomers();
    }

    static void printCustomers(){
        for(Customer s: customers){

            System.out.println(s);
        }
    }

}
