Title: How do I declare a 2D String arraylist?
Question: 
                
I want to do something like this ArrayList<String<String>> mylist

How can I create it?

How can I add to the external and internal list

and how can I convert the internal list to a simple array list?
    
Answer: 
You can go with

List<List<String>> ls2d = new ArrayList<List<String>>();
List<String> x = new ArrayList<String>();
x.add("Hello");
x.add("world!");
ls2d.add(x);

System.out.println(Arrays.deepToString(ls2d.toArray()));

    
Code: List<List<String>> ls2d = new ArrayList<List<String>>();
List<String> x = new ArrayList<String>();
x.add("Hello");
x.add("world!");
ls2d.add(x);

System.out.println(Arrays.deepToString(ls2d.toArray()));

Complete the code as a full Java method.

# Answer

You can go with

List<List<String>> ls2d = new ArrayList<List<String>>();
List<String> x = new ArrayList<String>();
x.add("Hello");
x.add("world!");
ls2d.add(x);

System.out.println(Arrays.deepToString(ls2d.toArray()));

    
Code: List<List<String>> ls2d = new ArrayList<List<String>>();
List<String> x = new ArrayList<String>();
x.add("Hello");
x.add("world!");
ls2d.add(x);

System.