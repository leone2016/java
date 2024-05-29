package udemy.kotlin.seccion1

fun main() {
    mostrarMensaje("Leonardo", 32)
    mostrarMensaje("Lorena", 30)
    println(sumar(10, 20))
    println("El IVA es: ${calcularIVA(100.0)}")
    mostrarMensaje2("Prueba sin edad como param")
}
fun mostrarMensaje(nombre: String, edad: Int) {
    println("Hola $nombre, tu edad es $edad")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun calcularIVA(valor: Double): Double {
    return valor * 0.12
}
/**
 * default parameters
 */
fun mostrarMensaje2(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tu edad es $edad")
}
