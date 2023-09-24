package com.calculating.project.macros

import com.calculating.project.macros.Calculators.{Actividad, CalculateCals, Porcentajes}
import com.calculating.project.macros.Commons.ArgumentsLoader
import com.calculating.project.macros.Commons.Utils.checkArgs
import org.apache.spark.sql.SparkSession

object Driver extends Porcentajes{


 def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder().master("local").appName("calculaCalorias").getOrCreate()


    val (sex, peso, estatura, anios, ejercicio, prteinas, carb, gras, calLess) =checkArgs(args)
    ArgumentsLoader.setGenero(sex)
    ArgumentsLoader.setPeso(peso.toInt)
    ArgumentsLoader.setEstatura(estatura.toInt)
    ArgumentsLoader.setEdad(anios.toInt)
    ArgumentsLoader.setActividad(ejercicio)
    ArgumentsLoader.setProteinas(prteinas.toDouble)
    ArgumentsLoader.setGrasas(gras.toDouble)
    ArgumentsLoader.setCarbohidratos(carb.toDouble)
    ArgumentsLoader.setCalMenos(calLess.toInt)

   val calMantenimiento = CalculateCals.cuentaCalories(spark)
   val calActividad = Actividad.executeCalculate(spark, calMantenimiento)
   super.proteina(calActividad)
   super.grasa(calActividad)
   super.carbos(calActividad)



  }




}
