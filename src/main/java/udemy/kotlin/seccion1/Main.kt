package udemy.kotlin.seccion1

// hola comentario
/**
 * Hola comentario
 * multilinea
 */
fun main(args: Array<String>) {
    println("Hello World! Leonardo Hola")
    mostrarMensaje(2);
    val numero = 10_000_000 //NUEVO PARA MI
    println(numero)

    var pi = 3.14159265
    println(pi)

    var mensaje = 'c' // caracter
    println(mensaje)

    var isValid = true
    println(isValid)

    var pais: String = "Ecuador"
    pais = "Peru"

    var ciudad = "Quito"
}

fun mostrarMensaje(codigo: Int) {
    if (codigo == 1)
        println("Hola")
    else
        println("Adios")

}