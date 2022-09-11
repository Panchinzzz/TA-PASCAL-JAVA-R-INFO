Program GoPromocion1;
const

DimF = 5;

type

oficina = record
id: integer;
dni: integer;
costo: integer;
end;

edificio = array[1..DimF] of oficina;
//------------------------------------------------
procedure CargarArreglo(var e: edificio; var DimL: integer);
procedure CargarRegistro(var o: oficina);
begin

readln(o.id);
if(o.id <> -1) then begin
readln(o.dni);
readln(o.costo);
end;

end;
//---
var o: oficina;
begin
DimL := 0;
CargarRegistro(o);
while (o.id <> -1) and (DimL < DimF) do begin
DimL := DimL + 1;

e[DimL] := o;
CargarRegistro(o);
end;

end;
//------------------------------------------------
procedure LeerArreglo(e: edificio; DimL: integer);
begin

if(DimL > 1) then LeerArreglo(e, DimL-1);
writeln;
Writeln(e[DimL].id);
Writeln(e[DimL].dni);
Writeln(e[DimL].costo);

writeln('-----------------');

end;
//------------------------------------------------
procedure OrdenarInserccion(var e: edificio; DimL: integer);

var 
i, j : integer;
actual : oficina;

begin

for i := 2 to DimL do begin

actual := e[i];
j:= i-1;

while(j > 0) and (e[j].ID > actual.ID) do begin 

e[j+1] := e[j];
j := j-1;

end;
e[j+1] := actual;
end;

end;
//------------------------------------------------
Procedure busquedaDicotomica (e: edificio; ini,fin: integer; dato:integer; var pos: integer); 
var mid: integer;
begin
pos := -1;
if(ini <= fin) then begin
mid := (ini + fin) div 2;

if(e[mid].id = dato) then pos := mid
                  else if(dato > e[mid].id) then BusquedaDicotomica(e, mid+1, fin, dato, pos)
                       else BusquedaDicotomica(e, ini, mid-1, dato, pos);


end;

end;
//------------------------------------------------
function Expensas(e: edificio; DimL: integer) : integer;
begin

if(DimL > 1) then Expensas := e[DimL].costo + Expensas(e, DimL-1)
             else Expensas := e[DimL].costo;


end;
//------------------------------------------------
var e: edificio; DimL, pos: integer;
begin
CargarArreglo(e, DimL);
LeerArreglo(e, DimL);
OrdenarInserccion(e, DimL);
//writeln('CORTE CHILENO');
//LeerArreglo(e, DimL);
BusquedaDicotomica(e, 1, DimL, 9, pos);
//writeln(pos);
writeln(Expensas(e, DimL));
end.
