"use strict";
exports.__esModule = true;
console.log("Variable Definition");
var customerid = 231001;
var customer_name = "kristy";
//customerid=customer_name; //error
console.log("customerid" + " " + customerid);
console.log("customername" + " " + customer_name);
console.log("Function Return Type");
function deduction(hra, pf) {
    return hra + pf;
}
//total_deduction=deduction(2330,"jack");//error
//console.log(total_deduction);
console.log("Structuring");
var customer_phne = {
    cus1: 7872563452,
    cus2: 9893562782,
    cus3: 8976567487
};
//customer_phne.cus1="Hansi";//error
console.log(customer_phne);
console.log("Arrays");
var customer_age = [34, 56, 18, 12, 45, 23];
for (var b = 0; b < customer_age.length; b++) {
    if (customer_age[b] >= 20) {
        console.log("Eligibile");
    }
    else {
        customer_age[b] = 0;
    }
    console.log("After Eligibility Check");
    for (var g = 0; g < customer_age.length; g++) {
        console.log(customer_age[g]);
    }
}
