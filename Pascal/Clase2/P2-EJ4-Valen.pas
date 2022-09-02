Program AddNums(output);
const
DimF = 20;
   type
   arreglo = array[1..DimF] of integer;
   
   procedure Inicializar(var a: arreglo);
   procedure CargarVector(var a: arreglo; var i: integer);
   begin
   if(i <= 20) then begin
   a[i] := random(10)+1;
   i:= i + 1;
   CargarVector(a, i);
   end;
   end;
   
   var i : integer;
   begin
   randomize;
   i:= 1;
   CargarVector(a,i);
   
   end;
   
   procedure LeerArreglo(a:arreglo);
   procedure Recorrer(a: arreglo; i: integer);
   begin
   if(i <= 20)then begin
   writeln('Numero cargado en la posicion ', i, ': ', a[i]);
   i:= i + 1;
   Recorrer(a, i);
   end;
   end;
   var i : integer;
   begin
   i := 1;
   Recorrer(a, i);
   end;
   
   function Max(a: arreglo): integer;
   procedure Recorrer(a: arreglo; i: integer; var Maximo: integer);
   begin
   
   if(i <= 20)then begin
   Recorrer(a, i+1, Maximo);
   if(a[i] > Maximo) then Maximo := a[i];
   end;
   
   end;
   var i, Maximo: integer;
   begin
   i:= 1;
   Maximo:= 0;
   Recorrer(a, i, Maximo);
   Max := Maximo;
   end;
   
   function Suma(a: arreglo): integer;
   procedure Recorrer(a: arreglo; i: integer; var total: integer);
   begin
    if(i <= 20)then begin
   Recorrer(a, i+1, total);
   total := total + a[i];
   end;
   end;
   
   var i, total: integer;
   begin
   i:=1;
   total:=0;
   Recorrer(a,i,total); 
   Suma := total;
   end;

   var a :arreglo;
begin
    Inicializar(a);
    LeerArreglo(a);
    //writeln(Max(a));
   //writeln(Suma(a));
end.
