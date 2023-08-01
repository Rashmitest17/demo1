package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class SignUpPage extends BaseTest2 {

	@FindBy(xpath = "")
	WebElement testElement;

	public SignUpPage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage validateOpenSignuplink() {

		return new HomePage();
	}

}
