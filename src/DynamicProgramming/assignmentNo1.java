package DynamicProgramming;

import java.util.Scanner;

public class assignmentNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int curret=0;
            int currentMOne= 0;
            int currentMTwo = 0;
            for (int j=1;j<=n; j++){
                curret = sc.nextInt();
                if (j == 1){

                }
                else if (j == 2){

                    curret = Math.max(curret,currentMOne);
                }
                else{
                    curret = Math.max(curret+currentMTwo,currentMOne);
                }
                currentMTwo = currentMOne;
                currentMOne = curret;
            }
            System.out.println(curret);
        }
    }
}
