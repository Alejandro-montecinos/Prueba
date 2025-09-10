package archivosPruebaParaMandar

fun ordenSuperior(){

    // Declare la función operacion. (3 puntos)
    fun operacion(x: Int, y: Int, f: (Int, Int) -> Int): Int{
        return f(x,y)
    }
    // Declare las funciones suma y multiplicación. (3 puntos)
    fun suma (a:Int,b: Int ):Int{
        return (a+b)
    }

    fun multiplicacion (a:Int,b: Int ):Int{
        return (a*b)
    }

    // Utilice operacion para sumar 2 + 2 y multiplicar 2 × 2. (4 puntos)
    println("Suma orden superior ${operacion(2,3,::suma)}")
    println("Multiplicacion orden superior ${operacion(2,3,::multiplicacion)}")

}