programa P1Ej2
procesos
  proceso JuntarPapeles(ES Papeles: numero)
  comenzar
    si(HayPapelEnLaEsquina)
      mientras(HayPapelEnLaEsquina)
        tomarPapel
        Papeles := Papeles + 1
  fin
  proceso Recorrer(ES Papeles: numero)
  comenzar
    repetir 19
      JuntarPapeles(Papeles)
      mover
  fin
areas
  AreaTodos : AreaC(10,10, 30,30)
robots
  robot tipo1
  variables
    Papeles: numero
  comenzar
    Papeles := 0
    Recorrer(Papeles)
    Informar(Papeles)
  fin
  robot tipo2
  variables
    Papeles: numero
  comenzar
    Papeles := 0
    derecha
    Recorrer(Papeles)
    Informar(Papeles)
  fin
  robot tipo3
  variables
    Papeles: numero
  comenzar
    Papeles := 0
    repetir 2
      derecha
    Recorrer(Papeles)  
    Informar(Papeles)
  fin 
  robot tipo4
  variables
    Papeles: numero
  comenzar
    Papeles := 0
    repetir 3
      derecha
    Recorrer(Papeles)
    Informar(Papeles)
  fin
variables
  R1: tipo1
  R2: tipo2
  R3: tipo3
  R4: tipo4
comenzar
  AsignarArea(R1, AreaTodos)
  AsignarArea(R2, AreaTodos)
  AsignarArea(R3, AreaTodos)
  AsignarArea(R4, AreaTodos)
  Iniciar(R1, 10, 10)
  Iniciar(R2, 10,30)
  Iniciar(R3, 30, 30)
  Iniciar(R4, 30, 10)
fin
