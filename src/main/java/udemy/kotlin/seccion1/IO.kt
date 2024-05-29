package udemy.kotlin.seccion1

fun main() {
    println("Ingrese su edad:")
    val edad = readLine();
    println("Ingrese su nombre:")
    val nombre = readLine();
    println("\n\n Hola $nombre, \n tu edad es $edad")
    //row string
    val mensaje = """
        ** DATOS PERSONALES **
        Nombre: $nombre 
        Edad: $edad años
    """.trimIndent()
    println(mensaje)

}