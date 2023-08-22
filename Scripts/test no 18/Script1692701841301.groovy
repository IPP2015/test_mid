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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

// by ilham pandu putra
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.waitForElementPresent(findTestObject('Object', [('value') : '//*[@id="app"]/div/div/div[1]/div']), 0)

WebUI.getText(findTestObject('Object', [('value') : '//*[@id="app"]/div/div/div[1]/div']))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="firstName"]']), 'Ilham')

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="lastName"]']), 'Putra')

WebUI.scrollToElement(findTestObject('Object', [('value') : '//*[@id="userNumber"]']), 0)

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="userEmail"]']), 'panduputra.ilham@gmail.com')

WebUI.click(findTestObject('Object', [('value') : '//*[@id="genterWrapper"]/div[2]/div[1]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="genterWrapper"]/div[2]/div[2]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="genterWrapper"]/div[2]/div[3]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="genterWrapper"]/div[2]/div[1]/label']))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="userNumber"]']), '5777641438')

WebUI.click(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="dateOfBirth"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="dateOfBirth"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[2]']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="dateOfBirth"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[7]']))

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), '1997')

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="dateOfBirthInput"]']), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="subjectsInput"]']), 'test astra mid - sen')

WebUI.click(findTestObject('Object', [('value') : '//*[@id="hobbiesWrapper"]/div[2]/div[1]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="hobbiesWrapper"]/div[2]/div[2]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="hobbiesWrapper"]/div[2]/div[3]/label']))

WebUI.click(findTestObject('Object', [('value') : '//*[@id="hobbiesWrapper"]/div[2]/div[1]/label']))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="currentAddress"]']), 'jl.rasamala 1 rt.15 rw.02 menteng dalam tebet jakarta selatan 12870')

WebUI.scrollToElement(findTestObject('Object', [('value') : '//*[@id="submit"]']), 0)

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="react-select-3-input"]']), 'Rajasthan')

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="react-select-3-input"]']), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object', [('value') : '//*[@id="react-select-4-input"]']), 'Jaipur')

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="react-select-4-input"]']), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object', [('value') : '//*[@id="submit"]']), Keys.chord(Keys.ENTER))

path = 'ubah path disini dengan double \\ contohnya d:\\test\\SS\\'

WebUI.takeFullPageScreenshot(path+'18.jpg')

