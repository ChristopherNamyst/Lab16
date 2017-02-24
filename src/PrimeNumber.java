import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;


        System.out.println("Our application helps you find any prime number(from 2 to 100)  " +
                "sequentially from the first prime number entered. ");


        do {
            System.out.println("Let's start by entering a prime number....");
            int userInput = scan.nextInt();
            checkPrime(userInput);

            System.out.println("That particular prime number in our list is " + checkPrime(userInput));

            System.out.println("Would you like to find another Prime? y/n?");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Thank you for participating, Have a great day!!");
    }



    public static int checkPrime (int index){
        boolean[] list;
        list = new boolean[100000];

        // populate with true to assume all integers are prime.
        Arrays.fill(list, true);
        //create arraylist of primes
        ArrayList<Integer> primes = new ArrayList<Integer>();
        //setting known non-primes to false
        //we know 0 and 1 are not prime
        list[0] = false;
        list[1] = false;
        //created a loop to start at the first prime in our array list
        for (int i = 2; i < list.length; i++) {
            //if the number is prime,
            //then go through all its multiples and make their values false.

            if (list[i]) {
                //traverse and set the mmultiple of each prime number to false
                for (int j = 2; i * j < list.length; j++) {
                    list[i * j] = false;

                }
                //pop n lockin our list up real good like whut
                primes.add(i);
            }
        }
        //returning our user specified index aka prime number
        return primes.get(index - 1);
    }

}



