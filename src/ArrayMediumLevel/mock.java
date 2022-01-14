package ArrayMediumLevel;

public class mock {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int even = 0;
        int odd =0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of event:"+even +"The number of odd:"+odd);
        String str= "my name is sarthak";
        countWord(str);
    }
    public static void countWord(String str){
        int count =1;
        int length = str.length();
        for (int i=0; i<length; i++){
            if (str.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
    //100 / 50 / 20 / 10 / 5/2/1
    //
    //357
    //
    //3 - 100
    //
    //1 - 50
    //
    //0-20
    //
    //0-10
    //
    //1-5
    //
    //1-2
    //
    //0-1
}
