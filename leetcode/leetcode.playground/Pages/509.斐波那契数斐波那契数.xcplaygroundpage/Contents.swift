//: [Previous](@previous)

import Foundation

class Solution {
    func fib(_ n: Int) -> Int {
        
        if n==1 || n==2 {
            return 1
        }
        if n<3 {
            return n
        }
        var n1 = 1, n2 = 1
        var result = 0
        for _ in 3...n {
            result = n1 + n2
            n1 = n2
            n2 = result
        }
        return result
    };
}

let result = Solution().fib(0)
print(result)
