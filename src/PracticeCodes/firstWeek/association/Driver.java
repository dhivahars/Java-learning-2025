package PracticeCodes.firstWeek.association;

public class Driver {
    private static Car car;

    public static void main(String[] args) {
        Driver d=new Driver();
        d.car=new Car("Rolls Royce","Lary","pthalo green","Dhivahar");
        System.out.println(car.showDetails());
    }
}
