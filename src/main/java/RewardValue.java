import java.util.Scanner;

public class RewardValue{
    private double cashValue;
    private double miles;

    //Constructor 1 
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = cashValue / 0.0035;
    }
    //Constructor accepting miles value 
    public RewardValue(double miles){
        this.miles = miles;
        miles = cashValue / 0.0035;
    }
    
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return miles;
    }

}