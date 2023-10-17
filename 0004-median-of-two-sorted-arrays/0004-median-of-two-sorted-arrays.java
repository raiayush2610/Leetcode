import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n= nums1.length;
     int m= nums2.length;
    int [] newArray = new int [n+m];
    int k=0;
    for(int i= 0;i<n;i++){
         newArray[k++]= nums1[i];
    }
    for(int i= 0;i<m;i++){
         newArray[k++]= nums2[i];
     }
    Arrays.sort(newArray);

    int nl = newArray.length;
    double mediam =0;
    if(nl%2==0){
        double num1=newArray[nl/2]+ newArray[(nl-1)/2];
        return ( num1/2);
    }else
        return (double) newArray[nl/2];
    

    
    }
}