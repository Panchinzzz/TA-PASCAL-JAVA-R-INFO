programa P1Ej5
procesos
  proceso TomarPapeles(ES Papeles: numero)
  comenzar
    si(HayPapelEnLaEsquina)
      mientras(HayPapelEnLaEsquina)
        tomarPapel
        Papeles := Papeles + 1
  fin
  proceso TomarFlores(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flores := Flores + 1
  fin

  proceso RecorrerAvenidasPar(ES Papeles: numero)
  comenzar
    repetir 19
      TomarPapeles(Papeles)
      mover
  fin
  proceso RecorrerAvenidasImpar(ES Flores: numero)
  comenzar
    repetir 19
      TomarFlores(Flores)
      mover
  fin
areas
  Area4 : AreaP(10,1,15, 20)
  Area2 : AreaP(75,80,80, 99)
  Area1 : AreaP(1,75,20,80)
  Area3 : AreaP(80,10,99, 15)
robots
  robot tipo1
  variables
    Papeles: numero
  comenzar
    Papeles := 0
    RecorrerAvenidasPar(Papeles)
    derecha
    repetir 5
      mover
    derecha
    RecorrerAvenidasPar(Papeles)
    derecha
    repetir 5
      mover
    repetir Papeles
      depositarPapel
    Informar(Papeles)
  fin
  robot tipo2
  variables
    Flores: numero
  comenzar
    Flores := 0
    derecha
    RecorrerAvenidasImpar(Flores)
    derecha
    repetir 5
      mover
    derecha
    RecorrerAvenidasImpar(Flores)
    repetir 2
      derecha
    repetir 19
      mover
    repetir Flores
      depositarFlor
    Informar(Flores)
  fin
variables
  R2, R4: tipo1
  R1, R3: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  Iniciar(R1,1,80)
  Iniciar(R2,75,80)
  Iniciar(R3, 80,15)
  Iniciar(R4, 10, 1 )
fin
