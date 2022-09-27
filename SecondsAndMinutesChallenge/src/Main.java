public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Values";

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("------------");

        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-2233l));

    }

    public static String getDurationString(long minute, long second) {
        if ((minute <0) || ( (second < 0) || (second > 59))) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = (int) minute / 60;
        long remainingMinutes = (int) minute % 60;
        System.out.println(minute + " minutes and " + second + " seconds = " + hours + "h " + remainingMinutes +
                "m " + second + "s");
        return hours + "h " + remainingMinutes + "m "+ second + "s";
    }

    public static String getDurationString(long second) {
        if (second < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = (int) second / 60;
        long remainingSeconds = (int) second % 60;
        System.out.println(second + " seconds is equal to " + minutes + " minutes and " + remainingSeconds + " seconds.");
        return getDurationString(minutes, remainingSeconds);
    }
}