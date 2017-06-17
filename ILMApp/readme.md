http://www.beingjavaguys.com/2014/08/spring-restful-web-services.html

http://localhost:8080/ILMApp/
http://localhost:8080/ILMApp/api/assessment/list
http://localhost:8080/ILMApp/api/assessment/byId?userId=1
http://localhost:8080/ILMApp/api/users/list

http://localhost:8080/ILMApp/api/users/user?workmail=dan@articasearch.com
http://localhost:8080/ILMApp/api/reports/download/demoStatementReportPDF
http://localhost:8080/ILMApp/api/reports/download/userStatementReportPDF?workmail=abc@mail.com




Step:1 define a field like
field name="listCusipData" and class="java.util.ArrayList"

Step:2 use this expression inside your sub report dataSourceExpression
new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($F{listCusipData},false)

http://siempredesdeelcurro.blogspot.in/2013/06/jasper-reports-crear-report-utilizando.html