public class Classroom{
    public static void MergeSort(int arr[], int si, int ei){
       if(si>=ei){
        return;
       }
       
        //first calculate mid to get left and right side of the array
       int mid = si + (ei-si)/2; //(si+ei)/2
       MergeSort(arr,si,mid);   //left part
       MergeSort(arr, mid+1, ei);  //right part

       merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterate for reight part
        int k = 0; //iterator for temperory array

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,7,8,9,10,1,2,3,4,5};
        MergeSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }
}
