public class Classroom{
    public static void ReverseArray(int arr[]){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        ReverseArray(arr);
    }
}
