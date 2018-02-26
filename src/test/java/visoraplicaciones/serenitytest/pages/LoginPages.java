package visoraplicaciones.serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPages extends PageObject {

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[1]/td[2]/input")
    WebElementFacade txtUsuario;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[2]/td[2]/input")
    WebElementFacade txtPassword;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
    WebElementFacade btnIngresar;
    
    @FindBy(xpath = "//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input")
    WebElementFacade txtCoreJava;
    
    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[4]/input")
    WebElementFacade txtRubyforRails;
    
    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[4]/td[4]/input")
    WebElementFacade txtPython;
    
    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input[1]")
    WebElementFacade btnAdd;
         
    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input[2]")
    WebElementFacade btnClean;
        
    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]input[3]")
    WebElementFacade btnLogout;
    
     
    public WebDriver driver;

public LoginPages(WebDriver driver){
    super(driver);
    this.driver=driver;
    
}

public  void ingresarUsuario(ExamplesTable datos){

    txtUsuario.type(datos.getRow(0).get("usuario"));

}

public void ingresarPassword(ExamplesTable datos){

    txtPassword.type(datos.getRow(0).get("contrasena"));

}

public void clicIngresar(){

    btnIngresar.click();
}

public  void ingresarCore(ExamplesTable datos){

    txtCoreJava.type(datos.getRow(0).get("corejava"));

}

public void ingresarRuby(ExamplesTable datos){

    txtRubyforRails.type(datos.getRow(0).get("ruby"));
    
}

public void ingresarPython(ExamplesTable datos){

    txtPython.type(datos.getRow(0).get("python"));

}

public void clicAdd(){

    btnAdd.click();
}

public void clicClean(){

    btnClean.click();
}

public void clicLogout(){

    btnLogout.click();

}

}
