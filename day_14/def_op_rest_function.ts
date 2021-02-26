//Function with default parameter

function applyDiscount(price: number, discount: number = 0.05): number {
    return price * (1 - discount);
}

console.log(applyDiscount(100));

//Function with optional paramter

function test(x: number, y?: number): void {
    console.log("x: " + x);
    console.log("y: " + y);
}

test(1);
test(1, 2);

//Function with rest parameter

function getTotal(...numbers: number[]): number {
    let total = 0;
    numbers.forEach((num) => total += num);
    return total;
}
console.log(getTotal()); 
console.log(getTotal(10, 20)); 
console.log(getTotal(10, 20, 30)); 

