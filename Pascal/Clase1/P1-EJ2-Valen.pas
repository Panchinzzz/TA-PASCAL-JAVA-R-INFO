rogram P1EJ1;
CONST DimF = 6;

type
    oficina = record
        ID: integer;
        DNI: integer;
        Valor: integer;
        end;

edificio = array[1..DimF] of oficina;

procedure CargarVector(var e: edificio;var DimL: integer);

procedure LeerOficina(var o: oficina);
begin 
writeln('----------------');
writeln('Inserte ID: ');
readln(o.ID);

if(o.ID <> -1) then begin
writeln('Inserte DNI: ');
readln(o.DNI);
writeln('Inserte Valor: ');
readln(o.Valor);
writeln('----------------');
end;
end;

var
i: integer;
o: oficina;
begin
DimL := 0;
i := 1;

LeerOficina(o);
while (o.ID <> -1) and (DimL < DimF) do begin
e[i] := o;
i := i+1;
DimL := DimL + 1;
LeerOficina(o);
end;
end;

procedure LeerVector(e: edificio; DimL: integer);

var
i: integer;

begin



for i:= 1 to DimL do begin
writeln('----------------');
writeln('Oficina numero: ', i);
writeln(e[i].ID);
writeln(e[i].DNI);
writeln(e[i].Valor);
writeln('----------------');
end;

end;

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

procedure OrdenarSeleccion (var e: edificio; DimL: integer);
var i, j, p: integer; item: oficina;
begin

for i := 1 to DimL-1 do begin
p:= i;
for j := i+1 to DimL do

if(e[j].ID < e[p].ID) then p:= j;

item := e[p];
e[p] := e[i];
e[i] := item;

end;
end;



var
DimL: integer;
e: edificio;

begin
CargarVector(e, DimL);
LeerVector(e, DimL);
//OrdenarInserccion(e, DimL);
//OrdenarSeleccion(e, DimL);
LeerVector(e, DimL);
end.
