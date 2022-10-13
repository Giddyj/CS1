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
      
      int totalPoints = 0; 
      
      if (newGrade == 'a')
      {
        System.out.println("Outstanding");
        totalPoints = + 4;
      }
      if (newGrade == 'b')
      {
        System.out.println("Above average");
        totalPoints = + 3;
      }
      if (newGrade == 'c')
      {
        System.out.println("Average");
        totalPoints = + 2;
      }
      if (newGrade == 'd')
      {
        System.out.println("Below average");
        totalPoints = + 1;
      }
      if (newGrade == 'f')
      {
        System.out.println("Try again");
        totalPoints = + 0;
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
    
    System.out.println( totalPoints );
    
  }
}
