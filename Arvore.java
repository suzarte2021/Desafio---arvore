package Arvore;
import java.util.Scanner;
import java.util.Stack;
public class Arvore {
	/*/Concluir o exercício de arvores

- Listar os numeros pares //Ok
- Listar os numeros impares //Ok
- Remover //Ok
- Adicionar os outros metodos de consulta (pre-fixado. pos-fixado, in-fixado) //Ok
 /*/
	public int numeros;
	public Arvore esq, dir;
	private String valor;

	public static void main(String[] args) {
		Stack<Integer> numeroPar = new Stack<Integer>(); //Stack é uma pilha para armazenar
		Stack<Integer> numeroImpar = new Stack<Integer>();
		Scanner dados = new Scanner(System.in);

		Arvore arvore = null;
		int numeroPar1 = 0;
		int numeroImpar1;
		arvore = null;
		for (int i = 1; i>= 0; i++) {
			System.out.println("Informe um número: ");
			numeroPar1 = dados.nextInt();
			if(numeroPar1 % 2 == 0) { // Se o núemro for par
				System.out.println("Esse número é Par");
				numeroPar.push(numeroPar1); // Inserção/Inserindo elemento
			} else { // Senao
				System.out.println("Esse número é Impar");
				numeroImpar.push(numeroPar1); // Inserção/Inserindo elemento
			}
		}
	}
	//Método consultar
	public static void consultarPosOrdem(Arvore aux) {
		if (aux != null) {
			consultarPosOrdem(aux.esq);
			consultarPosOrdem(aux.dir);
			System.out.print(aux.numeros + " ");
		}
	}  
	//Método remover
	public void removernumeroPar1(String numeroPar1) {
		if(numeroPar1 == numeroPar1()) {	
			System.out.println("Número par removido");
		} else {
			System.out.println("Essa número não é o primeiro da fila"); 
		}
	}
	private String numeroPar1() {
		return null;
	}
	//Método Inserir
	public static Arvore inserir(Arvore aux, int num) {
		if (aux == null) {
			aux = new Arvore();
			aux.numeros = num;
			aux.esq = null;
			aux.dir = null;
		} else if (num < aux.numeros) {
			aux.esq = inserir(aux.esq, num);
		}
		else {
			aux.dir = inserir(aux.dir, num);
		}
		return aux;
	}
	//pos-fixado
	public void posfixado(Arvore aux, int num) {
	    if(aux != null){
	      posfixado(aux.esq, num);
	      posfixado(aux.dir, num);
	        System.out.print(aux.valor + " ");
	    }
	}
}




