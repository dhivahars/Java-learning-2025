package PracticeCodes.association;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String owner;
    private Engine engineType;

    public Car(String brand, String model, String color, String owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.owner = owner;
        this.engineType=new Engine("b-range petrol Engines");
    }
    String showDetails(){
        return "Brand:"+brand+"\nModel:"+model+"\nColor:"+color+"\nOwner:"+owner+"\nEngine Type:"+engineType.getType();
    }
}
