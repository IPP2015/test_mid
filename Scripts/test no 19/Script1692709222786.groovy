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

// by ilham pandu putra
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/webtables')

WebUI.waitForElementPresent(findTestObject('Object', [('value') : '//*[@id="addNewRecordButton"]']), 0)

WebUI.getText(findTestObject('Object', [('value') : '//*[@id="app"]/div/div/div[1]/div']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="addNewRecordButton"]']))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="firstName"]']), 'Ilham')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="lastName"]']), 'Putra')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="userEmail"]']), 'panduputra.ilham@gmail.com')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="age"]']), '26')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="salary"]']), '0')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="department"]']), 'IT QA')

WebUI.click(findTestObject('Object', [('value') : '//*[@id="submit"]']))

WebUI.scrollToElement(findTestObject('Object', [('value') : '//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]']), 
    0)

WebUI.verifyElementText(findTestObject('Object', [('value') : '//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]']), 'Ilham')

path = 'ubah path disini dengan double \\ contohnya d:\\test\\SS\\'

WebUI.takeFullPageScreenshot(path+'19.jpg')
