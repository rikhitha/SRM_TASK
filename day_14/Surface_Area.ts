class Square_Side {  
    x: number;  
    constructor(x: number) {  
     this.x = x;  
    }  
    AreaOfSquare() {  
     return this.x * this.x;  
    }  
    
   } 
class Rectangle{
    AreaofRectangle() {
        return this.h * this.b;
    }
    h:number;
    b:number;
    constructor( r:number , b:number){
        this.h=r;
        this.b=b;
        
    }

} 
class Triangle{
    AreaofTriangle() {
        return 0.5*this.h * this.b;
    }
    h:number;
    b:number;
    constructor( h:number , b:number){
        this.h=h;
        this.b=b;
        
    }

} 
   var side = new Square_Side(5.73);  
   var area = side.AreaOfSquare();  
   var val=new Rectangle(2.34,45.34);
   var recarea=val.AreaofRectangle();
   var value=new Triangle(2.3987,45.23434);
   var triarea=value.AreaofTriangle();
    
   console.log("The Area of the Square is :" + area);
   console.log("The Area of the Square is(with precision of 2 decimal places) :" + area.toFixed(2)); 
   console.log("The Area of the Rectangle is :" + recarea);
   console.log("The Area of the Rectangle is(with precision of 2 decimal places) :" + recarea.toFixed(2));  
   console.log("The Area of the Triangle is :" + triarea);
   console.log("The Area of the Triangle is(with precision of 2 decimal places) :" + triarea.toFixed(2));  
    