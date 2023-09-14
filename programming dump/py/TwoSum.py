class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        #self refers to instance of object
        #nums: List[int], target: int means that nums is expected to be
        #a list of integers and that target is expected to be an integer.
        #-> List[int] means that the function should return a list of integers.
        for i in range(0, len(nums)-1):#checks first value
            for j in range(0, len(nums)-1):#iterates through all consecutive values and checks
                try:
                    if nums[i]+nums[i+j+1]==target:
                        return (i, i+j+1)
                except:
                    break
    def twoSumtwo(self, nums: list[int], target:int) -> list[int]:
        d = {} #dictionary
        for i, j in enumerate(nums):
            #yields (index,value) pair for each item in sequence
            print(d)
            r = target - j
            print(r)
            print(j)
            print("swag")
            if r in d: return [d[r], i]
            d[j] = i
            print(i)


def main():
    myObj = Solution()
    nums = [2,6,5,7,1,3,5,11]
    target = 10
    print(myObj.twoSumtwo(nums, target))
        

if __name__=='__main__':
    main()