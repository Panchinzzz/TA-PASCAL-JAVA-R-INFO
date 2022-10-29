programa P2EJ2
procesos
  proceso Juntar(ES Flores: numero; ES Papeles: numero)
  comenzar
    si(HayPapelEnLaEsquina)
      mientras(HayPapelEnLaEsquina)
        tomarPapel
        Papeles := Papeles + 1
    si(HayFlorEnLaEsquina)
      mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flores := Flores + 1
  fin
  proceso Escalones(ES Flores: numero; ES Papeles: numero)
  variables
    alto: numero
  comenzar
    Random(alto, 1, 5)
    repetir alto
      Juntar(Flores, Papeles)
      mover
    derecha
    Juntar(Flores, Papeles)
    mover
    repetir 3
      derecha
  fin
areas
  Area1: AreaP(2,1,6,20)
  Area2: AreaP(7,1,11,20)
  Area3: AreaP(12, 1, 16, 20)
  Area4: AreaP(1,1,1,1)
robots
  robot tipo1
  variables 
    Flores, Papeles, cantEscalones: numero
  comenzar
    cantEscalones := 0
    Flores := 0
    Papeles := 0
    repetir 4
      Escalones(Flores, Papeles)
      si(Flores > Papeles)
        cantEscalones := cantEscalones + 1
      Flores := 0
      Papeles := 0
    EnviarMensaje(cantEscalones, R4)
  fin
  robot tipo2
  variables
    total, cantAct: numero
  comenzar
    total := 0
    repetir 3
      RecibirMensaje(cantAct, *)
      total := total + cantAct
    Informar(total)
  fin
variables
  R1,R2,R3: tipo1
  R4: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  Iniciar(R1, 2,1)
  Iniciar(R2,7,1 )
  Iniciar(R3, 12, 1)
  Iniciar(R4,1, 1)
fin
