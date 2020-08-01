package school.cesar.eta.unit.utils;

import school.cesar.eta.unit.BodyMassIndex;

public class BodyMassIndexMock extends BodyMassIndex {

    public double weight = 0;
    public double height = 0;


    @Override
    public double calculate(double weight, double height) {
        //        return 0;
        this.weight = weight;
        this.height = height;

        return super.calculate(weight, height);
    }

    @Override
    public String classify(double bmi) {
        return "Obese";
    }

    //Spies
    public int contCalls = 0;
    public String bmiResult = null;
    //weight, height, bmi



    //verificar atributos
}
//Spy
//public class SpyMessageService extends FakeMessageService {
//
//    public int contCalls = 0;
//    public String msg = null;
//
//    @Override
//    public boolean send(String msg, String rec) {
//        contCalls++;
//        this.msg = msg;
//        return super.send(msg, rec);
//    }
//}

//Mock com Spy
//public class MessageServiceMock implements MessageServiceInterface {
//    public int count = 0;
//    public String msg = null;
//
//    @Override
//    public boolean send(String msg, String rec) {
//        count++;
//        this.msg = msg;
//        return true;
//    }
//
//    @Override
//    public boolean sync() {
//        throw new UnsupportedOperationException();
//    }
//}