enum weekdays{
    Sunday=0,
    Monday=getWorkingHours('monday'),
    Tuesday=Monday+1,
    Wednesday=Monday,
    Thursday=Wednesday+2,
    Friday=Monday+3,
    Saturday=0
    
}
function getWorkingHours(Day : String): number
{
    
    return 9;

}
for (var i in weekdays)
{
    console.log(i+"-"+weekdays[i])
}