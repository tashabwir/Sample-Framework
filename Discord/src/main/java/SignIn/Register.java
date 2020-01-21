package login;

public class Register extends commonAPI{

    public void register(String email, String username, String password){
        this.driver.findElement(By.id("email")).sendKeys(email);
        this.driver.findElement(By.ib("user")).sendKeys(username);
        this.driver.findElement(By.id("pass")).sendKeys(password);
        this.driver.findElement(By.cssSelector("input[value='Continue']")).click();
    }
}
