import {Data} from "node-lombok";

@Data()
class User {
    [x: string]: any;

    private name: string;
    private email: string;

    constructor(name: string, email: string) {
        this.name = name;
        this.email = email;
    }
}

const user = new User('user', 'user@email');
console.log(user.getName());
console.log(user.getEmail());
