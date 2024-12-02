function generateOTP(digit)
{
    let otp="";
    for(let i=0;i<digit;i++)
    {
        otp+=Math.floor(Math.random()*10).toString();
    }
    return otp;
}
var digit=prompt("enter the no of digits in otp:");
console.log(generateOTP(digit));