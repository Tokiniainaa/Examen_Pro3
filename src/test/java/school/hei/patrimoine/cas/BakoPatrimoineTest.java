package school.hei.patrimoine.cas;

import org.junit.jupiter.api.Test;
import school.hei.patrimoine.cas.example.BakoPatrimoine;
import school.hei.patrimoine.modele.Patrimoine;

import static org.junit.jupiter.api.Assertions.*;

public class BakoPatrimoineTest {

    @Test
    public void testPatrimoineAu31Decembre2025() {
        BakoPatrimoine patrimoineCalculator = new BakoPatrimoine();
        Patrimoine patrimoineAu31Decembre = patrimoineCalculator.patrimoineBakoAu31Decembre2025();

        System.out.println("Patrimoine total de Bako au 31 décembre 2025: " +
                patrimoineAu31Decembre.getValeurComptable() + " Ar");
    }
}
