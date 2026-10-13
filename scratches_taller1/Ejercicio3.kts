val nombres = listOf("Toby", "Luna", "Max", "Bruno")
for ((index, dato) in nombres.withIndex()) {
    println("Paciente: $dato, Turno: ${index+1}")
}
val rango = 4 downTo 1
for (dato in rango) {
    println("Turno $dato ir al consultorio")
}