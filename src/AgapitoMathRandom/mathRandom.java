
package AgapitoMathRandom;

public class mathRandom {

	public static void sistemazione(int vet[]) {
		int a;
		
		for(int i=0 ; i<100 ; i++) {
			for(int j=i ; j<100 ; j++) {
				
				if( vet[i] > vet[j]) {
					a = vet[i] ;
					vet[i] = vet[j];
					vet[j] = a;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int vet[] = new int[100];
		int media, m=0;
		
		for (int i=0 ; i<100 ; i++) {
			vet[i] = (int) (Math.random() * 100);
			m = m + vet[i];
		}
		
		sistemazione(vet);
		media= m /100;
			System.out.print("La media dei numeri generati casualmente e' : " +media);
	}

}
