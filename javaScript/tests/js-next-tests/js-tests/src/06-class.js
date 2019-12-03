/**
 * Create a Prefixer class with constructor and a prefixArray method
 */
exports.Prefixer = class Prefixer {
    constructor(prefix) {
        this.prefix = prefix;
    }
};

exports.Prefixer.prototype.prefixArray = function(arr) {
    return arr.map(value => {
        return this.prefix + value;
    });
};

/**
 * Create a PrefixerSuffixer class which extends from the Prefixer class
 * but adds a sufixArray method
 */
exports.PrefixerSufixer = class PrefixerSuffixer extends exports.Prefixer {
    constructor(prefix, sufix) {
        super(prefix);
        this.sufix = sufix;
    }

    sufixArray(arr) {
        return arr.map(value => {
            return value + this.sufix;
        });
    }
};
