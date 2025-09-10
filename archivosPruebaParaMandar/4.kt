package archivosPruebaParaMandar

fun condicionales(){

    val edad = 15
    //Cree un programa que clasifique a la persona como mayor de edad o menor de edad. (6 puntos)
    if (edad>=18){
        println("Es mayor de edad")
    }else{
        println("Es menor de edad")
    }

    //Valide que la edad ingresada sea positiva y menor a 150. (4 puntos)

    if (edad>=0 && edad<150){
        println("El numero es positivo y menor a 150")
    }else{
        println("El numero no cumple con las dSos condiciones ${edad}")
    }


}