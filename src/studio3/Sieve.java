import java.util.Scanner;
public class Sieve {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Value for n: ");
        int n = in.nextInt();
        int[] numb = new int[n];
        boolean[] myArray = new boolean [n];
        for (int i = 0; i < numb.length; i++){
            numb[i] = 2 + i;
        }
        for (int i = 2; i*i < n; i++){
            if (myArray[i] == true){
                for (int j = i*i; j < n; j += i){
                    myArray[j] = false;
                }
            }
        }
        for (int i = 0; i < n; i++){
            if (myArray[i] == true){
                System.out.println(numb[i]);
            }
        }
    }
    
}
