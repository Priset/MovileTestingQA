package activities.notes;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddNoteScreen {
    public Button titleNoteSet = new Button(By.id("com.notas.controlador:id/tituloNota"));
    public TextBox titleNote = new TextBox(By.id("com.notas.controlador:id/tituloNota"));
    public Button bodyNoteSet = new Button(By.id("com.notas.controlador:id/textoNota"));
    public TextBox bodyNote = new TextBox(By.id("com.notas.controlador:id/textoNota"));
    public Button saveButton = new Button(By.id("com.notas.controlador:id/botonGuardarNota"));
}
