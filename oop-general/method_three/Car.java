package method_three;
public class Car<T extends Gears>{
    // creating a class attribute for the Car
    private int speed = 0; // all new car objects assumed to be stationary
    private enum Direction{
        FORWARD ("Forward"),
        BACKWARD ("Backward"),
        NEUTRAL ("Neutral");

        private String this_direction;

        Direction(String indirection){
            this_direction = indirection;
        }
    }; 
    private Direction direction = Direction.NEUTRAL;

    private enum CarType{
        MANUAL,
        AUTOMATIC
    }
    Engine<?> engine;

    Car(){
        engine = new Automatic();
    }
    Car(CarType engineType){
        switch(engineType){
            case MANUAL:
                engine = new Manual();
            case AUTOMATIC:
                engine = new Automatic();
            
        }
    }

    int getSpeed(){
        return speed;
    }
    // made private cause technically you can't "set the speed" for a car but following get/set pair 
    private void setSpeed(int inSpeed){
        if (inSpeed < 0){
            System.out.println("Invalid speed");
        }
        else{
            this.speed = inSpeed;
            System.out.println("The speed is now: " + speed);
        }
    }

    String getDirection(){
        return direction.this_direction;
    }

    
    private void setDirection(Direction inDirection){
        direction = inDirection;  
    }

    void accelerate(){
        if (engine.accelerate() && (engine.turn_rate != 0)){
            speed+= engine.turn_rate;
            System.out.println("Accelerated to speed: " + speed);
        }
        else{
            System.out.println("Engine cannot accelerate");
        }
        
    }
    void decelerate(){
        if (engine.decelerate() && (engine.turn_rate != 0)){
            if (speed > 0){
                speed-= engine.turn_rate;
                System.out.println("Decelerated to speed: " + speed);
            }
            if (speed <= 0){
                direction = Direction.NEUTRAL;
                System.out.println("Car is at neutral" );
            } 
        }
    }
    

}