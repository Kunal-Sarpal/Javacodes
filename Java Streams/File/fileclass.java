import java.io.*;

// class File is used to sccessing property of file
public class fileclass{
    public static void main(String[] args){

        File f = new File("./direct");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        
        System.out.println(f.lastModified()/5000/60/60/24);
        for(File x: list){
            System.out.println(x.getName());
            System.out.println(x.getPath());
            System.out.println(x.getParent());
        }
    }
}