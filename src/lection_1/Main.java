package lection_1;

abstract class Automobile{
    protected String carModel;
    protected int hoursePowers;
    public String manufacture;
    public void SethoursePowers(int powers) {this.hoursePowers = powers;}
    public String getCarModel() { return carModel; }
    public int getHoursePowers() {return hoursePowers;}
    public Automobile(String carModel, int hoursePowers){
        this.carModel = carModel;
        this.hoursePowers = hoursePowers;
    }
    public abstract void display();
}


public class Main {
    public static void main(String[] args) {
        Supercar Camaro = new Supercar("camaro",  200, "chevy", 2000, 0);
        //System.out.println(Camaro.GetPrice());
        //Camaro.StageTunning();
        Camaro.SetStage(2);
        Supercar.showDiscont();
        System.out.println(Camaro.GetPrice());
        Camaro.display();
        Camaro.ShowAboutSupercar();
        SUV.AvaliableForTunningOptions();
    }
}