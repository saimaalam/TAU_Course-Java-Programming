package chapter9;

public class BirthdayCake extends Cake{
   public String candles;
    public BirthdayCake()
    {
        super("Chocolate");
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
    public String getCandles() {
        return candles;
    }
}
