Program AddNums(output);
   type
   venta = record
   cod:integer;
   fecha: integer;
   cant: integer;
   end;
   
   venta2 = record
   cod:integer;
   cant: integer;
   end;
   
   arbol = ^nodo;
   
   nodo = record
   dato: venta;
   HI: arbol;
   HD: arbol;
   end;
   
   arbol2 = ^nodo2;
   
   nodo2 = record
   dato: venta2;
   HI: arbol2;
   HD: arbol2;
   end;
  
   procedure CrearLista(var a: arbol);
   
   procedure Insertar(var a: arbol; v: venta);
   begin
       if(a = nil) then begin
        new(a);
        a^.dato := v;
        a^.HI := nil;
        a^.HD := nil;
       end
       else if(v.cod >= a^.dato.cod) then Insertar(a^.HD , v)
       else if(v.cod < a^.dato.cod) then Insertar(a^.HI , v)
   end;
   
   procedure CargarVenta(var v: venta);
   begin
   readln(v.cod);
   
   if(v.cod <> 0) then begin
   readln(v.fecha);
   readln(v.cant);
   end;
   
   end;
   
   var v: venta;
   begin
    a := nil;
    CargarVenta(v);
    while (v.cod <> 0) do begin
    Insertar(a, v);
    CargarVenta(v);
    end;
    
   end;
   
 
   
   procedure ImprimirLista(a:arbol);
   begin
    if(a <> nil) then begin
    ImprimirLista(a^.HI);
    writeln(a^.dato.cod);
    writeln(a^.dato.fecha);
    writeln(a^.dato.cant);
    writeln('---------');
    ImprimirLista(a^.HD);
    end;
   end;
   
   procedure ImprimirLista2(a:arbol2);
   begin

    if(a <> nil) then begin
    ImprimirLista2(a^.HI);
    writeln(a^.dato.cod);
    writeln(a^.dato.cant);
    writeln('---------');
    ImprimirLista2(a^.HD);
    end;
   end;
   
   procedure Insertar2(var b: arbol2; v: venta2);
   begin
       if(b = nil) then begin
        new(b);
        b^.dato := v;
        b^.HI := nil;
        b^.HD := nil;
       end
       else if(v.cod > b^.dato.cod) then Insertar2(b^.HD, v)
       else if(v.cod < b^.dato.cod) then Insertar2(b^.HI, v)
       else if(v.cod = b^.dato.cod) then b^.dato.cant := b^.dato.cant + v.cant;       
   end;
   
   
   
   procedure CargarSegundoArbol(var a: arbol;var b: arbol2);
   
   procedure SegundoArbol(var a: arbol; var b: arbol2);
   var data: venta2;
   begin
   
   if (a <> nil) then begin
   data.cod :=  a^.dato.cod;
   data.cant := a^.dato.cant;
   insertar2(b, data);
  
   SegundoArbol(a^.HD, b);
   SegundoArbol(a^.HI, b);
   end;
   
   end;
   begin
   SegundoArbol(a, b)
   end;

function CantCodigo(var a: arbol; cod: integer): integer;
begin

if(a = nil) then CantCodigo := 0 
    else if(a^.dato.cod = cod) then CantCodigo := a^.dato.cant + CantCodigo(a^.HD, cod)
         else if (cod > a^.dato.cod) then CantCodigo := CantCodigo(a^.HD, cod)
              else CantCodigo := CantCodigo(a^.HI, cod);
         
end;

function ImprimirCantidad(b: arbol2; cod: integer): integer;
begin

if(b <> nil) then

if(b^.dato.cod = cod) then ImprimirCantidad := b^.dato.cant
    else if (cod > b^.dato.cod) then ImprimirCantidad :=  ImprimirCantidad(b^.HD, cod)
              else ImprimirCantidad := ImprimirCantidad(b^.HI, cod)

end;
   
var a: arbol; b: arbol2;
begin
b:= nil;

CrearLista(a);
//ImprimirLista(a);

CargarSegundoArbol(a,b);
//ImprimirLista2(b);

//writeln(CantCodigo(a, 4)) //22
//writeln(ImprimirCantidad(b, 2));
end.
