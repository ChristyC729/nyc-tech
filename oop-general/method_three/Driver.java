package method_three;
public class Driver extends Car{
    Driver(){}

    void startCar(){
        engine.ignite();
    }
    void stopCar(){
        engine.extinguish();
    }
    void pushGas(){
        accelerate(); 
    } 
    void releaseGas(){
        decelerate();
    }

    void changeGears(AutomaticGears input_gear){
        engine.gearShift(input_gear);
    }
    void changeGears(ManualGears input_gear){
        engine.gearShift(input_gear);
    }

}