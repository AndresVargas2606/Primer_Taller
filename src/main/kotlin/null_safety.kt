package compose.project

fun main (){
    //Manejo de null (null safety) y smart cast
    var nombre : String = "Carlos"
    println("Nombre: $nombre")

    var name : String? = null //Variable puede ser tanto string como null
    println("Nombre: $name")

    //Manejo de variables null
    //Operador safe call (?.)
    println(name?.length)

    //Operador elvis (?:)
    val ciudad : String? = null
    val nombre_ciudad = ciudad ?: "Ciudad desconocida"
    println("Nombre de ciudad: " +nombre_ciudad)

    //Smart cast
    val titular: String? = "Clase de Aplicaciones moviles"
    if(titular != null) {
        println("El tamaño de la " +titular+ " es: "+titular.length)
    }

    //Smart cast con operador is
    val apellido : String? = "Vargas"
    if(apellido is String) {
        println("Apellido is a String " + apellido)
    }
}