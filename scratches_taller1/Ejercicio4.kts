val contacto_emergencia : String? = null
println(contacto_emergencia?.length)

if (contacto_emergencia is String) {
    println("El contacto de emergencia "+contacto_emergencia+" es de: " +contacto_emergencia.length)
}
else {
    val contacto_final = contacto_emergencia ?: "Sin contacto final"
    println("El contacto de emergencia "+contacto_final+" es de: " +contacto_final.length)
}
