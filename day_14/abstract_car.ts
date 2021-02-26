abstract class cardet
{
    color:String;
    engine_capacity:number;
    no_of_cylinders:number;
    constructor(color:String, engine_capacity:number,no_of_cylinders:number)
    {
        this.color=color;
        this.engine_capacity=engine_capacity;
        this.no_of_cylinders=no_of_cylinders;
    }
    abstract start_car():void ;
    
    abstract stop_car():void;
    

    abstract accelerator_car():void;
    
   abstract open_carlock():void;
    
    abstract close_carlock():void;
    
}
class suv extends cardet
{
  carregno:number;
  constructor(color:String,engine_capacity:number,no_of_cylinders:number,carregno:number)
  {
      super(color,engine_capacity,no_of_cylinders);
      this.carregno=carregno;

  }
  start_car():void
    {
        console.log("Inside Start_car method");
    }
    stop_car():void
    {
        console.log("Inside Stop_car method");
    }

    accelerator_car():void
    {
        console.log("Inside Accelerator_car method");
    }
    open_carlock():void
    {
        console.log("Inside Open_carlock method");
    }
    close_carlock():void
    {
        console.log("Inside Close_carlock method");
    }

}
let obj:cardet=new suv("Red",1196,4,8907);
obj.start_car();
obj.stop_car();
obj.accelerator_car();
obj.open_carlock();
obj.close_carlock();