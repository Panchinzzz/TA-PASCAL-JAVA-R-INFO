program Ej3;

type
alumno = record
legajo: integer;
DNI: integer;
Ano: integer;
end;

arbol = ^nodoArbol;

nodoArbol = record
dato: alumno;
HI: arbol;
HD: arbol;
end;

procedure CrearArbol(var a: arbol);
procedure CargarAlumno(var a: alumno);
begin
readln(a.legajo);
readln(a.DNI);
readln(a.Ano);
end;

procedure Insertar(var a: arbol; al: alumno);
   begin
       if(a = nil) then begin
        new(a);
        a^.dato := al;
        a^.HI := nil;
        a^.HD := nil;
       end
       else if(al.legajo >= a^.dato.legajo) then Insertar(a^.HD , al)
       else if(al.legajo < a^.dato.legajo) then Insertar(a^.HI , al)
   end;

var al: alumno;
begin
CargarAlumno(al);
while (al.Ano > 2010) do begin
Insertar(a, al);
CargarAlumno(al)
end;
end;

procedure LeerArbol(a: arbol);
begin

if(a <> nil) then begin
LeerArbol(a^.HI);

writeln(a^.dato.legajo);
writeln(a^.dato.DNI);
writeln(a^.dato.Ano);


LeerArbol(a^.HD);
end;
end;

procedure MenorA(a:arbol; n: integer);
procedure LeerArbol(a: arbol);
begin
writeln(a^.dato.DNI);
writeln(a^.dato.Ano);
end;

begin

if(a <> nil) then begin

if(a^.dato.legajo < n) then begin 
LeerArbol(a);
MenorA(a^.HI,n);
MenorA(a^.HD,n);
end;
end;
end;

procedure Entre(a:arbol; b,c: integer);
procedure LeerArbol(a: arbol);
begin
writeln(a^.dato.DNI);
writeln(a^.dato.Ano);
end;

begin
if(a<> nil) then begin

if(a^.dato.legajo > b) and (a^.dato.legajo < c) then begin
LeerArbol(a);
Entre(a^.HI, b, c);
Entre(a^.HD, b, c);
end
    else if (a^.dato.legajo <= b) then Entre(a^.HD, b, c)
         else Entre(a^.HI, b, c);

end;
end;


function Impar(a: arbol): integer;
begin
if(a = nil) then Impar := 0
else begin
if(a^.dato.legajo mod 2 = 1) then  Impar := 1 + Impar(a^.HD) + Impar(a^.HI)
    else begin
    Impar := Impar(a^.HD) +Impar(a^.HI);
    end;

end;
end;

function Max2(a: arbol): integer;
begin
if(a = nil) then Max2 := 0
else begin
if((a^.dato.ano > Max2(a^.HD)) and (a^.dato.ano > Max2(a^.HI))) then  Max2 := a^.dato.ano
    else begin
    Max2 := Max2(a^.HD) + Max2(a^.HI);
    end;

end;
end;

var a: arbol;
begin
a := nil;
CrearArbol(a);
LeerArbol(a);
writeln('---------');
//MenorA(a, 16);
//Entre(a, 1, 15);
//writeln(Impar(a));
//writeln(Max2(a));
end.
