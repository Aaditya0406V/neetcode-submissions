class Solution:
    def reverse(self,nums,l,r):
        while l<r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        k=k%n
        # nums[:] = nums[n-k:] + nums[:n-k]
        self.reverse(nums,n-k,n-1)
        self.reverse(nums,0,n-k-1)
        self.reverse(nums,0,n-1)