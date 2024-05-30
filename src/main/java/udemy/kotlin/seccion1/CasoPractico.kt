package udemy.kotlin.seccion1

/**
 * Necesidad del usuario
 * Alejandro tiene una casa de cambio que se dedica solamente a cambiar dólares
 * estadounidenses a pesos mexicanos, al inicio de cada día consulta la tasa de
 * cambio y es la que utiliza el resto del día. Actualmente realiza las anotaciones en
 * una libreta apoyándose de una calculadora, pero debido a la afluencia de
 * clientes, en ocasiones comete errores. Le gustaría tener una herramienta que le
 * facilite el proceso y le indique cuanto dinero le queda en la caja al realizar cada
 * operación. Siempre se asegura de tener suficiente efectivo para todo el día, pero
 * cuando se le agota tiene que cerrar el resto del día, ya que en el lugar donde
 * vive no hay bancos.
 */

/**
 * Especificación de requisitos
 * Almacenar en el programa al inicio del día la tasa de cambio y el efectivo
 * disponible en caja.
 * Calcular la cantidad de dinero a entregar en pesos mexicanos en base a
 * los dólares a cambiar y la tasa de cambio.
 * Después de cada operación, indicar el efectivo que debe haber en la caja,
 * tanto en pesos como en dólares.
 */

/**
 * Arquitectura
 * Programa para realizar las funciones solicitadas, escrito en el lenguaje de
 * programación Kotlin y con el que el usuario va a interactuar mediante la
 * consola.
 */

/**
 * Algoritmo
 * 1. Solicitar al usuario la tasa de cambio
 * 2. Solicitar al usuario la cantidad de dinero disponible en la apertura de caja en pesos
 * 3. Solicitar al usuario la cantidad de dinero disponible en la apertura de caja en dólares
 * 4. Solicitar al usuario la cantidad de dólares a cambiar
 * 5. Sumar la cantidad de dólares a cambiar al total de dólares en la caja
 * 6. Calcular la cantidad de pesos mexicanos a entregar
 * 7. Restar la cantidad de pesos entregados al total de pesos en la caja
 * 8. Mostrar al usuario la cantidad de pesos a entregar, así como el total de pesos y dólares en la caja
 * 9. Regresar al paso 4 para ejecutar las operaciones nuevamente
 * 10.Para salir del programa, simplemente cerrarlo
 */