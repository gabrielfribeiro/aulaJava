package aulaJava006.java;
	public class App {
		public static void main(String[] args) {
			ControleRemoto controle = new ControleRemoto(50, false, false);
			controle.ligar();
			controle.abrirMenu();
		}
}
