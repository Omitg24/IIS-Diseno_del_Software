package base.editor.figures;

import base.editor.core.BoundingBox;
import base.editor.core.Editor;
import base.editor.core.Figure;
import base.editor.core.Tool;
import base.editor.tools.AbstractCreationTool;

public class RectangleCreationTool extends AbstractCreationTool implements Tool
{
	public RectangleCreationTool(Editor editor)
	{
		super(editor);
	}

	@Override
	protected Figure createFigure(BoundingBox boundingBox)
	{
		return new Rectangle(boundingBox);
	}

	@Override
	public String toString()
	{
		return "Herramienta de creación de rectángulo";
	}
}
