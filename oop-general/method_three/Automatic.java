package method_three;

public class Automatic extends Engine<AutomaticGears>{

    private AutomaticGears gears = AutomaticGears.NEUTRAL;

    void gearShift(AutomaticGears input_gear){
        gears = input_gear;
        turn_rate = gears.rate;
    }
    
}
