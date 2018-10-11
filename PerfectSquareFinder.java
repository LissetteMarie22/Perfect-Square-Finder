import java.util.ArrayList; //Adding ArrayList Library
import java.util.Scanner; //Adding Scanner library

public class PerfectSquareFinder { //Beginning the class
    public static void main(String args[]){ //Starting main class
        Scanner reader = new Scanner(System.in); //Making a new Scanner
        System.out.println("Enter an integer m: "); //Prompt asking the user to enter their number of choice.
        int m = reader.nextInt(); //Scanner gets int entered.
        ArrayList<Integer> numbArray = new ArrayList<Integer>(); //Making new ArrayList.
        for(int i=1; i < m; i++ ){ //Making loop to add factors of a number to an array list.
         if(m % i == 0 ){
             numbArray.add(i);
         }
        }
        try {
            for(Integer n: numbArray){ //Using m to go through list of it's factors and multiply it against each factor to see if it's a perfect square.
                if(isPerfectSquare(m,n) ) {
                    int foundPair = m*n;
                    System.out.println("The smallest number for m * n to be a perfect square is " + n); //Prints the smallest number that, when multiplied with m, gives you a perfect square.
                    System.out.println( "m * n is " + foundPair); //Shows  what these numbers multipled together gets you.
                    break; //Stop searching for a number once you find the smallest number that meets this condition.
                }

            }
        } catch (Exception e) { //Catching any list iteration errors.
            e.printStackTrace();
        }

    }

    public static boolean isPerfectSquare(int numb1, int numb2){ //Function used above, that takes two numbers, and sees if they, multiplied together gets you a perfect square.

        int value = numb1 * numb2;
        double squareRoot =  Math.sqrt(value);
        int squaredInt = (int)squareRoot;

        if(Math.pow(squareRoot,2) == Math.pow(squaredInt,2)) {
            return true;
        }
return false;

    }


}
