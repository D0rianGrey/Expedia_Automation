class User {
    skills: string[] = new Array<string>();

    addSkill(skill: string);
    addSkill(skill: string[]);
    addSkill(skill: string | string[]): void {
        if (typeof skill === 'string') {
            this.skills.push(skill);
        } else {
            this.skills.push(...skill);
        }
    }

    printSkills() {
        console.log(this.skills);
    }
}

const list = Array.of("TEST", "ENGLISH");

const user: User = new User();
user.addSkill("DEV");
user.addSkill(list);
user.printSkills();
