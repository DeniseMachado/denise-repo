/**
 * Fix the async retrieve method, doing proper error handling
 * in case fetch does not return a user
 */
exports.User = class {
    constructor(url) {
        this.url = url;
    }

    retrieve() {
        return fetch(this.url);
    }
};
