/**
 * Solutions for the lab 08
 * lab08.js
 */

/** Solution 6*/
class Counter {
	constructor() {
		this._count = 0;
	}
	
	get count() {
		return this._count;
	}
	
	add() {
		this._count += 1;
	}
	
	reset() {
		this._count = 0;
	}
}

console.log("***** Solution 6");
const counter = new Counter();

counter.add();counter.add();
console.log(counter.count);

counter.reset();
console.log(counter.count);

/** Solution 8*/

function make_adder(inc) {
	let count = 0;
	const increaser = inc; 
	return function() {
		return count += increaser;
	}
}

console.log("***** Solution 8");
var add5 = make_adder(5);
console.log(add5());
console.log(add5());
console.log(add5());

/** Solution 10*/
const module = (function() {
	let name;
	let age;
	let salary;
	
	const getName = function() {
		return name;
	}
	
	const setName = function(newName) {
		name = newName;
	}
	
	const getAge = function() {
		return age;
	}
	
	const setAge = function(newAge) {
		age = newAge;
	}
	
	const getSalary = function() {
		return salary;
	}
	
	const setSalary = function(newSalary) {
		salary = newSalary;
	}
	
	const increaseSalary = function(percentage) {
		const currentSalary = getSalary();
		salary = currentSalary + currentSalary*percentage/100;
	}
	
	const incrementAge = function() {
		age = getAge() + 1;
	}
	
	return {
		setName : setName,
		setAge : setAge,
		setSalary : setSalary,
		increaseSalary : increaseSalary,
		incrementAge : incrementAge
	}
})();

const employee = module;
employee.setName("Anna");
employee.setAge(40);
employee.setSalary(80000);
employee.incrementAge();
employee.increaseSalary(10);

employee.setAddress = function(newAddress) {
	employee.address = newAddress;
}

employee.getAddress = function() {
	return employee.address;
}

employee.setAddress("123 S Main street, Fairfield, Iowa.");
console.log(employee.getAddress());