import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int[] vector = {0,1,2,3,4,5,6,7,8,9};

        for (i=0;i<vector.length;i++) {
            if (i%2==0){
                vector[i]+=2;
            }else {
                vector[i]*=2;
            }
            System.out.print(vector[i]+"|");
        }
    }
}
