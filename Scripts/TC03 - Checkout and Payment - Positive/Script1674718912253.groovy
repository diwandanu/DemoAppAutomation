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

Mobile.startApplication('C:\\Users\\User-PC\\Downloads\\apk\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Log In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - bobexample.com'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Rebecca Winter'), 'Muhamad Trian Diwandanu', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Mandorley 112 (1)'), 'Jalan Benteng Jaya RT 03 RW 09 No 2', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Truro'), 'Tangerang', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Cornwall'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - United Kingdom'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 89750'), '15111', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - To Payment'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Rebecca Winter (1)'), 'Muhamad Trian Diwandanu', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 3258 1265 7568 789'), '325812657568789', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0325 (1)'), '03/25', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 123'), '123', 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Place Order'), 0)

Mobile.closeApplication()

