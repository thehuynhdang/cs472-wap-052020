function logLoginConsole() {
    var username = document.getElementById("uname");
    console.log("Username=" + username.value);

    var pwd = document.getElementById("pwd");
    console.log("Password=" + pwd.value);
    
    return false;
}

function showNewProductInfo() {
    var productNbr = document.getElementById("txtProductNbr").value;
    document.getElementById("showProductNbr").innerText = productNbr;

    //txtQuantity
    var quantity = document.getElementById("txtQuantity").value;
    document.getElementById("showQuantity").innerText = quantity;

    //txtName
    var name = document.getElementById("txtName").value;
    document.getElementById("showName").innerText = name;

    //txtSupplier
    var supplier = document.getElementById("txtSupplier").value;
    document.getElementById("showSupplier").innerText = supplier;

    //txtPrice
    var price = document.getElementById("txtPrice").value;
    document.getElementById("showPrice").innerText = price;

    //txtSuppliedDate
    var suppliedDate = document.getElementById("txtSuppliedDate").value;
    document.getElementById("showSuppliedDate").innerText = suppliedDate;
}

function clock() {
    setInterval(function() {
            var now = new Date();
            const date = now.toLocaleDateString();
            const time = now.toLocaleTimeString();
            document.getElementById("showClock").innerText = `${date} ${time}`;
        }, 1000);
}