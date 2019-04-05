<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
 xmlns:th="http://www.thymeleaf.org">

<head>
 <title>EduRate : Register</title>
 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.min.css">
</head>

<body>
        <form th:action="@{/register}" method="post" >
          <h1 class="h3 mb-3 font-weight-normal">Register</h1>
          <form:label for="inputName" path="userName" class="sr-only">Name</form:label>
               <form:input type="text" path="userName" id="inputName" class="form-control" placeholder="Name" required="required" autofocus="autofocus"/>
               <form:label for="firstName" path="firstName" class="sr-only">First Name</form:label>
               <form:input type="text" path="firstName" id="firstName" class="form-control" placeholder="FirstName" required="required"/>
               <form:label for="inputPassword" path="password" class="sr-only">Password</form:label>
               <form:input type="password" path="password" id="inputPassword" class="form-control" placeholder="Password" required="required"/>
               <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
          </form:form>
    </div>
</body>
</html>