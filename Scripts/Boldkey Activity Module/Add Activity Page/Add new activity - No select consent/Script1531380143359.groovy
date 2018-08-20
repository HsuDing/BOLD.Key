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

WebUI.callTestCase(findTestCase('Bold Key Login Page/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Bold Key Login Page/Login Action/Action Test Case'), [('username') : 'cwpreflat', ('password') : 'P@55word'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Boldkey Activity Listing/Add Activity/a_Activity (4)'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Activity/button_Activity (4)'))

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Activity/input_txt_ActivityName (1)'), inputActivityName)

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Activity/input_txt_ActivityDescription (1)'), inputDescription)

if(inputChannels.toLowerCase() == 'false'){
	if(WebUI.verifyElementChecked(findTestObject('Object Repository/checkbox_consent'), 2, FailureHandling.OPTIONAL)){
		WebUI.click(findTestObject('Object Repository/checkbox_consent'))
	}
}else if (inputChannels.toLowerCase() == 'true'){
	if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/checkbox_consent'), 2, FailureHandling.OPTIONAL)){
		WebUI.click(findTestObject('Object Repository/checkbox_consent'))
	}	
}

WebUI.click(findTestObject('Boldkey Activity Listing/Add Activity/button_Next (4)'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Activity/button_OK (1)'))

//WebUI.callTestCase(findTestCase('Bold Key Login Page/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

