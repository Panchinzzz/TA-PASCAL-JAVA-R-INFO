Program EJ3;
const CantGeneros = 8;

type

pelicula = record
cod: integer;
codgenero: integer;
prom: integer;
end;

genero = ^nodo;
	 nodo = record
	          dato: pelicula;
	          sig: genero;
	        end;

catalogo = array [1..CantGeneros] of genero;
promedios = array [1..CantGeneros] of integer;

procedure LeerArreglo2(prom: promedios);
var
i: integer;
begin
 for i:= 1 to cantGeneros do begin
    writeln('--------------------- ');
    writeln('COD del Mayor promedio del genero numero: ', i);
    writeln(prom[i]);
    writeln('--------------------- ');
 
 end;

end;

procedure LeerArreglo(c: genero);

begin

while c <> nil do begin
writeln('--------------------- ');
writeln(c^.dato.cod);
writeln(c^.dato.codgenero);
writeln(c^.dato.prom);
writeln('--------------------- ');
c:= c^.sig;
end;

end;


Procedure CrearListaAgregarAdelante (var genero:genero; pelicula:pelicula);
Var nue:genero;
begin
     New(nue);
     nue^.dato:=pelicula;
     nue^.sig:=genero;
     genero:=nue;
end;

procedure InicializarArr(var proms: promedios);
var
i: integer;
begin
for i:= 1 to cantGeneros do begin
proms[i] := 0;
end;
end;

procedure InicializarArrList(var c: catalogo);
var
i: integer;
begin
 for i:=1 to CantGeneros do begin
    c[i] := nil
 end;
end;

procedure CargarVector(var c: catalogo);

procedure CargarPelicula(var p: pelicula);
begin
readln(p.cod);
if p.cod <> -1 then begin
readln(p.codgenero);
readln(p.prom);
end;
end;

var
p: pelicula;

begin
 CargarPelicula(p);
 while p.cod <> -1 do begin
 CrearListaAgregarAdelante(c[p.codGenero], p);
 CargarPelicula(p);
 end;
 
end;

procedure CargarPromedios(var proms: promedios; c: catalogo);


function MejorPromedio (g: genero): integer;
var max, codMax: integer;
begin
max := 0;
if g = nil then MejorPromedio := 0;
while g <> nil do begin
if(g^.dato.prom > max) then begin
max := g^.dato.prom;
codMax := g^.dato.cod;
end;

g := g^.sig;
end;
MejorPromedio := codMax;
end;

var
i:integer;
begin

for i:= 1 to cantGeneros do begin
writeln('z');

proms[i] := MejorPromedio(c[i]);

end;

end;

procedure MinMax (c: catalogo; var CodMin, CodMax : integer);

procedure Pasada(g: genero; var Min, CodMin, Max, CodMax: integer);
begin

while g <> nil do begin
if(g^.dato.prom > max) then begin
max := g^.dato.prom;
codMax := g^.dato.cod;
end;
if(g^.dato.prom < min) then begin
min := g^.dato.prom;
codMin := g^.dato.cod;
end;

g := g^.sig;
end;
end;

var
Min, Max, i: integer;
begin
Min:= 999;
Max := 0;

for i:= 1 to cantGeneros do begin

Pasada(c[i], Min, CodMin, Max, CodMax);

end;


end;

var
i: integer;
c: catalogo;
proms: promedios;
CodMin, CodMax: integer;

begin

InicializarArrList(c);
CargarVector(c);
for i:= 1 to cantGeneros do begin
//LeerArreglo(c[i]);
end;
InicializarArr(proms);
CargarPromedios(proms, c);
LeerArreglo2(proms);
MinMax(c,CodMin, CodMax);
writeln(CodMin);
writeln(CodMax);
end.
