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
		
		public static void ordenacionBurbuja3(int nums[],int np) {
			int numeros[]=nums.clone();
			long comparaciones=0,intercambios=0,recorridos=0;
			
			int i =1;
			long ini = System.nanoTime();
			recorridos+=1;
			do{
				boolean ordenado=true;
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
			}while (i<numeros.length);
			long fin = System.nanoTime();
			resultados[np][2][0]=comparaciones;
			resultados[np][2][1]=intercambios;
			resultados[np][2][2]=recorridos;
			resultados[np][2][3]=fin-ini;
			

		}
		
	}//burbuja
	
	static class Quicksort{
		static long comparaciones=0;
		static long intercambios=0;
		static long recorridos=0;
		
        static public int[] quicksort(int[] numeros,int izq,int der) {
            int pivote = numeros[izq];
            int i = izq, j = der;
            int aux;
            recorridos+=1;
            while(i<j) {
            	comparaciones+=1;
            	recorridos+=1;
                while(numeros[i]<=pivote && i<j) i++;
                comparaciones+=1;
                recorridos+=1;
                while(numeros[j]>pivote)j--;
                if(i<j) {
                	intercambios+=1;
                    aux = numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j] = aux;
                }
            }
            intercambios+=1;
            numeros[izq]=numeros[j];
            numeros[j]=pivote;
            if(izq<j-1)
                quicksort(numeros,izq,j-1);
            if(j+1<der)
                quicksort(numeros, j+1, der);
            return numeros;
        }
        
        public static void llamadaQuicksort(int nums[],int np) {
        	int numeros[]=nums.clone();
        	
        	long ini = System.nanoTime();
        	quicksort(numeros,0,numeros.length-1);
			long fin = System.nanoTime();
			
			resultados[np][3][0]=comparaciones;
			resultados[np][3][1]=intercambios;
			resultados[np][3][2]=recorridos;
			resultados[np][3][3]=fin-ini;
			
			comparaciones=intercambios=recorridos=0;
        	
        }
    
        
    }
	
	
}
public class PruebaOrdenamiento {

	public static void main(String[] args) {
		

	}

}
