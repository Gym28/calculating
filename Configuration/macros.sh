root = true
# IMPUT VARS
SEXO =$1
PESO =$2
ESTATURA =$3
EDAD=$4
ACTIVIDAD=$5
PROTEINA=$6
CARBOHIDRATOS=$7
GRASA=$8
RESTACALORIAS=$9
posiblesValues=["s","l","m","i","d"]
posiblesexo=["f","m"]
#comprueba si es numero
es_numero='^-?[0-9]+([.][0-9]+)?$'


display_usage(){
  echo "introduce la información necesaria"
  echo "Not valid Arguments: $@"
  echo "Usage: SEXO[femenino(f)/masculino(m)] peso[kg]  estatura[cm] edad[anos] actividad[sedentario(s)/lijero[l]/moderado[m]/intenso[i]/duro[d] proteina[double] carbohidratos grasa calorias_menos[double] "
  }

check_usage() {
  if [$# -eq 9]; then
    display_usage $@
    exit 1
  fi
}

check_valid(){
  if [["$posiblessexo[*]" != *"$1"*]]; then
      echo "$1 is not a valid value:$posiblesexo"
      else
        if [["$posiblesValues[*]" != *"$9"*]]; then
          echo "$9 is not a valid value:$posiblesValues "
          exit 1
        fi
      exit 1
  fi
}

check_valid_number(){
  var_values=("$2" "$3" "$4" "$6" "$7" "$8" "$9")
  for var_values in "${var_values[@]}"; do
    if ![[ $var_values =~ $es_numero ]] ; then
      echo "ERROR: $var_name No es un número" >&2 && var_nan=true
    done
    [-n "var_nan"] && exit 1
    return 0

}


check_usage @
SEX0= $(echo $1 | tr '[:lower:]' '[:upper:]')
ACTIVIDAD=$(echo $5 | tr '[:lower:]' '[:upper:]')
check_valid $SEXO $ACTIVIDAD
check_valid_number  $PESO  $ESTATURA  $EDAD  $PROTEINA $CARBOHIDRATOS $GRASA $RESTACALORIAS


if [ $# -eq 0 ]
  then
    echo "No arguments supplied"
    exit 1
  else
    JAR="../lib/Margin.jar"
    CLASS="com.carrefour.bigdata.bdindic.its.margen.AppBatch"