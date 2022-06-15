import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSoftAssertions extends BaseTest {
    /**Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?
     В 1-м случае идет поиск среди h1 внутри которого есть div (т.е. идет поиск h1 c потомком div )
     Во 2-м случае идет поиск первого встречного h1 у которого может и не быть h1
     <h1><div>Test Block</div></h1>
     */
    @Test
    @DisplayName("Primer koda JUnit 5")
    public void checkSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("summary [href*='/wiki/SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("@ExtendWith"));
    }
}
