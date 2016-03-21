/**
 * Created by YPsitos on 3/21/16.
 */
public class HouseholdOne extends Households {
    double mTaxes;
    @Override
    public double income(double money) {
        money = 50000;
        return money;
        }

    public double taxes(double uncleSam){
        uncleSam = income(mTaxes)*.2;
        return uncleSam;
    }
}
