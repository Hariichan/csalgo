
import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPrime = 0;
        int i = 1;
        int counter = 2;
        int check = 2;
        boolean continuee = true;
        int set[] = new int[99];
        int prime[] = new int[99];
        while (i < 50) {

            set[i] = i;
            i++;

        }

        i = 3;
        counter = 1;
        prime[0] = set[0];
        do {
            while (i < 50) {

                int verify = 1;
                if(set[i] == 0){
                verify = set[i] % set[check];
                }

                if (verify == 0) {
                    System.out.println(set[i]);
                    set[i] = 0;
                }
                i++;
            }
            i = check+1;
            do {
                check++;
            } while (set[check] == 0 && check <50);
           System.out.println(set[check]);
            if (check >= 50) {
                continuee = false;
            }
            
            System.out.println(continuee && check < 50);
        } while (continuee && check < 50);
        counter = 0;
        i = 0;

        do {
            if (set[i] != 0) {
                prime[counter] = set[i];
                 counter++;
            }
            i++;
        } while (i < 50);
        for (int cnt = 0; cnt < counter; cnt++) {
            System.out.print(prime[cnt] + ", ");
        }

    }
}
