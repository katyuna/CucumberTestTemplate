package application;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BeforeStep {
    private final SelenideElement sendRequestButton = $x("//a[@href='#popup:swc_discuss_project']");

    @Допустим("Пользователь открывает главную страницу сайта {string}")
    public void openMainPage (String url) {
        //   Configuration.timeout = 60000;
        System.out.println(url);
        open(url);
    }
    @И("нажимает кнопку Оставить заявку")
    public void pressSendRequestButton() {
        sendRequestButton.click();
    }
}
