import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

if (GlobalVariable.openBrowser == false) {
    WebUI.callTestCase(findTestCase('Bold Key Login Page/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Bold Key Login Page/Login Action/Action Test Case'), [('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_ (1)/login name'), 5)

//username = WebUI.getText(findTestObject('BoldKey Login/Page_/Page_/Page_BOLD.Key - Login/input_txtusername'))

//expectedusername = WebUI.getText(findTestObject('BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_ (1)/login name'))

//WebUI.verifyMatch(username, expectedusername, true)

WebUI.callTestCase(findTestCase('Bold Key Login Page/Logout/Logout - Yes'), [:], FailureHandling.STOP_ON_FAILURE)

