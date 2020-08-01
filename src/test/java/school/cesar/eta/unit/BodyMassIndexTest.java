package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import school.cesar.eta.unit.utils.BodyMassIndexMock;

public class BodyMassIndexTest {

    private BodyMassIndex bmi;

    @BeforeEach
    public void setupTest(){
        bmi = new BodyMassIndex();
    }


    @Test
    public void classify_bmiUnder16_severelyUnderweight() {
        String actual = bmi.classify(15.9f);
        Assertions.assertEquals("Severely Underweight", actual);
    }

    @Test
    public void classify_bmi16_underweight() {
        String actual = bmi.classify(16f);
        Assertions.assertEquals("Underweight", actual);
    }

    @Test
    public void classify_18Dot5_healthyWeight() {
        String actual = bmi.classify(18.5f);
        Assertions.assertEquals("Healthy Weight", actual);
    }

    @Test
    public void classify_bmi25_overweight() {
        Assertions.assertEquals("Overweight", bmi.classify(25));
    }

    @Test
    public void classify_bmi30_obese() {
        Assertions.assertEquals("Obese", bmi.classify(30));
    }

    @Test
    public void calculate_weight120height2_30(){
        double weight = 120;
        double height = 2;

        Assertions.assertEquals(30, bmi.calculate(weight, height));
    }

    @Test
    public void classify_weight120height2_obese(){
        double weight = 120;
        double height = 200;

        bmi = new BodyMassIndexMock();

        Assertions.assertEquals("Obese", bmi.classify(weight, height));

    }

    // Verificar se está passando o valor correto pelo Calculate
    @Test
    public void classify_spyWeight120height2_30(){
        double weight = 120;
        double height = 2;

        bmi = new BodyMassIndexMock();
        bmi.classify(weight, height);

        Assertions.assertEquals(120, ((BodyMassIndexMock) bmi).weight);
        Assertions.assertEquals(2, ((BodyMassIndexMock) bmi).height);
    }

    // Verificar se está passando o valor correto pelo Classify

}