package seminars.five;

/*
Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
сайте https://www.saucedemo.com/.
Данные для входа - логин: "standard_user", пароль: "secret_sauce".
Проверить, что авторизация прошла успешно и отображаются товары.

 */

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    void checkAuthorization() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        password.submit();
        WebElement product = driver.findElement
                (By.className("header_secondary_container"));

        assertTrue(product.getText().contains("Products"));
    }
}
