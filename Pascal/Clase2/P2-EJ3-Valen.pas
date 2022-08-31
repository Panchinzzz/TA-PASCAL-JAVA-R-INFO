program EJ3;

type
lista = ^nodo;

nodo = record
dato: integer;
sig: lista;
end;

procedure CargarNumerosRandom(var l: lista);
var n: integer; aux:lista;
begin


readln(n);
if(n <> 0) then begin
CargarNumerosRandom(l);
new(aux);
aux^.dato := n;
aux^.sig:= l;
l := aux;
end else
l := nil;
end;

procedure MinMax(l: lista; var Min, Max: integer);
begin 
if(l <> nil) then begin
if(l^.dato > Max) then Max := l^.dato;
if(l^.dato < Min) then Min := l^.dato;
MinMax(l^.sig, Min, Max);
end;
end;

procedure Pasar(l: lista; v: integer);
procedure EncontrarValor(l: lista; v: integer; var validacion: boolean);
begin

if(l <> nil) and (validacion = false) then begin
writeln(l^.dato, ' ', v);
if(l^.dato = v) then validacion := true;
EncontrarValor(l^.sig, v, validacion);
end;

end;
var validacion : boolean;
begin
    validacion := false;
    if(l = nil) then writeln(validacion)
    else begin
    EncontrarValor(l, v, validacion);
    writeln(validacion);
    end;
    
end;


var
l:lista; Min, Max: integer;
begin
Min:= 999;
Max:= 0;
CargarNumerosRandom(l);
//MinMax(l, Min, Max);
//writeln(Min);
//writeln(Max);
//Pasar(l, 4);
end.
