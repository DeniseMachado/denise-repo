/**
 * Fix the async retrieve method, doing proper error handling
 * in case fetch does not return a user
 */
exports.User = class {
    constructor(url) {
        this.url = url;
    }

     async retrieve() {
        const response = await fetch(this.url);

        if(!response) {
            throw new Error("Error");
        }

        return response;
    }
};
