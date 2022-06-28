import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def firstname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

def lastname = org.apache.commons.lang.RandomStringUtils.randomAlphabetic(4)

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_/sign_in_locator'))

WebUI.scrollToElement(findTestObject('Page_Login - My Store/email_register_field'), 0)

WebUI.setText(findTestObject('Page_Login - My Store/email_register_field'), ((firstname + '.') + lastname) + '@gmail.com')

WebUI.click(findTestObject('Page_Login - My Store/register_button'))

WebUI.scrollToElement(findTestObject('Page_Login - My Store/label_Mr'), 0)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/label_Mr'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), firstname)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), lastname)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'T8Zxgyb7BwVkAR0khxpfZw==')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Bandung')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Bandung')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '+1122334455')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Page_/username_locator'), 0)

WebUI.verifyElementText(findTestObject('Page_/username_locator'), (firstname + ' ') + lastname)

WebUI.closeBrowser()

