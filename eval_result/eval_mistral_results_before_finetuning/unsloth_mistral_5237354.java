Title: How to test List<String> for empty or nullness?
Question: 
                
It seems no matter what I do I get the wrong result.

My list is defined as follows:

private List<String> selectedPriorities;


Nothing odd or fancy on the getter/setter:

public void setSelectedPriorities(List<String> selectedPriorities) {
    this.selectedPriorities = selectedPriorities;
}

public List<String> getSelectedPriorities() {
    return selectedPriorities;
}


In a session bean I want to alter a different List based on the contents (or lack thereof) of this list.

Here is that code:

List<String> restrictList = new ArrayList<String>();
restrictList.add("lower(logs.clazz) like lower(concat(#{logs.clazz},'%'))");
restrictList.add("lower(logs.rule) like lower(concat(#{logs.rule},'%'))");
PrioritySelectorBean selectorBean = (PrioritySelectorBean) Component.getInstance("prioritySelectorBean",true);
System.out.println("constructRestrictionList selectorBean "+selectorBean.getSelectedPriorities());

if (selectorBean.getSelectedPriorities() == null) {
    System.out.println("IS NULL");
    return restrictList;
}

if (selectorBean.getSelectedPriorities().isEmpty()){
    System.out.println("IS EMPTY");
}

if (selectorBean.getSelectedPriorities().size()<1){
    System.out.println("HAS NOTHING IN IT");
    return restrictList;
}
System.out.println("NOT NULL");
restrictList.add("lower(logs.priority) in (#{prioritySelectorBean.selectedPriorities})");


It always falls through to NOT NULL and adds the string to restrictList.  It's making me crazy! How do I detect nothingness in this list? Here is the log snippet

14:24:10,057 INFO  [STDOUT] constructRestrictionList selectorBean []
14:24:10,057 INFO  [STDOUT] IS NULL
14:24:10,057 INFO  [STDOUT] NOT NULL
14:24:10,057 INFO  [STDOUT] adding priority to restrictList


Answer:

You are comparing the list with `null` using `==` operator, which is not the correct way to check for nullness in Java. Instead, you should use the `equals()` method or the `!=` operator.

In your case, you should change the following lines:

```java
if (selectorBean.getSelectedPriorities() == null) {
    System.