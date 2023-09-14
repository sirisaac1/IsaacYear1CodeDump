class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        #given list of ints nums, return true if any num reoccurs return false if not
        nums_set=set()
        for i in nums:
            if i in nums_set:
                return True
            else:
                num_set.add(i)
        return False

def main():
    myObj = Solution()
    nums = [1,2,3,6]
    condition = (myObj.containsDuplicate(nums))
    print(str(condition))

if __name__=='__main__':
    main()