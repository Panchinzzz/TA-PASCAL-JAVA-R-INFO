programa P1Ej1b
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
  AreaR1 : AreaP(1,1,1,100)
  AreaR2 : AreaP(3,1,3,100)
  AreaR3 : AreaP(5,1,5,100)
robots
  robot tipo1
  variables
    Flores: numero
  comenzar
    Flores := 0
    RecorrerAvenidayJuntar(Flores)
    DepositarFlores(Flores)
  fin

variables
  Robot1 : tipo1
  Robot2 : tipo1
  Robot3 : tipo1
comenzar
  AsignarArea(Robot1, AreaR1)
  AsignarArea(Robot2, AreaR2)
  AsignarArea(Robot3, AreaR3)
  Iniciar(Robot1, 1, 1)
  Iniciar(Robot2, 3, 1)
  Iniciar(Robot3, 5, 1)
fin
