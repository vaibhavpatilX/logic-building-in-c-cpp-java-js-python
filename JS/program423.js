
function CountDigits(No) 
{
    let iDigit = 0
    
    let i = 0
    while(No != 0)
    {
        No = Math.floor(No/10)
        console.log(No)
        i++
    }
    return i
}

let Value = 123
let iRet = 0
iRet = CountDigits(Value)

console.log("Number of Digits are: "+iRet)

