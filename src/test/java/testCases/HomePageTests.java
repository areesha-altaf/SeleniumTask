package testCases;

import org.testng.annotations.Test;
import pageObjects.BaseTest;
import utils.TestData;

public class HomePageTests extends BaseTest {

    @Test
    public void runTest1() {
        homePageObj.navigateToHomePage(TestData.BASE_URL);
        homePageObj.enterEmail(TestData.EMAIL);
        homePageObj.enterPassword(TestData.PASSWORD);
    }

    @Test
    public void runTest2() {
        homePageObj.verifyTest1Elements();
        homePageObj2.verifyListGroupSize(TestData.LIST_SIZE);
        homePageObj2.verifySecondListItem(TestData.SECOND_LIST_ITEM);
        homePageObj2.verifySecondListItemBadge(TestData.SECOND_LIST_ITEM_BADGE);
    }

    @Test
    public void runTest3() {
        homePageObj3.verifyDefaultOption(TestData.OPTION_1);
        homePageObj3.selectOption3(TestData.OPTION_3);
    }

    @Test
    public void runTest4() {
        homePageObj4.verifyFirstButtonEnabled();
        homePageObj4.verifySecondButtonDisabled();
    }

    @Test
    public void runTest5() throws InterruptedException {
        homePageObj5.waitAndClickButton();
        homePageObj5.verifyButtonClickDisable(TestData.CLICK_MSG);
        Thread.sleep(10000);
    }


}