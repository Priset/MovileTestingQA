package activities.notes;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class PrincipalScreen {
    public Button addNoteButton = new Button(By.id("com.notas.controlador:id/botonNuevaNota"));
    public Label noteTitleCreated = new Label(By.id("com.notas.controlador:id/tituloEnLista"));
    public Button noteList = new Button(By.id("com.notas.controlador:id/layout_fila_lista"));

}
