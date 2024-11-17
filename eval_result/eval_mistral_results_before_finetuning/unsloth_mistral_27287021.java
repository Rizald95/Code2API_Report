Title: How to get String[] A - String[] B i.e. all elements which are in A but not in B ,In java?
Question: 
                
I have a String [] allEmps ; String array Of All emps;

String [] allEmps = StringUtil.convertCommaStringToArray(listOfEmpsCommaSep, ",");


I have another String [] EmpsWithCompensationDefined

String [] listOfEmpsWithCompDefined =  DBUtility.selectFieldAndReturnAsStringArray(QueryToGetEmpsWhomCompIsDefined, con);


Now I want to get employees whom compensation is not defined i.e An entry which is in A but not in B.

Solution : I can iterate over both the array and get the difference. But this would be O(n^2) complex. Is there any other way with less asymptotic complexity?

Edit:

ArrayList listOfFilteredEmps = new ArrayList();
                    for(int j =0;j<allEmps.length;j++){
                        boolean isMatched = false;
                        for(int i=0;i<listOfEmpsWithCompDefined.length;i++){
                            if(allEmps[j]==listOfEmpsWithCompDefined[i]){
                                isMatched = true;
                            }
                        }
                        if(!isMatched){
                            if(listOfFilteredEmps!=null && listOfFilteredEmps.size()==0){
                                listOfFilteredEmps.add(allEmps[j]);
                            }else{
                                listOfFilteredEmps.add(","+allEmps[j]);
                            }
                        }
                    }

    
Answer: 
You can try in this way

String [] allEmps={"A","B","C","D"};
String [] listOfEmpsWithCompDefined={"A","D","E"};
Set<String> mySet1 = new HashSet<>(Arrays.asList(allEmps)); // convert to set
Set<String> mySet2 = new HashSet<>(Arrays.asList(listOfEmpsWithCompDefined)); // convert to set

Set<String> result = new HashSet<>(mySet1);
result.removeAll(mySet2);

List<String> filteredEmps = new ArrayList<>(result);

This will give you the difference between two arrays in O(n) time complexity.

Explanation:

1. Convert both arrays to Set data structure.
2. Use removeAll() method of Set to remove all elements of second set from the first set.
3. Convert the resultant set back to List.

This way, you can get the difference between two arrays in O(n) time complexity.