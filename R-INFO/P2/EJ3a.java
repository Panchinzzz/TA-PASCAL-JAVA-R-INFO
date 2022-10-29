programa P2EJ3
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    si(HayFlorEnLaEsquina)
      mientras(HayFlorEnLaEsquina)
        tomarFlor
        Flores := Flores + 1
  fin
  proceso JuntarPapeles(ES Papeles: numero)
  comenzar
    si(HayPapelEnLaEsquina)
      mientras(HayPapelEnLaEsquina)
        tomarPapel
        Papeles := Papeles + 1
  fin
areas
  Equipo1 : AreaPC(1,1,20,1)
  Equipo2 : AreaPC(1, 5, 20, 5)
robots
  robot tipo1
  variables
    Dato: numero
  comenzar
    Dato := 0
    derecha
    si(PosCa = 1)
      repetir 9
        JuntarPapeles(Dato)
        mover
      EnviarMensaje(Dato, R2)
    sino
      repetir 9
        JuntarFlores(Dato)
        mover
      EnviarMensaje(Dato, R4)
  fin
  robot tipo2
  variables
    Dato: numero
  comenzar
    derecha
    si(PosCa = 1)
      RecibirMensaje(Dato, R1)
      repetir 9
        JuntarPapeles(Dato)
        mover
      Informar(2)
      Informar(Dato)
    sino
      RecibirMensaje(Dato, R3)
      repetir 9
        JuntarFlores(Dato)
        mover  
      Informar(4)
      Informar(Dato)
  fin
variables
  R1, R3: tipo1
  R2, R4: tipo2
comenzar
  AsignarArea(R1, Equipo1)
  AsignarArea(R2, Equipo1)
  AsignarArea(R3, Equipo2)
  AsignarArea(R4, Equipo2)
  Iniciar(R1, 1,1)
  Iniciar(R2, 11,1)
  Iniciar(R3, 1,5)
  Iniciar(R4, 11,5)
fin
