class cycle {  
    wheels = "two";  
}  
class auto {  
    wheels = "three";  
}  
class Car {  
    wheels = "four";  
    start(){  
        console.log("started!");  
    }  
}  
let au: auto = new cycle(); // substitutes  
let cyc:cycle  = new auto(); // substitutes  
let autotwo: auto = new Car();  
//let C: Car = new auto(); // IDE & compiler error  
console.log("no of wheels in cycle: "+au.wheels);  
console.log("no of wheels in auto: "+cyc.wheels);  
console.log("no of wheels in Car: "+autotwo.wheels); 