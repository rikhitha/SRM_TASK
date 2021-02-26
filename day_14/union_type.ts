function disp(name:string|string[]) { 
    if(typeof name == "string") { 
       console.log(name) 
    } else { 
       var i; 
       
       for(i = 0;i<name.length;i++) { 
          console.log(name[i])
       } 
    } 
 } 
 disp("mark") 
 console.log("Printing names array....") 
 disp(["Mark","Tom","Mary","John"])
 function disp2(name:string|number) { 
    if(typeof name == "string")
     { 
       console.log(name) 
    } 
    else 
    { 
       console.log("Type number"+name)
       } 
     
 } 
 disp("mark") 
 console.log("Printing names array....") 
 disp(["Mark","Tom","Mary","John"])
 disp2(25)

