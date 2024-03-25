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

WebUI.openBrowser('https://kotakoki.wijaysali.my.id/')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage/buttonShop'))

WebUI.verifyElementPresent(findTestObject('Homepage/buttonShop'), 0)

WebUI.click(findTestObject('Homepage/buttonShop'))

WebUI.verifyElementPresent(findTestObject('Halaman Checkout/detailBarang'), 0)

WebUI.click(findTestObject('Halaman Checkout/detailBarang'))

WebUI.verifyElementPresent(findTestObject('Halaman Checkout/buttonAddCart'), 0)

WebUI.click(findTestObject('Halaman Checkout/buttonAddCart'))

WebUI.click(findTestObject('Halaman Checkout/addKeranjang'))

WebUI.verifyElementPresent(findTestObject('Halaman Checkout/verifyHalamanCart'), 0)

WebUI.verifyElementPresent(findTestObject('Halaman Checkout/buttonCheckout'), 0)

WebUI.click(findTestObject('Halaman Checkout/buttonCheckout'))

WebUI.verifyElementPresent(findTestObject('Halaman Checkout/verifyHalamanCheckout'), 0)

WebUI.setText(findTestObject('Form Pemesanan/inputFirstName'), 'Annisa')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputFirstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Form Pemesanan/inputLastName'), 'Putri')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputLastName'))

WebUI.setText(findTestObject('Form Pemesanan/inputCompany'), 'PT Maju Sejahtera')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputCompany'))

WebUI.setText(findTestObject('Shop/inputAlamat'), 'Jalan Bendungan Walahar No. 12, Jakarta Pusat')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputAlamat'))

WebUI.setText(findTestObject('Shop/inputAlamatBangunan'), 'Rumah')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputAlamatBangunan'))

WebUI.setText(findTestObject('Shop/inputCity'), 'Jakarta')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputCity'))

WebUI.setText(findTestObject('Shop/inputKodePos'), '102102')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputKodePos'))

WebUI.setText(findTestObject('Shop/inputNoHP'), '08921029100')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputNoHP'))

WebUI.setText(findTestObject('Shop/inputEmail'), 'annisaputri@gmail.com')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/inputEmail'))

WebUI.setText(findTestObject('Shop/textareaNote'), 'Double Packaging')

WebUI.verifyElementVisible(findTestObject('Form Pemesanan/textareaNote'))

WebUI.click(findTestObject('Shop/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Form Pemesanan/verifyHalamanRingkasanPesanan'), 0)

WebUI.closeBrowser()

