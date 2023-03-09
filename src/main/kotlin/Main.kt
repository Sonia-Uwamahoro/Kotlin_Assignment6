
fun main(){

    val car = Car("Toyota", "C-HR", "black", 4)

    // for carry function
    car.carry(4)
    car.capacity

    // for identify function
    car.identify()
    println(car.color)
    println(car.make)
    println(car.model)

    // for calculateParkingFees function
    car.calculateParkingFees(3)
    var parkingFees = car.calculateParkingFees(3)
    println(parkingFees)


    // Function for the bus subclass
    val bus = Bus("Volvo Buses", "k897", "red", 50)

    // Function for max trip fare function
    var tripFee =  bus.maxTripFare(500.00)
    println(tripFee)

    // Function that returns the product of hours and capacity
    var product = bus.calculateParkingFees(4)
    println(product)


}
// Car class
open class Car(var make: String, var model: String, var color: String, var capacity: Int){

    // Function that compares people and the capacity of the car
    fun carry(people: Int){

        var x = people - capacity

        if(people<=capacity){
            println("Carry $people passengers")
        }
        else{
            println("Over capacity by $x people")
        }
    }

    // Function that prints out color, make and model.
    fun identify(){
        println("I am a $color $make $model")
    }

    // Function that calculates parking fees
    open fun calculateParkingFees(hours: Int): Int{
        return hours*20
    }

}


// For Bus class

class Bus(make: String, model: String, color: String, capacity: Int): Car(make, model, color, capacity){

    // Function that returns the maximum amount of fare
    fun maxTripFare(fare: Double): Double{
        return capacity * fare
    }

    // Function that returns the product of hours and capacity of the bus
    override fun calculateParkingFees(hours: Int): Int {
        return super.calculateParkingFees(hours)
        return hours * capacity

    }
}
