programa P3EJ4
procesos
  proceso JuntarFlor(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      tomarFlor
  fin
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    mientras(HayFlorEnLaEsquina)
      tomarFlor
  fin
areas
  AreaOrigen : AreaPC(10,10,10,10)
  AreaDestino : AreaC(11,11,11,11)
  Area1 : AreaP(9,9, 9, 9)
  Area2 : AreaP(9,10, 9, 10)
  Area3 : AreaP(9,11, 9, 11)
  Area4 : AreaP(9,12, 9, 12)
  Area5 : AreaP(1,1, 1, 1)
robots
  robot tipo1
  variables
    id, Flores, X, Y: numero
    Seguir: boolean
  comenzar
    RecibirMensaje(id, R5)
    Seguir:= V
    X := PosAv
    Y := PosCa
    Flores := 0
    mientras(Seguir)
      BloquearEsquina(10,10)
      Pos(10,10)
      si(HayFlorEnLaEsquina)   
        JuntarFlor(Flores)
        si(~HayFlorEnLaEsquina)
          Seguir := F
        BloquearEsquina(11,11)
        Pos(11,11)
        LiberarEsquina(10,10)
        depositarFlor
        Pos(X,Y)
        LiberarEsquina(11,11)
      sino
        Seguir := F
        Pos(X,Y)
        LiberarEsquina(10,10)
        EnviarMensaje(id, R5)
  fin
  robot tipo2
  variables
    Flores, idAct, X, Y: numero
  comenzar
    Flores := 0
    X := PosAv
    Y := PosCa
    EnviarMensaje(1,R1)
    EnviarMensaje(2,R2)
    EnviarMensaje(3,R3)
    EnviarMensaje(4,R4)
    repetir 3
      RecibirMensaje(idAct, *)
    Informar(idAct)
    BloquearEsquina(11,11)
    Pos(11,11)
    JuntarFlores(Flores)
    Pos(X,Y)
    LiberarEsquina(11,11)
    
  fin

variables
  R1,R2,R3,R4: tipo1
  R5: tipo2
comenzar
  AsignarArea(R1, AreaOrigen)
  AsignarArea(R2, AreaOrigen)
  AsignarArea(R3, AreaOrigen)
  AsignarArea(R4, AreaOrigen)
  AsignarArea(R1, AreaDestino)
  AsignarArea(R2, AreaDestino)
  AsignarArea(R3, AreaDestino)
  AsignarArea(R4, AreaDestino)
  AsignarArea(R5, AreaDestino)
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R5, Area5)
  
  Iniciar(R1, 9,9)
  Iniciar(R2, 9,10)
  Iniciar(R3, 9, 11)
  Iniciar(R4, 9,12)
  Iniciar(R5, 1,1)
fin
