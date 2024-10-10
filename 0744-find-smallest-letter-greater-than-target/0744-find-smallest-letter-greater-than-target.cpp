class Solution {
public:
    char nextGreatestLetter(vector<char>& nums, char target) {
        int low=0,high=nums.size()-1;
        char ans=nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=nums[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
};
