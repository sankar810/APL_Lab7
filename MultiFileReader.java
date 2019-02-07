package filewordreader;

public class MultiFileReader {

    public static void main(String[] args){
        try {
            Reader r4 = new Reader("E:/Files/file4.txt");
            Reader r3 = new Reader("E:/Files/file3.txt"); 
            Reader r1 = new Reader("E:/Files/file1.txt");
            Reader r2 = new Reader("E:/Files/file2.txt"); 
          
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            
        }
        System.out.println("Done in main!");
    }   
}
