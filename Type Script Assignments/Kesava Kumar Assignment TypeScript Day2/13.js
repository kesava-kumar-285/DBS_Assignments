var student = /** @class */ (function () {
    function student() {
    }
    student.prototype.assign_data = function (id, name, stream) {
        this.id = id;
        this.name = name;
        this.stream = stream;
    };
    student.prototype.get_Id = function () {
        return this.id;
    };
    ;
    student.prototype.get_Name = function () {
        return this.name;
    };
    ;
    student.prototype.get_Stream = function () {
        return this.stream;
    };
    ;
    return student;
}());
var student_obj = new student();
student_obj.assign_data(88, "Kesava", "CSE");
console.log("ID : " + student_obj.get_Id() + "\nName : " + student_obj.get_Name() + "\nStream : " + student_obj.get_Stream());
