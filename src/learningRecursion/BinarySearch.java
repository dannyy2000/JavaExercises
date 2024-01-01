package learningRecursion;

public class BinarySearch {

    public static void main(String[] args) {
     int []nums = {2,4,5,6,7,8,9};
     int tar = 8;
        System.out.println(binarySearch(nums, tar, 0, nums.length - 1));
    }

    static int binarySearch(int[]arr,int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/ 2;

        if(arr[m] == target){
            return m;
        }

        if(target > arr[m]){
            return binarySearch(arr,target,m+1,e);
        }
        return binarySearch(arr,target,s,m-1);

    }
}
