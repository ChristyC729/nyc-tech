package method_two;
/*
 * Note: I don't know how engines work, so this is 
 * my best interpretation :) 
 */

public class Engine{
    boolean engineIgnited = false;
    boolean accelerate= false;
    private boolean beltTurning = false;
    private boolean fuelBurning = false;
    
    // ignite is called to start the car
    void ignite(){
        if (!engineIgnited){
            engineIgnited = true;
            burnFuel();
            turnBelts();
            System.out.println("Engine Ignited");
        }
        else{
            System.out.println("Engine already ignited");
        }
       
    }
    void extinguish(){
        if (engineIgnited){
            engineIgnited = false;
            extinguishFuel();
            stopBelts();
            System.out.println("Engine turned off");
        }
        else{
            System.out.println("Engine already off");
        }
    }

    boolean accelerate(){
        if (engineIgnited && beltTurning && fuelBurning){
            accelerate = true;
            System.out.println("Engine is accelerating");
        }
        else{
            System.out.println("Engine is not ignited");
        }
        return accelerate;
    }

    boolean decelerate(){
        if (accelerate && beltTurning & fuelBurning){
            accelerate = false;
            System.out.println("Engine is decelerating");
        }
        else{
            System.out.println("Vehicle is not accelerating");
        }
        return (!accelerate);
    }

    private void burnFuel(){
        fuelBurning = true;
        System.out.println("Fuel is burning");
    }
    
    private void extinguishFuel(){
        fuelBurning = false;
        System.out.println("Fuel is not burning");
    }

    private void turnBelts(){
        beltTurning = true;
        System.out.println("Belt is turning");
    }
    private void stopBelts(){
        beltTurning = false;
        System.out.println("Belt is not turning");
    }

    // idk how gears work
    void shiftGears(){
        System.out.println("Gears Shifted");
    }
}
