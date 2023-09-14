import sys

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
#linked list implemented with ListNode class, two attributes val and next
#val stores value of node, next points to next in linked list

class Solution:
    #takes in two linked lists as input parameters and returns sum as new linked list
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        #first create dummy node to store result of sum
        dummy = ListNode()
        #tail variable used to keep track of last node in LL
        #carry variable used to keep track of what value to carry when adding 2 digits
        tail, carry = dummy, 0
        #while loop runs until all digits in both LL have been added and no carry left
        #each iteration, value of current node calculated as sum of
        #corresponding digits in l1 and l2, along with any carry from previous calc
        while l1 or l2 or carry != 0:
            num1 = l1.val if l1 else 0
            num2 = l2.val if l2 else 0

            nodeSum = num1 + num2 + carry
            #if sum is >=10 carry is 1, val of current node is set to unit digit of sum
            carry = nodeSum // 10   # floor division, rounds result down to nearest whole #
            nodeSum = nodeSum % 10   # modulo, returns remainder of division
            #new node created with calculated value, tail.next is set to node.
            tail.next = ListNode(nodeSum)
            
            l1 = l1.next if l1 else None #moves pointer to next val if from l1. otherwise null
            l2 = l2.next if l2 else None
            #tail variable updated to point to new Node          
            tail = tail.next
        return dummy.next
#Overall this function uses linked list traversal to add two numbers digit by digit
#also taking care of carrying excess of sum to next digit


def main():
    l1 = input('Enter First Linked List, separate by spaces: \n')
    l2 = input('Enter Second Linked List: \n')

    l1 = list(map(int, l1.split()))
    l2 = list(map(int, l2.split()))

    l1 = ListNode()
    l2 = ListNode()

    Sol = Solution()
    swag=(Sol.addTwoNumbers(l1,l2))
    print(swag)
if __name__ == "__main__":
    main()

    

    

