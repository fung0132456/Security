import java.util.Random;

import java.util.*;
public class Keygenerate {
 public static void main(String[] args) {
  // For the users choosing the length of the password that will be generate
  System.out.print("Choose key generater for 1,2,3,4,5 keys\nChoose(1-5):  ");
  Scanner in = new Scanner(System.in);
  int choice = in .nextInt();

  // For choice 1 , it will generate 1-key password
  if (choice == 1) {
   System.out.println("1-key password");
  // For setting the max and min length of the ASCII table
   int min = 32;
   int max = 127;
   int count = max - min + 1;
   int[] anArray = new int[count];

   // Reuse the array to increment the min
   for (int i = 0; i < count; i++, min++) {
    anArray[i] = min;
   }
   // It will change the values inside the array to the value in ASCII table
   StringBuffer sb = new StringBuffer();
   for (int i = 0; i < anArray.length; i++) {
    sb.append((char) anArray[i]);
   }

   // To change the charater's ASCII table value to string form
   String sh = sb.toString();

   // To randomly get one of the ASCII table value 
   Random r = new Random();
   int size = sh.length();


   for (int a = 0; a < 1; a++) {
    char f = (sh.charAt(r.nextInt(size)));
    System.out.print(String.valueOf(f));
   }

   // For choice 2 , it will generate 2-key password
  } else if (choice == 2) {
   System.out.println("2-key password");
   // For setting the max and min length of the ASCII table
   int min = 32;
   int max = 127;
   int count = max - min + 1;
   int[] anArray = new int[count];

   // Reuse the array to increment the min
   for (int i = 0; i < count; i++, min++) {
    anArray[i] = min;
   }

   // It will change the values inside the array to the value in ASCII table
   StringBuffer sb = new StringBuffer();
   for (int i = 0; i < anArray.length; i++) {
    sb.append((char) anArray[i]);
   }

   // To change the charater's ASCII table value to string form
   String sh = sb.toString();


   // To randomly get two of the ASCII table value 
   Random r = new Random();
   int size = sh.length();


   for (int a = 0; a < 2; a++) {
    char f = (sh.charAt(r.nextInt(size)));
    System.out.print(String.valueOf(f));


   }
   // For choice 3 , it will generate 3-key password
  } else if (choice == 3) {
   System.out.println("3-key password");
   // For setting the max and min length of the ASCII table
   int min = 32;
   int max = 127;
   int count = max - min + 1;
   int[] anArray = new int[count];

   // Reuse the array to increment the min
   for (int i = 0; i < count; i++, min++) {
    anArray[i] = min;
   }

   // It will change the values inside the array to the value in ASCII table
   StringBuffer sb = new StringBuffer();
   for (int i = 0; i < anArray.length; i++) {
    sb.append((char) anArray[i]);
   }

   // To change the charater's ASCII table value to string form
   String sh = sb.toString();

   // To randomly get three of the ASCII table value 
   Random r = new Random();
   int size = sh.length();

   for (int a = 0; a < 3; a++) {
    char f = (sh.charAt(r.nextInt(size)));
    System.out.print(String.valueOf(f));
   }
   // For choice 4 , it will generate 4-key password
  } else if (choice == 4) {
   System.out.println("4-key password");
   // For setting the max and min length of the ASCII table
   int min = 32;
   int max = 127;
   int count = max - min + 1;
   int[] anArray = new int[count];

   // Reuse the array to increment the min
   for (int i = 0; i < count; i++, min++) {
    anArray[i] = min;
   }

   // It will change the values inside the array to the value in ASCII table
   StringBuffer sb = new StringBuffer();
   for (int i = 0; i < anArray.length; i++) {
    sb.append((char) anArray[i]);
   }

   // To change the charater's ASCII table value to string form
   String sh = sb.toString();

   // To randomly get four of the ASCII table value 
   Random r = new Random();
   int size = sh.length();


   for (int a = 0; a < 4; a++) {
    char f = (sh.charAt(r.nextInt(size)));
    System.out.print(String.valueOf(f));
   }
   // For choice 5 , it will generate 5-key password
  } else if (choice == 5) {
   System.out.println("5-key password");
   // For setting the max and min length of the ASCII table
   int min = 32;
   int max = 127;
   int count = max - min + 1;
   int[] anArray = new int[count];

   // Reuse the array to increment the mi
   for (int i = 0; i < count; i++, min++) {
    anArray[i] = min;
   }

   // It will change the values inside the array to the value in ASCII table
   StringBuffer sb = new StringBuffer();
   for (int i = 0; i < anArray.length; i++) {
    sb.append((char) anArray[i]);
   }

   // To change the charater's ASCII table value to string form
   String sh = sb.toString();


   // To randomly get five of the ASCII table value 
   Random r = new Random();
   int size = sh.length();


   for (int a = 0; a < 5; a++) {
    char f = (sh.charAt(r.nextInt(size)));
    System.out.print(String.valueOf(f));
   }
  } else {
   //If the user input the number larger than 5 , it will give an error message to let the user know that.
   System.out.println("Wrong Choice");
  }
 }
}