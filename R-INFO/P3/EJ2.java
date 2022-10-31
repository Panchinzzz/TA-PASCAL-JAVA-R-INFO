programa P3EJ2
procesos
  proceso JuntarFlores(ES Flores: numero)
  comenzar
    mientras(HayFlorEnLaEsquina)
      tomarFlor
      Flores := Flores + 1
  fin
  proceso JuntarPapeles(ES Papeles: numero)
  comenzar
    mientras(HayPapelEnLaEsquina)
      tomarPapel
      Papeles := Papeles + 1
  fin
  proceso Escalon(E medida: numero; ES Flores: numero)
  comenzar
    repetir medida
      mover
    derecha
    JuntarFlores(Flores)
    repetir medida
      mover
    JuntarFlores(Flores)
    repetir 3
      derecha
  fin
  proceso EscalonInv(E medida: numero; ES Papeles: numero)
  comenzar
    repetir medida
      mover
    JuntarPapeles(Papeles)
    repetir 3
      derecha
    repetir medida
      mover
    JuntarPapeles(Papeles)
    derecha
  fin
areas
  Area : AreaPC(1,1,31,31)
robots
  robot tipo1
  variables
    aux: numero
    Flores : numero
    id: numero
  comenzar
    RecibirMensaje(id, R3)
    Flores := 0
    aux := 5
    repetir 5
      si(aux = 1)
        BloquearEsquina(16,16)
        Escalon(aux, Flores)
        aux := aux - 1
      sino
        Escalon(aux, Flores)
        aux := aux - 1
    EnviarMensaje(id, R3)
    repetir 3
      derecha
    mover
    LiberarEsquina(16,16)
    aux := 2
    repetir 4
      Escalon(aux, Flores)
      aux := aux + 1
    Informar(Flores)
    EnviarMensaje(V, R3)
  fin
  robot tipo2
  variables
    aux: numero
    Papeles: numero
    id: numero
  comenzar
    RecibirMensaje(id, R3)
    Papeles := 0
    aux := 5
    repetir 5
      si(aux) = 1
        BloquearEsquina(16,16)
        EscalonInv(aux, Papeles)
        aux := aux - 1
      sino
        EscalonInv(aux, Papeles)
        aux := aux - 1
    EnviarMensaje(id, R3)
    derecha
    mover
    LiberarEsquina(16,16)
    aux := 2
    repetir 4
      EscalonInv(aux, Papeles)
      aux := aux + 1
    Informar(Papeles)
    EnviarMensaje(V, R3)
  fin
  robot tipo3
  variables
    idGanador: numero
    idPerdedor: numero
    termino: boolean
  comenzar
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    RecibirMensaje(idGanador, *)
    RecibirMensaje(idPerdedor, *)
    repetir 2
      RecibirMensaje(termino, *)
    Informar(idGanador)
  fin
variables
  R1: tipo1
  R2: tipo2
  R3: tipo3
comenzar
  AsignarArea(R1, Area)
  AsignarArea(R2, Area)
  AsignarArea(R3, Area)
  Iniciar(R1, 1,1)
  Iniciar(R2, 31, 1)
  Iniciar(R3, 15, 1)
fin
