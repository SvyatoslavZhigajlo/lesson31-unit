public class ConversionHoursMinutesSeconds {

    public  void conversionHoursMinutesSeconds() {
        System.out.println(makeReadable(359999));
        System.out.println(makeReadable(360));
    }

    public String makeReadable(int seconds) {
        final int anHourInSeconds = 3600;
        final int aMinuteInSeconds = 60;

        String hh = Integer.toString((seconds / anHourInSeconds));
        String mm = Integer.toString((seconds % anHourInSeconds) / aMinuteInSeconds);
        String ss = Integer.toString(seconds % aMinuteInSeconds);

        if (hh.length() == 1) {
            hh = "0" + hh;
        }
        if (mm.length() == 1) {
            mm = "0" + mm;
        }
        if (ss.length() == 1) {
            ss = "0" + ss;
        }

        return hh + " hour and " + mm + " minute and " + ss + " second";
    }
}
