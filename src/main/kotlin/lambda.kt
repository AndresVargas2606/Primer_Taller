package compose.project

fun main(){
    val saludar = { println("Hola mundo")}
    saludar ()

    //Lambda con parametro
    val duplicar = { numero : Int -> numero * 2 }
    println(duplicar(10))

    //Lambda con un parametro y palabra clave it
    val palabra_it : (Int) -> Int = { it * 3 }
    println("Lambda con palabra clave :" +palabra_it(10))

    //Lambada con varios parametros
    val sumar = {a : Int, b : Int-> a + b}
    println("Lambda con dos o mas parametros" + sumar(10,20))

    //Lambda en coleccions
    val nombres = listOf("Ana", "Bob", "Cedar")
    nombres.forEach { println(it) } //Con palabra clave it
    nombres.forEach { item -> println("Nombre: " +item) }

}