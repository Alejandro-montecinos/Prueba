package archivosPruebaParaMandar


fun clasesYherencias(){

    open class Persona(val nombre: String, val edad:Int ,val rut: String){
        open fun mostrarInfo(){
            println("Nombre:${this.nombre}, Edad: ${edad}, Rut:${this.rut}")
        }
    }

    class Estudiante(var matricula:String, var carrera: String,nombre:String,edad:Int,rut:String): Persona(nombre, edad ,rut){

        override fun mostrarInfo(){
            println("Nombre:${this.nombre}, Edad: ${edad}, Rut:${this.rut}, Matricula:${matricula}, Carrera${carrera}")
        }

        fun estudiar(){
            println("Estudiando!!!!!!")
        }

    }


    class Profesor(var especialidad: String,nombre:String,edad:Int,rut:String): Persona(nombre, edad ,rut){

        override fun mostrarInfo(){
            println("Nombre:${this.nombre}, Edad: ${edad}, Rut:${this.rut}, Especialidad: ${this.especialidad}")
        }

        fun explicar (){
            println("Explicando!!!!!!")
        }

    }



    val estudiante = Estudiante("3jk4jk3hjg56j","ingenieria informatica","alejandro",20,"21846360-1")
    estudiante.mostrarInfo()
    estudiante.estudiar()

    val profesor = Profesor("Matematicas","Federico",34,"1273129-3")
    profesor.mostrarInfo()
    profesor.explicar()


}