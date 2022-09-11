Program Promocion(output);

const
DimF = 7;

type

dia = 1..DimF;

entrada = record
cod: integer;
dia: dia;
asiento: integer;
monto: integer;
end;

entrada2 = record
cod: integer;
cant: integer;
end;

lista2 = ^nodo2;

nodo2 = record
dato: entrada2;
sig: lista2;
end;

lista = ^nodo;

nodo = record
dato: entrada;
sig: lista;
end;


todos = array[1..DimF] of lista;
//---------------------------------------------

procedure Inicializar(var t: todos);
var i: integer;
begin

for i:= 1 to DimF do t[i] := nil;

end;

//----------------------------------------------

procedure CargarArreglo(var t: todos);

procedure CargarRegistro(var e: entrada);
begin

readln(e.cod);

if(e.cod <> 0) then begin

readln(e.dia);
readln(e.asiento);
readln(e.monto);

end;
end;
//--
procedure CargarLista(var l: lista; e: entrada);
var aux, ant, act : lista;
begin

new(aux);
aux^.dato := e;

ant := l;
act := l;

while (act <> nil) and (e.cod > act^.dato.cod) do begin
ant := act;
act := act^.sig;
end;

if(ant = act) then l := aux
              else ant^.sig := aux;
                   aux^.sig := act;
end;
//---
var e: entrada;
begin

CargarRegistro(e);

while(e.cod <> 0) do begin
CargarLista(t[e.dia], e);
CargarRegistro(e);
end;

end;
//----------------------------------------------
procedure LeerArreglo(t: todos);
var i: integer;
begin

for i:= 1 to DimF do begin
writeln;
if(t[i] <> nil) then writeln('Datos de las entradas vendidas en el dia: ', t[i]^.dato.dia);
writeln;
while t[i] <> nil do begin
writeln('cod: ',t[i]^.dato.cod);
writeln(t[i]^.dato.asiento);
writeln(t[i]^.dato.monto);
writeln;
t[i] := t[i]^.sig;
end;
writeln('-------------------------');
end;

end;
//----------------------------------------------
procedure Merge(t:todos; var l, ult: lista2);
procedure AgregarAtras(var l, ult: lista2; dato: entrada2);
var aux: lista2;
begin

new(aux);
aux^.dato := dato;
aux^.sig := nil;

if(l = nil) then l := aux
            else ult^.sig := aux;
            ult := aux;
end;
//---
procedure Min(var t:todos; var MinCod: integer);
var i, IndexMin : integer;
begin
MinCod := 999;
IndexMin := -1;

for i:= 1 to DimF do begin

if(t[i] <> nil) then begin

if(t[i]^.dato.cod <= MinCod) then begin
IndexMin := i;
MinCod := t[i]^.dato.cod;
end;
end;
end;

if(IndexMin <> -1) then t[IndexMin] := t[IndexMin]^.sig;

end;
//---
var IndexMin, MinCod, act, cantidad: integer; dato: entrada2;
begin

Min(t, MinCod);

while (MinCod <> 999) do begin
act := MinCod;
cantidad := 0;

while (MinCod <> 999) and (act = MinCod) do begin
cantidad := cantidad + 1;

Min(t, MinCod);
end;

dato.cod := act;
dato.cant := cantidad;
AgregarAtras(l, ult, dato);
end;

end;
//----------------------------------------------
procedure LeerLista(l: lista2); 
begin
writeln;
if l <> nil then begin

writeln('Codigo de entrada numero ', l^.dato.cod, ': ', l^.dato.cant);
writeln;
LeerLista(l^.sig);
end;

end;
//-----------------------------------------------
var t: todos; l, ult: lista2;
begin
ult := nil;
Inicializar(t);
CargarArreglo(t);
LeerArreglo(t);
Merge(t, l, ult);
LeerLista(l);
end.
