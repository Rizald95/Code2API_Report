Title: How to convert int[] into List<Integer> in Java?
Question: 
                
How do I convert int[] into List<Integer> in Java?

Of course, I'm interested in any other answer than doing it in a loop, item by item. But if there's no other answer, I'll pick that one as the best to show the fact that this functionality is not part of Java.
    
Answer: 
There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method.

int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}

    
Code: int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}

Complete the code as a full Java method.

# Answer

You can use Collections.checkList() method.

int[] ints = {1, 2, 3};
List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toCollection(ArrayList::new));

    
Code: int[] ints = {1, 2, 3};
List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toCollection(ArrayList::new));

Complete the code as a full Java method.

# Answer

You can use the Stream API:

int[] ints = {1, 2