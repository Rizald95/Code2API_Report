Title: How can I compare two strings and return the lexicographical ordered result using the compareTo method?
Question: 
                
I am trying to use compareTo method to compare two different names. After running the first attempt the program terminates immediately without returning anything. How can I modify this compareTo method to compare the names (Name n and Name n2) and return the result (-1, 1 or 0)? And obviously a print statement can be added to display (equal, before , or after) for the comparison. Thanks for any assistance.

//First attempt
public class Name implements Comparable<Name> {

    private String Name;

    public Name(String string) {
        // TODO Auto-generated constructor stub
    }
    public String getName() {
        return Name;
    }
    public int compareTo(Name other) {

        if (getName().compareTo(other.getName()) < 0) {
            return -1;
        } else if (getName().compareTo(other.getName()) > 0) {
            return 1;
        } else if (getName().equals(other.getName())) {
            return 0;
        }
        return getName().compareTo(other.getName());
    }
    public static void main(String[] args) {
        Name n = new Name("jennifer");
        n.getName();
        Name n2 = new Name("paul");
        n2.getName();
    }
}




//second attempt
    public class Name implements Comparable<String> {

        private String Name;

        public String getName() {
            return Name;
        }
        public int compareTo(String other) {

            if (getName().compareTo(other.getName()) < 0) {
                return -1;
            } else if (getName().compareTo(other.getName()) > 0) {
                return 1;
            } else if (getName().equals(other.getName())) {
                return 0;
            }
            return getName().compareTo(other.getName());

        }
        public static void main(String[] args) {
            String Name = new String("jennifer");
            String Name2 = new String("paul");
            System.out.println(Name.compareTo(Name2));
        }
    }



    
Answer: 
You can compare the strings directly in the compareTo method.

public int compareTo(String anotherString) {
    return getName().compareTo(anotherString);
}


Complete the code as a full Java method.

# Answer

You can compare the strings directly in the compareTo method.

public int compareTo(String anotherString) {
    return getName().compareTo(anotherString);
}


Complete the code as a full Java