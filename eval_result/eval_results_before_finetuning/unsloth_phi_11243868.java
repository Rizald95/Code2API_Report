Title: how to automatically populate a 2d array with numbers
Question: 
                
Hi i am trying to auto populate a 2d array based on user input.
The user will enter 1 number, this number will set the size of the 2d array. i then want to print out the numbers of the array.
for example , if the user enters the number 4 . the 2d array will be 4 rows by 4 colums, and should contain the number 1 to 16, and print out as follows.

1-2-3-4
5-6-7-8
9-10-11-12
13-14-15-16


But i am struggling to think of the right statement that will do this. 
for the moment my code just prints out a 2d array containing *.

Has anyone any ideas how i could print out the numbers , i'm really stuck.
my code follows:

public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter room length");

    int num1 = input.nextInt();
    int num2 = num1;
    int length = num1 * num2;
    System.out.println("room "+num1+"x"+num2+"="+length);

    int[][] grid = new int[num1][num2];

    for(int row=0;row<grid.length;row++){   
        for(int col=0;col<grid[row].length;col++){
            System.out.print("*");  
        }
        System.out.println();
    }
}

    
Answer: 
Read n value,
int[][] arr = new int[n][n];
int inc = 1;
for(int i = 0; i < n; i++)
    for(int j = 0; j < n; j++) 
        arr[i][j] = inc++;
    

    
Code: int[][] arr = new int[n][n];
int inc = 1;
for(int i = 0; i < n; i++)
    for(int j = 0; j < n; j++) 
        arr[i][j] = inc++;

for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}


A: Here is the code that will do what you want:
public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter room length");

    int num1 = input.nextInt