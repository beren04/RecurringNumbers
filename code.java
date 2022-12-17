import java.util.Arrays;

public class RecurringNumbers {
    static boolean isIn(int[] arr, int val){
    for (int a: arr){
        if(a==val) {
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        int[] list = {1,5,4,8,4,6,8,7,9,2,2,6};
        int[] recur= new int[list.length];
        int startIndex=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])) {
                    if (!isIn(recur,list[i])){
                        recur[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        for(int a: recur){
            if(a!=0){
                System.out.print(a+ " ");
            }
        }
    }
}
