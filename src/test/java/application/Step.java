package application;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.$x;

public class Step {
    private final SelenideElement contactInput = $x("//input[@id='input_1495810354468']");
    private final SelenideElement nameInput = $x("//input[@id='input_1495810359387']");
    private final SelenideElement commentInput = $x("input_1495810410810");
    private final SelenideElement sendButton = $x("//button[@class='t-submit']");

    @Когда("Пользователь заполняет все поля формы")
    public void fillTheForm() {
        contactInput.click();
        contactInput.setValue("test@test.test");
        nameInput.click();
        nameInput.setValue("Тестовый Тест Тестович");
        //  commentInput.click();
        //  commentInput.setValue("Коммент");
    }

    @И("нажимает кнопку отправки")
    public void sendForm() {
        sendButton.click();
    }

    @Тогда("Происходит отправка формы")
    public void assertSendForm() {

    }

    @И("Отображается сообщение об успешной отправке")
    public void isSuccessMassageDisplaed() {
    }
}
