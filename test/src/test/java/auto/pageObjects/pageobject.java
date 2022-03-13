package auto.pageObjects;

import static org.junit.Assert.assertEquals;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/test/newtours/")
public class pageobject extends PageObject {

	String btn_register = "//td/a[@href='register.php']";
	String txt_fName = "//input[@name='firstName']";
	String txt_lName = "//input[@name='lastName']";
	String txt_phone = "//input[@name='phone']";
	String txt_email = "//input[@name='userName']";
	String txt_address = "//input[@name='address1']";
	String txt_city = "//input[@name='city']";
	String txt_state = "//input[@name='state']";
	String txt_postalc = "//input[@name='postalCode']";

	String txt_username = "//input[@name='email']";
	String txt_password = "//input[@name='password']";
	String txt_conpassword = "//input[@name='confirmPassword']";
	String btn_submit = "//input[@name='submit']";
	String label_validation = "//p[3]/font/b";

	public void btn_register() {

		find(By.xpath(btn_register)).click();

	}

	public void txt_fName(String fName) {

		find(By.xpath(txt_fName)).sendKeys(fName);

	}

	public void txt_lName(String lName) {

		find(By.xpath(txt_lName)).sendKeys(lName);

	}
	
	public void txt_phone(String phone) {

		find(By.xpath(txt_phone)).sendKeys(phone);

	}
	

	public void txt_email(String email) {

		find(By.xpath(txt_email)).sendKeys(email);

	}

	public void txt_address(String address) {

		find(By.xpath(txt_address)).sendKeys(address);

	}

	public void txt_city(String city) {

		find(By.xpath(txt_city)).sendKeys(city);

	}

	public void txt_state(String state) {

		find(By.xpath(txt_state)).sendKeys(state);

	}

	public void txt_postalc(String postalc) {

		find(By.xpath(txt_postalc)).sendKeys(postalc);

	}

	public void select_country(String country) {

		find(By.xpath("//option[@value='" + country + "']")).click();

	}

	public void txt_username(String username) {

		find(By.xpath(txt_username)).sendKeys(username);

	}

	public void txt_password(String password) {

		find(By.xpath(txt_password)).sendKeys(password);

	}

	public void txt_conpassword(String conpassword) {

		find(By.xpath(txt_conpassword)).sendKeys(conpassword);

	}
	
	public void btn_submit() {

		find(By.xpath(btn_submit)).click();

	}
	
	public void validacionRegistro() {

		String validacion = find(By.xpath(label_validation)).getText();
		
		validacion = validacion.substring(0, 23);
		
		
		
		assertEquals("Note: Your user name is", validacion);

	}

}
