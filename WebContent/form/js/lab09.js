/**
 * Solutions for the lab 09
 * lab09.js
 */

(function(){
	console.log("********** Solution for Question 1");
	let person = {
			name: "",
			dateOfBirth: "",
			getName: function() {
				return this.name;
			},
			setName: function(newName) {
				this.name = newName;
			}
	}
	
	let john = Object.create(person);
	john.setName("John");
	john.dateOfBirth = "December 10th, 1998";
	
	john.toString = function() {
		return `The person’s name is ${this.getName()}. ${this.getName()} was born on ${this.dateOfBirth}.`;
	};
	
	console.log(john.toString());
	
	console.log("********** Solution for Question 2");
	let employee = Object.create(person);
	employee.salary = 0;
	employee.hireDate = new Date();
	employee.doJob = function(jobTitle) {
		console.log(`${this.getName()} is a ${jobTitle} who earns ${this.salary}`);
	}
	
	employee.setName("Anna");
	employee.salary = "$249.995.50";
	employee.doJob("Programmer");
	
	console.log("********** Solution for Question 3");
	
	class Person {
		constructor(name, dateOfBirth) {
			this._name = name;
			this._dateOfBirth = dateOfBirth;
		}
		
		get name() {
			return this._name;
		}
		
		set name(newName) {
			this._name = newName;
		}
		
		get dateOfBirth() {
			return this._dateOfBirth;
		}
		
		set dateOfBirth(date) {
			this._dateOfBirth = date;
		}
		
		toString() {
			return `{Name: ${this.name}, DateOfBirth: ${this.dateOfBirth}}`;
		}
	}
	
	let peter = new Person("Peter", "November 10, 1985");
	console.log(peter.toString());
	
	
})();