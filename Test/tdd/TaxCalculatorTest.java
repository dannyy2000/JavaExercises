package tdd;

import Chief_class.Citizen;
import Chief_class.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.testng.Assert.*;


import java.math.BigDecimal;

public class TaxCalculatorTest {
    private TaxCalculator calculator;
    private Citizen mathias;
    private Citizen dewunmi;
    private Citizen deola;

    @BeforeEach
    public void setUp(){
        mathias = new Citizen();
        mathias.setFirstName("mathias");
        mathias.setSurname("momodu");
        BigDecimal salary = new BigDecimal(17000);
        mathias.setEarnings(salary);

        dewunmi = new Citizen("Adewunmi","Adegunwa");
        dewunmi.setEarnings(BigDecimal.valueOf(25000));

        deola = new Citizen("Adeola","Adekunle",BigDecimal.valueOf(45000));
    }
    @Test
    public void calculateTax(){
        BigDecimal mathiasTax = TaxCalculator.calculateTax(mathias);
        assertEquals(2550,mathiasTax.intValue());

        BigDecimal wunmiTax = TaxCalculator.calculateTax(dewunmi);
        assertEquals(3750,wunmiTax.intValue());
    }

    @Test
    public void calculateExcessTax(){
        BigDecimal deolaTax = TaxCalculator.calculateTax(deola);
        assertEquals(7500,deolaTax.intValue());

    }
}
