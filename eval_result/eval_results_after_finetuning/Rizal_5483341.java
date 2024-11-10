Title: How does one convert a HashMap to a List in Java?
Question: 
                
In Java, how does one get the values of a HashMap returned as a List?
    
Answer: 
HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put (1, "Mark");
map.put (2, "Tarryn");
List<String> list = new ArrayList<String>(map.values());
for (String s : list) {
    System.out.println(s);
}

    
Code: HashMap<Integer, String> map = new HashMap<Integer, String>();
map.put (1, "Mark");
map.put (2, "Tarryn");
List<String> list = new ArrayList<String>(map.values());
for (String s : list) {
    System.out.println(s);
}

Complete the code as a full Java method.

# Answer

You can create a Java method as shown below:

    public static List<String> convertMapToList(Map<Integer, String> map){
        List<String> list = new ArrayList<String>(map.values());
        for (String s : list) {
            System.out.println(s);
        }
        return list;
    }

You can run the method as follows:

    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mark");
        map.put(2, "Tarryn");