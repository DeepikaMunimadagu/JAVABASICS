public class Classroom{
    
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int er = arr.length;
        int ec = arr[0].length;
        int sum1 = 0;
        int sum2 = 0;
        
        for(int i=0;i<er;i++){
            for(int j=0;j<ec;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }
                if(i+j==er){
                    sum2+=arr[i][j];
                }
            }
        }
        int totalsum = sum1+sum2;
        System.out.println("The sum of the diagonals is -> "+totalsum);

    }
}
