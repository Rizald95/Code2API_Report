
public class Test {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("foo", "bar");
        list.add(map);
        
        System.out.println(list);
    }
}

