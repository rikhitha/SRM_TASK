export default interface paymentmanager{
    payid: number;
    name: string;
    bank:string;
    branch:string;
    
      
    dopayment():string;
}
