//fun returning o
function Addition(No1,No2)
{
    return No1+No2
}

function Demo()
{
    return Addition
}

let Ret = Demo()

let Ans = 0

Ans = Ret(10,11)

console.log(Ans)