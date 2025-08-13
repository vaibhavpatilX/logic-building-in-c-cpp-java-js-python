
function Maximum(Brr) 
{
    
    let iMax = Brr[0]
    for (let i = 0; i < Brr.length; i++)
    {
        if(iMax < Brr[i])
        {
            iMax = Brr[i]
        }
    }
    return iMax
    
}

Arr = [11, 21, 51, 101, 111, 121]
let iRet = 0
iRet = Maximum(Arr)

console.log("Maximum of all elements : " + iRet)


