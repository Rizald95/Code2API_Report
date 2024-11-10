
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

            String other = new String("paul");

            System.out.println(Name.compareTo(other));

        }
    }



    

public class Name implements Comparable<String> {

    private String Name;

    public String getName() {
        return Name;
    }
    public int compareTo(String other) {

        if (getName().compareTo(other.getName()) < 0) {
            return -1;
        } else if (