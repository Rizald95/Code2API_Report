Title: How to skip successive elements in a java stream?
Question: 
                
I've been trying to incorporate more functional programming into what I do because of the of the side-effect-free nature of the code I write and its utility in concurrent code.  I came across the need to filter out successive elements of a java stream and couldn't come up with a functional approach better than a plain old imperative approach.  Say I have a program that logs its arguments and I want to filter out 2 successive elements.  For example, -o anOption, -k aSecretKeyWhoseValueWeShouldNotLog, -a anotherOption.  What I want in the log is -o anOption, -a anotherOption.  

I came up with several approaches, but none of them was as understandable as using a for loop that indexed past the stuff I needed to filter out.  

This seems like a fairly common thing to want to do.  Is there a pattern, using java streams or anything else, that is commonly used for this kind of thing?

Thanks,

Here's what I ended up with.

static String filterSecretKeyOutOfCommandLineLogString(final String[] args) {
    return joinArgsToString(filterOptionAndValueOutOfCommandLineLogString(SECRET_KEY, args));
}

private static String joinArgsToString(final String[] args) {
    return Joiner.on(ARG_JOINER_DELIMITER).join(args);
}

private static String[] filterOptionAndValueOutOfCommandLineLogString(final Option option, final String[] args) {
    final List<String> filteredList = new ArrayList<>();

    final int numArgs = args.length;

    for (int i = 0; i < numArgs; ++i) {
        if (Arguments.matchesOption(option, args[i])) {
            ++i;
         } else {
             filteredList.add(args[i]);
         }
     }

     return filteredList.toArray(new String[0]);
}

    
Answer: 
I'm not sure if this is any better than what you already have. Given that the input is a String[] and the (intermediate) output you want is also a String[], it seems like you're already using a for loop. However, you can use Java 8 Streams to make the code more concise. Here's a possible solution:

```java
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String[] input = {"-o", "anOption", "-k", "aSecretKeyWhoseValueWeShouldNotLog", "-a", "anotherOption"};
        System.out.