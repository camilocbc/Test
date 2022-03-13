
    
    

@tag
Feature: Prueba Automatizacion

  @R1
  Scenario Outline: Registro exitoso.
    Given realizar un registro 
    When el cliente ingrese al formulario de registro con nombre <fName> apellido <lName> celular <phone> correo <email> direccion <address> ciudad <city> estado <state> cod_postal <postal> pais <country> usuario<usuario> contrasena <password> y con_contrasena <conPassword>
     Examples:
    | fName |  lName | phone | email | address | city | state | postal | country | usuario | password | conPassword |
    |  "Cristian" | "Buitrago" | "3124130120" | "cristian@gmail.com" | "calle 1" | "bogota" | "bogota" | "011501" | "COLOMBIA" | "cristiancbc" | "123456" | "123456" |
      
      