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
Set<String> mySet2 = new HashSet<>(Arrays.asList(listOfEmpsWithCompDefined));
mySet1.removeAll(mySet2); // remove all elements from set1 which are in set2
String[] abc = mySet1.toArray(new String[0]); // convert to array
        
System.out.println(abc[0]);
System.out.println(abc[1]);
System.out.println(abc[2]);


Code: String [] allEmps={"A","B","C","D"};
String [] listOfEmpsWithCompDefined={"A","D","E"};
Set<String> mySet1 = new HashSet<>(Arrays.asList(