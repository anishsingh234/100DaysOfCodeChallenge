class Solution {
    public int[] twoSum(int[] nums, int target) {
      int arr[]=new int[2];
      int arrsize=nums.length;
      for (int i =0 ; i<arrsize; i++){
          for(int j=i+1; j<arrsize; j++){
              if(nums[i]+nums[j]==target){
                 arr[0]=i;
                 arr[1]=j;
                break;
              }
          }
      }
      return arr;
    }   
}