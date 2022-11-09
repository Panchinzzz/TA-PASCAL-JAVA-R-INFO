programa P4EJ4
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    mientras(HayFlorEnLaBolsa)
      tomarFlor
      Flores := Flores + 1
  fin
  proceso JuntarPapeles(ES Papeles: numero)
  comenzar
    mientras(HayPapelEnLaEsquina)
      tomarPapel
      Papeles := Papeles + 1
  fin
  proceso VaciarBolsa
  comenzar
    mientras(HayFlorEnLaBolsa)
      depositarFlor
    mientras(HayPapelEnLaBolsa)
      depositarPapel
  fin
areas
  AreaG: AreaP(1,1,100,100)
robots
  robot tipo1
  variables
    Seguir: boolean
    Flores, Papeles, Tarea, id, X, Y, Xact, Yact: numero
  comenzar
    RecibirMensaje(id, R3)
    Seguir := V
    Xact := PosAv
    Yact := PosCa
    Papeles := 0
    Flores := 0
    mientras(Seguir)
      RecibirMensaje(Tarea, R3)
      si(Tarea = 4)
        Seguir := F
        EnviarMensaje(V, R3)
      sino
        RecibirMensaje(X, R3)
        RecibirMensaje(Y, R3)
        BloquearEsquina(X, Y)
        Pos(X, Y)
        si(Tarea = 1)
          JuntarFlores(Flores)
        sino
          si(Tarea = 2)
            JuntarPapeles(Papeles)
          sino
            si(Tarea = 3)
              VaciarBolsa
        Pos(Xact, Yact)
        LiberarEsquina(X, Y)
        EnviarMensaje(V, R3)
  fin
  robot tipo2
  variables
    Tarea, id,repeticiones, X, Y: numero
    R1, R2, Seguir, Termino: boolean
  comenzar
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    R1 := V
    R2 := V
    Seguir := V
    repeticiones := 0
    mientras(repeticiones <= 10 & Seguir)
      Random(Tarea, 1, 4)
      Informar(repeticiones)
      Informar(Tarea)
      Informar(R1)
      Informar(R2)
      si(R1 & R2)
        Random(id, 1, 2)
        si(id = 1)
          si(Tarea = 4)
            EnviarMensaje(Tarea, R1)
            R1 := F
          sino
            Random(X, 1, 100)
            Random(Y, 1, 100)
            EnviarMensaje(Tarea, R1)                   
            EnviarMensaje(X, R1)
            EnviarMensaje(Y, R1)
        sino
          si(id = 2)
            si(Tarea = 4)
              EnviarMensaje(Tarea, R2)
              R2 := F
            sino
              Random(X, 1, 100)
              Random(Y, 1, 100)
              EnviarMensaje(Tarea, R2)
              EnviarMensaje(X, R2)
              EnviarMensaje(Y, R2)
      sino
        si(R1)
          si(Tarea = 4)
            EnviarMensaje(Tarea, R1)
            R1 := F
          sino
            Random(X, 1, 100)
            Random(Y, 1, 100)
            EnviarMensaje(Tarea, R1)
            EnviarMensaje(X, R1)
            EnviarMensaje(Y, R1)
        sino
          si(R2)
            si(Tarea = 4)
              EnviarMensaje(Tarea, R2)
              R2 := F
            sino
              Random(X, 1, 100)
              Random(Y, 1, 100)
              EnviarMensaje(Tarea, R2)
              EnviarMensaje(X, R2)
              EnviarMensaje(Y, R2)  
      repeticiones := repeticiones + 1
      si((R1 = F) & (R2 = F))
        Seguir := F
      sino
        si(repeticiones = 10)
          EnviarMensaje(4, R1)
          EnviarMensaje(4, R2)
      RecibirMensaje(Termino, *)
  fin
variables
  R1,R2: tipo1
  R3: tipo2
comenzar
  AsignarArea(R1, AreaG)
  AsignarArea(R2, AreaG)
  AsignarArea(R3, AreaG)  
  Iniciar(R1, 2,1)
  Iniciar(R2, 3,1)
  Iniciar(R3, 1,1)
fin
