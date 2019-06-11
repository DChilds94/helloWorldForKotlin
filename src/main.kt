import com.rsc.Person

fun main() {
    println("Hello, World!")

    var daniel = Person("Daniel") // mutable
    val wiktoria = Person("Wiktoria") // immutable

    daniel.Name = "Daniel"
    wiktoria.Name = "Wiktoira"
    println("name is ${daniel.Name}")
    println("name is ${wiktoria.Name}")

    daniel.displayWithLambda(::printName)
    wiktoria.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}