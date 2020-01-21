package home;

import DiscHome.HomePage;

public class HomeTest extends commonAPI {

    @Test
    public void testUserCanLogIn(){
        driver.get("https://discordapp.com/login");
        HomePage hp = new HomePage();
        hp.logIn("asdfghj@gmail.com","asdfghj");
    }

    public void userCanRegister(){
        driver.get("https://discordapp.com/login");
        Register reg = new Register();
        reg.register("asdfghj@gmail.com","user1","asdfghj");
    }
}
