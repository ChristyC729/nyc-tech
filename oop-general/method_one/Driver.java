package method_one;
public class Driver{
    boolean startEngine = false;
    boolean accelerate = false;

    Driver(){}

    void startEngine(){
        startEngine = true;
    }
    void stopEngine(){
        startEngine = false;
    }
    void pushGas(){
        accelerate = true; 
    } 
    void releaseGas(){
        accelerate = false;
    }

}