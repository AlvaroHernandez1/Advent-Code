import java.util.*;
import java.io.*;

public class Driver{
  public static void main(String[] args){
    if (args[0].equals("1")){
      System.out.println(day1("Day1_1.txt"));
      System.out.println(day1_2("Day1_1.txt"));
    }
    System.out.println(day2("Day2_1.txt"));
  }
  public static int day2(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);
      String line = input.nextLine();

      String[] data = line.split(",");

      System.out.println(Arrays.toString(data));


      input.close();//releases the file from your program
      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");        return 0; //you can return from a void function just don't put a value.
    }
  }

  public static int day1_2(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);

      ArrayList<Integer> fuel = new ArrayList<Integer>();
      while (input.hasNextInt()){
        fuel.add(input.nextInt());
      }
      int sum = 0;
      for (int i = 0; i < fuel.size(); i++){
        while (fuel.get(i) > 0){
          int fuelNeeded = ((fuel.get(i) / 3) - 2);
          if (fuelNeeded > 0)
            sum += fuelNeeded;
          fuel.set(i, fuelNeeded);
        }
      }


      input.close();//releases the file from your program
      return sum;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");        return 0; //you can return from a void function just don't put a value.
    }
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

  public static int base(String filename){
    try {
      File file = new File(filename);//1
      Scanner input = new Scanner(file);


      input.close();//releases the file from your program
      return 0;

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");        return 0; //you can return from a void function just don't put a value.
    }
  }
}
