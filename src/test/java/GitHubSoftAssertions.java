import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSoftAssertions extends BaseTest {
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
