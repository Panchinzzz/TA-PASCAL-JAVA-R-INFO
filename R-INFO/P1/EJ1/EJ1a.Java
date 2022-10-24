programa P1Ej1a
procesos
  proceso RecorrerAvenidayJuntar(ES Flores: numero)
  comenzar
    repetir 99
      mientras(HayFlorEnLaEsquina)
        Flores := Flores + 1
        tomarFlor
      mover
      mientras(HayFlorEnLaEsquina)
        Flores := Flores + 1
        tomarFlor

  fin
  proceso DepositarFlores(E Flores: numero)
  comenzar
    repetir(Flores)
      depositarFlor
  fin
areas
  AreaR1 : AreaP(1,1,5,100)
robots
  robot tipo1
  variables
    Flores: numero
  comenzar
    Flores := 0
    RecorrerAvenidayJuntar(Flores)
    DepositarFlores(Flores)
    Pos(3,1)
    Flores := 0
    RecorrerAvenidayJuntar(Flores)
    DepositarFlores(Flores)
    Pos(5,1)
    Flores:= 0
    RecorrerAvenidayJuntar(Flores)
    DepositarFlores(Flores)
  fin

variables
  Robot1 : tipo1
comenzar
  AsignarArea(Robot1, AreaR1)
  Iniciar(Robot1, 1, 1)
fin
