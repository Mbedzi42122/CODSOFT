import java.util.Scanner;
public class task2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int totalMarks = 0;

        System.out.println("   welcome to student grade calculator \nhow many subjects do you want to calculate? ");
        int NumberSubject = input.nextInt();
       
        System.out.println("input the marks obtained (out of 100) in each subject.");
        
        for(int i = 0;i < NumberSubject ;i++){
            
            System.out.print("subject "+(1+i)+": ");
            int z = input.nextInt();

            if(z<0 || z>100){
            System.out.print("your marks are out of range please please make sure your are out of 100\nagain enter your marks: ");
            z = input.nextInt();
            }

            totalMarks += z;
        }
        int outof = 100 * NumberSubject;

        System.out.println("\nTotal marks: " + totalMarks+" (out of "+outof+")");
        
        
        double percent =(double) totalMarks/outof;
        double Tpercent = percent*100;
        System.out.println("Average percentage: "+ Tpercent+"%");


        int grade = (int)Tpercent / 10;
        
        switch (grade) {
            case 10 :
                System.out.println("Grade: A");
                break;
            case 9 :
                System.out.println("Grade: A");
                break;
            case 8 :
                System.out.println("Grade: B");
                break;
            case 7 :
                System.out.println("Grade: C");
                break;
            case 6 :
                System.out.println("Grade: D");
                break;
            case 5 :
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: Fail!");
                break;
        }

        input.close();
    }
}
