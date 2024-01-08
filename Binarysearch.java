import java.util.*;
import java.util.Scanner; 
public class Binarysearch{
int Bin(int ar[],int l,int r,int x){
    int mid;
  while(l<=r){
     mid=(l+r)/2;
     if(ar[mid]==x){
        return mid;
      }
      else if(x<ar[mid]){
        r=mid-1;
      }
      else if(x>ar[mid]){
        l=mid+1;
      }
    }
    return -1;
  }
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      Binarysearch bs= new Binarysearch();
      System.out.println("Enter Array Size:");
      int n= sc.nextInt();
      System.out.println("Enter Search Element:");
      int k= sc.nextInt();
      System.out.println("Enter Array Elements:");
      int ar[]= new int[n];
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      Arrays.sort(ar);
      int b=bs.Bin(ar,0,n-1,k);
      b=b+1;
      if(b==0){
        System.out.println("Element is not found!");
      }
      else{
        System.out.println("Element is  found at :"+b);
      }
  }
} 
