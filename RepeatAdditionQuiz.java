import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    //加入陣列
    ArrayList<Integer> list = new ArrayList<Integer>();
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();
    list.add(answer);
    
    while (number1 + number2 != answer) {
      System.out.print("Wrong answer. Try again. What is " 
        + number1 + " + " + number2 + "? ");
      answer = input.nextInt();
      
      //假如使用者輸入重複答案
      if (list.contains(answer)) {
        System.out.println("這個答案已經輸入過囉!" + answer);
      }
      else {
        list.add(answer);
      }
    }

    System.out.println("You got it!");
  }
}