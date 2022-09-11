Program AddNums(output);
 const
 DimF = 3;
type 
rubro = 1..DimF;

producto = record

cod: integer;
rubro: rubro;
stock: integer;
precio: integer;

end;

arbol = ^nodo;

nodo = record
dato: producto;
HI: arbol;
HD: arbol;
end;

todos = array[1..DimF] of arbol;

//----------------------------------------
procedure CargarProducto(var p: producto);
begin

readln(p.cod);

if (p.cod <> -1) then begin

readln(p.rubro);
readln(p.stock);
readln(p.precio);

end;

end;

//----------------------------------------
procedure InsertarArreglo(var a: arbol; p: producto);
begin

if(a = nil) then begin
new(a);

a^.dato := p;
a^.HI := nil;
a^.HD := nil;
end
else if(p.cod >= a^.dato.cod) then InsertarArreglo(a^.HD, p)
                              else InsertarArreglo(a^.HI, p);

end;

//----------------------------------------
procedure InicializarArreglo(var t: todos);
var i: integer;
begin

for i:= 1 to DimF do t[i] := nil;

end;
//----------------------------------------
Procedure CargarArreglo(var t: todos);
var p: producto;
begin

InicializarArreglo(t);

CargarProducto(p);
while p.cod <> -1 do begin
InsertarArreglo(t[p.rubro], p);

CargarProducto(p);
end;
end;
//----------------------------------------
procedure LeerArreglo(t:todos);
procedure LeerArbol(a: arbol);
begin

if(a <> nil) then begin
LeerArbol(a^.HI);

writeln(a^.dato.cod);
writeln(a^.dato.rubro);
writeln(a^.dato.stock);
writeln(a^.dato.precio);

writeln;
LeerArbol(a^.HD);
end;
end;
//--
var i: integer;
begin

for i:= 1 to DimF do begin 
if(t[i] <> nil) then writeln('Productos del rubro: ', t[i]^.dato.rubro);
writeln;
LeerArbol(t[i]);
writeln('---------------');
end;

end;
//----------------------------------------
function BuscarArbol(a: arbol; dato: integer): boolean;
begin

if(a = nil) then BuscarArbol := false
            else if (a ^.dato.cod = dato) then BuscarArbol := true
                 else BuscarArbol := BuscarArbol(a ^.HI, dato) or BuscarArbol(a ^.HD, dato);

end;
//----------------------------------------
procedure Max(a: arbol);
begin

if(a = nil) then writeln(0)
            else if (a^.HD = nil) then begin
            writeln(a^.dato.cod);
            writeln(a^.dato.stock);
            end
            else Max(a^.HD);
end;
//----------------------------------------
procedure Maximos(t: todos);
var i: integer;
begin
writeln;
for i:= 1 to DimF do begin
writeln('Maximo del rubro: ', t[i]^.dato.rubro);

Max(t[i]);
writeln('------------------');

end;

end;
//----------------------------------------
function Cantidad(a: arbol; c,d: integer): integer;
begin
if(a = nil) then Cantidad := 0
            else if (a^.dato.cod >= c) and (a^.dato.cod <= d) then Cantidad := 1 + Cantidad(a^.HI, c, d) + Cantidad(a^.HD, c, d)
                 else Cantidad := Cantidad(a^.HI, c, d) + Cantidad(a^.HD, c, d);


end;
//----------------------------------------
procedure Cantidades(t: todos; a, b: integer);
var i: integer;
begin
writeln;
for i:= 1 to DimF do begin

writeln('Cantidad de productos con codigos entre ', a, ' y ', b, ' en el rubro: ', t[i]^.dato.rubro);
writeln(Cantidad(t[i], a, b));

writeln('-------------------------');
end;

end;
//----------------------------------------
var t: todos; r : rubro;
begin
writeln;
CargarArreglo(t);
LeerArreglo(t);
//readln(r);
//writeln(BuscarArbol(t[r], 1));
//Maximos(t);
Cantidades(t, 4, 10);
end.
