/*
 * @lc app=leetcode.cn id=509 lang=javascript
 *
 * [509] 斐波那契数
 */

// @lc code=start
/**
 * @param {number} n
 * @return {number}
 */
var fib = function (n) {
    if (n == 1 || n == 2) return 1
    let n1 = 1, n2 = 1
    let result = 0
    for (let i = 3; i < n; i++) {
        let result = n1 + n2
        n1 = n2
        n2 = result
    }
    return result
};
// @lc code=end

