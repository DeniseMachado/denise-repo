let expect = require('expect.js');
let variablesAnswers = require('../../src/01-variables');

describe('variables', () => {
    it('you should be able to prevent variable reassignment', () => {
        expect(variablesAnswers.reassignVariable).to.throwException(function(
            e
        ) {
            expect(e).to.be.a(TypeError);
            expect(e.message).to.equal('Assignment to constant variable.');
        });
    });

    it('you should be able to fix scoping issues with block scope local variable', () => {
        variablesAnswers.numberReturningFuncs(99).forEach((func, index) => {
            expect(func()).to.equal(index);
        });
    });
});
