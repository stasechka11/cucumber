package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private final SelenideElement transferHeading = $(byText("Пополнение карты"));
    private final SelenideElement amountInput = $("[data-test-id='amount'] input");
    private final SelenideElement fromInput = $("[data-test-id='from'] input");
    private final SelenideElement transferButton = $("button[data-test-id='action-transfer']");
    private final SelenideElement transferErrorMessage = $("[data-test-id='error-notification'] .notification__content");

    public TransferPage() {
        transferHeading.shouldBe(visible);
    }

    public DashboardPage makeValidTransfer(String transferAmount, String fromCardNumber) {
        makeTransfer(transferAmount, fromCardNumber);
        return new DashboardPage();
    }

    public void makeTransfer(String transferAmount, String fromCardNumber) {
        amountInput.setValue(transferAmount);
        fromInput.setValue(fromCardNumber);
        transferButton.click();
    }

}
