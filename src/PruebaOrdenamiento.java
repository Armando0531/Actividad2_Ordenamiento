class MetodosOrdenamiento{
	
	static long resultados[][][]=new long[4][8][4];
	static class Burbuja {
		
		public static void ordenacionBurbuja1(int nums[],int np) {
			int numeros[]=nums.clone();
			long comparaciones=0,intercambios=0,recorridos=0;
			
			long ini = System.nanoTime();
			recorridos+=1;
			for (int i = 1; i < numeros.length; i++) {
				recorridos+=1;
				for (int j = 0; j <= numeros.length-i-1; j++) {
					comparaciones+=1;
					if(numeros[j]>numeros[j+1]) {
						intercambios+=1;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
					}
				}
			}
			long fin = System.nanoTime();
			resultados[np][0][0]=comparaciones;
			resultados[np][0][1]=intercambios;
			resultados[np][0][2]=recorridos;
			resultados[np][0][3]=fin-ini;
			
		}
		
		public static void ordenacionBurbuja2(int nums[],int np) {
			int numeros[]=nums.clone();
			long comparaciones=0,intercambios=0,recorridos=0;
			
			int i =1;
			boolean ordenado=false;
			long ini = System.nanoTime();
			recorridos+=1;
			while (i<numeros.length) {
				ordenado=true;
				recorridos+=1;
				for (int j = 0; j < numeros.length-i; j++) {
					comparaciones+=1;
					if(numeros[j]>numeros[j+1]) {
						intercambios+=1;
						ordenado=false;
						int aux = numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
					}
				}
				i+=1;
			}
			long fin = System.nanoTime();
			resultados[np][1][0]=comparaciones;
			resultados[np][1][1]=intercambios;
			resultados[np][1][2]=recorridos;
			resultados[np][1][3]=fin-ini;
			
		}
		
	}//burbuja
	
	
	
}
public class PruebaOrdenamiento {

	public static void main(String[] args) {
		

	}

}
