Program GoToPromo2;
const
DimF = 8;
type

auto = record
patente: integer;
anio: integer;
marca: char;
modelo: integer;
end;

arbol = ^nodo;

nodo = record
dato: auto;
HI: arbol;
HD: arbol;
end;

lista = ^nodolista;

nodolista = record
dato: auto;
sig : lista;
end;

todos = array[1..8] of lista;
//------------------------------------------
procedure CargarArbol(var a: arbol);
procedure CargarRegistro(var a: auto);
begin
readln(a.patente);
if(a.patente <> 0) then begin
readln(a.anio);
readln(a.marca);
readln(a.modelo);
end;
end;
//---
procedure InsertarNodo(var a: arbol; car: auto);
begin

if(a = nil) then begin

new(a);
a^.dato := car;

a^.HI := nil;
a^.HD := nil;

end
else if(car.patente >= a^.dato.patente) then InsertarNodo(a^.HD, car)
                                        else InsertarNodo(a^.HI, car);

end;
//---
var car: auto;
begin
a := nil;

CargarRegistro(car);
while car.patente <> 0 do begin
InsertarNodo(a, car);
CargarRegistro(car);
end;

end;
//------------------------------------------
 procedure LeerArbol(a:arbol);
   begin
    if(a <> nil) then begin
    LeerArbol(a^.HI);
    writeln(a^.dato.patente);
    writeln(a^.dato.anio);
    writeln(a^.dato.marca);
     writeln(a^.dato.modelo);
    writeln('---------');
    LeerArbol(a^.HD);
    end;
   end;
//------------------------------------------
function CantidadMarca(a: arbol; dato: char): integer;
begin
if(a = nil) then CantidadMarca := 0
            else if(a^.dato.marca = dato) then CantidadMarca := 1 + CantidadMarca(a^.HI,dato) + CantidadMarca(a^.HD,dato)
                 else CantidadMarca := CantidadMarca(a^.HI,dato) + CantidadMarca(a^.HD,dato)


end;

//------------------------------------------

Procedure Inicializar(var t: todos);
var i: integer;
begin

for i:= 1 to DimF do t[i] := nil;

end;

//------------------------------------------
procedure LeerArreglo(t: todos);
var i: integer;
begin

for i := 1 to DimF do begin

while (t[i] <> nil) do begin
writeln;
writeln(t[i]^.dato.patente);
writeln(t[i]^.dato.anio);
writeln(t[i]^.dato.marca);
writeln(t[i]^.dato.modelo); 

t[i] := t[i]^.sig;
end;
writeln('-----------------');
end;

end;

//------------------------------------------
procedure CargarArreglo(a: arbol; var t: todos);
procedure Insertar(var l: lista; elem: auto);
var aux : lista;
begin
new(aux);
aux^.dato := elem;

if(l = nil) then l := aux
            else begin
            aux^.sig := l;
            l := aux;
            end;

end;
//---
begin

if(a <> nil) then begin
CargarArreglo(a^.HI, t);

Insertar(t[a^.dato.anio], a^.dato);

CargarArreglo(a^.HD, t);
end;
end;
//------------------------------------------
function BuscarPatente(a: arbol; dato: integer): integer;
begin
if(a = nil) then BuscarPatente := 0
            else if (a^.dato.patente = dato) then BuscarPatente := a^.dato.anio
                 else if (dato > a^.dato.patente) then BuscarPatente := BuscarPatente(a^.HD, dato)
                      else if (dato < a^.dato.patente) then  BuscarPatente := BuscarPatente(a^.HI, dato);
end;
//------------------------------------------
var a: arbol;t: todos;
begin
CargarArbol(a);
LeerArbol(a);
//writeln(CantidadMarca(a, 'c'));
Inicializar(t);
CargarArreglo(a,t);
//LeerArreglo(t);
writeln(BuscarPatente(a, 2))
end.
