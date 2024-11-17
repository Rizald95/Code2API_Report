Title: how to get specific value from string array and save it to another string array?
Question: 
                
i have string array like this :
String A[] = {"65535", "00000", "00000", "00000", "00000", "A32CE", "43251", "98702", "ACED2", "98AAB", "00000", "00000", "00000", "65535", "65535"}

how to get the values other than 65535 and 00000 and save it to another string array like this:
String B[] = {"A32CE", "43251", "98702", "ACED2", "98AAB"}

I've already tried  this:

if(A!="65535" && A!="00000")
{
    for(i=0; i<A.length; i++){
    B[i] = A[i];
    }
}


but the return value that i get is the whole String A[]. Please help.
    
Answer: 
Since you're working with arrays and not ArrayList objects, things get a little tedious. The following code runs through the first array, checks if the current String is not the one you don't want, and increases the counter by one if it has found one you do want. It then creates a new array as big as the number of objects you want in the initial array, runs through the intial array again, this time adding the String obejcts you want to the second array.

String[] arrayOne = {"65535", "00000", "00000", "00000", "00000",
        "A32CE", "43251", "98702", "ACED2", "98AAB",
        "00000", "00000", "00000", "65535", "65535"};

int counter = 0;
for (int i = 0; i < arrayOne.length; i++) {
    if (!arrayOne[i].equals("65535") && !arrayOne[i].equals("00000")) {
        counter++;
    }
}

String[] arrayTwo = new String[counter];
int j = 0;
for (int i = 0; i < arrayOne.length; i++) {
    if (!arrayOne[i].equals("65535") && !arrayOne[i].equals("00000")) {
       