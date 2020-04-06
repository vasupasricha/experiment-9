import java.io.*;
import java.util.ArrayList;

class file{
    public static void main(String[] args) throws FileNotFoundException, IOException {
         File file = new File("C:\\Users\\91869\\Desktop\\exp09.txt"); 
  int i=3;
  BufferedReader br = new BufferedReader(new FileReader(file)); 
  ArrayList<String> List = new ArrayList<>();
  String str; 
  str = br.readLine();
  while (str!= null) 
  {
      if((i%2)==1) 
      {
         List.add(str); 
      }
  str=br.readLine();
  i=i+1;
  }
  System.out.println(List);
    } 
}
