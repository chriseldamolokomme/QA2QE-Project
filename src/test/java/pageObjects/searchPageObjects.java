package pageObjects;

import org.openqa.selenium.WebElement;

public class searchPageObjects {

        /*private WebElement inputEmail;
        private WebElement inputPassword;
        private WebElement SigninButton;*/

        public static String btnSearch() {
            return "//img[@alt='Magento Commerce']";
        }

        public static String btnListSearch(){
            return"//a[@id='ui-id-3']/span[2]";
        }

        public static String btnCategory() {
            return "//a[contains(text(),'Hoodies & Sweatshirts')]";
        }

        public static String txtAssert(){
            return "//h1[@id='page-title-heading']/span";
        }

}
