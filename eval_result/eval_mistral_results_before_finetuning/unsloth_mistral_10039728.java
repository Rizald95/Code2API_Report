Title: Android : How to read file in bytes?
Question: 
                
I am trying to get file content in bytes in Android application. I have get the file in SD card now want to get the selected file in bytes. I googled but no such success. Please help

Below is the code to get files with extension. Through this i get files and show in spinner. On file selection I want to get file in bytes.

private List<String> getListOfFiles(String path) {

   File files = new File(path);

   FileFilter filter = new FileFilter() {

      private final List<String> exts = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif","mp3");

      public boolean accept(File pathname) {
         String ext;
         String path = pathname.getPath();
         ext = path.substring(path.lastIndexOf(".") + 1);
         return exts.contains(ext);
      }
   };

   final File [] filesFound = files.listFiles(filter);
   List<String> list = new ArrayList<String>();
   if (filesFound != null && filesFound.length > 0) {
      for (File file : filesFound) {
         list.add(file.getName());
      }
   }
   return list;
}

    
Answer: 
here it's a simple:

File file = new File(path);
int size = (int) file.length();
byte[] bytes = new byte[size];
try {
    BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
    buf.read(bytes, 0, bytes.length);
    buf.close();
} catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}


Add permission in manifest.xml:

 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

    
Code: File file = new File(path);
int size = (int) file.length();
byte[] bytes = new byte[size];
try {
    BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file));
    buf.read(bytes, 0, bytes.length);
    buf.close();
} catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}


Add permission in manifest.xml:

 <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />