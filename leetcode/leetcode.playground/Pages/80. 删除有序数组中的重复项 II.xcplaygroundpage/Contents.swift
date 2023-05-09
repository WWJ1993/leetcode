//: [Previous](@previous)

import Foundation


func removeDuplicates(_ nums: inout [Int]) -> Int {
    return process(&nums, 1)
}
func process(_ nums: inout [Int],_ k:Int)-> Int{
    var idx = 0
    for item in nums {
        if  idx<k || nums[idx-k] != item  {
            idx = idx+1
            nums[idx] = item
        }
    }
    return idx
    
}
