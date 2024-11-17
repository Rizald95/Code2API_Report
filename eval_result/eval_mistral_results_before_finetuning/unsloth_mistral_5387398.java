public static String convertMinutesToHoursAndMinutes(int minutes) {
    int hours   = minutes / 60;
    int minutes = minutes % 60;
    return String.format("%d:%02d", hours, minutes);
}