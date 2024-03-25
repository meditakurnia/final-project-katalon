<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetBooking</name>
   <tag></tag>
   <elementGuidId>acc7fd34-5e99-417d-ac66-1afef86759c2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>382435b3-e10d-420d-8188-379eed21a3a0</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://restful-booker.herokuapp.com/booking/1224</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

//verifikasi response code 200 OK
WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

//menyimpan bookingid ke global variabel
def slurper = new JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def value = result.firstname
println('value=' + value)
GlobalVariable.firstname = value
println('GlobalVariable=' + GlobalVariable.firstname)

//verifikasi data 
WS.verifyElementPropertyValue(response, 'firstname', GlobalVariable.firstname)
WS.verifyElementPropertyValue(response, 'lastname', &quot;BTS&quot;)
WS.verifyElementPropertyValue(response, 'totalprice', 125)
WS.verifyElementPropertyValue(response, 'depositpaid', true)
WS.verifyElementPropertyValue(response, 'bookingdates.checkin', &quot;2022-11-11&quot;)
WS.verifyElementPropertyValue(response, 'bookingdates.checkout', &quot;2022-11-11&quot;)
WS.verifyElementPropertyValue(response, 'additionalneeds', &quot;Breakfast&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
