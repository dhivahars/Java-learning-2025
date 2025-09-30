package PracticeCodes.streamsExcercise.eCommerce;

import java.util.*;
import java.util.stream.Collectors;

import static PracticeCodes.firstWeek.streamsExcercise.eCommerce.Status.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Orders> orders=new ArrayList<>();
        orders.add(new Orders(1,"Martin",COMPLETED,10000));
        orders.add(new Orders(2,"Shelby",PENDING,1000));
        orders.add(new Orders(3,"Tim",CANCELLED,2500));
        orders.add(new Orders(4,"Jersey",CANCELLED,5500));
        orders.add(new Orders(5,"Dakota",PENDING,87834));
        orders.add(new Orders(6,"Scarlett",COMPLETED,3200));
        //Excercise-1
        System.out.println("Completed Orders");
        System.out.println("_______________________________________");
        orders.stream().filter(a->a.getOrder_status()==COMPLETED)
                .forEach(System.out::println);
        //Excercise-2
        System.out.println("\nTotal Revenue from Orders");
        System.out.println("_______________________________________");
        double sum=orders.stream().filter(a -> a.getOrder_status() == COMPLETED)
                .mapToDouble(Orders::getAmount).sum();
        System.out.println(sum);
        //Excercise-3
        System.out.println("\nCustomers Ordered more than 2000");
        System.out.println("_______________________________________");
        orders.stream().filter(a->a.getAmount()>2000).map(Orders::getCustomerName).forEach(System.out::println);
        //Excercise-4
        System.out.println("\nCancelled Orders count");
        System.out.println("_______________________________________");
        System.out.println(orders.stream().filter(a->a.getOrder_status()==CANCELLED).count());
        //Excercise-5
        System.out.println("\nOrder of Max Amount");
        System.out.println("_______________________________________");
        Orders max=orders.stream()
                .max(Comparator.comparing(Orders::getAmount)).get();
        System.out.println(max);
    }
}
