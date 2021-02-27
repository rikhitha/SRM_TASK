import paymentmanager from './interface_payment';

let pay: paymentmanager = {
    payid: 256389,
    name: "kishore",
    bank: "sbi",
    branch: "sholinganallur",
    dopayment() {
        return "payment sucessful"
    }
    




}

console.log(pay.dopayment());

class upimode implements paymentmanager {
    payid: 894564
    name: "gpay"
    bank: "sbi"
    branch: "sholinganallur"
    dopayment() {
        return "upi sucessful"
    }


}

class card implements paymentmanager {

    payid: 5669
    name: "rupay"
    bank: "sbi"
    branch: "sholinganallur"
    dopayment() {
        return "debited from your card"

    }

}
let upi: upimode = new upimode();
console.log(upi.dopayment());
let cd: card = new card();
console.log(cd.dopayment());