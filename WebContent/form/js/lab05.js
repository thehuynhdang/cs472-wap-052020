/**
 * Solutions for the lab 05
 * lab05.js
 */

window.onload = function() {
	//1.	Define a function max() that takes two numbers as arguments and returns the largest of them. Use the if-then-else construct available in Javascript.
	function max(n1, n2) {
		if(n1>n2) return n1;
		return n2;
	}	
	console.log("\n1.----testing------");
	console.log("max(4,5)=" + max(4,5));

	//2.	Define a function maxOfThree() that takes three numbers as arguments and returns the largest of them.
	function maxOfThree(n1, n2, n3) {
		var a = [n1, n2, n3];
		let max = a[0];
		for(let i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	console.log("\n2.----testing------");
	console.log("maxOfThree(2, 4, 1)=" + maxOfThree(2, 4, 1));

	//3.	Write a function isVowel() that takes a character (i.e. a string of length 1) and returns true if it is a vowel, false otherwise.
	function isVowel(c) {
		return ['a', 'e', 'i', 'o', 'u'].indexOf(c.toLowerCase()) !== -1
	}
	console.log("\n3.----testing------");
	console.log("isVowel('a')=" + isVowel('a'));

	//4.	Define a function sum() and a function multiply() that sums and multiplies (respectively) all the numbers in an input array of numbers. For example, sum([1,2,3,4]) should return 10, and multiply([1,2,3,4]) should return 24. Note/Hint: Do these using Imperative programming approach (i.e. for…loop or while…loop)
	function sum() {
		let sum = 0;
		for(var i in arguments){
			sum += arguments[i];
		}
		return sum;
	}
	console.log("\n4.----testing------");
	console.log("sum(1,2,3,4,5)=" + sum(1,2,3,4,5));
	console.log("sum(1,5)=" + sum(1,5));

	function multiply() {
		let result = 1;
		for(var i in arguments){
			result *= arguments[i];
		}
		return result;
	}
	console.log("multiply(1,2,3,4,5)=" + multiply(1,2,3,4,5));
	console.log("multiply(2,5)=" + multiply(2,5));

	//5.	Define a function reverse() that computes the reversal of a string. For example, reverse("jag testar") should return the string "ratset gaj".
	function reverse(s) {
		let result = "";
		for(i=s.length-1; i>0; i--) {
			result += s[i];
		}
		return result;
	}
	console.log("\n5.----testing------");
	console.log("reverse(\"jag testar\")=" + reverse("jag testar"));

	//6.	Write a function findLongestWord() that takes an array of words and returns the length of the longest one.
	function findLongestWord(words) {
		let a = words.split(" ");
		let maxlen = 0;
		for(w of a) {
			if(w.length > maxlen) {
				maxlen = w.length;
			}
		}
		return maxlen;
	}
	console.log("\n6.----testing------");
	console.log("findLongestWord(\"the length of the longest words\")=" + findLongestWord("the length of the longest words"));

	//7.	Write a function filterLongWords() that takes an array of words and an integer i and returns a new array containing only those words that were longer than i characters.
	function filterLongWords(words, len) {
		let result = words.filter(function(value, index, array) {
			return value.length > len;
		});

		return result;
	}
	console.log("\n7.----testing------");
	console.log("filterLongWords([\"length\", \"of\", \"the\", \"longest\", \"words\"], 3)=" + filterLongWords(["length", "of", "the", "longest", "words"], 3));

	//8.	Write a function named, computeSumOfSquares, that takes as input, an array of numbers and calculates and returns the sum of the squares of each number in the input array. E.g. computeSumOfSquares([1,2,3]) should be computed as 12 + 22 +32 = 14. Note: Write your Javascript code without using Imperative programming. i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach.
	function computeSumOfSquares(a) {
		let result = a.map(function(value) {
			return value*value;
		}).reduce(function(sum, value) {
			return sum + value;
		});
	
		return result;
	}
	console.log("\n8.----testing------");
	console.log("computeSumOfSquares([1,2,3])=" + computeSumOfSquares([1,2,3]));

	//9.	Write a function named, printOddNumbersOnly, that takes as input, an array of integral numbers and it finds and prints only the numbers which are odd.
	function printOddNumbersOnly(a) {
		let result = a.filter(function(value) {
			return value%2 != 0;
		});
		return result;
	}
	console.log("\n9.----testing------");
	console.log("printOddNumbersOnly([1,2,3])=" + printOddNumbersOnly([1,2,3]));

	//10.	Write a function named, computeSumOfSquaresOfEvensOnly, that takes as input, an array of integral numbers and calculates and returns the sum of the squares of only the even numbers in the input array. E.g. computeSumOfSquaresOfEvensOnly ([1,2,3,4,5]) should be computed as 22 +42 = 20.
	function computeSumOfSquaresOfEvensOnly(a) {
		let result = a.filter(function(value) {
			return value%2 == 0;
		}).map(function(value){
			return value*value;
		}).reduce(function(sum, value) {
			return sum + value;
		});

		return result;
	}
	console.log("\n10.----testing------");
	console.log("computeSumOfSquaresOfEvensOnly([1,2,3,4])=" + computeSumOfSquaresOfEvensOnly([1,2,3,4]));

	//11.	Using the Array.reduce(…) function, re-implement your functions, sum(…) and multiply(…) (defined in Problem 4 above) without using Imperative programming. i.e. Do NOT use any explicit looping construct; instead use functional programming style/approach. 
	function sum() {
		let result = Array.from(arguments).reduce(function(sum, value) {
			return sum + value;
		});

		return result;
	}
	console.log("\n11.----testing------");
	console.log("sum(1,2,3)=" + sum(1,2,3));

	function multiply() {
		let result = Array.from(arguments).reduce(function(sum, value) {
			return sum * value;
		});
		return result;
	}
	console.log("multiply(1,2,3)=" + multiply(1,2,3));

	//12.	Implement Javascript code for a function named, findSecondBiggest, which takes as input, an array of numbers and finds and returns the second biggest of the numbers. For example, findSecondBiggest([1,2,3,4,5]) should return 4. And findSecondBiggest([19,9,11,0,12]) should return 12. (Note: Do not use sorting!)
	function findSecondBiggest(a) {
		let index = a.map(function(value) {
			return a.filter(function(value2){
				return value2 > value;
			}).length;
		}).findIndex(function(value, index){
			return value == 1;
		})

		return a[index];
	}
	console.log("\n12.----testing------");
	console.log("findSecondBiggest([1,7,3,9,5])=" + findSecondBiggest([1,7,3,9,5]));

	//13.	Write a function named printFibo, that takes as input, a given length, n, and any two starting numbers a and b, and it prints-out the Fibonacci sequence, e.g. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34,…) of the given length, beginning with a and b. (e.g. printFibo(n=1, a=0, b=1), prints-out: "0", as output; printFibo(n=2, a=0, b=1), prints-out: "0, 1", as output; printFibo(n=3, a=0, b=1), prints-out: "0, 1, 1", as output; printFibo(n=6, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5", as output; and printFibo(n=10, a=0, b=1), prints-out: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34", as output).
	function printFibo(len, start, end) {
		var result = [];
		if(len == 1) {
			result[0] = start;
			return result;
		} 
		
		if(len == 2) {
			result[0] = start;
			result[1] = end;
			return result;
		}

		result[0] = start;
		result[1] = end;
		return fibo(result, len-2, start, end);
	}

	function fibo(result, len, start, end) {
		if(len == 0) return result;
		let next = start + end;
		result.push(next);
		return fibo(result, len-1, end, next);
	}
	console.log("\n13.----testing------");
	console.log("printFibo(6, 1, 1)=" + printFibo(6, 1, 1));
	
	var test = [3,3,3,4,5];
	for(const a in test) {
		console.log(test[a]);
	}
}