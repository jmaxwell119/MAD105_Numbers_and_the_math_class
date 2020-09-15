import java.text.DecimalFormat

fun main(){
    var total = 0.00
    do{
        print("Enter the cost of item, enter 0 when finished: ")
        val itemCost = readLine()!!.toDouble()
        total += itemCost
        val currency = DecimalFormat("$.00")
        val tax = total * .025
        val totalWithTax = total + tax
        val reccTip = totalWithTax * .175
        if (itemCost == 0.00){
            print("total is ")
            println(currency.format(total))
            print("tax is ")
            println(currency.format(tax))
            print("total with tax is ")
            println(currency.format(totalWithTax))
            print("17.5% tip is ")
            println(currency.format(reccTip))
        }
    }while (itemCost != 0.00)


}