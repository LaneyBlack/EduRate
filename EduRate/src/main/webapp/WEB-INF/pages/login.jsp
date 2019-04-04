<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
 xmlns:th="http://www.thymeleaf.org">

<head>
 <title>EduRate : Login</title>
 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.min.css">
</head>

<body>
        <form th:action="@{/login}" method="post" >
          <h1 class="h3 mb-3 font-weight-normal">Login</h1>
        <label for="inputName" path="userName" class="sr-only">Name</label>
       <input type="text" path="userName" id="inputName" name="name" class="form-control" placeholder="Name" required autofocus>
       <label for="inputPassword" class="sr-only">Password</label>
       <input  type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
     <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
  </form>
    </div>
</body>
</html>
