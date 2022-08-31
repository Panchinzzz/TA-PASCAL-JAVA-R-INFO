Program Ej2;

type
lista = ^nodo;

nodo = record
dato: integer;
sig: lista;
end;

procedure CargarNumeros(var l: lista);
var n: integer; aux:lista;
begin
readln(n);
if(n <> 0) then begin
CargarNumeros(l);
new(aux);
aux^.dato := n;
aux^.sig:= l;
l := aux;
end else
l := nil;
end;

procedure LeerNumeros(l:lista);
begin
if(l <> nil) then begin
write(l^.dato, ' ');
LeerNumeros(l^.sig);
end;
end;

var
l: lista;
begin
l := nil;
CargarNumeros(l);
LeerNumeros(l)
end.
