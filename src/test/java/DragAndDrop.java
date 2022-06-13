import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    public void FirstDrAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("column-b");
        //actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();

        $("#column-a").shouldHave(text("B"));
    }
}
