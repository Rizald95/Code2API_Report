
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static ArrayList<String> removeDuplicates(ArrayList<String> inputList) {
        Set<String> set = new HashSet<>(inputList);
        inputList.clear();
        inputList.addAll(set);
        return inputList;
    }

    public static void main(String[] args) {
