class Solution {
    public int[] twoSum(int[] nums, int target) {

        //use hashmap //put details inside //check diff =targer - nums[i] //get i
        //chech diff is in hashmap  //else index ,continue

        HashMap<Integer,Integer>map=new HashMap <>();

        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];

            if(map.containsKey(diff))
            {
                return new int[] {map.get(diff),i};

               
            }
            
            map.put(nums[i], i);
        }
        return null;
    }
}
