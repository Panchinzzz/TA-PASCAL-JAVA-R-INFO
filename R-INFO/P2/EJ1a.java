programa P2EJ1
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flores := Flores + 1
  fin
  proceso RecorrerAvenida(ES Flores: numero)
  comenzar
    repetir 9
      JuntarFlores(Flores)
      mover
  fin
areas
  Area1: AreaP(1,1,1,10)
  Area2: AreaP(2,11,2,20)
robots
  robot tipo1
  variables
    Flores, Flores2, id: numero
  comenzar
    id := PosAv
    Flores := 0
    RecorrerAvenida(Flores)
    si(id = 1)
      EnviarMensaje(Flores, R2)
      RecibirMensaje(Flores2, R2)
    sino
      EnviarMensaje(Flores, R1)
      RecibirMensaje(Flores2, R1)
    si(Flores - Flores2 > 0)
      Informar(id)
      Informar(Flores - Flores2)
  fin
variables
  R1, R2: tipo1
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  Iniciar(R1, 1,1)
  Iniciar(R2, 2, 11)
fin
