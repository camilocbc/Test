package auto.Steps;

import net.thucydides.core.annotations.Step;
import auto.pageObjects.pageobject;

public class steps {

	pageobject pageObjects;

	@Step
	public void ingreso_a_navegador() {
		pageObjects.open();
		pageObjects.waitForWithRefresh();
	}

	@Step
	public void btn_register() {
		pageObjects.btn_register();
	}

	@Step
	public void txt_fName(String fName) {
		pageObjects.txt_fName(fName);
	}
	
	@Step
	public void txt_lName(String lName) {
		pageObjects.txt_lName(lName);
	}

	@Step
	public void txt_phone(String phone) {
		pageObjects.txt_phone(phone);
	}

	@Step
	public void txt_email(String email) {
		pageObjects.txt_email(email);
	}

	@Step
	public void txt_address(String address) {
		pageObjects.txt_address(address);
	}

	@Step
	public void txt_city(String city) {
		pageObjects.txt_city(city);
	}

	@Step
	public void txt_state(String state) {
		pageObjects.txt_state(state);
	}

	@Step
	public void txt_postalc(String postalc) {
		pageObjects.txt_postalc(postalc);
	}

	@Step
	public void select_country(String country) {
		pageObjects.select_country(country);
	}

	@Step
	public void txt_username(String username) {
		pageObjects.txt_username(username);
	}

	@Step
	public void txt_password(String password) {
		pageObjects.txt_password(password);
	}

	@Step
	public void txt_conpassword(String conpassword) {
		pageObjects.txt_conpassword(conpassword);
	}

	@Step
	public void btn_submit() {
		pageObjects.btn_submit();
	}

	@Step
	public void validacionRegistro() {
		pageObjects.validacionRegistro();
	}

}
