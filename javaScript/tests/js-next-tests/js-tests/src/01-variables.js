/**
 * Should return array of functions that return each number from 0 to times
 * Use block scope (not closure) to fix this
 */
exports.numberReturningFuncs = function(times) {
    var fs = [];
    for (let i = 0; i < times; i++) {
        fs.push(() => i);
    }

    return fs;
};

/**
 * Prevent variable reassignment
 */
exports.reassignVariable = function() {
    var a = 1;

    {
        const a = 1;
        a = 2;
    }
};
