package be.nadira.enumstaken;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNSDAY(true),
    TURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

private final boolean WEEKDAY;

Day(boolean WEEKDAY){
    this.WEEKDAY = WEEKDAY;
}

public boolean getWEEKDAY(){
    return WEEKDAY;
}

    @Override
    public String toString() {
        return "Day{" +
                "WEEKDAY=" + WEEKDAY +
                "} " ;
    }
}
