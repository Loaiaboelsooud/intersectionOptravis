<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><spring:message code="optravis.message" text="default"/></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="/js/calculateArrayIntersection.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/customCss.css">
</head>

<body>
<div class="container">
    <h1><spring:message code="optravis.message" text="default"/></h1>
    <%--@elvariable id="arrayIntersection" type=""--%>
    <form:form id="myForm" action="" method="POST" modelAttribute="arrayIntersection">
        <div class="form-group">
            <form:label path="arrayOneSize"><spring:message code="arrayOneSize.message" text="default"/></form:label>
            <form:input type="number" path="arrayOneSize"/>
        </div>
        <div class="form-group">
            <form:label path="arrayTwoSize"><spring:message code="arrayTwoSize.message" text="default"/> </form:label>
            <form:input type="number" path="arrayTwoSize"/>
        </div>
        <label class="radio-inline">
            <input type="radio" id="arrayOneToSet" name="arrayOneToSet" path="arrayOneToSet" value="true"
                   checked><spring:message code="arrayOneToSet.message" text="default"/>
        </label>
        <label class="radio-inline">
            <input type="radio" id="arrayTwoToSet" name="arrayOneToSet" path="arrayOneToSet"
                   value="false"><spring:message code="arrayTwoToSet.message" text="default"/>
        </label>
        <br>
        <br>
        <label class="radio-inline">
            <input type="radio" name="iterateOverSet" path="iterateOverSet" value="true" checked><spring:message
                code="iterateOverSet.message" text="default"/>
        </label>
        <label class="radio-inline">
            <input type="radio" name="iterateOverSet" path="iterateOverSet" value="false"><spring:message
                code="iterateOverArray.message" text="default"/>
        </label>
        <br>
        <br>
        <input type="submit" id="submitButton" class="btn btn-success"/>
    </form:form>
    <div class="progress" id="progressBar">
        <span class="progress-bar" role="progressbar"><spring:message code="loading.message" text="default"/></span>
    </div>
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title"><spring:message code="optravis.message" text="default"/></h4>
                </div>
                <div class="modal-body" style="display: inline-block">
                    <p id="errorMsg"/>
                    <p id="intersectionCount"/>
                    <p id="timeTaken"/>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><spring:message
                            code="close.message" text="default"/></button>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>