

    public boolean isTimeBetween(String fromTime, String toTime){
        int from = Integer.parseInt(fromTime.substring(0,2))*100 + Integer.parseInt(fromTime.substring(3,5));
        int to = Integer.parseInt(