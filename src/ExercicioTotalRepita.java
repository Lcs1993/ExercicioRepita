import javax.swing.JOptionPane;

public class ExercicioTotalRepita {

	public static void main(String[] args) {
		int n=-1,totPar=0,totImpar=0;
		int totCem=0;
		int totValor=0;
		int mediaValor=0,somaValores = 0;
		do {
			n= Integer.parseInt(JOptionPane.showInputDialog("<html>Informe o valor <br><em>{0 interrompe}</em></html>"));
			if(n!=0) {
				totValor++;
				somaValores=somaValores+n;
				if (n%2==0) {
					totPar=totPar+1;
				}else {
					totImpar++;
				}	
				//total com mais 100
				if(n>100) {
					
					totCem++;
				}
			}
			
		}while(n!=0);
		mediaValor=somaValores/totValor;
//		System.out.println("Impar: "+totImpar);
//		System.out.println("Par: "+totPar);
//		System.out.println("mais de cem: "+totCem);
//		System.out.println("total de numeros:"+totValor);
//		System.out.println("media de valores: "+mediaValor);
		JOptionPane.showMessageDialog(null, "<html>Resultado <hr><br>"
				+ "total de valores:"+totValor+"</html>" +
				"total de pares: "+totPar+"\n"+
				"total de impares: "+totImpar+"\n"+
				"acima de 100: "+totCem+"\n"+
				"media de valores: "+mediaValor+"\n");
		
	}

}
