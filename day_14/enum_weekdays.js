var weekdays;
(function (weekdays) {
    weekdays[weekdays["Sunday"] = 0] = "Sunday";
    weekdays[weekdays["Monday"] = getWorkingHours('monday')] = "Monday";
    weekdays[weekdays["Tuesday"] = weekdays.Monday + 1] = "Tuesday";
    weekdays[weekdays["Wednesday"] = weekdays.Monday] = "Wednesday";
    weekdays[weekdays["Thursday"] = weekdays.Wednesday + 2] = "Thursday";
    weekdays[weekdays["Friday"] = weekdays.Monday + 3] = "Friday";
    weekdays[weekdays["Saturday"] = 0] = "Saturday";
})(weekdays || (weekdays = {}));
function getWorkingHours(Day) {
    return 9;
}
for (var i in weekdays) {
    console.log(i + "-" + weekdays[i]);
}
