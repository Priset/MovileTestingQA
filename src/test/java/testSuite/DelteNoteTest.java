package testSuite;

import activities.notes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class DelteNoteTest {
    PermisionScreen permisionScreen = new PermisionScreen();
    PopUpScreen popUpScreen = new PopUpScreen();
    PrincipalScreen principalScreen = new PrincipalScreen();
    AddNoteScreen addNoteScreen = new AddNoteScreen();
    EditNoteScreen editNoteScreen = new EditNoteScreen();
    String titleNote = "Testing QA" + new Date().getTime();
    String bodyNote = "Testeando la aplicacion de notas de mi tubo" + new Date().getTime();
    @Test
    public void verifyDeleteNote() throws InterruptedException {
        permisionScreen.continueButton.click();
        popUpScreen.allowButton.click();
        popUpScreen.allowButton2.click();
        permisionScreen.continueButton2.click();
        popUpScreen.allowButton.click();
        principalScreen.addNoteButton.click();
        addNoteScreen.titleNoteSet.click();
        addNoteScreen.titleNote.setText(titleNote);
        addNoteScreen.bodyNoteSet.click();
        addNoteScreen.bodyNote.setText(bodyNote);
        addNoteScreen.saveButton.click();
        Assertions.assertEquals(titleNote, principalScreen.noteTitleCreated.getText(), "ERROR la nota no se creo correctamente!");
        Thread.sleep(1000);
        principalScreen.noteList.click();
        editNoteScreen.delteButton.click();
        popUpScreen.yesButtonToDelete.click();
        Assertions.assertFalse(principalScreen.noteList.isControlDisplayed(), "ERROR la nota no se creo correctamente!");
        Thread.sleep(1000);

    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
