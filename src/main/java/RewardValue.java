
public class RewardValue{
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    //Constructor 1 
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    //Constructor accepting miles value 
    public RewardValue(int milesValue){
        //convert miles to cash
        this.cashValue = convertoToCash(milesValue);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        //convert cash to miles 
        this.milesValue = convertoToMiles(this.cashValue);
    }

    public static double convertoToCash(int milesValue){
        return milesValue * CONVERSION_RATE;
    }

    public static double convertoToMiles(double cashValue){
        return (int) (cashValue / CONVERSION_RATE);
    }

}