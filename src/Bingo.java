import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        int[] print=Rand();
        int a=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(print[a]+"   ");
                a++;
            }
            System.out.println();
        }
    }

    public static int[] Rand(){
        Random random = new Random();
        int[] check = new int[26];
        int[] ret= new int[25];
        for(int i=0;i<25;i++){
            do {
                ret[i] = random.nextInt(25)+1;
            } while (check[ret[i]] == 1);
            check[ret[i]] = 1;
        }
        return ret;
    }
}