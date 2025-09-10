package archivosPruebaParaMandar

fun colecciones(){

    val numeros = listOf(1, 4, 12, 4, 5, 45, 8, 10)


    //Cree una lista con todos los elementos impares

        var nuevo = mutableListOf<Int>()
        for (i in numeros) {
            if (i % 2 == 1) {
                nuevo.add(i)
            }
        }
        println("Lista con numeros impares$nuevo")


    //Encuentre el primer elemento que sea mayor a 11. (3 puntos)

        println("primer elemento mayor a 11 == ${numeros?.find { it>11 }}")



    //Sume el primer y el último elemento de la lista. (3 puntos)

        println("sumano el primer y ultimo elemento de la lista ====  ${numeros.first()+numeros.last()}")


}