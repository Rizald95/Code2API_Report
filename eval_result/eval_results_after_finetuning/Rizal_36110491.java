

import java.io.*;

class Detail{
    public static void main(String[] args) throws Exception {
        users u=new users();
        if(args.length==1){
            System.out.println("No Details");
        }else{
            FileReader reader = new FileReader("users.txt");
            BufferedReader buffer= new BufferedReader(reader);

            String line = null;

            while ((line = buffer.readLine()) != null) {
                u.addToSearchString(line+'\n');
            }
            buffer.close();
            u.printName();
            }
        }
} 

class users{

    String names;

    users(){
        names=new String();
    }

    void addToSearchString(String add){
        names += add;
    }

    void printName() {
        int i = 0;
        String splitter = "";
        String[] name_array = names.split(splitter);

        for (i = 0; i < name_array.length; i++) {
            System.out.println(name_array[i]);
        }
    }
}


    
