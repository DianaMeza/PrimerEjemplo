package visoraplicaciones.serenitytest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;
import visoraplicaciones.serenitytest.pages.LoginPages;

public class LoginSteps extends ScenarioSteps {

    LoginPages loginPages=new LoginPages(getDriver());

    public LoginSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresar(){
        loginPages.open();
    }

    @Step
    public void ingresarDatosLogin(ExamplesTable datos){
        loginPages.ingresarUsuario(datos);
        loginPages.ingresarPassword(datos);
        loginPages.clicIngresar();
        loginPages.ingresarCore(datos);
    }
    
    @Step
    public void ingresarDatosBook(ExamplesTable datos){
        loginPages.ingresarCore(datos);
        loginPages.ingresarRuby(datos);
        loginPages.ingresarPython(datos);
        loginPages.clicAdd();
        loginPages.clicClean();
        loginPages.clicLogout();
    }


}


