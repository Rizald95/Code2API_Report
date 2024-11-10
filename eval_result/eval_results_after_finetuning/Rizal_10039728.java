
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

  