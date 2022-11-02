programa P4EJ6
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
  proceso JuntarPapelesyFlores(ES Flores: numero; ES Papeles: numero)
  comenzar
    JuntarFlores(Flores)
    JuntarPapeles(Papeles)
  fin
  proceso Recorrer(E Medida: numero;ES Flores: numero)
  comenzar
    repetir Medida
      JuntarFlores(Flores)
      mover
  fin
  proceso Recorrer2(E Medida: numero;ES Flores: numero;ES Papeles: numero)
  comenzar
    repetir Medida
      JuntarPapelesyFlores(Flores, Papeles)
      mover
  fin
  proceso Recorrer3(E Medida: numero; ES Papeles: numero)
  comenzar
    repetir Medida
      JuntarPapeles(Papeles)
      mover
  fin

areas
  Area1: AreaPC(2,2,16,16)
  Puesto1: AreaPC(1,20,100,20)
  Puesto2: AreaPC(1,21,100,21)
  Puesto3: AreaPC(1,22,100,22)
  Area2: AreaP(1,1,1,1)
robots
  robot tipo1
  variables
    Flores, Coo, id: numero
    go: boolean
  comenzar
    RecibirMensaje(id, R4)
    Flores := 0
    Recorrer(6, Flores)
    derecha
    Recorrer(2, Flores)
    BloquearEsquina(5,8)
    Recorrer(2, Flores)
    LiberarEsquina(5,8)
    Recorrer(2, Flores)
    derecha
    Recorrer(2, Flores)
    BloquearEsquina(8,5)
    Recorrer(2,Flores)
    LiberarEsquina(8,5)
    Recorrer(2, Flores)
    derecha
    Recorrer(6, Flores) 
    EnviarMensaje(id, R4)
    RecibirMensaje(Coo, R4)
    RecibirMensaje(go, R4)
    Pos(1, Coo)
    repetir 2
      derecha
    repetir (Flores)
      si(PosAv < 100)
        depositarFlor
        mover
  fin
  robot tipo2
  variables
    Flores, Papeles, Coo ,id: numero
    go: boolean
  comenzar
    RecibirMensaje(id, R4)
    Flores := 0
    Papeles := 0
    Recorrer2(2, Flores, Papeles)
    BloquearEsquina(5,8)
    Recorrer2(2, Flores, Papeles)
    LiberarEsquina(5,8)
    Recorrer2(6, Flores, Papeles)
    derecha
    Recorrer2(3, Flores, Papeles)
    BloquearEsquina(9,15)
    Recorrer2(2, Flores, Papeles)
    LiberarEsquina(9,15)
    Recorrer2(5, Flores, Papeles)
    derecha
    Recorrer2(5, Flores, Papeles)
    BloquearEsquina(15,9)
    Recorrer2(2, Flores, Papeles)
    LiberarEsquina(15,9)
    Recorrer2(3, Flores, Papeles)
    derecha
    Recorrer2(6, Flores, Papeles)
    BloquearEsquina(8,5)
    Recorrer2(2, Flores, Papeles)
    LiberarEsquina(8,5)
    Recorrer2(2, Flores, Papeles)
    EnviarMensaje(id, R4)
    RecibirMensaje(Coo, R4)
    RecibirMensaje(go, R4)
    Pos(1, Coo)
    repetir 2
      derecha
    repetir Flores
      si(PosAv < 100)
        depositarFlor
        mover
    repetir Papeles
      si(PosAv < 100)
        depositarPapel
        mover
  fin
  robot tipo3
  variables
    Papeles, id, Coo : numero
    go: boolean
  comenzar
    Papeles := 0
    RecibirMensaje(id, R4)
    Recorrer3(5, Papeles)
    BloquearEsquina(15, 9)
    Recorrer3(2, Papeles)
    LiberarEsquina(15,9)
    derecha
    repetir 2
      Recorrer3(7, Papeles)
      derecha
    BloquearEsquina(9,15)
    Recorrer3(2, Papeles)
    LiberarEsquina(9,15)
    Recorrer3(5, Papeles)
    EnviarMensaje(id, R4)
    RecibirMensaje(Coo, R4)
    RecibirMensaje(go, R4)
    Pos(1, Coo)
    repetir 2
      derecha
    repetir Papeles
      si(PosAv < 100)
        depositarPapel
        mover
  fin
  robot tipo4
  variables
    idAct: numero
    Coo: numero
  comenzar
    Coo:= 20
    EnviarMensaje(3, R3)
    EnviarMensaje(1, R1)
    EnviarMensaje(2, R2)
    repetir 3
      RecibirMensaje(idAct, *)
      si(idAct = 1)
        EnviarMensaje(Coo, R1)
      sino
        si(idAct = 2)
          EnviarMensaje(Coo, R2)
        sino
          si(idAct = 3)
            EnviarMensaje(Coo, R3)
      Coo := Coo + 1
    EnviarMensaje(V, R1)
    EnviarMensaje(V, R2)
    EnviarMensaje(V, R3)
  fin
variables
  R1: tipo1
  R2: tipo2
  R3: tipo3
  R4: tipo4
comenzar
  AsignarArea(R1, Area1)
  AsignarArea(R2, Area1)
  AsignarArea(R3, Area1)
  AsignarArea(R1, Puesto1)
  AsignarArea(R1, Puesto2)
  AsignarArea(R1, Puesto3)
  
  AsignarArea(R2, Puesto1)
  AsignarArea(R2, Puesto2)
  AsignarArea(R2, Puesto3)
  
  AsignarArea(R3, Puesto1)
  AsignarArea(R3, Puesto2)
  AsignarArea(R3, Puesto3) 
  
  AsignarArea(R4, Area2)
  Iniciar(R1,2,2)
  Iniciar(R2,5,5)
  Iniciar(R3,9,9)
  Iniciar(R4, 1, 1)
fin
