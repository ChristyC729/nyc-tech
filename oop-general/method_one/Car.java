package method_one;
public class Car {
    // creating a class attribute for the Car
    private int speed = 0; // all new car objects assumed to be stationary
    private int direction =0; //negative=backwards, positive=forward, 0=neutral
    private Engine engine;
    Driver driver;

    Car(){
        this.engine = new Engine();
        this.driver = new Driver();
    }
    Car(Engine engineType, Driver driver_in){
        this.engine = engineType;
        this.driver = driver_in;
    }

    int getSpeed(){
        return this.speed;
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
        return this.direction;
    }

    void setDirection(int inDirection){
        this.direction = inDirection;  
    }

    void startEngine(){
        engine.ignite();
    }

    void stopEngine(){
        engine.extinguish();
    }
    void accelerate(){
        if (driver.accelerate && engine.accelerate()){
            speed++;
            System.out.println("Accelerated to speed: " + speed);
        }
        else{
            System.out.println("Engine cannot accelerate");
        }
        
    }
    void decelerate(){
        if (!driver.accelerate && engine.decelerate()){
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
        this.direction = -1;
        this.speed=1;
        System.out.println("You are now in reverse");
    }
    void drive(){
        this.direction = 1;
        this.speed = 1;
        System.out.println("You are now on drive");
    }
    void park(){
        this.direction=0;
        this.speed = 0;
        System.out.println("You are now parked");
    }
    

}