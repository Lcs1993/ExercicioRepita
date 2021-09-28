import javax.swing.JOptionPane;

public class ExercicioRepita {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Primeiro problema");
		int n,soma = 0;
		do {
			n= Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um número<br><em>{valor 0 interrompe}</em></html>"));
			soma=soma+n;
		} while(n!=0);
		JOptionPane.showMessageDialog(null, "<html>Resultado obtido<hr><br>"
				+ "soma dos valores:"+soma+"</html>");

	}

}
