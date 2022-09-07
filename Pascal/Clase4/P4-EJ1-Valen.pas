Program AddNums(output);
const
Gen = 8;
type

Pelicula = record
cod: integer;
genero: 1..Gen;
prom: integer;
end;

lista = ^nodo;

nodo = record
dato: Pelicula;
sig: lista;
end;

Catalogo = array[1..Gen] of lista;

OBJ = record
Pri: catalogo;
Ult: catalogo;
end;

procedure Inicializar(var O: OBJ);
var i: integer;
begin
for i:= 1 to Gen do begin
O.pri[i] := nil;
O.ult[i] := nil;
end;
end;


procedure CargarArreglo(var O: OBJ);

{procedure AgregarAtras(var l:lista; var ult: lista; p: pelicula);
var aux : lista;
begin
new(aux);
aux^.dato := p;
aux^.sig := nil;

if(l = nil) then l := aux
 else ult^.sig := aux;
 
ult := aux;

end;
}

procedure AgregarOrdenado(var l:lista; p: pelicula);
var aux, act, ant : lista;
begin
new(aux);
aux^.dato := p;
aux^.sig := nil;

ant := l;
act := l;

while (act <> nil) and (p.cod > l^.dato.cod) do begin
ant := act;
act := act^.sig;
end;

if(ant = act) then l := aux
    else ant^.sig := aux;
    aux^.sig := act;
end;

procedure CargarRegistro(var p: pelicula);
begin
readln(p.cod);
if (p.cod <> -1) then begin
readln(p.genero);
readln(p.prom);
end;
end;

var p: pelicula;
begin
CargarRegistro(p);

while (p.cod <> -1) do begin
//AgregarAtras(O.pri[p.genero], O.ult[p.genero], p);
AgregarOrdenado(O.pri[p.genero], p);
CargarRegistro(p);
end;

end;

procedure LeerArreglo(c: catalogo);
var i : integer;
begin

for i:= 1 to Gen do begin

while (c[i] <> nil) do begin
writeln(c[i]^.dato.cod);
writeln(c[i]^.dato.genero);
writeln(c[i]^.dato.prom);
writeln;

c[i] :=c[i]^.sig;
end;
writeln('-------------');
end;

end;

var O: OBJ;
begin
Inicializar(O);
CargarArreglo(O);
writeln;
LeerArreglo(o.Pri)
end.
