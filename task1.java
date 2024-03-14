import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in);

        int rounds ;
        int score = 0;

        for ( rounds = 1; rounds < 100 ; rounds++  ) {
            
            double randomNumber = Math.random();

        int targetNumber = (int)(randomNumber*101);

       // System.out.println(targetNumber);

            for (int i = 0; i < 3; i++) {
                
            
            System.out.print((i+1)+". Write your guess :");
             int guess = input.nextInt();

             if (guess== targetNumber) {
                System.out.println("the guess is correct \n");
                score += (i+1) ;
               break;
             } else if(guess<targetNumber) {
                System.out.println("the guess is too low \n");
             }else if(guess>targetNumber){
                System.out.println("the guess is too high \n");
             }else 
            {
                System.out.println("something went wrong please tyr again later");
             }

             if (i == 2) {
                System.out.println("Out of attempts , target number was: " + targetNumber);
        }
    }
    input.nextLine();

        System.out.println("Do you still want to play the game? , (yes or no)?");
        String choice = input.nextLine();

    

        double Totalscore_1= score/rounds;
        double Totalscore_2= Totalscore_1*10;

        if(choice.equalsIgnoreCase("no")){

            System.out.println("Your final score is: " + Totalscore_2 +" (out of 10)");
            System.out.println("Total rounds played: " + rounds);
            break;
        }else if(choice.equalsIgnoreCase("yes")){
        continue;
        }
        else{
            System.out.println("invalid option!");
        }

        
        input.close();
    }
    
    

    }
}