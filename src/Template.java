

public class Template <T extends Number>{
    private T number;
    Template(T num){
        this.number = num;
    }
    public void setNumber(T number1){
        this.number = number1;
    }
    public  T getNumber(){
        return this.number;
    }

    public double multiplicate(){
        return (this.number.doubleValue())*2;
    }
}
