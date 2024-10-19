public class Commission extends Hourly
{
    protected double TotalSales;
    protected double CommissionRate;

    public Commission (String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate, double commissionRate)
   {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        CommissionRate = commissionRate;
   }
 
   public void addSales (double totalSales)
   {
        TotalSales = totalSales;
   }

    @Override
    public double pay(){
        return super.pay() + (CommissionRate * TotalSales);
    }

    @Override
    public String toString()
    {
      String result = super.toString();

        return result + "\n Total Sales: " + TotalSales;
    }

}



