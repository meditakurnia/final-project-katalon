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

Mobile.startExistingApplication('com.example.mikebanks.bankscorpfinancial')

Mobile.verifyElementVisible(findTestObject('Payment/burgerBar'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/burgerBar'), 0)

Mobile.verifyElementExist(findTestObject('Payment/menuPayment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/menuPayment'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/buttonAddPayment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/buttonAddPayment'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/inputPayeeName'), 'andien', 0)

Mobile.tap(findTestObject('Object Repository/Payment/submitPayeeName'), 0)

Mobile.verifyElementVisible(findTestObject('Payment/inputAmount'), 0)

Mobile.setText(findTestObject('Object Repository/Payment/inputAmount'), '', 0)

Mobile.verifyElementVisible(findTestObject('Payment/buttonSubmitPayment'), 0)

Mobile.tap(findTestObject('Object Repository/Payment/buttonSubmitPayment'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Payment/verifyPayment'), 0)

