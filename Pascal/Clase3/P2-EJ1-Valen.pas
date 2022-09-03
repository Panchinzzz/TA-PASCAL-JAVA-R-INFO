Program ImperativoClase3;

type rangoEdad = 12..100;
     cadena15 = string [15];
     socio = record
               numero: integer;
               nombre: cadena15;
               edad: rangoEdad;
             end;
     arbol = ^nodoArbol;
     nodoArbol = record
                    dato: socio;
                    HI: arbol;
                    HD: arbol;
                 end;
     
procedure GenerarArbol (var a: arbol);
{ Implemente un modulo que lea informacion de socios de un club y las almacene en un arbol binario de busqueda. De cada socio se lee numero de socio, 
nombre y edad. La lectura finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. }

  Procedure LeerSocio (var s: socio);
  begin
    //write ('Ingrese numero del socio: ');
    readln (s.numero);
    If (s.numero <> 0)
    then begin
      //     write ('Ingrese nombre del socio: ');
           readln (s.nombre);
        //   write ('Ingrese edad del socio: ');
           readln (s.edad);
         end;
  end;  
  
  Procedure InsertarElemento (var a: arbol; elem: socio);
  Begin
    if (a = nil) 
    then begin
           new(a);
           a^.dato:= elem; 
           a^.HI:= nil; 
           a^.HD:= nil;
         end
    else if (elem.numero < a^.dato.numero) 
         then InsertarElemento(a^.HI, elem)
         else InsertarElemento(a^.HD, elem); 
  End;

var unSocio: socio;  
Begin
 a:= nil;
 LeerSocio (unSocio);
 while (unSocio.numero <> 0)do
  begin
   InsertarElemento (a, unSocio);
   writeln;
   LeerSocio (unSocio);
  end;
end;

procedure InformarNumeroSocioMasGrande (a: arbol);
{Informe el numero de socio mas grande. Debe invocar a un modulo recursivo que retorne dicho valor.}

  function NumeroMasGrande (a: arbol): integer;
  begin
    if (a = nil) then NumeroMasGrande:= -1
    else if (a^.HD = nil) then NumeroMasGrande:= a^.dato.numero
                          else NumeroMasGrande:= NumeroMasGrande (a^.HD);
  end;
   
var max: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Mas Grande ----->');
  writeln;
  max:= NumeroMasGrande (a);
  if (max = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio mas grande: ', max);
         writeln;
       end;
end;

procedure InformarDatosSocioNumeroMasChico (a: arbol);
{ Informe los datos del socio con el numero de socio mas chico. Debe invocar a un modulo recursivo que retorne dicho socio. }
  
  function SocioMasChico (a: arbol): arbol;
  begin
    if ((a = nil) or (a^.HI = nil))
    then SocioMasChico:= a
    else SocioMasChico:= SocioMasChico (a^.HI);
  end;
   
var minSocio: arbol;
begin
  writeln;
  writeln ('----- Informar Datos Socio Numero Mas Chico ----->');
  writeln;
  minSocio:= SocioMasChico (a);
  if (minSocio = nil) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Socio con numero mas chico: ', minSocio^.dato.numero, ' Nombre: ', minSocio^.dato.nombre, ' Edad: ', minSocio^.dato.edad); 
         writeln;
       end;
end;

procedure InformarNumeroSocioConMasEdad (a: arbol);
{ Informe el numero de socio con mayor edad. Debe invocar a un modulo recursivo que retorne dicho valor.  }

  procedure actualizarMaximo(var maxValor,maxElem : integer; nuevoValor, nuevoElem : integer);
	begin
	  if (nuevoValor >= maxValor) then
	  begin
		  maxValor := nuevoValor;
		  maxElem := nuevoElem;
	  end;
	end;
	procedure NumeroMasEdad (a: arbol; var maxEdad: integer; var maxNum: integer);
	begin
	   if (a <> nil) then
	   begin
		   actualizarMaximo(maxEdad,maxNum,a^.dato.edad,a^.dato.numero);
		   numeroMasEdad(a^.hi, maxEdad,maxNum);
		   numeroMasEdad(a^.hd, maxEdad,maxNum);
	   end; 
	end;
var maxEdad, maxNum: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Con Mas Edad ----->');
  writeln;
  NumeroMasEdad (a, maxEdad, maxNum);
  if (maxEdad = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio con mas edad: ', maxNum);
         writeln;
       end;
end;

procedure AumentarEdad (a: arbol);
begin
 if (a <> nil)
 then begin
        a^.dato.edad:= a^.dato.edad + 1;
        AumentarEdad (a^.HI);
        AumentarEdad (a^.HD);
      end;
end;

procedure InformarExistenciaNumeroSocio (a: arbol);
{ Lea un valor entero e informe si existe o no existe un socio con ese valor. Debe invocar a un modulo recursivo que reciba el valor lei­do y
       retorne verdadero o falso. }
       
  function Buscar (a: arbol; num: integer): boolean;
  begin
    if (a = nil) 
    then Buscar:= false
    else If (a^.dato.numero = num) 
         then Buscar:= true
         else if (num < a^.dato.numero)
              then Buscar:= Buscar (a^.HI, num)
              else Buscar:= Buscar (a^.HD, num)
  end;
  
var numABuscar: integer;
begin
  writeln;
  writeln ('----- Informar Existencia Numero Socio ----->');
  writeln;
  write ('Ingrese numero de socio a buscar: ');
  Readln (numABuscar);
  writeln;
  if (Buscar (a, numABuscar)) 
  then writeln ('El numero ', numABuscar, ' existe')
  else writeln ('El numero ', numABuscar, ' no existe');
  writeln;
end;
procedure InformarExistenciaNombreSocio(a:arbol);

function Buscar (a:arbol; nombre:cadena15): boolean;
begin
	if (a = nil) then
		Buscar := false
	else
		if (nombre = a^.dato.nombre) then
			Buscar := true
		else begin
                Buscar(a^.HI, nombre); 
                Buscar(a^.HD, nombre);
end;
end;
  
  
  var validacion: boolean; nombre : cadena15;
  begin
  readln(nombre);
  validacion := Buscar(a, nombre);
  writeln(validacion);
  end;
  
function CantSocios(a: arbol): integer;
begin
if(a=nil) then CantSocios := 0
    else CantSocios:= 1 + CantSocios(a^.HI)+ CantSocios(a^.HD);

end;

function InformarPromedioDeEdad (a: arbol): integer;
function InformarEdadTotal(a:arbol): integer;
begin
if(a = nil) then InformarPromedioDeEdad := 0
    else InformarEdadTotal := (a^.dato.edad + InformarEdadTotal(a^.HI) + InformarEdadTotal(a^.HD));
end;
begin
InformarPromedioDeEdad := InformarEdadTotal(a) div CantSocios(a);
end;

Function InformarCantidadSociosEnRango(a: arbol; c,d: integer): integer;
procedure Recorrer(a:arbol; c,d: integer; var cant: integer);
begin
if(a <> nil) then begin
if((a^.dato.numero > c) and (a^.dato.numero < d)) then
    begin
        cant := cant + 1;
        Recorrer(a^.HI, c, d, cant);
        Recorrer(a^.HD, c, d, cant);
    end
    else if (a^.dato.numero <= c) then Recorrer(a^.HD, c, d, cant)
    else if (a^.dato.numero >= d) then Recorrer(a^.HI, c, d, cant)

end;
end;
var cant : integer;
begin
cant := 0;
Recorrer(a,c,d,cant);
writeln(cant);
end;

procedure enOrden (a:arbol);
begin
	if (a <> nil) then begin
		enOrden(a^.HI);
		writeln('', a^.dato.numero);
		writeln('', a^.dato.nombre);
		writeln('', a^.dato.edad);
		writeln('---------');
		enOrden(a^.HD);	
	end;	
end;

procedure PosOrden (a:arbol);
begin
	if (a <> nil) then begin
		PosOrden(a^.HD);
		if(a^.dato.numero mod 2 = 0) then begin
		writeln('', a^.dato.numero);
		writeln('', a^.dato.nombre);
		writeln('', a^.dato.edad);
		writeln('---------');
		end;
		PosOrden(a^.HI);	
	end;	
end;


var a: arbol; 
Begin
  GenerarArbol (a);
  //InformarNumeroSocioMasGrande (a);
  //InformarDatosSocioNumeroMasChico (a);
  //InformarNumeroSocioConMasEdad (a);
  //AumentarEdad (a);
 //InformarExistenciaNumeroSocio (a);
 
 //InformarExistenciaNombreSocio (a);
    //cantSocios (a);
    //writeln(InformarPromedioDeEdad (a));
  //InformarCantidadSociosEnRango (a, 2, 4);
    //enOrden(a);
    //PosOrden (a);
  readln;
End.
