import java.util.Scanner;
public class Converter
{
	public static void main(String args [])
	{
      	int binario=0;// 1ª variavel binario 
      	int decimal=0;// 2ªª variavel decimal 
      	int octal=0;// 3ª variavel octal 
      	int hexadecimal;// 4ª variavel hexadecimal 
      	int valor=0;// 5ª variavel numero digitado pelo usuario 
      	int resp=0;// 6ª variavel que obtem a resposta 
        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite 1 para Converter entre Bases\nDigite 2 para Créditos\nDigite 3 para Sair");
        valor = leitor.nextInt();
        if (valor == 1)
        {	
        	System.out.println("Digite para Converter\n 1 para Binario\n 2 para Decimal\n 3 para Hexadecimal\n 4 para Octal");
        	valor = leitor.nextInt();
        	if (valor == 1)
			{
				System.out.println("Digite o valor em Binario");
				binario = leitor.nextInt();	
				resp= binario/10;
				System.out.println("valor em Decimal: "+resp); 	
				resp= binario/16;
				System.out.println("valor em Hexadecimal: "+resp); 	
				resp= binario/8;
				System.out.println("valor em Octal: "+resp); 
			}
			else if (valor == 2)
			{
				System.out.println("Digite o valor em Decimal");
				decimal = leitor.nextInt();
				resp= decimal/2;
				System.out.println("valor em Binario: "+resp); 
				resp= decimal/16;
				System.out.println("valor em Binario: "+resp);
				resp= decimal/8;
					System.out.println("valor em Octal: "+resp);
			}
			else if (valor == 3)
			{
				System.out.println("Digite o valor em Hexadecimal");
				hexadecimal = leitor.nextInt();
				resp= hexadecimal/10;
				System.out.println("valor em Decimal: "+resp);
				resp= hexadecimal/8;
				System.out.println("valor em Octal: "+resp);
				resp= hexadecimal/2;
				System.out.println("valor em Binario: "+resp);
			}
			else if (valor == 4)
			{
				System.out.println("Digite o valor");
				octal = leitor.nextInt();
				resp= octal/2;
				System.out.println("valor em Binario: "+resp); 
				resp= octal/10;
				System.out.println("valor em Decimal: "+resp);
				resp= octal/16;
				System.out.println("valor em Hexadecimal: "+resp);			 
			}
		}
		else if (valor ==2)
		{
			System.out.println("Programa desenvolvido pelo aluno Lucas Cassiano");
		}
		else if (valor ==3)
		{
			System.exit(0);
		}
	}
}
