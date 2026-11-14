class Solution:
    def merge_array(self,left,right):
        i,j,n,m = 0,0,len(left),len(right)
        result = []
        while i < n and j < m:
            if left[i]<right[j]:
                result.append(left[i])
                i+=1
            else:
                result.append(right[j])
                j+=1
        if i<n : 
            while i<n:
                result.append(left[i])
                i+=1
        if j<m:
            while j<m:
                result.append(right[j])
                j+=1
        return result

    def merge_sort(self,arr):
        if len(arr) == 1:
            return arr
        mid = len(arr)//2
        left = arr[:mid]
        right = arr[mid:]
        left = self.merge_sort(left)
        right = self.merge_sort(right)
        return self.merge_array(left,right)

    def sortArray(self, nums: List[int]) -> List[int]:
        return self.merge_sort(nums)
        
        