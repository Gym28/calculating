package com.calculating.project.macros.Commons

import com.calculating.project.macros.Definitions.constants._

object Utils {

  //argumentos

  def checkArgs(args:Array[String]): (String, String, String,String,String,String,String,String, String )
 ={
    val sexo:List[String]= List(mujer, hombre)
    val activities:List[String]=List("sedentario", "leve", "moderado", "intenso", "duro")
    val numeros  = List(args(1), args(2), args(3), args(5), args(6), args(7), args(8))

    println("cal menos " + args(8))

    if(args.length != 9|| (!sexo.contains(args(0))) || !concuerda(numeros) || !activities.contains(args(4)))
      throw new Exception(s"the arguments given are not the correct ones")
    else {
      (args(0), args(1), args(2), args(3),args(4), args(5), args(6), args(7), args(8) )
    }

  }


  def concuerda(argumento: List[String]): Boolean = {
    val patron = """(\d+\.?\d*)""".r
    val pasa =argumento.forall(s=> patron.pattern.matcher(s).matches())
    println("son numeros ? " + pasa)
    pasa

  }

}
