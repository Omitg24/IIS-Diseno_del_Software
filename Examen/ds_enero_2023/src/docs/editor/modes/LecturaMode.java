package docs.editor.modes;

import java.io.PrintWriter;

import docs.editor.Editor;
import docs.editor.Mode;

//PATRÓN STATE
//	Representa una de las clases ConcreteState...
//	Métodos:
//		Request1() -> portada()
//		Request2() -> insertar()
//		Request3() -> mostrar()
public class LecturaMode implements Mode {
	
	private Editor editor;
	
	public LecturaMode(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void insertar(String texto) {}

	@Override
	public void portada(String texto) {}

	@Override
	public void mostrar(PrintWriter out) {
		out.println("Portada: " + this.editor.getDocument().getCover());
		out.println("Contenido:");
		for (String line : this.editor.getDocument().getContents()) {
			out.println(line);
		}		
	}

}
