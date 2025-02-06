import java.util.*;
import java.io.*;

public class Driver{
  public static void main(String[]args){
    System.out.println(day1("Day1_1.txt"));
  }

  public static int day1(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      ArrayList<Integer> fuel = new ArrayList<Integer>();
      while (input.hasNextInt()){
        fuel.add(input.nextInt());
      }
      int sum = 0;
      for (int i = 0; i < fuel.size(); i++){
        int fuelNeeded = ((fuel.get(i) / 3) - 2);
        sum+= fuelNeeded;
      }


      input.close();//releases the file from your program
      return sum;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");        return 0; //you can return from a void function just don't put a value.
    }
  }
}
