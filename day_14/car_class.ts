class car
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
    var objcar=new car("Blue",1197,4)
    console.log("color of car is :"+" "+objcar.color);
    console.log("Engine capacity of car is :"+" "+objcar.engine_capacity);
    console.log("No of cylinders in car is :"+" "+objcar.no_of_cylinders);
    objcar.start_car();
    objcar.stop_car();
    objcar.accelerator_car();
    objcar.open_carlock();
    objcar.close_carlock();


