class Department {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
}

class University {
    constructor() {
        this.departments = [];
    }

    addDepartment(id, name) {
        const department = new Department(id, name);
        this.departments.push(department);
    }

    displayDepartments() {
        console.log("Departments in the university:");
        this.departments.forEach(department => {
            console.log(`ID: ${department.id}, Name: ${department.name}`);
        });
    }
}


const university = new University();
university.addDepartment(1, "Computer Science");
university.addDepartment(2, "Electrical Engineering");
university.displayDepartments();
