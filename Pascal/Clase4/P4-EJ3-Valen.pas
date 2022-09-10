Program AddNums(output);
const 
DimF = 4;
type

venta = record
cod: integer;
codp: integer;
fecha: integer;
cantidad: integer;
end;

producto = record
cod: integer;
cantidad: integer;
end;

lista = ^nodo;

nodo = record
dato: venta;
sig: lista;
end;

lista2 = ^nodo2;

nodo2 = record
dato: producto;
sig: lista2;
end;



sucursales = array[1..DimF] of lista;

//-------------------------------------
procedure Inicializar(var s: sucursales);
var i: integer;
begin

    for i:= 1 to DimF do s[i] := nil;

end;
//---------------------------------------

procedure CargarArreglo(var s: sucursales);
procedure InsertarOrdenado(var l: lista; v: venta);
var aux, act, ant : lista;
begin
new(aux);
aux^.dato := v;
aux^.sig := nil;

ant := l;
act := l;

while (act <> nil) and (v.codp > act^.dato.codp) do begin
ant := act;
act := act^.sig;
end;

if(ant = act) then l := aux
    else ant^.sig := aux;
    aux^.sig := act;
end;
//---

procedure CargarRegistro(var v: venta);
begin

readln(v.cod);

if(v.cod <> 0) then begin

readln(v.codp);
readln(v.fecha);
readln(v.cantidad);
end;

end;
//---
var v: venta;
begin

CargarRegistro(v);
while (v.cod <> 0) do begin
InsertarOrdenado(s[v.cod], v);
CargarRegistro(v);
end;

end;
//---------------------------------------
procedure LeerArreglo(s: sucursales);
var i: integer;
begin
writeln('------------');
for i:= 1 to DimF do begin

while (s[i] <> nil) do begin

writeln(s[i]^.dato.cod);
writeln(s[i]^.dato.codp);
writeln(s[i]^.dato.fecha);
writeln(s[i]^.dato.cantidad);
writeln;
s[i] := s[i]^.sig;
end;
writeln('------------');
end;

end;
//---------------------------------------

procedure Merge(s: sucursales; var l, ult: lista2);

procedure AgregarUltimo(var l: lista2; p: producto; var ult: lista2);
var aux: lista2;
begin

new(aux);

aux^.dato := p;
aux^.sig := nil;

if(l = nil) then l := aux
            else ult^.sig := aux;
            ult := aux;


end;

procedure Min(var s: sucursales; var cant: integer; var MinCod : integer);
var i, indexMin: integer;
begin
MinCod := 999;
indexMin:= -1;

for i:= 1 to DimF do begin

if(s[i] <> nil) then begin

if(s[i]^.dato.codp <= MinCod) then begin
indexMin := i;
MinCod := s[indexMin]^.dato.codp;
end;

end;

end;

if(indexMin <> -1) then begin
cant := s[indexMin]^.dato.cantidad;
s[indexMin] := s[indexMin]^.sig;
end;


end;
//---
var cant, act, total, MinCod: integer; p: producto;
begin

Min(s,cant, MinCod);
while (MinCod <> 999) do begin
total := 0;
act := MinCod;

while (MinCod <> 999) and (act = MinCod) do begin

total := total + cant;
Min(s,cant, MinCod);
end;
p.cod := act;
p.cantidad := total;

AgregarUltimo(l, p, ult);
end;

end;
//---------------------------------------

procedure LeerMerge(l: lista2);
begin

while (l <> nil) do begin

writeln('Cantidad de vendidos con el codigo de producto numero ', l^.dato.cod, ': ', l^.dato.cantidad);

writeln('-------------');
l := l^.sig;
end;

end;
//---------------------------------------

var 
s: sucursales; l, ult: lista2;
begin
ult := nil;
l := nil;
writeln;
Inicializar(s);
CargarArreglo(s);
//LeerArreglo(s);
Merge(s, l, ult);
LeerMerge(l);
end.
