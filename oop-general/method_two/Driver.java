package method_two;
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

}