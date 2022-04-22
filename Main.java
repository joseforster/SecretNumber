import java.util.Scanner;

public class Main{
        
        public static void main(String args []){

            Number number = new Number();

            Scanner input = new Scanner(System.in);

            Util.Question(number.getNumbers());

            int guess = input.nextInt();

            while(!number.isSecretNumber(guess)){

                boolean guessResult = number.isRightSide(guess, number.getNumbers());

                Util.Question(number.getNumbers(), guessResult);

                guess = input.nextInt();
     
            }

            System.out.println("YOU CHOOSED THE RIGHT NUMBER!");

            input.close();
        }
    }