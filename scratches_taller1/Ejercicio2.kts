//
val edad : Int = 2
val esUrgenia : Boolean = true

val categoria = when (edad) {
    in 0 .. 1 ->"Cachorro"
    in 2 .. 7 -> "Adulto"
    in 8 .. Int.MAX_VALUE -> "senior"
    else -> "Edad no valida"
}

if (esUrgenia == true || categoria == "senior") {
    println("Prioridad Alta")
}
else {
    println("Atencion Regular")
}