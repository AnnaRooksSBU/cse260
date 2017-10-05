import java.util.Calendar;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        Calendar now = Calendar.getInstance();
        hour = now.get(Calendar.HOUR_OF_DAY);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
    }
    public Time(int unixTS) {
        int totalSeconds = unixTS/1000;
        second = totalSeconds % 60;
        int minutes = totalSeconds / 60;
        minute = minutes % 60;
        int hours = minutes / 60;
        hour = hours % 24;
    }
}
