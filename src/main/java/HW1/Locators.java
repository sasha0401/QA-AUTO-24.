package HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    private static class Url {
        private static final String one ="https://uhomki.com.ua/koshki/1074/";
        private static final String two ="https://itstep.dp.ua/ru";
        private static final String three ="https://www.w3schools.com/";
        private static final String four ="https://www.jetbrains.com/idea/";
        private static final String five ="https://www.jetbrains.com/idea/download/#section=windows";
    }
    private static class Name_locators {
        private static final By Class = By.className("userbar__button-text");
        private static final By link = By.linkText("Вход");
        private static final By Entrance = By.xpath("//span[text()='Вход']");
        private static final By Divuser = By.xpath("//div[contains(@class, 'user')]");
        private static final By Catalog1 = By.xpath("//div[contains(@class, 'footer__heading')]");
        private static final By Catalog2 = By.xpath("//a[@href=\"/ru/sobaki-koshki-obshchee/\"]");
        private static final By ITSTEP = By.xpath("//h2[contains(text(), 'IT специальностям ')]");
        private static final By Aquarium = By.xpath("//span[contains(text(), 'Аквариумы')]");
        private static final By Zfive = By.xpath("//div[contains(@class, 'dropbtn-phones')]/span");
        private static final By Zsix = By.xpath("//h2[contains(@class, 're-section-title re-home-adult__title')]");
        private static final By Zeight = By.xpath("//h3[text()='Университет']/../../../div[1]/a/h3");
        private static final By Znine = By.xpath("//a[@href='/idea/download/']");
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Задание 1.
        // https://uhomki.com.ua/koshki/1074/
        //Найти как можно кликнуть на кнопку "Вход" элемент используя 4 различных локатора
        // (Это могут быть и 4 варианта xpath, нужно чтобы они отличались)
        //1.Первый вариант ищет ссылку на основе ее текста (с помощью функции "contains")
        driver.get("https://uhomki.com.ua/koshki/1074/");
        driver.findElement(By.xpath("//a[contains(text(), 'Вход')]")).click();
        Thread.sleep(2000);
        driver.quit();
        //2.Поиск элемента по className
       driver.findElement(By.className("userbar__button-text")).click();
        Thread.sleep(2000);
        driver.quit();
        //3.Поиск элемента по linkText
        driver.findElement(By.linkText("Вход")).click();
        Thread.sleep(2000);
        driver.quit();
        //4.
        driver.findElement(By.xpath("//span[text()='Вход']")).click();
        Thread.sleep(2000);
        driver.quit();
        /////////////////
        //Задание 2.
        // https://uhomki.com.ua/ru/koshki/1074/
        //Найти элемент "Каталог", а при помощи него найти путь к элементу "Собаки/кошки общее" используя xpath.
        /*driver.get(Url.one);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class, 'footer__heading')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/ru/sobaki-koshki-obshchee/\"]")).click();
        driver.quit();*/
        /////////////////
        //Задание 3.
        //https://itstep.dp.ua/ru
        //Найти данный элемент по тексту "IT специальностям"
        /*driver.get(Url.two);
        Thread.sleep(2000);
        System.out.println(
        driver.findElement(By.xpath("//h2[contains(text(), 'IT специальностям ')]")).getText());
        driver.quit();*/
        /////////////////
        //Задание 4.
        //Найти путь к данному элементу https://uhomki.com.ua/koshki/1074/
        /*driver.get(Url.one);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Аквариумы')]")).click();
        Thread.sleep(4000);*/
        /////////////////
        //Задание 5.
        //https://itstep.dp.ua/ru Найти путь к данному элементу не используя текст.
        /*driver.get(Url.two);
        Thread.sleep(2000);
        System.out.println(
        driver.findElement(By.xpath("//div[contains(@class, 'dropbtn-phones')]/span")).getText());
        driver.quit();*/
        /////////////////
        //Задание 6.
        //https://itstep.dp.ua/ru Найти локатор данного элемента не используя текст.
        /*driver.get(Url.two);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h2[contains(@class, 're-section-title re-home-adult__title')]")).click();
        driver.quit();*/
        /////////////////
        //Задание 7.
        //https://www.w3schools.com/
        //Найти 10 элементов на странице, для нахождения которых можно использовать
        // только айди и с которыми можно взаимодействовать. (Кликнуть, ввести текст и т.д.).
        //1 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("darkmodemenu")).click();
        Thread.sleep(2000);
        driver.quit();*/
        //2 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("nav_search_btn")).click();
        Thread.sleep(4000);
        driver.quit();*/
        //3 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("nav_translate_btn")).click();
        Thread.sleep(3000);
        driver.quit();*/
        //4 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("search2")).sendKeys("HTML Tutorial");
        Thread.sleep(2000);
        driver.findElement(By.id("learntocode_searchbtn")).click();
        Thread.sleep(2000);
        driver.quit();*/
        //5 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_tutorials")).click();
        driver.quit();*/
        //6 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_exercises")).click();
        Thread.sleep(2000);
        driver.quit();*/
        //7 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("cert_navbtn")).click();
        Thread.sleep(2000);
        driver.quit();*/
        //8 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("w3loginbtn")).click();
        Thread.sleep(5000);
        driver.quit();*/
        //9 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("signupbtn_topnav")).click();
        Thread.sleep(4000);
        driver.quit();*/
        //10 Элемент.
        /*driver.get(Url.three);
        Thread.sleep(2000);
        driver.findElement(By.id("navbtn_references")).click();
        Thread.sleep(2000);
        driver.quit();*/
        /////////////////
        //Задание 8.
        //https://itstep.dp.ua/ru Отыскать один элемент на основе другого.
        //Для нахождения первого элемента можете использовать любые методы и локаторы,
        //для прописывания дальнейшего поиска второго элемента не использовать текст.
        //h3[text()='Университет']/../../../div[1]/a/h3
        /*driver.get(Url.two);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[text()='Университет']/../../../div[1]/a/h3")).click();
        Thread.sleep(2000);
        driver.quit();*/
        /////////////////
        //Задание 9.
        //https://www.jetbrains.com/idea/ Найти данный элемент не используя текст. Используя только имя класса.
        /*driver.get(Url.four);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/idea/download/']")).click();
        Thread.sleep(2000);
        driver.quit();*/
        /////////////////
        //Задание 10.
        //Найти локаторы к двум данным кнопкам. Пользоваться любыми локаторами и методами.
        //https://www.jetbrains.com/idea/download/#section=windows
        //1 кнопка.
        //a[contains(@href, '/idea/download/download-thanks.html?platform=windows&code=IIC')]
        /*driver.get(Url.five);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href, '/idea/download/download-thanks.html?platform=windows&code=IIC')]")).click();
        Thread.sleep(2000);
        driver.quit();*/
        //2 кнопка.
        //a[contains(@href, '/idea/download/download-thanks.html?platform=windows')]
        /*driver.get(Url.five);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href, '/idea/download/download-thanks.html?platform=windows')]")).click();
        Thread.sleep(2000);
        driver.quit();*/

    }
}
