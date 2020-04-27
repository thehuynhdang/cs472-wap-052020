
function decorateByInterval() {
	setInterval(decorate, 500);
}

function decorate() {
	let text = document.getElementById("txtComment");

	let currentSize = text.style.fontSize;
	if(!currentSize) {
		currentSize = window.getComputedStyle(text).fontSize;
	}

	text.style.fontSize = parseInt(currentSize) + 2 + "pt";
	return true;
}

function changeBling(check) {
	let text = document.getElementById("txtComment");
	if(check.checked) {
		alert("Bling is being turned on")
		text.style.fontWeight = "bold";
		text.style.textDecoration = "underline";
		text.style.color = "green";

		document.body.style.backgroundImage = "url('https://courses.cs.washington.edu/courses/cse190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
	} else {
		alert("Bling is being turned off")
		text.style.fontWeight = "normal";
		text.style.textDecoration = "none";
		text.style.color = "black";
	}

}