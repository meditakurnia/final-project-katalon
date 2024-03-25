<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CreateBooking</name>
   <tag></tag>
   <elementGuidId>8b463b58-56a3-4ccb-af9c-dea98245eb6e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;firstname\&quot; : \&quot;Jimin\&quot;,\n    \&quot;lastname\&quot; : \&quot;BTS\&quot;,\n    \&quot;totalprice\&quot; : 125,\n    \&quot;depositpaid\&quot; : true,\n    \&quot;bookingdates\&quot; : {\n        \&quot;checkin\&quot; : \&quot;2022-11-11\&quot;,\n        \&quot;checkout\&quot; : \&quot;2022-11-11\&quot;\n    },\n  \n    \&quot;additionalneeds\&quot; : \&quot;Breakfast\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>e21c1de2-b4e4-4cbf-993a-04a4bc62f115</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d694e354-42fa-4df4-8750-4fee77e127e2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://restful-booker.herokuapp.com/booking</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
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

//verifikasi status code
WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

//menyimpan bookingid ke global variabel
def slurper = new JsonSlurper()
def result = slurper.parseText(response.getResponseBodyContent())
def value = result.bookingid
println('value=' + value)
GlobalVariable.bookingid = value
println('GlobalVariable=' + GlobalVariable.bookingid)


//verifikasi data
WS.verifyElementPropertyValue(response, 'bookingid', GlobalVariable.bookingid)
WS.verifyElementPropertyValue(response, 'booking.firstname', &quot;Jimin&quot;)
WS.verifyElementPropertyValue(response, 'booking.lastname', &quot;BTS&quot;)
WS.verifyElementPropertyValue(response, 'booking.totalprice', 125)
WS.verifyElementPropertyValue(response, 'booking.depositpaid', true)
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkin', &quot;2022-11-11&quot;)
WS.verifyElementPropertyValue(response, 'booking.bookingdates.checkout', &quot;2022-11-11&quot;)
WS.verifyElementPropertyValue(response, 'booking.additionalneeds', &quot;Breakfast&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
