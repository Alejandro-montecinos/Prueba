package archivosPruebaParaMandar

import java.util.Objects

fun ciclos(){

    data class Alumno(
        val nombre: String,
        val nota1: Int,
        val nota2: Int,
        val nota3: Int
    )
    val listaAlumnos = listOf(
        Alumno("Alex", 55, 60, 40),
        Alumno("Iris", 30, 45, 62),
        Alumno("Juan", 50, 57, 63),
        Alumno("Nina", 68, 65, 60)
    )

    for (i in listaAlumnos){
        var promedio = (i.nota1+i.nota2+i.nota3)/3
        println("Nombre:${i.nombre}, Promedio= ${promedio}")
    }



}