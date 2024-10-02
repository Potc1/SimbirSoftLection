package lection_1;

import lection_1.Automobile;
import lection_1.ShowAbout;

public class Supercar extends Automobile implements StageCalculation, ShowAbout {
    private double price;
    private int stage = 0;
    public static final double discont =  0.05;

    Supercar(String carModel, int hoursePowers, String manufacture, double price, int stage){
        super(carModel, hoursePowers);
        super.manufacture = manufacture;
        this.price = price;
        this.stage = stage;
    }
    public  void SetStage(int type){
        this.stage = type;
        StageTunning();
    }
    public double GetPrice(){
        return this.price;
    }
    public int GetStage(){
        return this.stage;
    }
    public void display(){
        System.out.printf("model: %s power: %s and born from: %s \n", super.getCarModel(), super.getHoursePowers(), super.manufacture);
    }
    public static void showDiscont(){
        System.out.println(discont);
    }
    public void StageTunning(){
        switch (this.stage) {
            case 1, 2:
                CalculationPower();
                CalculationPrice();
                break;
            default:
                return;
        }
    }

    @Override
    public void CalculationPower() {
        if (this.stage == 1){
            super.SethoursePowers(super.getHoursePowers()+10);
        } else if (this.stage == 2){
            super.SethoursePowers(super.getHoursePowers()+40);
        }
    }

    @Override
    public void CalculationPrice() {
        if (this.stage == 1){
            this.price*=1.1;
        } else if (this.stage == 2){
            this.price*=1.3;
        }
    }
    @Override
    public void ShowAboutSupercar(){
        System.out.printf("this supercar model is %s, power: %s, stage: %s and price: %s \n", super.getCarModel(), super.getHoursePowers(), GetStage(), GetPrice());
    }
}

