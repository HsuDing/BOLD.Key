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

def numConsent = WebUI.getText(findTestObject('Homepage/Get Text/Consent_GetText'))

def numQRCode = WebUI.getText(findTestObject('Homepage/Get Text/QR Code_GetText'))

def numSMSOTP = WebUI.getText(findTestObject('Homepage/Get Text/SMS OTP_GetText'))

def numTotal = WebUI.getText(findTestObject('Homepage/Get Text/Total Code Generated_GetText'))

def verifyNumTotal = numConsent.toInteger() + numQRCode.toInteger() + numSMSOTP.toInteger()

WebUI.verifyMatch(verifyNumTotal.toString(), numTotal, true)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Bold Key Login Page/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

