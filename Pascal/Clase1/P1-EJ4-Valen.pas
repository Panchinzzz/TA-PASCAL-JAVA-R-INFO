Program EJ4;

Const Rubros = 8;
Const MaxR3 = 3;
type

producto = record
Cod: integer;
Rubro: integer;
precio: integer;
end;

Rubro = ^nodo;

nodo = record
dato: producto;
sig: Rubro;
end;

Productos = array[1.. Rubros] of Rubro;
Rubro3 = array[1..MaxR3] of producto; 

procedure CargarArreglo(var Lp: productos);
Procedure CrearListaOrdenada ( var R: rubro ; p: producto);
var
   ant, nue, act: rubro;
begin
  new (nue);
  nue^.dato := p;
  act := R;
  ant := R;
{Recorro mientras no se termine la lista y no encuentro la posición correcta}
  while (act<>NIL) and (act^.dato.cod < p.cod) do begin
      ant := act;
      act := act^.sig ;
  end;
  if (ant = act)  then R := nue   {el dato va al principio}
                  else  ant^.sig  := nue; {va entre otros dos o al final}
  nue^.sig := act ;
end;

procedure CargarRegistro(var p : producto);
begin
readln(p.Cod);
readln(p.Rubro);
readln(p.Precio);
end;

var
p: producto;
begin

CargarRegistro(p);
repeat
CrearListaOrdenada(Lp[p.rubro], p);
CargarRegistro(p);
until(p.precio=0);
CrearListaOrdenada(Lp[p.rubro], p);
end;

procedure LeerArreglo(Lp: productos);
procedure LeerLista(R: rubro);
begin
while R <> Nil do begin
writeln(R^.dato.cod);
writeln(R^.dato.rubro);
writeln(R^.dato.Precio);
R := R^.sig;
writeln();
end;
end;

var i: integer;
begin

for i:=1 to Rubros do begin
writeln('Productos del rubro: ', i);
LeerLista(Lp[i]);
writeln('--------------------- ');
end;

end;

procedure Inicializacion(var Lp: productos);
var i : integer;
begin

for i := 1 to Rubros do Lp[i] := NIl;

end;

procedure CargarRubro3(var r3: rubro3; var DimL:integer; L: rubro);

begin
DimL:=0;

while (L <> nil) and (DimL < MaxR3) do begin
DimL := DimL + 1;
r3[DimL] := L^.dato;
L := L^.sig;
end;

end;
procedure LeerRubro3(R3: rubro3; Diml: integer);
var i : integer;
begin
writeln();
writeln('Productos especificos del rubro 3!');
for i:= 1 to DimL do begin
writeln(R3[i].cod);
writeln(R3[i].Rubro);
writeln(R3[i].precio);
writeln();
end;
end;

var
Lp : Productos;
R3: rubro3;
DimL: integer;

begin
Inicializacion(Lp);
CargarArreglo(Lp);
LeerArreglo(Lp);
CargarRubro3(r3, DimL, Lp[3]);
LeerRubro3(R3, DimL);

end.
