var employee = /** @class */ (function () {
    function employee(id, name, designation, dept) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dept = dept;
    }
    employee.prototype.display = function () {
        console.log("ID: " + this.id + "    Name : " + this.name + "    Dept : " + this.dept + "    Designation : " + this.designation);
    };
    return employee;
}());
var obj = new employee(88, "Chandra", "CSE", "Manager");
obj.display();
//console.log ("Private data : "+obj.id);
