/**
 * Return an array containing the function arguments
 */
exports.argsAsArray = function(...arguments) {
    return arguments;
};

/**
 * Return an array containing the function arguments,
 * but discarding the first two
 */
exports.lastArgs = function(a, b, ...arguments) {
    return arguments;
};

/**
 * Return a function which applies the provided transform function
 * on all arguments and returns an array with the results
 */
exports.transformArgs = function(transform) {
    var arr = [];

    return function(...args) {
        args.forEach(element => {
            arr.push(transform(element));
        });
        return arr;
    };
};

/**
 * Invoke the callback function passing each character
 * from the provided string as an argument
 */
exports.spreadChars = (str, cb) => cb(...str);

/**
 * Concatenate the provided arrays using the spread operator
 */
exports.mergeArrays = function(arr1, arr2) {
    return [...arr1, ...arr2];
};

/**
 * Return array of chars from the provided array of strings
 * using the spread operator
 */
exports.spreadArrayStrings = function(arr) {
    let newArr = [];

    arr.forEach(element => {
        newArr.push(...element);
    });
    return newArr;
};

/**
 * Flatten an array of arrays using the spread operator
 */
exports.flattenArray = function(arr) {
    return [].concat.apply([], arr);
};
