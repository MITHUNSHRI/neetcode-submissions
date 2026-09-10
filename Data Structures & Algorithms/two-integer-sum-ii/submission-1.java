class Solution
{
    public int[] twoSum(int [] number,int target )
    {
        int l=0;
        int r=number.length-1;

      
{
        while(l<r)
        {
            int curr=number[l]+number[r];

            if(curr >target)
            {
                r--;
            }
            else if(curr <target)
            {
                l++;
            }
            else
            {
                return new int[]{l+1,r+1};
            }
        }
}
        return new int[0];
    }
}