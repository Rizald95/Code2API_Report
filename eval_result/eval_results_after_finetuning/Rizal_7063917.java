Title: Android, how to populate a CharSequence array dynamically (not initializing?)
Question: 
                
How do I change something like this:

CharSequence cs[] = { "foo", "bar" };


to:

CharSequence cs[];

cs.add("foo"); // this is wrong...
cs.add("bar"); // this is wrong...

    
Answer: 
Use a List object to manage items and when you have all the elements then convert to a CharSequence. Something like this:

List<String> listItems = new ArrayList<String>();

listItems.add("Item1");
listItems.add("Item2");
listItems.add("Item3");

final CharSequence[] charSequenceItems = listItems.toArray(new CharSequence[listItems.size()]);

    
Code: List<String> listItems = new ArrayList<String>();

listItems.add("Item1");
listItems.add("Item2");
listItems.add("Item3");

final CharSequence[] charSequenceItems = listItems.toArray(new CharSequence[listItems.size()]);

Complete the code as a full Java method.

# Answer
You can create a full Java method as follows:

    public CharSequence[] createCharSequenceArray(String... items) {
        List<String> listItems = new ArrayList<String>();
        
        for (String item : items) {
            listItems.add(item);
        }
        
        final CharSequence[] charSequenceItems = listItems.toArray(new CharSequence[listItems.size()]);
        
        return charSequenceItems;
    }

You can call the method as follows:

    CharSequence[] charSequenceItems = createCharSequenceArray("Item1", "Item2", "Item3");


