/**
 * Creates a counter module with an initial value, zero if not provided
 * The counter module should have get, increment and reset methods
 */
exports.createCounter = function(counter) {
    newCounter = counter || 0;

    /* return {
        get: function() {
           return newCounter;
        },

        increment: function() {
          return newCounter++;
        },
        reset: function() {
            return newCounter = 0;
        },
    };*/

    function get() {
        return newCounter;
    }
    function increment() {
        return newCounter++;
    }

    function reset() {
        return (newCounter = 0);
    }

    var obj = {
        get: get,
        increment: increment,
        reset: reset
    };

    return obj;
};

/**
 * Creates a person module with name and age
 * An initial name value should be provided and
 * an exception thrown if not,
 * the module should have getAge, setAge and getName methods
 */
exports.createPerson = function(name) {
    var newName = name;
    var age = 0;

    if (!name) {
        throw new Error("You not provided an initial name");
    }

    function getAge() {
        return age;
    }

    function setAge(value) {
        return age = value;
    }

    function getName() {
        return newName;
    }

    var objPerson = {
        getAge: getAge,
        setAge: setAge,
        getName: getName
    };

    return objPerson;
};
