#!/usr/bin/env bash
# Compila y prueba un ejercicio desde la terminal.
#
# Uso:   ./correr.sh <tema> <ejercicio>
# Ej.:   ./correr.sh 01 1      (Singleton, ejercicio 1)
#        ./correr.sh 10 7      (Proxy, ejercicio 7)
#
# (Si usás un IDE, no hace falta: abrí el archivo Prueba...java del ejercicio y ejecutá su main.)

if [ $# -ne 2 ]; then
    echo "Uso: ./correr.sh <tema> <ejercicio>     (ej.: ./correr.sh 01 1)"
    exit 1
fi

tema=$(printf "%02d" "$((10#$1))")
base="$(cd "$(dirname "$0")" && pwd)"
dir=$(ls -d "$base"/ejercicios/p"$tema"_*/ej"$2" 2>/dev/null | head -n 1)

if [ -z "$dir" ]; then
    echo "No encontré el ejercicio $2 del tema $tema."
    exit 1
fi

pkg="$(basename "$(dirname "$dir")").$(basename "$dir")"
cd "$dir" || exit 1
prueba=$(ls Prueba*.java | head -n 1 | sed 's/\.java$//')
echo ">>> $pkg.$prueba"
javac -encoding UTF-8 -d out *.java && java -cp out "$pkg.$prueba"
