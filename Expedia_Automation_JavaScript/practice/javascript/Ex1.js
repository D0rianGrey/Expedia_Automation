class User {
    #name;
    #age;

    constructor(name, age) {
        this.#name = name;
        this.#age = age;
    }

    get getName() {
        return this.#name;
    }

    get getAge() {
        return this.#age;
    }

    test() {
        console.log("Hello");

        return this;
    }

    static test2(){
        console.log("Hello2");
    }
}







