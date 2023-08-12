import java.util.Scanner;
import java.util.Random;

public class Main {
    static void NumberGuess(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = random.nextInt(100)+1;
        int k = 5, i =0;
        int score = 100;
        while(i<k){
            System.out.println("Enter your guess:");
            int guessedNumber = sc.nextInt();

            if(randomNumber == guessedNumber){
                System.out.println("You guessed correct and YOU WIN!!");
                break;
            }
            else if(randomNumber>guessedNumber){
                System.out.println(guessedNumber+" is lower the number. Guess higher number");
                score -=20;
            }
            else{
                System.out.println(guessedNumber+" is higher the number. Guess lower number");
                score -=20;
            }
            i++;
        }
        if(i == k){
            System.out.println("You trails are exhausted.");
            System.out.println("The number is "+randomNumber);
        }
        System.out.println("Your score is "+score);
    }
    public static void main(String[] args) {
        boolean num ;
        Scanner sc = new Scanner(System.in);
        do{
            NumberGuess();
            System.out.println("Want to play again(true/false):");
            num = sc.nextBoolean();
        }
        while(num);
    }
}
