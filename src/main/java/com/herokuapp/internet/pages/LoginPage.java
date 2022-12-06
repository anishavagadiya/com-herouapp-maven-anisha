package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button/i[text() =' Login']");
    By secureAreaText = By.xpath("//div[@class = 'example']/h2[contains(text(), 'Secure Area')]");
    By invalidUsernameMessage = By.xpath("//div[1]//div[@class = 'flash error' and contains(text(),'Your username is invalid!')]");
    By invalidPasswordMessage = By.xpath("//div[1]//div[@class = 'flash error' and contains(text(),'Your passwor is invalid!')]");



    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(secureAreaText);
    }
    public String getInvalidUsernameMessage() {
        return getTextFromElement(invalidUsernameMessage);
    }
    public String getInvalidPasswordMessage() {
        return getTextFromElement(invalidPasswordMessage);


    }

}
