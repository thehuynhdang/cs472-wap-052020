/**
 * Solutions for the lab 09
 * lab09-jquery.js
 */

$(document).ready(function() {

	$("#frmLogin").submit(function(event) {
		event.preventDefault();
		
		const username = $("#uname");
	    console.log("Username=" + username.val());

	    const pwd = $("#pwd");
	    console.log("Password=" + pwd.val());
	});
	
	
	$("#frmNewProduct").submit(function(event) {
		event.preventDefault();
		
		const productNbr = $("#txtProductNbr").val();
	    $("#showProductNbr").text(productNbr);

	    //txtQuantity
	    const quantity = $("#txtQuantity").val();
	    $("#showQuantity").text(quantity);

	    //txtName
	    const name = $("#txtName").val();
	    $("#showName").text(name);

	    //txtSupplier
	    const supplier = $("#txtSupplier").val();
	    $("#showSupplier").text(supplier);

	    //txtPrice
	    const price = $("#txtPrice").val();
	    $("#showPrice").text(price);

	    //txtSuppliedDate
	    const suppliedDate = $("#txtSuppliedDate").val();
	    $("#showSuppliedDate").text(suppliedDate);
	    
	    $("#showInfoModel").show();
	});
});