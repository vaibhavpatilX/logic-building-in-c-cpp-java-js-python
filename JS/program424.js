
function SumDigits(No) 
{
    let iDigit = 0
    let iSum = 0
    
    while(No != 0)
    {
        iDigit = No % 10
        iSum = iSum+iDigit
        No = Math.floor(No/10)
    }
    return iSum
}

let Value = 123
let iRet = 0
iRet = SumDigits(Value)

console.log("Summation of Digits are: "+iRet)

