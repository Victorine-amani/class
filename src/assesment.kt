fun main(){

    colorSort(listOf(Car("Sclass","Toyota","red"),
        Car("Nissan","Toyota","blue"),
        Car("Sunny","Nissan","purple"),
        Car("probox","Toyota","red"),
        Car("BMW","Mercedes","blue")))
    long("Victorine")
    var account=CurrentAccount(123456,"John Joel",12000.00)
    account.deposit(13000.00)
    account.withdraw(1000.00)
    account.details()
    var save=SavingsAccount(7)
    save.withdraw(10000.0)



}
data class Car(var make:String,var model:String,var color:String)
fun colorSort(car:List<Car>){
    var red= mutableListOf<String>()
    var blue= mutableListOf<String>()
    var other= mutableListOf<String>()
  when(Car.color) {
      "red"->println(red.add(car.toString()))
      "blue"->println(blue.add(car.toString()))
      else->println(other.add(car.toString()))
  }
}

fun long(name:String):Int{
    return name.length
}

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        println(amount+balance)
    }
    open fun withdraw(amount:Double){
        println(balance-amount)
    }
    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }
}

class SavingsAccount(var withdrawals:Int):CurrentAccount(accountNumber, accountName, balance) {
    override fun withdraw(amount: Double) {
        if (withdrawals < 4) {
            println(balance - amount)
            withdrawals++

        }
    }
}