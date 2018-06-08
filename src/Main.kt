fun main (args: Array<String>) {
    val maxBottles = 99
    var curBottles = maxBottles
    var bottle = "bottles"


    for (i in 1..maxBottles){
        var printString = "$curBottles $bottle of beer on the wall. $curBottles $bottle of beer. " +
                "Take one down, pass it around. "
        printString += if (--curBottles == 0){
            "No more"
        } else{
            curBottles
        }
        if (curBottles == 1){
            bottle = "bottle"
        } else if (curBottles == 0){
            bottle = "bottles"
        }
        printString += " $bottle of beer on the wall."

        println(printString)
    }
}