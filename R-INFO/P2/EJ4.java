programa P2EJ4
procesos
  proceso Juntar(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flores := Flores + 1
  fin
areas
  Zona : AreaC(25,25,30,30)
  Area1: AreaP(25,1,25,1)
  Area2: AreaP(30,1,30,1)
  Area3: AreaP(35,1,35,1)
  Area4: AreaP(40,1,40,1)
  Area5: AreaP(1,1,1,1)
robots
  robot tipo1
  variables
    Flores: numero
    AV, CA: numero
    X, Y: numero
    saltar: boolean
    gane: boolean
  comenzar
    saltar := V
    Flores := 0
    Juntar(Flores)
    mientras(saltar)
      RecibirMensaje(saltar, R5)
      Informar(saltar)
      si(saltar)
        Random(X, 25, 30)
        Random(Y, 25, 30)
        AV := PosAv
        CA := PosCa
        Pos(X,Y)
        Juntar(Flores)
        Pos(AV, CA)
        EnviarMensaje(Flores, R5)
    RecibirMensaje(gane, R5)
    si(gane)
      Pos(27,27)
  fin
  robot tipo2
  variables
    robotAct: numero
    seguir: numero
    floresAct : numero
    maxId: numero
    maxFlores: numero
  comenzar
    maxFlores := 0
    repetir 10
      Random(robotAct, 1, 4)
      Informar(robotAct)
      si(robotAct = 1)
        EnviarMensaje(V, R1)
      sino
        si(robotAct = 2)
          EnviarMensaje(V,R2)
        sino
          si(robotAct = 3)
            EnviarMensaje(V, R3)
          sino
            si (robotAct = 4)
              EnviarMensaje(V, R4)
      RecibirMensaje(floresAct, *)
      si(floresAct > maxFlores)
        maxId := robotAct
        maxFlores := floresAct
    EnviarMensaje(F, R1)
    EnviarMensaje(F, R2)
    EnviarMensaje(F, R3)
    EnviarMensaje(F, R4)
    si(maxId = 1)
      EnviarMensaje(V, R1)
      EnviarMensaje(F, R2)
      EnviarMensaje(F, R3)
      EnviarMensaje(F, R4)
    sino
      si(maxId = 2)
        EnviarMensaje(F, R1)
        EnviarMensaje(V, R2)
        EnviarMensaje(F, R3)
        EnviarMensaje(F, R4)
      sino
        si(maxId = 3)
          EnviarMensaje(F, R1)
          EnviarMensaje(F, R2)
          EnviarMensaje(V, R3)
          EnviarMensaje(F, R4)
        sino
          si(maxId = 4)   
            EnviarMensaje(F, R1)
            EnviarMensaje(F, R2)
            EnviarMensaje(F, R3)
            EnviarMensaje(V, R4)
  fin
variables
  R1, R2, R3, R4: tipo1
  R5: tipo2
comenzar
  AsignarArea(R1, Zona)
  AsignarArea(R2, Zona)
  AsignarArea(R3, Zona)
  AsignarArea(R4, Zona)
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R5, Area5)

  Iniciar(R1, 25, 1)
  Iniciar(R2, 30, 1)
  Iniciar(R3, 35, 1)
  Iniciar(R4, 40, 1)
  Iniciar(R5, 1,1)
fin
