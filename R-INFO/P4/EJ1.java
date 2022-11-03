programa P4EJ1
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    mientras(HayFlorEnLaEsquina)
      tomarFlor
      Flores := Flores + 1
  fin
areas
  Area1 : AreaPC(1,1,1,100)
  Area2 : AreaPC(2,1,2,100)
  Area3 : AreaPC(3,1,3,100)
  Area4 : AreaP(100,100,100,100)
robots
  robot tipo1
  variables
    id, Flores, FloresRandom, X, Y: numero
    Ir : boolean
  comenzar
    X := PosAv
    Y := PosCa
    Flores := 0
    id := PosAv   
    mientras(FloresRandom <> 0)
      Random(FloresRandom, 1, 4)
      EnviarMensaje(id, R4)
      EnviarMensaje(FloresRandom, R4)
      EnviarMensaje(Y, R4)
      RecibirMensaje(Ir, R4)
      mover
      JuntarFlores(Flores)
      Pos(X, Y)
      repetir FloresRandom
        si(PosCa < 100)
          depositarFlor
          mover
          Y := PosCa
          si(PosCa = 100)
            FloresRandom := 0
        sino
          FloresRandom := 0
          
  fin
  robot tipo2
  variables
    idAct, FloresAct, Calle, Flores: numero
    R1, R2, R3, Seguir: boolean
  comenzar
    R1:= V
    R2:= V
    R3:= V
    Seguir := V
    Flores := 0
    JuntarFlores(Flores)
    mientras(Seguir)
      RecibirMensaje(idAct, *)
      si(idAct = 1)
        RecibirMensaje(FloresAct, *)
      sino
        si(idAct = 2)
          RecibirMensaje(FloresAct, *)
        sino
          si(idAct = 3)
            RecibirMensaje(FloresAct, *)
          
      si(FloresAct <> 0)
        si(idAct = 1)
          RecibirMensaje(Calle, *)
        sino
          si(idAct = 2)
            RecibirMensaje(Calle, *)
          sino
            si(idAct = 3)
              RecibirMensaje(Calle, *)
        Pos(idAct, Calle + 1)
        repetir FloresAct
          depositarFlor
        Pos(100,100)
        si(idAct = 1)
          EnviarMensaje(V, R1)
        sino
          si(idAct = 2)
            EnviarMensaje(V, R2)
          sino
            si(idAct = 3)
              EnviarMensaje(V, R3)
      sino
        si(idAct = 1)
          R1 := F
        sino
          si(idAct = 2)
            R2 := F
          sino
            si(idAct = 3)
              R3 := F
        si(R1 = F)
          si(R2 = F)
            si(R3 = F)
              Seguir := F
  fin
variables
  R1,R2,R3: tipo1
  R4: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R4, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R4, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area3)
  AsignarArea(R4, Area4)
  
  Iniciar(R1, 1,1)
  Iniciar(R2, 2, 1)
  Iniciar(R3, 3,1)
  Iniciar(R4, 100,100)
fin
