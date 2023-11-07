//: [Previous](@previous)

import Foundation

class Solution {
    func smallestRepunitDivByK(_ k: Int) -> Int {
        var len:Int = 1
        var resId = 1 % k
        var set = Set<Int>()
        set.insert(resId)
        while resId != 0 {
//            len*10+1
            resId = (resId*10+1)%k
            len = len + 1
            if set.contains(resId) == true {
                return -1
            }
            set.insert(resId)
        }
        return len
    }
}
print(Solution().smallestRepunitDivByK(27))
//: [Next](@next)

