package com.calculating.project.macros.Commons

object ArgumentsLoader {

  private var genero: String = ""
  private var activities: String = ""
  private var pActual: Int = 0
  private var estatura: Int = 0
  private var edad: Int = 0
  private var proteinas: Double = 0.0
  private var grasa: Double = 0.0
  private var carbos: Double = 0.0
  private var calMenos: Int = 500

  def setGenero(generoParam:String): Unit= {
    genero=generoParam
  }

  def setActividad(actividadParam: String): Unit = {
    activities = actividadParam
  }

  def setEstatura(estaturaParam: Int): Unit = {
   estatura = estaturaParam
  }

  def setEdad(edadParam: Int): Unit = {
    edad = edadParam
  }

  def setProteinas(proteinasParam: Double): Unit = {
    proteinas = proteinasParam
  }

  def setGrasas(grasasParam: Double): Unit = {
    grasa = grasasParam
  }

  def setCarbohidratos(carboParam: Double): Unit = {
    carbos = carboParam
  }

  def setPeso(pActualParam:Int): Unit={
    pActual =pActualParam
  }

  def setCalMenos(calMenosParam:Int):Unit = {
    calMenos=calMenosParam
  }

  def getGenero:String = genero
  def getActividad:String = activities
  def getPeso:Int= pActual
  def getEstatura:Int=estatura
  def getEdad:Int = edad
  def getProteinas:Double = proteinas
  def getCarbo:Double=carbos
  def getGrasas:Double=grasa
  def getCalMenos:Int=calMenos

}
