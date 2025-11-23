package Challenge;

import java.util.Arrays;

class SearchInsertPosition {
    public static int BinarySearch(int [] nums, int target){
        int index = Arrays.binarySearch(nums,target);
        if(index < 0){
            return -(index+1);
        }else{
            return index;
        }
    }

    public static  void main(String[] args){
        SearchInsertPosition SIP=new SearchInsertPosition();
        int [] num1={1,3,5,6};
        int target=5;
        System.out.println(SIP.BinarySearch(num1,target));

    }
}
