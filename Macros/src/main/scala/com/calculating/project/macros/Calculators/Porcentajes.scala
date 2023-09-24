package com.calculating.project.macros.Calculators

import com.calculating.project.macros.Commons.ArgumentsLoader

trait Porcentajes {

  def proteina (calActividad: Double): Double = {
    val kalPerder: Int =ArgumentsLoader.getCalMenos
    val calorias = calActividad - kalPerder
    val prote = ArgumentsLoader.getProteinas
    val genero = ArgumentsLoader.getGenero
    val peso = ArgumentsLoader.getPeso
    val actividad:String= ArgumentsLoader.getActividad

    println("******************************************************************")
    println(f"  $genero con $peso kg $actividad y $calActividad%2.0f de calorias Mantenimiento  ")
    println(f"     menos  $kalPerder  calorias debe consumir $calorias%2.0f ")
    println("******************************************************************")
    val porcenProte = prote / 100
    val caloriasProte: Double = calorias * porcenProte
    val gramosP = caloriasProte / 4
    println("---------------------")
    println(s"Proteína $prote%")
    println("---------------------")
    println(f"calorias de proteina al dia $caloriasProte%2.0f")
    println(f"gramos de proteina al dia $gramosP%2.0f")
    caloriasProte

  }

  def grasa(calActividad: Double): Double = {
    val kalPerder: Int =ArgumentsLoader.getCalMenos
    val calorias = calActividad - kalPerder
    val grasas = ArgumentsLoader.getGrasas

    val porcenG = grasas / 100
    val caloriasG: Double = calorias * porcenG
    val gramosG = caloriasG / 9
    val grasaS: Double = 0.05
    val gramosGS: Double = calorias * grasaS / 9

    println("---------------------")
    println(s"Grasa $grasas%")
    println("---------------------")
    println(f"calorias de Grasa al dia $caloriasG%2.0f")
    println(f"gramos de Grasa al dia $gramosG%2.0f")
    println(f"gramos máximo de grasas saturadas por día: $gramosGS%2.0f")
    println(
      f"gramos máximo de grasas - saturadas por día: ${gramosG - gramosGS}%2.0f"
    )
    caloriasG

  }

  def carbos(calActividad: Double): Double = {
    val kalPerder: Int =ArgumentsLoader.getCalMenos
    val calorias = calActividad - kalPerder
    val carb :Double = ArgumentsLoader.getCarbo

    val porcenCarbo = carb / 100
    val caloriasCarbo: Double = calorias * porcenCarbo
    val gramosCarb = caloriasCarbo / 4
    println("---------------------")
    println(s"Carbos $carb %")
    println("---------------------")
    println(f"calorias de carbohidratos al dia $caloriasCarbo%2.0f")
    println(f"gramos de carbohidratos al dia $gramosCarb%2.0f")
    println("------------------------------------------------------\n")
    caloriasCarbo

  }

}
