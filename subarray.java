public class Classroom{
    public static void ArrayPairs(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print("("+arr[k]+")");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayPairs(arr);
    }
}
