package recursionPracticeProblem;
//write a program to calculate the x+y where sum of x = 1+2+3+.......+x-1 + x.
public class problemNo3 {
    public static int sum(int x, int y){
        if (x == 0){
            return y;
        }else{
            return (x+sum(x-1,0))+y;
        }
    }

    public static void main(String[] args) {
        int x = 5,y = 2;
        System.out.println(sum(x,y));
    }
}
