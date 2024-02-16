class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    constructor(id,salary,name,age) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }
}

const emp1 = new Employee(1046,35000,'John',22);
const emp2 = new Employee(1047,40000,'Rajesh',27);

console.log(emp1);
console.log(emp2);