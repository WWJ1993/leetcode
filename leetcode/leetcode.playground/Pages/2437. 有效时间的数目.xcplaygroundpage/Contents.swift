//: [Previous](@previous)

import Foundation

class Solution {
    var res = 0
    
    func countTime(_ time: String) -> Int {
        var countHour = 0
        var countMinute = 0
        let time = Array(time)
        for i in 0..<24 {
            let hiHour = String(i / 10)
            let loHour = String(i % 10)
            let _hiHour = String(time[0])
            let _loHour = String(time[1])
            if (_hiHour == "?" || _hiHour == hiHour) && (_loHour == "?" || _loHour == loHour) {
                countHour += 1
            }
        }
        for i in 0..<60 {
            let hiMinute = String(i / 10)
            let loMinute = String(i % 10)
            let _hiMinute = String(time[3])
            let _loMinute = String(time[4])
            if (_hiMinute == "?" || _hiMinute == hiMinute) && (_loMinute == "?" || _loMinute == loMinute) {
                countMinute += 1
            }
        }
        return countHour * countMinute
    }
    
    
//    func countTime(_ time: String) -> Int {
//        dfs(time: time,pos: 0)
//        return res
//    }
    
    func dfs(time:String, pos:Int)  {
        if time.count == pos {
            if check(time:time) == true{
                res = res + 1
            }
            return
        }
        print(time)
        var timeArray = Array(time)
        if timeArray[pos] == "?" {
            for i in 0...9 {
                timeArray[pos] = Character("\(i)")
                dfs(time: String(timeArray), pos: pos+1)
//                time.replacingCharacters(in: time.startInde, with: "")
//                dfs(time:time.replacingCharacters(in: index, with: "\(i)"),pos: pos+1)
            }
        }else{
            dfs(time: time,pos: pos+1)
        }
        
    }
    
    func check(time:String)->Bool{
        let timeArray = time.components(separatedBy: ":")
        guard let hh = Int(timeArray[0]), let mm = Int(timeArray[1] ) else { return false }
        return hh < 24 && mm < 60
    }
}

print(Solution().countTime("??:??"))

print(Array("123"))
//: [Next](@next)
