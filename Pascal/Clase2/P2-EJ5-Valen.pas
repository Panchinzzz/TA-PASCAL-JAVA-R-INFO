Program AddNums(output);
type
arr = array[1..10] of integer;

{function Buscar(N:arr;ini,fin, dato:integer):integer;
var
cen:integer;
control:boolean;
begin
control:=TRUE;
// writeln('INI_FIN :',ini,' - ',fin);delay(500);
While control AND (ini<=fin) DO BEGIN
cen:=(ini+fin) div 2;
if (N[cen]=dato) then begin
Buscar:=dato;
control:=false;
end else begin
if (dato<N[cen]) then begin Buscar:=Buscar(N,ini,cen-1, dato);
end else begin Buscar:=Buscar(N,cen+1,fin, dato);
end;
end;
end;
end;
}

procedure Buscar(a: arr; ini,fin, dato: integer; var pos : integer);
var mid: integer; control: boolean;
begin
control := true;

if(ini <= fin) then begin 

writeln('Inicio: ', ini);
mid := (ini+fin) div 2;
writeln('Medio: ', mid);
writeln('Fin: ',  fin);
writeln('--------');
if a[mid] = dato then pos := mid;

if(dato < a[mid])then Buscar(a, ini, mid-1, dato, pos)
                 else if(dato > a[mid]) then Buscar(a, mid+1,fin, dato, pos);

end;
end;

procedure Inicializar(var a:arr);
var i,n : integer;
begin
readln(n);
for i:= 1 to 10 do begin 
a[i] := n;
readln(n);
end;

for i:= 1 to 10 do begin 
writeln(a[i]); 
end;

end;

var a: arr; pos: integer;
begin
pos := -1;
Inicializar(a);
writeln;
Buscar(a, 1, 10, 6, pos);
writeln(pos);
end.
