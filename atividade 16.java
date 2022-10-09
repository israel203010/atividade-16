import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
int nota, Maiornota=Integer.Min_value,
  Menornota= Integer.Max_value, i;
  for (i=0; i<5; i++){
System.out.println("por favor, informe a " + "%do. nota.", (i+1));
  nota =entrada.nextInt();
  if(nota> Maiornota){
    Maiornota = nota;
  }
 else if (nota <Menornota){
Menornota = nota;

    }
  }

  System.out.println();
System.out.println("Maior nota = "+ Maior nota);
System.out.println("menor nota ="+ Menor nota );

 }}