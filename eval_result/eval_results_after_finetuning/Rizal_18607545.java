

    BufferedReader in = null;
    String read;
    int linenum;
    try{
        in = new BufferedReader(new FileReader("fileeditor.txt")); 
    }
    catch (FileNotFoundException e) {System.out.println("There was a problem: " + e);}
    try{
        for (linenum = 0; linenum<100; linenum++){
            read = in.readLine();
            if(read == null){} 
            else{
                String[] splited = read.split("\\s+");
                System.out.println(splited[linenum]);
           }
       }
    }
    catch (IOException e) {System.out.println("There was a problem: " + e);} 
}


