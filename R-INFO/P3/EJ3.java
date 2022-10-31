programa P3EJ3
procesos
  proceso JuntarFlor(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      tomarFlor
      Flores := Flores + 1
  fin
areas
  AreaT: AreaC(2,2,10,10)
  Area1: AreaP(2,1,2,1)
  Area2: AreaP(3,1,3,1)
  Area3: AreaP(4,1,4,1)
  Area4: AreaP(5,1,5,1)
  Area5: AreaP(1,1,1,1)
robots
  robot tipo1
  variables
    X,Y : numero
    Xact, Yact: numero
    Flores: numero
    id: numero
    Seguir: boolean
  comenzar
    RecibirMensaje(id, R5)
    Flores := 0
    RecibirMensaje(X, R5)
    RecibirMensaje(Y, R5)
    Xact := PosAv
    Yact := PosCa
    Seguir:= V
    mientras(Seguir)
      si(Seguir)
        BloquearEsquina(X, Y)
        Pos(X, Y)
        JuntarFlor(Flores)
        si(~HayFlorEnLaEsquina)
          Seguir :=  F
        Pos(Xact, Yact)
        LiberarEsquina(X,Y)  
    EnviarMensaje(id, R5) 
    EnviarMensaje(Flores, R5)
    EnviarMensaje(Seguir, R5)
  fin
  robot tipo2
  variables
    X, Y: numero
    idAct, FloresAct: numero
    maxId, maxFlores: numero
    HayFlores: boolean
  comenzar
    maxFlores := 0
    X := 6
    Y := 6
    EnviarMensaje(1,R1)
    EnviarMensaje(2,R2)
    EnviarMensaje(3,R3)
    EnviarMensaje(4,R4)
    EnviarMensaje(X, R1)
    EnviarMensaje(Y, R1)
    EnviarMensaje(X, R2)
    EnviarMensaje(Y, R2)
    EnviarMensaje(X, R3)
    EnviarMensaje(Y, R3)
    EnviarMensaje(X, R4)
    EnviarMensaje(Y, R4)
    HayFlores := V
    mientras(HayFlores)
      si(HayFlores)
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
      si(FloresAct > maxFlores)
        maxId := idAct
        maxFlores := FloresAct
      RecibirMensaje(HayFlores, *)
    Informar(maxId)
    Informar(maxFlores)
  fin
variables
  R1, R2, R3, R4: tipo1
  R5: tipo2
comenzar
  AsignarArea(R1,AreaT)
  AsignarArea(R2,AreaT)
  AsignarArea(R3,AreaT)
  AsignarArea(R4,AreaT)
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R5, Area5)
  Iniciar(R1, 2, 1)
  Iniciar(R2, 3, 1)
  Iniciar(R3, 4, 1)
  Iniciar(R4, 5, 1)
  Iniciar( R5, 1, 1)
fin
