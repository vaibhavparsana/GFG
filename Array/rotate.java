package Array;

import javax.sound.sampled.SourceDataLine;

public class rotate {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int d=2;
        int n=5;

        rotateLeft(arr,0,d-1);
        rotateLeft(arr,d,n-1);
        rotateLeft(arr,0,n-1);

        for(int i=0;i <n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    public static void rotateLeft(int arr[],int d,int n) {
        int temp;
        for(int i=d,j=n; i<j; i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
}
