

/**
 * Created by user on 2/23/17.
 */
public class PrimeNumber {
    public static void main(String[] args) {

    }
    public static String checkPrime (int numb){
        //if loop to check if number is equal to one it cant be prime
            if (numb <= 1) {
                return null;
            }
            //for loop to check number is divisible by 2 its not prime
            for (int i = 2; i < Math.sqrt(numb); i++) {
                if (numb % i == 0) {
                    return "not prime";
                }
            }
            return "Prime";


    }
}
