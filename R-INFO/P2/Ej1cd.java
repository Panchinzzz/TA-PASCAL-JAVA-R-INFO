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
  Area3: AreaP(3, 21, 3, 30)
  Area4: AreaP(4, 31, 4, 40)
  Area5: AreaP(5, 41, 5, 50)
  Area6: AreaP(6, 51, 6, 60)
  Area7: AreaP(2,1,2,1)
robots
  robot tipo1
  variables
    Flores,id: numero
  comenzar
    RecibirMensaje(id, R7)
    Flores := 0
    RecorrerAvenida(Flores)
    EnviarMensaje(id, R7)
    EnviarMensaje(Flores, R7)
  fin
  robot tipo2
  variables
    Flores,idActual, maxFlores, maxId: numero
  comenzar
    maxFlores := 0
    maxId:= 0
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    EnviarMensaje(3, R3)
    EnviarMensaje(4, R4)
    EnviarMensaje(5, R5)
    EnviarMensaje(6, R6)
    repetir 6
      RecibirMensaje(idActual, *)
      si(idActual = 1)
        RecibirMensaje(Flores, R1)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 1
      si(idActual = 2)
        RecibirMensaje(Flores, R2)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 2
      si(idActual = 3)
        RecibirMensaje(Flores, R3)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 3
      si(idActual = 4)
        RecibirMensaje(Flores, R4)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 4
      si(idActual = 5)
        RecibirMensaje(Flores, R5)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 5
      si(idActual = 6)
        RecibirMensaje(Flores, R6)
        si(Flores > maxFlores)
          maxFlores := Flores
          maxId := 6
    Informar(maxId)
    Informar(maxFlores)
  fin
variables
  R1, R2, R3, R4, R5, R6: tipo1
  R7: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R5, Area5)
  AsignarArea(R6, Area6)
  AsignarArea(R7, Area7)
  Iniciar(R1, 1,1)
  Iniciar(R2, 2, 11)
  Iniciar(R3, 3, 21)
  Iniciar(R4, 4, 31)
  Iniciar(R5, 5, 41)
  Iniciar(R6, 6, 51)
  Iniciar(R7, 2,1)
fin
