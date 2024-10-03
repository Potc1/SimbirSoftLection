package lection_1;

import lection_1.Automobile;

public class SUV extends Automobile {
    private double price;
    private String typeOfAWD;
    public static boolean avalibleForTuning = true;
    public static String[] TuningOptions = new String[] {"Reinforced frame", "MudTires", "Tent"};
    public void SetPrice(double price) {
        this.price = price;
    }
    public void setTypeOfAWD(String typeOfAWD) {
        this.typeOfAWD = typeOfAWD;
    }
    SUV(String carModel, int hoursePowers, String manufacture, double price, String typeOfAWD ){
        super(carModel, hoursePowers);
        super.manufacture = manufacture;
        this.price = price;
        this.typeOfAWD = typeOfAWD;
    }
    public String GetTypeOfAWD(){
        return this.typeOfAWD;
    }
    public double GetPrice(){
        return this.price;
    }
    public void display(){
        System.out.printf("model: %s power: %s and born from: %s /n", super.getCarModel(), super.getHoursePowers(), super.manufacture);
    }
//123
    public static void AvaliableForTunningOptions() {
        for(String option : TuningOptions){
            System.out.println(option);
        }
    }
}
