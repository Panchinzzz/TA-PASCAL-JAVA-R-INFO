programa P3EJ5
areas
  Area1: AreaP(4,1,4,100)
  Area2: AreaP(6,1,6,100)
  Area3: AreaP(8,1,8,100)
  Area4: AreaP(10,1,10,100)
  Area5: AreaP(1,1,1,1)
  Area6: AreaPC(11,11,11,11)
robots
  robot tipo1
  variables
    X, Y, id: numero
    Seguir, Papeles : boolean
  comenzar
    RecibirMensaje(id, R5)
    X := PosAv
    Y := PosCa
    Seguir := V
    mientras(Seguir)
      BloquearEsquina(11,11)
      Pos(11,11)
      si(HayPapelEnLaEsquina)
        tomarPapel
        Papeles := V
      sino
        Papeles := F
      Pos(X,Y)
      LiberarEsquina(11,11)
      si(Papeles)
        Y := Y + 1
        depositarPapel
        Pos(X, Y)
      sino
        Seguir := F
    EnviarMensaje(id, R5)
    EnviarMensaje(Y, R5)
  fin
  robot tipo2
  variables
    idAct, FloresAct, idMax, FloresMax: numero
  comenzar
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    EnviarMensaje(3, R3)
    EnviarMensaje(4, R4)
    FloresMax := 0
    repetir 4
      RecibirMensaje(idAct, *)
      si(idAct = 1)
        RecibirMensaje(FloresAct, R1)
      sino
        si(idAct = 2)
          RecibirMensaje(FloresAct, R2)
        sino
          si(idAct = 3)
            RecibirMensaje(FloresAct, R3)
          sino
            si(idAct = 4)
              RecibirMensaje(FloresAct, R4)
      si(FloresAct > FloresMax)
        idMax := idAct
        FloresMax := FloresAct
    Informar(idMax)
    Informar(FloresAct)    
  fin
variables
  R1,R2,R3,R4: tipo1
  R5: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R5, Area5)
  AsignarArea(R1, Area6)
  AsignarArea(R2, Area6)
  AsignarArea(R3, Area6)
  AsignarArea(R4, Area6)
  
  Iniciar(R1, 4,1)
  Iniciar(R2, 6,1)
  Iniciar(R3, 8,1)
  Iniciar(R4, 10,1)
  Iniciar(R5, 1,1)
fin
