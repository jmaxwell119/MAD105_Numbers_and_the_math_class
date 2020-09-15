import java.text.DecimalFormat

fun main(){
    var total = 0.00
    do{
        print("Enter the cost of item, enter 0 when finished: ")
        val itemCost = readLine()!!.toDouble()
        total += itemCost
        val currency = DecimalFormat("$.00")
        val totalFormatted = currency.format(total)
        val tax = total * .025
        val taxFormatted = currency.format(tax)
        val totalWithTax = total + tax
        val totalWithTaxFormatted = currency.format(totalWithTax)
        val reccTip = totalWithTax * .175
        val reccTipFormatted = currency.format(reccTip)
        if (itemCost == 0.00){
            print("total is ")
            println(totalFormatted)
            print("tax is ")
            println(taxFormatted)
            print("total with tax is ")
            println(totalWithTaxFormatted)
            print("17.5% tip is ")
            println(reccTipFormatted)
        }
    }while (itemCost != 0.00)


}