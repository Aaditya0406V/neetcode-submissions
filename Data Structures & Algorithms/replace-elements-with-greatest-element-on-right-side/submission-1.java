class Solution {
    public int[] replaceElements(int[] arr) {
                int largest = 0;
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(largest<arr[j])
                {
                    largest = arr[j];
                }
                
            }
            arr[i] = largest;
            largest = 0;
        }
                arr[arr.length-1] = -1;
        return arr;
    }
}