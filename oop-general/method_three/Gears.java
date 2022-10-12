package method_three;

interface Gears {
}

enum AutomaticGears implements Gears{
    REVERSE(1),
    NEUTRAL(0),
    DRIVE(1);

    public final int rate;

    AutomaticGears(int in_rate){
            this.rate = in_rate;
        }
}

enum ManualGears implements Gears{
    ONE (5),
    TWO (4),
    THREE (3),
    FOUR (2),
    FIVE (1),
    REVERSE (4),
    NEUTRAL (0);

    public final int rate;

    ManualGears(int in_rate){
        this.rate = in_rate;
    }
}