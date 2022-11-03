programa P4EJ2
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      tomarFlor
      Flores := Flores + 1
  fin
areas
  Area1 : AreaP(5,1,5,100)
  Area2 : AreaP(10,1,10,100)
  AreaTodos: AreaC(50,50, 50, 50)
  Area3: AreaP(11, 1, 11 ,1)
  Area4: AreaP(12,1,12,1)
robots
  robot tipo1
  variables
    Flores, X, Y : numero
  comenzar
    Flores := 0
    repetir 99
      X := PosAv
      Y := PosCa
      mientras(HayFlorEnLaEsquina)
        JuntarFlores(Flores)
        si(Flores = 5)
          BloquearEsquina(50,50)
          Pos(50,50)
          repetir 5
            depositarFlor
          Pos(X, Y)
          LiberarEsquina(50,50)
          Flores := 0
      mover 
  fin
  robot tipo2
  variables
    FloresRandom, Flores, X, repeticiones: numero
    Seguir: boolean
  comenzar
    Seguir:= V
    X := PosAv
    Flores := 0
    repeticiones := 0
    mientras(Seguir)
      Random(FloresRandom, 2 ,5)
      BloquearEsquina(50,50)
      Pos(50,50)
      si(HayFlorEnLaEsquina)
        repetir FloresRandom
          si(HayFlorEnLaEsquina)
            tomarFlor
            Flores := Flores + 1
        Pos(X, 1)
        LiberarEsquina(50,50)
        repeticiones := 0
      sino
        Pos(X, 1)
        LiberarEsquina(50,50)
        repeticiones := repeticiones + 1
        si(repeticiones = 8)
          Seguir := F
  fin
variables
  R1, R2: tipo1
  R3, R4: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R1, AreaTodos)
  AsignarArea(R2, Area2)
  AsignarArea(R2, AreaTodos)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  AsignarArea(R3, AreaTodos)
  AsignarArea(R4, AreaTodos)

  Iniciar(R1, 5,1)
  Iniciar(R2, 10, 1)
  Iniciar(R3, 11,1)
  Iniciar(R4, 12, 1)
fin
