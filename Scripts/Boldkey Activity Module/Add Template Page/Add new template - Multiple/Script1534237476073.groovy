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

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Template/input_txt_template_name (2)'), 'TestMul1')

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Template/input_txt_message_Title (2)'), 'Testing Multiple template 1')

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/button_Save (2)'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/button_OK (2)'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/a_Template'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/a_Consent'))

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Template/input_txt_template_name (2)'), 'Test Mul2')

WebUI.setText(findTestObject('Boldkey Activity Listing/Add Template/input_txt_message_Title (2)'), 'Testing multiple template 2')

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/button_Save (2)'))

WebUI.click(findTestObject('Boldkey Activity Listing/Add Template/button_OK (2)'))

WebUI.delay(5)

