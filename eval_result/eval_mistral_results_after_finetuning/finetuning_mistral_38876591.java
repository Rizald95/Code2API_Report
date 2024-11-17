Title: how to add value into List<Map<String, Object>>?
Question: 
                
I'm trying to add a value to an ArrayList.

Here is the code I wrote:

List<Map<String, Object>> list = new ArrayList<>();
list.put(1,"foo", (Object)"bar");


But, this does not work. Anybody have an idea?
    
Answer: 
List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);

    
Code: List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);

Complete the code as a full Java method.

# Answer

Here is the full Java method as a complete your code answer.

List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);


# Answer

List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
Map<String, Object> map = new HashMap<String, Object>();
map.put("foo", "bar");
list.add(map);

Complete the code as a full Java method.

# Code
