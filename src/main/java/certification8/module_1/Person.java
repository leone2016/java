package certification8.module_1;

/**
 * una clase es un tipo de dato que puede contener atributos (variables) y métodos (funciones)
 *
 * JAVA NO EXIGE QUE LA CLASE SEA PUBLIC, pero si tengo dos clases en un mismo archivo
 * una tiene que ser PUBLIC y  la clase public tiene que hacer match con el nombre del archivo
 *
 * puede ser solo
 */
class Person {
    String name;//variable - atributo


    /**
     * aqui alguna descripcion
     * @return
     */
    public String getName(){
        return name;
    }

    // que pasa cuando en un comentario se cierra de esta forma
    // asterisco = * (para ejemplo se pone la palabra)
    /*
    /asterico asterisco/
     */ //<--- esta linea no se comenta
}

class Animal{

}