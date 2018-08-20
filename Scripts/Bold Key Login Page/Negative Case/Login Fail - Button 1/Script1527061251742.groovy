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
import com.kms.katalon.core.exception.StepErrorException

if (GlobalVariable.openBrowser == false) {
    WebUI.callTestCase(findTestCase('Bold Key Login Page/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Bold Key Login Page/Login Action/Action Test Case'), [('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

switch (data_expectedresult.toString()) {
    default:
		if(username.trim() == '' || password == ''){
			def emptyUsername = false
			def emptyPassword = false
			def verifyUsername = ''
			def verifyPassword = ''
			
			if(WebUI.waitForElementVisible(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/username_message'), 5)){
				verifyUsername = WebUI.getText(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/username_message'))
				
				WS.verifyMatch(verifyUsername, username_message, true)
				emptyUsername = true
				
			}else if (WebUI.waitForElementVisible(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/password_message'), 5)) {
				verifyPassword = WebUI.getText(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/password_message'))
				
				WS.verifyMatch(verifyPassword, password_message, true)
				emptyPassword = true
				
			}
			
			if(emptyUsername == true || emptyPassword == true){
				WebUI.delay(2)
				WebUI.refresh()
				break
			}else if (emptyUsername == false && emptyPassword == false){
				throw new 
				com.kms.katalon.core.exception.StepErrorException('Something went wrong!')
			
			}
		}else {
			def invalidUser = false
			def accountLocked = false
			
			def serverMsg  = ''
			
			if(WebUI.waitForElementVisible(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/Page_BOLD.Key - Login/invalid_message'), 10)){
				serverMsg = WebUI.getText(findTestObject('Object Repository/BoldKey Login/Page_BOLD.Key - Login - BUTTON/Page_BOLD.Key - Login (2)/Page_BOLD.Key - Login/invalid_message'))
				
				if(serverMsg.compareTo(server_message) == 0){
					invalidUser = true
				}else if (serverMsg.compareTo(server_message1) == 0){
					invalidUser = true
				}else if (serverMsg.compareTo(server_message2) == 0){
					accountLocked  = true
				}else if (serverMsg.compareTo(server_message3) == 0){
					accountLocked  = true
				}
				
				if(invalidUser == true || accountLocked == true){
					WebUI.delay(2)
					WebUI.refresh()
					break
				}else if (invalidUser == false && accountLocked == false){
				 throw new 
				 com.kms.katalon.core.exception.StepErrorException('Something went wrong!')
				}
				
			}
			
		}
        break
}

