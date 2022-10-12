package method_two;
public class Car {
    // creating a class attribute for the Car
    private int speed = 0; // all new car objects assumed to be stationary
    private int direction =0; //negative=backwards, positive=forward, 0=neutral
    Engine engine;

    Car(){
        engine = new Engine();
    }
    Car(Engine engineType){
        engine = engineType;
    }

     int getSpeed(){
        return speed;
    }
    
    void setSpeed(int inSpeed){
        if (inSpeed < 0){
            System.out.println("Invalid speed");
        }
        else{
            this.speed = inSpeed;
            System.out.println("The speed is now: " + speed);
        }
    }

    int getDirection(){
        return direction;
    }

    void setDirection(int inDirection){
        direction = inDirection;  
    }

    void accelerate(){
        if (engine.accelerate()){
            speed++;
            System.out.println("Accelerated to speed: " + speed);
        }
        else{
            System.out.println("Engine cannot accelerate");
        }
    }

    void decelerate(){
        if (engine.decelerate()){
            if (speed > 0){
                speed--;
                System.out.println("Decelerated to speed: " + speed);
            }
            if (speed == 0){
                direction = 0;
                System.out.println("Car is at neutral" );
            } 
        }
    }
    void reverse(){
        direction = -1;
        speed=1;
        System.out.println("You are now in reverse");
    }

    void drive(){
        direction = 1;
        speed = 1;
        System.out.println("You are now on drive");
    }
    
    void park(){
        this.direction=0;
        this.speed = 0;
        System.out.println("You are now parked");
    }
    

}