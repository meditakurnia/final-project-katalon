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

Mobile.verifyElementExist(findTestObject('Add Account/buttonAddAccount'), 0)

Mobile.tap(findTestObject('Object Repository/Add Account/buttonAddAccount'), 0)

Mobile.verifyElementExist(findTestObject('Add Account/setTextAccountName'), 0)

Mobile.setText(findTestObject('Object Repository/Add Account/setTextAccountName'), 'Jang Uk', 0)

Mobile.verifyElementExist(findTestObject('Add Account/setTextInitialBalance'), 0)

Mobile.setText(findTestObject('Object Repository/Add Account/setTextInitialBalance'), '10000000', 0)

Mobile.tap(findTestObject('Object Repository/Add Account/submitAddAccount'), 0)

Mobile.verifyElementVisible(findTestObject('Add Account/verifyAddAccount'), 0)

Mobile.tap(findTestObject('Add Account/buttonAddAccount2'), 0)

Mobile.setText(findTestObject('Object Repository/Add Account/setTextAccountName'), 'Mudeok', 0)

Mobile.setText(findTestObject('Object Repository/Add Account/setTextInitialBalance'), '7500000', 0)

Mobile.tap(findTestObject('Object Repository/Add Account/submitAddAccount'), 0)

Mobile.verifyElementVisible(findTestObject('Add Account/verifyAddAccount'), 0)

