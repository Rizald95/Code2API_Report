public static boolean checkString(String s)
{
    if(!s.matches("[^abc]+"))
    {
        System.out.println("The string you entered has some incorrect characters");
        return false;
    }
    else
    {
        System.out.println("The string you entered is correct");
        return true;
    }
}