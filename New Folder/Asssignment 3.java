import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment 3 {

   public static void main(String []args) {
   Scanner s = new Scanner(System.in);
   
   String fileName = "input.txt"; 
   
   countWords(System.getProperty("user.dir"), fileName);
   
   }
   
   public static void countWords(String directory, String fileName) {
   
   //this declares Hash Map
   HashMap<String, Integer> wordCount = new HashMap();
   
   String fileNameWithDirectory = directory+ "\\src\\" + fileName;
   
   try
   { FileReader reader = new FileReader(fileNameWithDirectory);
      BufferedReader br = new BufferedReader(reader);
      
      String strCurrentLine;
      while ((strCurrentLine = br.readline()) != null) {
      
      String[] words = strCurrentLine.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
      
      int freq = 0;
      
      for (int i = 0; i < words.length; i++) {
      //HashMap should already have the key, and if so the value will be incremented
      
      if(wordCount.containsKey(words[i])) {
      int n = wordCount.get(words[i]);
      wordCount.put(words[i], ++n);
      }
      
      else {
           wordCount.put(words[i], l);
           
           }
           
           
          }
         
         }
         
         for (Map.Entry entry : wordCount.entrySet())
            System.out.println(entry.getValue() + ": " + entry.getKey());
            
            }
            
            catch (FileNotFoundException e) {
            
            System.err.println("File not found. ");
            }
            
            catch (NullPointerException e) {
            
            System.err.println("File is empty. ");
            }
            
            catch (Exception e) {
            
            System.err.print(e);
            }
            
        }
     
     
     }