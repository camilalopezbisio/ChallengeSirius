package challenges;

public class Exercise1 {

	public int[] squaresInOrder(int[] input) {
		
		int largoArray = input.length;
		int[] output = new int[largoArray];
		int punteroInicio = 0;
		int punteroFin = largoArray - 1;
		int punteroResultado = largoArray - 1;
		
		while(punteroResultado > -1) {
			
			if(Math.abs(input[punteroInicio]) > Math.abs(input[punteroFin])) {
				output[punteroResultado] = input[punteroInicio] * input[punteroInicio];
				punteroInicio++;
			}
			else {
				output[punteroResultado] = input[punteroFin] * input[punteroFin];
				punteroFin--;
			}
			
			punteroResultado--;
			
		}
		
		return output;
	}
	
}
