

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

