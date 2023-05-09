//: [Previous](@previous)

import Foundation

class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
        if nums.count == 0 {
            return nums.count
        }
        var p = 0, q = 1
        while q < nums.count {
            if nums[p] != nums[q] {
                if q-p>1 {
                    nums[p+1] = nums[q]
                }
                p = p+1
            }
            q = q+1
        }
        return p+1
    }
}
}


