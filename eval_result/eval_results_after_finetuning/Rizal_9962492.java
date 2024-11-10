Title: How to get the 'place' of a Number in Java (eg. tens, thousands, etc)
Question: 
                
How can I determine the number places of a number and determine the number of a loop to run?

For example, if i have an array int[] a= {123,342,122,333,9909} and int max = a.getMax() we get the value 9909. I want to get the number place value of 9909, which is the thousand-th place.

For example...

(number place value,number of loop to run)

(one,1 time)
(tenth,2 time)
(hundred,3 time)
(thousand,4 time)
(ten thousand,5 time)
(hundred thousand,6 time)


Here is my code, however it fails when it meets a zero between an integer...

public static int getMax(int[] t,int n){
     int maximum = t[0];   // first value of the array
     int index = 0;
     int div=1;
     int numSpace=0;
     int valueTester=34;
     boolean done=false;

     for (int i=1; i<n; i++) {
       if (t[i] > maximum) {
         maximum = t[i];   // maximum
         index = i; // comparing index
       }  
     }

     while(done==false){
         if (valueTester==0){
             done=true;
             }
          else{
            valueTester=(maximum / div) % 10;
            div=div*10;
            numSpace++;
            }
        }

     return numSpace;
     }

  }

    
Answer: 
You can use logarithms.

    double[] values = {4, 77, 234, 4563, 13467, 635789};
    for(int i = 0; i < values.length; i++)
    {
        double tenthPower = Math.floor(Math.log10(values[i]));
        int places = tenthPower + 1;
        System.out.println(places);
    }


Code: You can use logarithms. 

double[] values = {4, 77, 234, 4563, 13467, 635789};
for(int i = 0; i < values.length; i++)
{
    double tenthPower = Math.floor(Math.log10(values[i]));
    int places = tenthPower + 1;
    System.out.println