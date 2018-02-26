package visoraplicaciones.serenitytest.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import visoraplicaciones.serenitytest.steps.LoginSteps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("como usuario ingreso a la pagina de sahi")
    public void ingresarSitio(){

       try{
            loginSteps.ingresar();
       }catch(Exception e){
        System.out.println("ERR ") ;
       }
       

    }

    @When("ingreso las credenciales:$logueo")
    public void ingresarDatosLogueo(ExamplesTable logueo){

        loginSteps.ingresarDatosLogin(logueo);


    }
    @Then("ingreso a la pagina prinacipal del sitio")
    public void  verificarIngreso(){

    }
   

    @When("ingreso datos book")
    public void ingresarDatosPagBook(ExamplesTable datos){

        loginSteps.ingresarDatosBook(datos);


    }
    @Then("click en los botones de la pagina book")
    public void  clickBotones(){

    }
    
    
}

