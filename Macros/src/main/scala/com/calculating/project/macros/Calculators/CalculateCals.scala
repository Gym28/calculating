package com.calculating.project.macros.Calculators

import com.calculating.project.macros.Commons.ArgumentsLoader
import org.apache.spark.sql.SparkSession

object CalculateCals {

  def cuentaCalories(env:SparkSession):Double = {
     new CalculateCals(env:SparkSession).calculate()

}

  class CalculateCals(env:SparkSession) {

    private val gender: String = ArgumentsLoader.getGenero
    private val weight:Int = ArgumentsLoader.getPeso
    private val hight:Int =ArgumentsLoader.getEstatura
    private val edad:Int = ArgumentsLoader.getEdad

    def calculate ()  = {
      gender match {
        case hombre if hombre.contains("hombre") =>
          10 * weight + 6.25 * hight - 5 * edad + 5
        case mujer if mujer.contains("mujer") =>
          10 * weight + 6.25 * hight - 5 * edad - 161
        case _ => 0.0
      }

    }
  }
}
