/**
 * Return an object with a login property,
 * accessible only through a getter and setter
 */
exports.buildLogin = function() {

    //let login = '';

    return {
        _login: '',

        get login() {
            return login;
        },
        set login(newLogin) {
            login = newLogin;
        }
    };

};