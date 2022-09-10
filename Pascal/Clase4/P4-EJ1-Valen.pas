Program AddNums(output);
const
DimF = 4;
type

prestamo = record
id: integer;
cod: integer;
dia: integer;
mes: integer;
cant: integer;
end;

ISBN = record
id: integer;
cant: integer;
end;

lista = ^nodo;

nodo = record
dato: prestamo;
sig: lista;
end;

lista2 = ^nodo2;

nodo2 = record
dato: ISBN;
sig: lista2;
end;

meses = array[1..DimF] of lista;
//---------------------------------------------------------
procedure Inicializar(var m: meses);
var i: integer;
begin

for i:= 1 to DimF do m[i] := nil;

end;
//---------------------------------------------------------
procedure CargarArreglo(var m: meses);
procedure CargarLista(var l: lista; p: prestamo);
var aux, ant, act : lista;
begin
new(aux);

aux^.dato := p;

ant := l;
act := l;

while (act <> nil) and (p.id > act^.dato.id) do begin
ant := act;
act := act^.sig;
end;

if (ant = act) then l := aux
               else ant^.sig := aux;
               aux^.sig := act;

end;
//---
procedure CargarRegistro(var p: prestamo);
begin

readln(p.id);

if (p.id <> -1) then begin

readln(p.cod);
readln(p.dia);
readln(p.mes);
readln(p.cant);

end;

end;
//---
var p: prestamo;
begin

CargarRegistro(p);

while (p.id <> -1) do begin

CargarLista(m[p.mes], p);
CargarRegistro(p);

end;

end;
//---------------------------------------------------------
procedure LeerArreglo(m: meses);
var i: integer;
begin

writeln;

for i:=1 to DimF do begin

if(m[i] <> nil) then writeln('Prestamos de un libro en el mes: ',m[i]^.dato.mes);

while (m[i] <> nil) do begin

writeln;

writeln('id: ',m[i]^.dato.id);
writeln(m[i]^.dato.cod);
writeln(m[i]^.dato.dia);
writeln(m[i]^.dato.cant);

m[i] := m[i]^.sig;
end;
writeln('-----------------');
end;

end;
//---------------------------------------------------------
procedure MostrarRecursivo(m: meses);
procedure Recursivo(var m: meses; var act: integer);
var i: integer;
begin

writeln;

for i:=1 to DimF do begin

if (m[i] <> nil) and (act <> m[i]^.dato.mes) then begin
writeln('-----------------');
act := m[i]^.dato.mes;

writeln('Datos del mes: ', act);
end;

while (m[i] <> nil) do begin

writeln;

writeln('id: ',m[i]^.dato.id);
writeln('cod: ',m[i]^.dato.cod);

m[i] := m[i]^.sig;
Recursivo(m, act);
end;

end;
end;
//---
var act : integer;
begin
act := 999;

Recursivo(m, act);

end;
//---------------------------------------------------------
procedure Merge(m: meses; var l, ult: lista);
procedure AgregarAdelante(var l, ult: lista; p: prestamo);
var aux: lista;
begin

new(aux);
aux^.dato := p;

if(l = nil) then l := aux
            else ult^.sig := aux;
            ult := aux;
end;


//---
procedure Min(var m: meses; var p: prestamo);
var i, MinIndex: integer;
begin
p.id := 999;
MinIndex := -1;

for i:= 1 to DimF do begin

if (m[i] <> nil) then begin

if (m[i]^.dato.id <= p.id) then begin

p.id := m[i]^.dato.id;
MinIndex := i;

end;
end;
end;


if(MinIndex <> -1) then begin
p := m[MinIndex]^.dato;
m[MinIndex] := m[MinIndex]^.sig; 
end;

end;
//---
var p: prestamo;
begin

Min(m, p);

while (p.id <> 999) do begin
AgregarAdelante(l, ult, p);
Min(m, p);

end;

end;
//---------------------------------------------------------
procedure LeerLista(l: lista);
begin
writeln;
if (l <> nil) then begin

writeln('id: ',l^.dato.id);
writeln('cod: ',l^.dato.cod);


writeln('---------------------');
LeerLista(l^.sig);
end;
end;
//---------------------------------------------------------
procedure Merge2(m: meses;var l, ult: lista2);
procedure AgregarAtras(var l, ult: lista2; act, cantidad: integer);
var aux: lista2;
begin



new(aux);
aux^.dato.id := act;
aux^.dato.cant := cantidad;

if(l = nil) then l := aux
            else ult^.sig := aux;
            ult := aux;
end;
procedure Min(var m: meses; var ISBN: ISBN);
var i, MinIndex : integer;
begin

ISBN.id := 999;
MinIndex := -1;

for i:= 1 to DimF do begin

if(m[i] <> nil) then begin

if(m[i]^.dato.id <= ISBN.id) then begin
MinIndex := i;
ISBN.id := m[i]^.dato.id
end;

end;

end;

if(MinIndex <> -1) then begin
ISBN.id := M[MinIndex]^.dato.id;
ISBN.cant := M[MinIndex]^.dato.cant;
m[MinIndex] := m[MinIndex]^.sig;
end;
end;
//---
var ISB: ISBN; act, cantidad: integer; 
begin

Min(m,ISB);


While (ISB.id <> 999) do begin
act := ISB.id;
cantidad := 0;

while (ISB.id <> 999) and (act = ISB.id) do begin

cantidad := cantidad + ISB.cant;

Min(m,ISB);
end;

AgregarAtras(l, ult, act, cantidad);
end;


end;
//---------------------------------------------------------
procedure LeerLista2(l: lista2);
begin
writeln;
if (l <> nil) then begin

writeln('id: ',l^.dato.id);
writeln('can: ',l^.dato.cant);


writeln('---------------------');
LeerLista2(l^.sig);
end;
end;

//---------------------------------------------------------
var m: meses; l, ult: lista; l2, ult2 : lista2;
begin
l := nil;
ult := nil;
l2 := nil;
ult := nil;
Inicializar(m);
CargarArreglo(m);
//LeerArreglo(m);
//MostrarRecursivo(m);
Merge(m, l, ult);
//LeerLista(l);
Merge2(m, l2, ult2);
LeerLista2(l2);
end.
