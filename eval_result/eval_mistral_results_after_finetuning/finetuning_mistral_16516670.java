Title: How can I store HashMap<String, ArrayList<String>> inside a list?
Question: 
                
My hashmap stores the string as key and arraylist as the values. Now, I need to embed this into a list. That is, it will be of the following form:

List<HashMap<String, ArrayList<String>>>


These are the declarations I have used:

Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
ArrayList<String> arraylist = new ArrayList<String>();
map.put(key,arraylist);
List<String> list = new ArrayList<String>();


Can anyone help me which method and how to use in the list to proceed storing my map into it?
    
Answer: 
Always try to use interface reference in Collection, this adds more flexibility.
What is the problem with the below code?

List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();//This is the final list you need
Map<String, List<String>> map1 = new HashMap<String, List<String>>();//This is one instance of the  map you want to store in the above list.
List<String> arraylist1 = new ArrayList<String>();
arraylist1.add("Text1");//And so on..
map1.put("key1",arraylist1);
//And so on...
list.add(map1);//In this way you can add.


You can easily do it like the above.
    
Code: List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();//This is the final list you need
Map<String, List<String>> map1 = new HashMap<String, List<String>>();//This is one instance of the  map you want to store in the above list.
List<String> arraylist1 = new ArrayList<String>();
arraylist1.add("Text1");//And so on..
map1.put("key1",arraylist1);
//And so on...
list.add(map1);//In this way you can add.

Complete the code as a full Java method.

# Answer

You can try the code given below:

List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();
Map<String, List<String>> map1 = new HashMap<String, List<String>>();
List<String> arraylist1 = new ArrayList<String>();
arraylist1.add("Text1");
map1.put("key1",arraylist1);
list.add(map1);


    
Code the full Java method as a complete the code question.

# Answer

List<Map<String,List<String>>> list = new ArrayList<Map<String,List