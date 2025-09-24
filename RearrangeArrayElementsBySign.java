class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> neg=new ArrayList<Integer>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        
       for(int i=0;i<pos.size();i++){
        nums[i*2]=pos.get(i);
       }
       for(int i=0;i<neg.size();i++){
        nums[i*2+1]=neg.get(i);
       }
       return nums;
        
    }
}
