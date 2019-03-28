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
     <label for="inputName" class="sr-only">Name</label>
       <input type="name" id="name" name="name" class="form-control" placeholder="Name" required autofocus>
     <label for="inputFirstName" class="sr-only">First Name</label>
       <input type="name" id="firstname" name="firstname" class="form-control" placeholder="FirstName" required>
     <label for="inputPassword" class="sr-only">Password</label>
       <input  type="password" id="password" name="password" class="form-control" placeholder="Password" required>
       <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
  </form>
    </div>
</body>
</html>