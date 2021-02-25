import { SystemJsNgModuleLoader } from "@angular/core";

console.log("Variable Definition");

let customerid=231001;
let customer_name="kristy";
//customerid=customer_name; //error

console.log("customerid"+" "+customerid);

console.log("customername"+" "+customer_name);

console.log("Function Return Type");

 
function deduction(hra:number,pf:number)
{
    return hra+pf;
}
total_deduction=deduction(2330,"jack");//error

console.log(total_deduction);

console.log("Structuring");


let customer_phne={
    cus1:7872563452,
    cus2:9893562782,
    cus3:8976567487

};
customer_phne.cus1="Hansi";//error

console.log(customer_phne);


console.log("Arrays");

let customer_age=[34,56,18,12,45,23];


for(let b=0;b<customer_age.length;b++)
{
    if(customer_age[b]>=20)
    {
        console.log("Eligibile");
    }
    else
    {
        customer_age[b]="nil";//error

    }
    console.log("After Eligibility Check");
    
    for(let g=0;g<customer_age.length;g++)
    {
        console.log(customer_age[g]);
    }
}



