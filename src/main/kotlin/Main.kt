package compose.project

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
        //Tipo de variables:
        //val constantes o variables que no se modifican
        val name = "Kotlin"

        //var variables que si se modifican
        var nombre = "Andres"
        println("Hello my name is ${nombre}")

        nombre = "Andres2"
        println("Hola mi nombre es ${nombre}")

        //Tipos de datos:
        //String: Cadena de texto
        val  apelle:String = "Andres3"
        println("Bonjour, je m´apelle ${apelle}")

        //Char: Caracteres
        val caracter:Char = 'A'
        println("el caracter es:  ${caracter}")

        //Int: Numeros enteros
        val entero:Int = 20
        println("el entero es: ${entero}")

        //Long: Numeros extensos enteros
        val Long:Long = 1234567890
        println("El long es $Long")

        //Doubl: Numeros extensos con decimales
        val double: Double = 1234.567890
        println("El double es $Double")

        //Float: Numeros con decimales
        val float: Float = 1234.56F

        //Booleano:
        val bool: Boolean = true
        println("El bool es $Boolean")

        //Operadores de comparacion y rutinas
        val comparacion : Int = 10
        println(10 > comparacion)
        println(10 == comparacion)
        println(9 < comparacion)
        println(1 != comparacion)
        /*
        < mayor que
        < menor que
        >= mayor o igual
        <= menor o igual
        == igual a
        != diferente que
        */

        //AND
        val tiene_documento: Boolean = true
        println("comparacion de AND: ${5 < comparacion && tiene_documento}")
        println("comparacion de AND: ${14 < comparacion && tiene_documento}")

        //OR
        println("comparacion de OR: ${5 < comparacion || tiene_documento}")

        //NOT
        println("comparacion de NOT: ${tiene_documento}")
        println("comparacion de NOT: ${!tiene_documento}")

        //If y Else if
        val edad: Int = 10
        if (edad < 18) {
            println("La edad es menor: $edad")
        }
        else if (edad == 18) {
            println("La edad es igual: $edad")
        }
        else
        {
            println("La edad es mayor: $edad")
        }

        //___________________________________
        val mensaje = if (edad < 18) {
            "La edad es menor"
        }
        else if (edad == 18) {
            "La edad es igual"
        }
        else
        {
            "La edad es mayor"
        }
        println("${mensaje}: $edad")

        //When
        when(edad)
        {
            10 -> println("La edad es menor ")
            18 -> println("La edad es igual")
            else -> println("La edad es mayor")
        }

        //------------------------
        val message_variable = when(edad)
        {
            10 -> "La edad es menor "
            18 -> "La edad es igual"
            else -> "La edad es mayor"
        }
        println(message_variable)

        //Rangos y bucles
        /*Rangos: Son estructuras que representan secuencias de valores
        Inclusivos(..): Representan ambos rangos
        Exclusivos(until): Representa el primer rango pero excluye el final
        Saltos(step): Realiza saltos entre N y N
        Reversa(downTo): Contar hacia atras
         */
        val rango_inclusivo = 1..5 //1, 2, 3, 4, 5
        val rango_exclusivo = 1 until 5 //1, 2, 3, 4
        val rango_salto= 1 .. 10 step 2 //2, 4, 6, 8, 10
        val rango_reversa = 5 downTo 1 //5, 4, 3, 2, 1

        //For
        println("-------------")
        for (numero in rango_inclusivo){
            println(numero)
        }
        println("-------------")
        for (numero in rango_exclusivo){
            println(numero)
        }
        println("-------------")
        for (numero in rango_salto){
            println(numero)
        }
        println("-------------")
        for (numero in rango_reversa) {
            println(numero)
        }
        println("-------------")

        //Listas
        val lista = listOf("dato 1", "dato 2", "dato 3")
        for (numero in lista){
            println(numero)
        }
        println("-------------")

        for((index, dato) in lista.withIndex()){
            println("El $dato tiene el indice $index")
        }
        println("-------------")

        //While
        var bateria: Int = 100
        while (bateria >= 90){
            println("La bateria esta en $bateria%")
            bateria -= 1
        }
        println("-------------")
        //Do While
        do {
            bateria++
            println("La bateria esta cargando: $bateria%")
        } while(bateria < 100)
        println("-------------")

        //Control de bucles
        //Continuo
        for(dato in 1 .. 10){
            if(dato == 4 || dato == 8 ) continue //Se salta la interaccion si es "true"
            println("El dato $dato")
        }
        println("-------------")

        //Break
        for(dato in 1 .. 10){
            if(dato == 3 ) break //Se sale de la interracion si es "true"
            println("El dato $dato")
        }


}
