class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        
        s = []
        for i in range(0,n):
            s.append(nums[i])
            s.append(nums[i+n])
        return s