package docs.editor.modes;

import docs.editor.Editor;
import docs.editor.Mode;

//PATRÓN STATE
//	Extrae código común de los diferentes estados. 
//	(En este caso, no está en el diagrama del patrón)
//	Métodos:
//		Request1() -> portada()
//		Request2() -> insertar()
public abstract class WriteMode implements Mode {

	protected Editor editor;	
	
	public WriteMode(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void insertar(String texto) {
		this.editor.getDocument().insert(texto);
		if (this.editor.isCambiosEnabled()) {
			this.editor.addCambio("Se añadió la línea: " + texto);
		}
	}

	@Override
	public void portada(String texto) {
		this.editor.getDocument().setCover(texto);
		if (this.editor.isCambiosEnabled()) {
			this.editor.addCambio("Se cambió la imagen de portada: " + texto);
		}
	}
}
