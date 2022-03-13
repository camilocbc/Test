package auto.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import auto.Steps.steps;

public class definitions {
@Steps
steps Steps;

@Given("^realizar un registro$")
public void realizar_un_registro() throws Exception {
	Steps.ingreso_a_navegador();
	
}

	
@When("^el cliente ingrese al formulario de registro con nombre \"([^\"]*)\" apellido \"([^\"]*)\" celular \"([^\"]*)\" correo \"([^\"]*)\" direccion \"([^\"]*)\" ciudad \"([^\"]*)\" estado \"([^\"]*)\" cod_postal \"([^\"]*)\" pais \"([^\"]*)\" usuario\"([^\"]*)\" contrasena \"([^\"]*)\" y con_contrasena \"([^\"]*)\"$")
public void el_cliente_ingrese_al_formulario_de_registro_con_nombre_apellido_celular_correo_direccion_ciudad_estado_cod_postal_pais_usuario_contrasena_y_con_contrasena(String fName, String lName, String phone, String email, String address, String city, String state, String postalc, String country, String username, String password, String conpassword) {
	
	Steps.btn_register();
	Steps.txt_fName(fName);
	Steps.txt_lName(lName);
	Steps.txt_phone(phone);
	Steps.txt_email(email);
	Steps.txt_address(address);
	Steps.txt_city(city);
	Steps.txt_state(state);
	Steps.txt_postalc(postalc);
	Steps.select_country(country);
	Steps.txt_username(username);
	Steps.txt_password(password);
	Steps.txt_conpassword(conpassword);
	Steps.btn_submit();
	Steps.validacionRegistro();
	
	
}


}
