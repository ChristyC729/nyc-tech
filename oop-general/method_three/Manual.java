package method_three;

public class Manual extends Engine<ManualGears>{

    private ManualGears gears = ManualGears.NEUTRAL;

    void gearShift(ManualGears input_gear){
        gears = input_gear;
        turn_rate = gears.rate;
    }
}
