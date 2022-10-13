import java.util.Scanner;

public class Grades2 {
  
  public static void main(String[] args) {
    char[] grades = new char[5];
    grades[0] = 'a';
    grades[1] = 'b';
    grades[2] = 'c';
    grades[3] = 'd';
    grades[4] = 'f';
    
    int points;
    
    for(int i = 0; i < 5; i++){
      char newGrade;
      int classNumber = i + 1;
      
      System.out.print("Enter Class " + classNumber + " grade :");
      Scanner scanner = new Scanner(System.in);
      newGrade = scanner.next().charAt(0);
      
      if (newGrade == 'a')
      {
        System.out.println("Outstanding");
      }
      if (newGrade == 'b')
      {
        System.out.println("Above average");
      }
      if (newGrade == 'c')
      {
        System.out.println("Average");
      }
      if (newGrade == 'd')
      {
        System.out.println("Below average");
      }
      if (newGrade == 'f')
      {
        System.out.println("Try again");
      }
      
      grades[i] = newGrade;
    }
    
    for(int i = 0; i < 5; i++){
      int classNumber = i + 1;
      
      switch (grades[i]){
        case 'a':
          System.out.println("Class " + classNumber + " : " + 4 + " quality point(s)");
          break;
        case 'b':
          System.out.println("Class " + classNumber + " : " + 3 + " quality point(s)");
          break;
        case 'c':
          System.out.println("Class " + classNumber + " : " + 2 + " quality point(s)");
          break;
        case 'd':
          System.out.println("Class " + classNumber + " : " + 1 + " quality point(s)");
          break;
        case 'f':
          System.out.println("Class " + classNumber + " : " + 0 + " quality point(s)");
          break;
      }
    }
    
    
    
  }
}
