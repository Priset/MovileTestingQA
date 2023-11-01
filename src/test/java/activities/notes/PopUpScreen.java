package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class PopUpScreen {
    public Button allowButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));
    public Button allowButton2 = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.android.packageinstaller:id/permission_allow_button\"]"));
    public Button yesButtonToDelete = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
}
