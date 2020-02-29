package fr.lukam.clock.domain.model;

public class Time {

    public final Hours hours;
    public final Minutes minutes;
    public final Seconds seconds;

    public Time(Hours hours, Minutes minutes, Seconds seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static Time from(int hours, int minutes, int seconds) {
        return new Time(new Hours(hours), new Minutes(minutes), new Seconds(seconds));
    }

}
