var Square_Side = /** @class */ (function () {
    function Square_Side(x) {
        this.x = x;
    }
    Square_Side.prototype.AreaOfSquare = function () {
        return this.x * this.x;
    };
    return Square_Side;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(r, b) {
        this.h = r;
        this.b = b;
    }
    Rectangle.prototype.AreaofRectangle = function () {
        return this.h * this.b;
    };
    return Rectangle;
}());
var Triangle = /** @class */ (function () {
    function Triangle(h, b) {
        this.h = h;
        this.b = b;
    }
    Triangle.prototype.AreaofTriangle = function () {
        return 0.5 * this.h * this.b;
    };
    return Triangle;
}());
var side = new Square_Side(5.73);
var area = side.AreaOfSquare();
var val = new Rectangle(2.34, 45.34);
var recarea = val.AreaofRectangle();
var value = new Triangle(2.3987, 45.23434);
var triarea = value.AreaofTriangle();
console.log("The Area of the Square is :" + area);
console.log("The Area of the Square is(with precision of 2 decimal places) :" + area.toFixed(2));
console.log("The Area of the Rectangle is :" + recarea);
console.log("The Area of the Rectangle is(with precision of 2 decimal places) :" + recarea.toFixed(2));
console.log("The Area of the Triangle is :" + triarea);
console.log("The Area of the Triangle is(with precision of 2 decimal places) :" + triarea.toFixed(2));
