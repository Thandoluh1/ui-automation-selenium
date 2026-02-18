@Test
public void validLoginTest() {
    LoginPage login = new LoginPage(driver);
    login.open();
    Assert.assertTrue(driver.getTitle().contains("Login"));
}
