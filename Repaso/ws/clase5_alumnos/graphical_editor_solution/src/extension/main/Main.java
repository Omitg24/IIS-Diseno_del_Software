package extension.main;
import java.io.IOException;

import extension.editor.Drawing;
import extension.editor.Editor;
import extension.editor.Memory;
import extension.editor.UserInterface;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Editor editor = new Editor(new Drawing(), new Memory());
		UserInterface userInterface = new UserInterface(editor);
		userInterface.run();
	}
}
