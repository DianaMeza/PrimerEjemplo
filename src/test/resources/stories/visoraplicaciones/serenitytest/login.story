Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal



Scenario: logueo en aplicacion Sahi
Given como usuario ingreso a la pagina de sahi
When ingreso las credenciales:
|usuario|contrasena|corejava|ruby|python|
|test|secret|2|5|2|
Then ingreso a la pagina prinacipal del sitio
When ingreso las books:
|corejava|ruby|python|
|2|5|2|

