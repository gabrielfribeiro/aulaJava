package aulaJava006.java;

public class ControleRemoto implements Controlador {
	private float volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto(float volume, boolean ligado, boolean tocando) {
		this.volume = volume;
		this.ligado = ligado;
		this.tocando = tocando;
	}
	
	private float getVolume() {
		return volume;
	}
	private void setVolume(float volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	public void ligar() {
		this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);
		
	}

	public void abrirMenu() {
		System.out.println("Esta ligado? "+ this.getVolume());
		System.out.println("Esta tocando? "+ this.getTocando());
		System.out.print("Volume: "+ this.getVolume());
		for (int i = 0; i < this.getVolume(); i+=10) {
			System.out.print("[]");
		}
	}

	public void fecharMenu() {
		System.out.println("Fechando menu......");		
	}

	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}
	}

	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}
	}

	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	
	
}
