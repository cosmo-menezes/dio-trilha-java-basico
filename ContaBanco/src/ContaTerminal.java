import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência: ");
		String Agencia ;
		Agencia = ler.next();
		
		System.out.println("Por favor, agora digite o número da conta: ");
		int NumeroDaConta;
		NumeroDaConta = ler.nextInt();
		
		System.out.println("Obrigado, agora digite o nome do Cliente: ");
		String NomeCliente;
		NomeCliente = ler.next();
		
		
		float Saldo = 237.48f;
		
		System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, "
				+ " sua agência é " + Agencia + ", conta número " + NumeroDaConta + " e seu saldo é: " + Saldo + "já deve estar "
						+ " e já está disponível para saque ");
		

	}

}
