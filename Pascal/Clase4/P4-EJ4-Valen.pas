Program Ej4;
const DimF = 7;

type

entrada = record
cod: integer;
codo: integer;
fecha: integer;
monto: integer;
end;

obra = record
cod: integer;
cant: integer;
end;
lista = ^nodo;

nodo = record
dato: entrada;
sig: lista;
end;

lista2 = ^nodo2;

nodo2 = record
dato: obra;
sig: lista2;
end;

Semana = array[1..DimF] of lista;

procedure Inicializar(var s: semana);
var i: integer;
begin

for i:= 1 to DimF do s[i] := nil;

end;

//---------------------------------------------------------------

procedure CargarArreglo(var s: semana);
procedure InsertarOrdenado(var l: lista; e: entrada);
var aux, ant, act : lista;
begin
new(aux);
aux^.dato := e;
aux^.sig := nil;

ant := l;
act := l;

while (act <> nil) and (e.codo > act^.dato.codo) do begin
ant := act;
act := act^.sig;
end;

if(ant = act) then l := aux
              else ant^.sig := aux;
              aux^.sig := act;

end;
//---
procedure CargarRegistro(var e: entrada);
begin

readln(e.cod);

if (e.cod <> 0) then begin
readln(e.codo);
readln(e.fecha);
readln(e.monto);
end;

end;
//---
var e: entrada;
begin

CargarRegistro(e);

while (e.cod <> 0) do begin
InsertarOrdenado(s[e.cod],e);
CargarRegistro(e);
end;

end;

//---------------------------------------------------------------

procedure LeerArreglo(s: semana);
var i: integer;
begin
for i:= 1 to DimF do begin

while (s[i] <> nil) do  begin
writeln(s[i]^.dato.cod);
writeln(s[i]^.dato.codo);
writeln(s[i]^.dato.fecha);
writeln(s[i]^.dato.monto);

writeln;
s[i] := s[i]^.sig;
end;

writeln('-----------------');
end;

end;
//---------------------------------------------------------------
procedure Merge(s: semana; var l, ult: lista2);
procedure AgregarAtras(var l, ult: lista2; o: obra);
var aux : lista2;
begin

new(aux);

aux^.dato := o;
aux^.sig := nil;

if(l = nil) then l := aux
            else ult^.sig := aux;
                 ult := aux;


end;
//---
procedure Min(var s: semana; var MinCod: integer);
var IndexMin, i: integer;
begin
MinCod := 999;
IndexMin := -1;

for i:= 1 to DimF do begin

if(s[i] <> nil) then begin

if(s[i]^.dato.codo <= MinCod) then begin
IndexMin := i;
MinCod := s[i]^.dato.codo;
end;
end;
end;


if (IndexMin <> -1) then s[IndexMin] := s[IndexMin]^.sig;

end;
//---
var MinCod, act, cant: integer;o: obra;
begin

Min(s, MinCod);

while(MinCod <> 999) do begin

act := MinCod;
cant := 0;

while(MinCod <> 999) and (act = MinCod) do begin
cant := cant + 1;
Min(s, MinCod);
end;
o.cod := act;
o.cant := cant;
AgregarAtras(l, ult, o);
end;

end;

//---------------------------------------------------------------
procedure LeerMerge(l: lista2);
begin

while (l <> nil) do begin

writeln('Cantidad de entradas vendidas de la obra ', l^.dato.cod, ': ', l^.dato.cant);
writeln;
writeln('----------------------------------------------------------------------------------');
l := l^.sig;
end;


end;
//---------------------------------------------------------------
var s: semana; l, ult: lista2;
begin
Inicializar(s);
CargarArreglo(s);
//LeerArreglo(s);
Merge(s, l, ult);
LeerMerge(l);
end.
