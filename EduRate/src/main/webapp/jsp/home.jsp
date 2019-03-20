<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Registration</title>
        </head>
        <body>
            <form:form>
                <table align="center">
                    <tr>
                        <td>
                            <form:label>Username</form:label>
                        </td>
                        <td>
                            <form:input name="username"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label>Password</form:label>
                        </td>
                        <td>
                            <form:password name="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button>Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>