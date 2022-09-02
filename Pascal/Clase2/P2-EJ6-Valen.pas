Program AddNums(output);

procedure Binario(n: integer);
begin
if(n < 0) then writeln('No se procesan numeros negativos!!')
    else if (n = 0) then writeln(0)
       else if(n = 1) then writeln(1)
            else if (n >= 2) then begin
                writeln(n mod 2);
                Binario(n div 2);
            end;
end;

begin
Binario(30000);
end.
