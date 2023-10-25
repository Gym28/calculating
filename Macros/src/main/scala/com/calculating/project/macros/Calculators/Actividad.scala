package com.calculating.project.macros.Calculators

import com.calculating.project.macros.Commons.ArgumentsLoader
import org.apache.spark.sql.SparkSession


object Actividad extends Porcentajes {

  def executeCalculate ( env:SparkSession, calorias: Double):Double= {
    new Actividad (env:SparkSession, calorias: Double).calculate(env:SparkSession, calorias: Double)
  }



  class Actividad (env:SparkSession, calorias: Double) extends Porcentajes {

   def calculate (env:SparkSession, calorias: Double):Double= {

     val ejercicio = ArgumentsLoader.getActividad

     ejercicio match {

     case "sedentario" => calorias * 1.2
     case "ligcero" => calorias * 1.375
     case "moderado" => calorias * 1.55
     case "intenso" => calorias * 1.725
     case "duro" => calorias * 1.9
     case _ => 0.0
   }
   }
  }


}
