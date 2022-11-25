package Chief_class;

import java.math.BigDecimal;

public class TaxCalculator {

    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private  static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;

    public static BigDecimal calculateTax(Citizen citizen){
        BigDecimal taxAmount = BigDecimal.ZERO;
        if(citizen.getEarnings().compareTo(MINIMUM_EARNING) < 1){
            taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
        }
        else{
            BigDecimal baseTax = MINIMUM_EARNING.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
            BigDecimal excessAmount = citizen.getEarnings().subtract(MINIMUM_EARNING);
            taxAmount = excessAmount.multiply(BigDecimal.valueOf(ADDITIONAL_TAX_RATE)).add(baseTax);
        }
        return taxAmount;
    }
}
