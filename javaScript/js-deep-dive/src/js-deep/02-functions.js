/**
 * Return result of calling function with arguments as present in array
 */
exports.argsAsArray = function(fn, arr) {
    return fn.apply(this, arr);
};

/**
 * Return the result of calling a function with the provided obj as context
 * for the implicit argument this
 */
exports.speak = function(fn, obj) {
    return fn.call(obj);
};

/**
 * Return a prefixer function that concatenates a string argument with a prefix
 */
exports.stringPrefixer = function(prefix) {
    return function(str) {
        return prefix.concat(str);
    };
};

/**
 * Create an array of functions, each producing a result obtained
 * from applying the transform function to an argument from values array
 */
exports.makeResultFunctions = function(values, transform) {
    var funcs = [];

    values.forEach(value => {
        funcs.push(function() {
            return transform(value)});
        });
        return funcs;

};

/**
 * From a function which receives three arguments,
 * of which only two are available, create a new function
 * which wraps the original one with the missing argument
 */
exports.createWrapperFunction = function(fn, arg1, arg2) {
    return function(agr3) {
        return fn.apply(null, [arg1, arg2, agr3]);
    }
};

/**
 * Return the sum of all arguments
 */
exports.sumArguments = function() {
    var total = 0;

    for(var i=0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;

};

/**
 * Execute the function, passing it all the provided arguments
 */
exports.callIt = function(fn) {
var args = Array.prototype.slice.call(arguments, 1);
return fn.apply(fn, args);
};

/**
 * From a function which receives a variable number of arguments,
 * return a wrapper function which adds additional arguments to the ones
 * available and calls the original function
 */
exports.createAddArgumentsFunction = function(fn) {};
