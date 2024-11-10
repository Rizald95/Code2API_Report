

String person1 = "female";
String person2 = "female";
........
........
String person60 = "male";
........
String person100 = "male";


This is what I tried

for (int i = 1; i <101; i++) {
  if (i<60) {
    String person+i = "female";
  }
  else {
    String person+i = "male";   
  }
}


Can anybody help me correct this code?
    
Answer: 
A Map allows you to relate any key with any value. In this case, the key is the name of the variable, and the value is the value

Map<String, String> details = new HashMap<>();
for (int i = 1; i <101; i++) {
    if (i<60) {
        details.put("person" + i, "female");
    }
    else {
        details.put("person" + i, "male");
    }
}

    
Code: Map<String, String> details = new HashMap<>();
for (int i = 1; i <101; i++) {
    if (i<60) {
        details.put("person" + i, "female");
    }
    else {
        details.put("person" + i, "male");
    }
}


