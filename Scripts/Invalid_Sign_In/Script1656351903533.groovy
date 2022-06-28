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

auth_error_locator = 'Authentication failed.'

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_/sign_in_locator'))

WebUI.scrollToElement(findTestObject('Page_Login - My Store/email_field'), 0)

WebUI.setText(findTestObject('Page_Login - My Store/email_field'), 'voxteneo@gmail.com')

'wrong password'
WebUI.setText(findTestObject('Page_Login - My Store/password_field'), 'voxtene')

WebUI.click(findTestObject('Page_Login - My Store/submit_login_locator'))

WebUI.waitForElementPresent(findTestObject('Page_Login - My Store/auth_error_locator'), 0)

WebUI.verifyElementText(findTestObject('Page_Login - My Store/auth_error_locator'), auth_error_locator)

WebUI.closeBrowser()

