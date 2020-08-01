package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import school.cesar.eta.unit.utils.BodyMassIndexMock;

public class BodyMassIndexTest {

    @Test
    public void classify_bmiUnder16_severelyUnderweight() {
        String actual = BodyMassIndex.classify(15.9f);
        Assertions.assertEquals("Severely Underweight", actual);
    }

    @Test
    public void classify_bmi16_underweight() {
        String actual = BodyMassIndex.classify(16f);
        Assertions.assertEquals("Underweight", actual);
    }

    @Test
    public void classify_18Dot5_healthyWeight() {
        String actual = BodyMassIndex.classify(18.5f);
        Assertions.assertEquals("Healthy Weight", actual);
    }

    @Test
    public void classify_bmi25_overweight() {
        Assertions.assertEquals("Overweight", BodyMassIndex.classify(25));
    }

    @Test
    public void classify_bmi30_obese() {
        Assertions.assertEquals("Obese", BodyMassIndex.classify(30));
    }

    @Test
    public void calculate_weight120height2_30(){
        double weight = 120;
        double height = 2;

        Assertions.assertEquals(30, BodyMassIndex.calculate(weight, height));
    }

    @Test
    public void classify_weight120height2_obese(){
        double weight = 120;
        double height = 2;

        BodyMassIndexMock bmiMock = new BodyMassIndexMock();

        Assertions.assertEquals("Obese", bmiMock.classify(weight, height));

    }

}