/**
 * Fix the behaviour of the function
 */
exports.getPerson = function(years, time) {

    return {
        name: 'Pedro',
        age: 5,
        growUp: function() {
            setTimeout(() => {
                this.age += years;
            }, time);
        }
    };
};

/**
 * Fix the behaviour of the function
 */
exports.getArgsAsArray = function() {
    return (...args) => {
        return [].slice.call(args);
    };
};



/**
 * Fix the behaviour of the function
 */
exports.getMultiplier = function() {

    return {
        factor: 1,
        getMultiplierFunc: function() {
            return (value) => {
                return this.factor * value;
            };
        }
    };
};

/**
 * Fix the behaviour of the prefixArray method
 */
exports.Prefixer = function Prefixer(prefix) {
    this.prefix = prefix;
};

exports.Prefixer.prototype.prefixArray = function(arr) {
    return arr.map((value) => {
        return this.prefix + value;
    });
};
