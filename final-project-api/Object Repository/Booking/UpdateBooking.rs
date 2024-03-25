<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UpdateBooking</name>
   <tag></tag>
   <elementGuidId>2f467e11-51b1-439b-879d-976822dda339</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;firstname\&quot; : \&quot;Jimin Update\&quot;,\n    \&quot;lastname\&quot; : \&quot;Member Update\&quot;,\n    \&quot;totalprice\&quot; : 135,\n    \&quot;depositpaid\&quot; : true,\n    \&quot;bookingdates\&quot; : {\n        \&quot;checkin\&quot; : \&quot;2022-12-01\&quot;,\n        \&quot;checkout\&quot; : \&quot;2022-12-12\&quot;\n    },\n    \&quot;additionalneeds\&quot; : \&quot;Breakfast Update\&quot;\n}&quot;,
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
      <webElementGuid>cd93e73f-2a60-43a1-a833-e5b5fe4c6334</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>bcd077a2-8ec8-4c48-b488-53c148419352</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic YWRtaW46cGFzc3dvcmQxMjM=</value>
      <webElementGuid>8947769b-34bd-49ac-8c3f-b5700bfcf990</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://restful-booker.herokuapp.com/booking/1135</restUrl>
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

//verifikasi data
WS.verifyElementPropertyValue(response, 'firstname', &quot;Jimin Update&quot;)
WS.verifyElementPropertyValue(response, 'lastname', &quot;Member Update&quot;)
WS.verifyElementPropertyValue(response, 'totalprice', 135)
WS.verifyElementPropertyValue(response, 'depositpaid', true)
WS.verifyElementPropertyValue(response, 'bookingdates.checkin', &quot;2022-12-01&quot;)
WS.verifyElementPropertyValue(response, 'bookingdates.checkout', &quot;2022-12-12&quot;)
WS.verifyElementPropertyValue(response, 'additionalneeds', &quot;Breakfast Update&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
