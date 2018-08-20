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

WebUI.callTestCase(findTestCase('Bold Key Login Page/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Bold Key Login Page/Login Action/Action Test Case'), [('username') : 'cwpreflat', ('password') : 'P@55word'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

def inputHeader = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/Activity Listing_VerifyText'))

def verifyHeader = 'Activity Listing'

def inputNo = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/No_VerifyText'))

def verifyNo = 'No'

def inputCreatedDate = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/CreatedDate_VerifyText'))

def verifyCreatedDate = 'CreatedDate'

def inputActivityId = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/ActivityID_VerifyText'))

def verifyActivityId = 'Activity ID'

def inputActivityName = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/ActivityName_VerifyText'))

def verifyActivityName = 'Activity Name'

def inputDesc = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/Description_VerifyText'))

def verifyDesc = 'Description'

def inputActiveChannel = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/ActiveChannel_VerifyText'))

def verifyActiveChannel = 'Active Channel'

def inputAction = WebUI.getText(findTestObject('Boldkey Activity Listing/Activity Listing Verify Text/Action_VerifyText'))

def verifyAction = 'Action'
