Program Clase2MI;
const dimF = 5;
type vector = array [1..dimF] of char;
     lista = ^nodo;
     nodo = record
              dato: char;
              sig: lista;
            end;


procedure CargarVector (var v: vector; var dimL: integer);

  procedure CargarVectorRecursivo (var v: vector; var dimL: integer);
  var caracter: char;
  begin
    write ('Ingrese un caracter: ');
    readln(caracter);  
    if (caracter <> '.' ) and (dimL < dimF) 
    then begin
          dimL:= dimL + 1;
          v[dimL]:= caracter;
          CargarVectorRecursivo (v, dimL);
         end;
  end;
  
begin
  dimL:= 0;
  CargarVectorRecursivo (v, dimL);
end;
 
procedure ImprimirVector (v: vector; dimL: integer);
var
   i: integer;
begin
     for i:= 1 to dimL do
         write ('----');
     writeln;
     write (' ');
     for i:= 1 to dimL do begin
        write(v[i], ' | ');
     end;
     writeln;
     for i:= 1 to dimL do
         write ('----');
     writeln;
     writeln;
End;         

function ContarCaracteres(): integer;
var caracter: char;
Begin
  write ('Ingrese un caracter: ');
  readln(caracter);  
  if (caracter <> '.' )  
  then ContarCaracteres:= ContarCaracteres() + 1  
  else ContarCaracteres:=0  
End;
  

procedure CargarLista (var l: lista);
var caracter: char;
    nuevo: lista;
Begin
  write ('Ingrese un caracter: ');
  readln(caracter);  
  if (caracter <> '.' )  
  then begin
         CargarLista (l);
         new (nuevo);
         nuevo^.dato:= caracter;
         nuevo^.sig:= l;
         l:= nuevo;
       end
  else l:= nil
End;

procedure ImprimirListaMismoOrden (l: lista);
begin
  if (l<> nil) then begin
                      write (' ', l^.dato);
                      ImprimirListaMismoOrden (l^.sig);
                    end;
end;

procedure LeerVectorRecursivo(v: vector; DimL: integer);
procedure LeerRecursivo(v:vector;DimL:integer; var i:integer);
begin
if(i < DimL+1) then begin
writeln(v[i]);
i:= i+1;
LeerRecursivo(v, DimL, i);
end;

end;
var i:integer;
begin
i:=1;

LeerRecursivo(v,DimL,i);
end;

procedure ImprimirListaOrdenInverso (l: lista);
var letra: char;
begin
if(l <> nil)
then begin
ImprimirListaOrdenInverso(l^.sig);
write(' ',l^.dato);


end

end;


var cont, dimL: integer; l, newL: lista; v: vector;
Begin 
  //CargarVector (v, dimL);
  writeln;
 // if (dimL = 0) then writeln ('--- Vector sin elementos ---')
                //else begin
                       ImprimirVector (v, dimL);
                       {ImprimirVectorRecursivo (v, dimL);} 
                       //LeerVectorRecursivo(v, DimL);
                     //end;
                      //writeln;
  //writeln;                   
  //cont:= ContarCaracteres();
  writeln;
  writeln;
 // writeln('Se ingresaron ',cont,' caracteres'); 
  writeln;
  writeln;
  CargarLista (l);
  writeln;
  writeln;
  if (l = nil) then writeln ('--- Lista sin elementos ---')
               else Begin
                      writeln ('--- Orden ingresado ---');
                      writeln;
                      ImprimirListaMismoOrden (l);
                      writeln;
                      writeln;
                       writeln ('--- Orden inverso ---');
                      writeln;
                      ImprimirListaOrdenInverso (l); 
                    end;
  end.
