Title: How to remove unnecessary black background after resizing the image to a fixed resolution?
Question: 
                
I have been resizing every image to a fix resolution before adding it to my database .
for this purpose i have been using FileUpload and following code:-

logo_name = System.currentTimeMillis() + ".png";
            File  uploadedFile = new File("/www/static.appcanvas.com/"+logo_name);
            BufferedImage bi = ImageIO.read(item.getInputStream()); 
            Image img = bi.getScaledInstance(125,125,Image.SCALE_SMOOTH);
            BufferedImage img_logo = new BufferedImage(125,125,BufferedImage.TYPE_INT_RGB);
            Graphics2D g = img_logo.createGraphics();
            g.drawImage(img,0,0,null); 
            if(g != null) g.dispose();
            ImageIO.write(img_logo,"png",uploadedFile)


I get the image of the desired resolution but there is a unnecessary black background which i am unable to remove.
image before : http://www.rocketcampus.com/images/test.png
image after :  http://static.appcanvas.com/1334085929080.png
    
Answer: 
You can change the type of your BufferedImage to BufferedImage.TYPE_INT_ARGB to have a transparent background.

This worked for me:

public static void main(String[] args) throws IOException {
    FileInputStream item = new FileInputStream("D:/tmp/OpenFlexo_07.gif");
    String logo_name = System.currentTimeMillis() + ".png";
    File uploadedFile = new File("d:/www/static.appcanvas.com/" + logo_name);
    BufferedImage bi = ImageIO.read(item);
    Image img = bi.getScaledInstance(125, 125, Image.SCALE_SMOOTH);
    BufferedImage img_logo = new BufferedImage(125, 125, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = img_logo.createGraphics();
    g.drawImage(img, 0, 0, null);
    if (g != null) g.dispose();
    ImageIO.write(img_logo, "png", uploadedFile);
}

You can see the difference here:

Before: http://www.rocketcampus.com/images/OpenFlexo_07.gif

After: http://www.rocketcampus.com/images/1334085929080.png