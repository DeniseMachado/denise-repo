/**
 * Convert a binary String to a Number
 */
exports.binaryToDecimal = function(str) {
    return parseInt(str, 2);

};

/**
 * Add two Numbers with a precision of 2
 */
exports.add =  function(a, b) {
    return parseFloat((a + b).toPrecision(1));
    //return ((a * 100) + (b * 100))/100;
};

/**
 * Multiply two Numbers with a precision of 4
 */
exports.multiply =  function(a, b) {
    return ((a * 10) * (b * 10))/100
};
