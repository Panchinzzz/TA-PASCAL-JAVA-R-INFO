program Clase1MI;
const dimF = 10;
type rango1 = 0..15;
     rango2 = 0..99;
     rango3 = 0..dimF;
     venta = record
				codigoP: rango1;
				cantidad: rango2;
			 end;
	 vector = array [1..dimF] of venta;
	 lista = ^nodo;
	 nodo = record
	          dato: venta;
	          sig: lista;
	        end;

procedure AlmacenarInformacion (var v: vector; var dimL: rango3);
  
  procedure LeerVenta (var v: venta);
  begin

    write ('Codigo de producto: ');
    v.codigoP:= 2;
    writeln (v.codigoP);
    write ('Ingrese cantidad (entre 1 y 99): ');
    readln (v.cantidad);
  end;

var unaVenta: venta;
begin
    dimL := 0;
    LeerVenta (unaVenta);
    writeln(unaVenta.cantidad);

    while (unaVenta.cantidad <> 0)  and ( dimL < dimF ) do 
    begin
    writeln('---------');
    writeln(unaVenta.cantidad = 0);
    writeln(unaVenta.cantidad);
    writeln('---------');
       dimL := dimL + 1;
       v[dimL]:= unaVenta;
       LeerVenta (unaVenta);
    end;
   
end;

procedure ImprimirVector (v: vector; dimL: rango3);
var
   i: integer;
begin
     write ('         -');
     for i:= 1 to dimL do
         write ('-----');
     writeln;
     write ('  Codigo:| ');
     for i:= 1 to dimL do begin
        if(v[i].codigoP <= 9)then
            write ('0');
        write(v[i].codigoP, ' | ');
     end;
     writeln;
     writeln;
     write ('Cantidad:| ');
     for i:= 1 to dimL do begin
        if (v[i].cantidad <= 9)then
            write ('0');
        write(v[i].cantidad, ' | ');
     end;
     writeln;
     write ('         -');
     for i:= 1 to dimL do
         write ('-----');
     writeln;
     writeln;
End;

procedure Ordenar (var v: vector; dimL: rango3);

var i, j, pos: rango3; item: venta;	
		
begin
 for i:= 1 to dimL - 1 do 
 begin {busca el mínimo y guarda en pos la posición}
   pos := i;
   for j := i+1 to dimL do 
        if (v[j].cantidad < v[pos].cantidad) then pos:=j;

   {intercambia v[i] y v[pos]}
   item := v[pos];   
   v[pos] := v[i];   
   v[i] := item;
 end;
end;
procedure Eliminar (var v: vector; var DimL: rango3; valorInferior, valorSuperior: rango1);

  function BuscarPosicion (v: vector; dimL: rango3; elemABuscar: rango1): rango3;
  var pos: rango3;
  begin
    pos:= 1;
    while (pos <= dimL) and (elemABuscar > v[pos].cantidad) do
       pos:= pos + 1;
    if (pos > dimL) then BuscarPosicion:= 0
                    else BuscarPosicion:= pos;
  end;
  
  function BuscarPosicionDesde (v: vector; dimL, pos : integer; elemABuscar: rango1): rango3;
  begin
    while (pos <= dimL) and (elemABuscar >= v[pos].cantidad) do
       pos:= pos + 1;
    if (pos > dimL) then BuscarPosicionDesde:= dimL
                    else BuscarPosicionDesde:= pos - 1;
  end;
  
   procedure Corrimiento (var v: vector; posSuperior: rango3; posInferior: rango3; var DimL: rango3);
           var 
            c, diferencia, desplazo, cantElim, i: rango3;
            begin
    		   c:= 1;
               desplazo:= DimL - posSuperior;
               diferencia := posInferior + desplazo;
               cantElim := posSuperior - posInferior + 1;
               
               if desplazo <> 0 then 
               begin
                   for i:= posInferior to diferencia do begin
                       v[i] := v[posSuperior+c];
                       c:= c+1;
                   end;
               end;
                DimL:= DimL - cantElim;

            end;

var posInferior, posSuperior: rango3;
begin
  posInferior:= BuscarPosicion (v, dimL, valorInferior);
 
  if (posInferior <> 0) then begin
         posSuperior:= BuscarPosicionDesde (v, dimL, posInferior, valorSuperior);
         {Escribir el código correspondiente para hacer el corrimiento y disminuir la dimensión lógica}
         Corrimiento(v, posSuperior, posInferior, DimL);
       end;
end;

procedure AgregarAtras(var L, ult: lista; v:venta);
var nue: lista;
begin

 new (nue);
 nue^.dato:= v;
 nue^.sig := NIL;
 if l <> Nil then
    ult^.sig := nue
 else
     l := nue;
 ult := nue;

end;

procedure ListaPar(var L, ult: lista; v: vector; DimL: rango3);
var
i: rango3;
nue: lista;
begin
new(nue);
    for i:= 1 to DimL do begin
    
        if(v[i].cantidad mod 2 = 0) then begin
         
         AgregarAtras(L, ult, v[i]);
         
        end;
        end;
        
end;

procedure LeerLista(L: lista);
begin
   while l <> nil do begin
  writeln(L^.dato.cantidad);
  l:= L^.sig
end;
end;


var v: vector;
    dimL: rango3;
    valorInferior, valorSuperior: rango1;
    L,ult: lista; 
    
Begin
  L := nil;

  AlmacenarInformacion (v, dimL);
  writeln;
  if (dimL = 0) then writeln ('--- Vector sin elementos ---')
                else begin
                       writeln ('--- Vector ingresado --->');
                       writeln;
                       ImprimirVector (v, dimL);
                       writeln;
                       writeln ('--- Vector ordenado --->');
                       writeln;
                       Ordenar (v, dimL);
                       ImprimirVector (v, dimL);
                        writeln ('--- lista ordenada por par --->');
                        writeln;
                       ListaPar(L, ult, v, DimL);
                       LeerLista(L);
                       write ('Ingrese valor inferior: ');
                       readln (valorInferior);
                       writeln;
                       write ('Ingrese valor superior: ');
                       readln (valorSuperior);
                       writeln;
                       Eliminar (v, dimL, valorInferior, valorSuperior);
                        write ('eliminado xd: ');
                        writeln;
                       ImprimirVector(v, DimL);
                      end;
                       
end.
