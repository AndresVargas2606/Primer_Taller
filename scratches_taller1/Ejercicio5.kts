val precios = listOf(1000, 2000, 3000)

val recargo_nocturno = { precio_final: Int -> precio_final * 0.1 }
precios.forEach { println("El precio original es: "+it+" y con recargo nocturno del 10% es de: "+recargo_nocturno(it)) }