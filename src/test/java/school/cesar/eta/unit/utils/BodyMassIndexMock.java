package school.cesar.eta.unit.utils;

import school.cesar.eta.unit.BodyMassIndex;
import school.cesar.eta.unit.BodyMassIndexInterface;

public class BodyMassIndexMock implements BodyMassIndexInterface {
    @Override
    public double calculate(double weight, double height) {
        return 0;
    }

    @Override
    public String classify(double weight, double height) {
        return "Obese";
    }

//    @Override
//    public double calculate(double weight, double height){
//
//    }




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
}
