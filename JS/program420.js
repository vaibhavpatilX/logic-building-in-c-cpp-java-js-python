
//Summation of Factors
function SumFactors(No) 
{
    let iSum = 0

    for(let i = 1; i <= (No/2);i++)
    {
        if(No % i == 0)
        {
            iSum = iSum + i
        }
    }


}

let Value = 12
let iRet = 0
iRet = SumFactors(Value)

console.log("Summation of factors : " + iRet)


