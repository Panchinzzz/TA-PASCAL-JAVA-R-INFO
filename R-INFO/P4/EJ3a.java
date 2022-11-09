programa P4EJ3
procesos
  proceso JuntarFlor(ES Flores: numero)
  comenzar
    mientras(HayFlorEnLaEsquina)
      tomarFlor
      Flores := Flores + 1
  fin
areas
  Area1: AreaP(1,1,1,100)
  Area2: AreaP(2,1,2,100)
  Area3: AreaP(3,1,3,100)
  Area4: AreaP(4,1,4,1)
robots
  robot tipo1
  variables
    id, Flores, Calle: numero
    Seguir: boolean
  comenzar
    Flores := 0
    Calle := 1
    RecibirMensaje(id, R4)
    repetir 99
      JuntarFlor(Flores)
      si(Calle = 5)
        Calle := 0
        si(id = 1)
          EnviarMensaje(V, R2)
          EnviarMensaje(V, R3)
        sino
          si(id = 2)
            EnviarMensaje(V, R1)
            EnviarMensaje(V, R3)
          sino
            si(id = 3)
              EnviarMensaje(V, R1)
              EnviarMensaje(V, R2)
        repetir 2
          RecibirMensaje(Seguir, *)
      mover
      Calle := Calle + 1
  fin
  robot tipo2
  comenzar
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    EnviarMensaje(3, R3)
  fin
variables
  R1,R2,R3: tipo1
  R4: tipo2
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area2)
  AsignarArea(R3, Area3)
  AsignarArea(R4, Area4)
  Iniciar(R1, 1,1)
  Iniciar(R2, 2,1)
  Iniciar(R3, 3,1)
  Iniciar(R4, 4,1)
fin
