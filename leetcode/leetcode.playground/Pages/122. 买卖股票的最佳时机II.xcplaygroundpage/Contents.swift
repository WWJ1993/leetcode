//: [Previous](@previous)

import Foundation

class Solution {
    func maxProfit(_ prices: [Int]) -> Int {
        var sum = 0;
        var pre = prices[0];
        for i in 1..<prices.count {
            let price = prices[i];
            if price>pre {
                sum += price-pre;
                pre = price;
            }else{
                pre = price;
            }
        }
        return sum;
    }
}



//: [Next](@next)
