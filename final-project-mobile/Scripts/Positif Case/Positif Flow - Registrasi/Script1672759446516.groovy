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

Mobile.verifyElementExist(findTestObject('Registrasi/buttonCreateProfil'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi/buttonCreateProfil'), 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextFirstName'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextFirstName'), 'medita', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextLastNameRegist'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextLastNameRegist'), 'kurnia', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextCountry'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextCountry'), 'indonesia', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextUsernameRegist'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextUsernameRegist'), 'kurniameditaaa1', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextPasswordRegist'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextPasswordRegist'), 'Password123@', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/setTextConfirmPassRegist'), 0)

Mobile.setText(findTestObject('Object Repository/Registrasi/setTextConfirmPassRegist'), 'Password123@', 0)

Mobile.verifyElementExist(findTestObject('Registrasi/submitCreateProfile'), 0)

Mobile.tap(findTestObject('Object Repository/Registrasi/submitCreateProfile'), 0)

Mobile.verifyElementExist(findTestObject('Login/buttonLogin'), 0)

