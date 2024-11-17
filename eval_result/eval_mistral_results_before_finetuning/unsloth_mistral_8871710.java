public String[] findBeforeAndAfterSubString(String s) {
    String[] split = s.split("dance");
    return new String[]{split[0], split[1]};
}