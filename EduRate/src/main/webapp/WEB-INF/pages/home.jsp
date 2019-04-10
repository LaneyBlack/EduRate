<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EduRate : Your Stats</title>
        <style type="text/css">
        body{
          display: table;
          width: 99%;
          background: #dedede;
          text-align: left;
        }
        *{
          -webkit-box-sizing: border-box; /* Safari/Chrome, other WebKit */
          -moz-box-sizing: border-box;    /* Firefox, other Gecko */
          box-sizing: border-box;         /* Opera/IE 8+ */
        }

        .aa_h2{
          font:100 5rem/1 Roboto;
          text-transform: uppercase;
        }

        .datagrid table { border-collapse: collapse; text-align: left; width: 100%; }
                .datagrid {font: normal 12px/150% Geneva, Arial, Helvetica, sans-serif; background: #fff; overflow: hidden; border: 2px solid #36752D; -webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; }
                .datagrid table td,
                .datagrid table th { padding: 3px 20px; }
                .datagrid table thead th {background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #00A600), color-stop(1, #007300) );background:-moz-linear-gradient( center top, #00A600 5%, #007300 100% );filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#00A600', endColorstr='#007300');background-color:#00A600; color:#FFFFFF; font-size: 19px; font-weight: bold; border-left: 1px solid #000000; }
                .datagrid table thead th:first-child { border: none; }
                .datagrid table tbody td { color: #000000; border-left: 1px solid #000000;font-size: 15px;border-bottom: 1px solid #A9B3B8;font-weight: normal; }
                .datagrid table tbody .alt td { background: #EDFFEE; color: #000000; }
                .datagrid table tbody td:first-child { border-left: none; }
                .datagrid table tbody tr:last-child td { border-bottom: none; }
                .datagrid table tfoot td div { border-top: 1px solid #36752D;background: #DFFFDE;}
                .datagrid table tfoot td { padding: 0; font-size: 14px }
                .datagrid table tfoot td div{ padding: 2px; }
                .datagrid table tfoot td ul { margin: 0; padding:0; list-style: none; text-align: right; }
                .datagrid table tfoot  li { display: inline; }
                .datagrid table tfoot li a { text-decoration: none; display: inline-block;  padding: 2px 8px; margin: 1px;color: #FFFFFF;border: 2px solid #006100;-webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #026108), color-stop(1, #018001) );background:-moz-linear-gradient( center top, #026108 5%, #018001 100% );filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#026108', endColorstr='#018001');background-color:#026108; }
                .datagrid table tfoot ul.active,
                .datagrid table tfoot ul a:hover { text-decoration: none;border-color: #006303; color: #FFFFFF; background: none; background-color:#00B01D;}div.dhtmlx_window_active, div.dhx_modal_cover_dv { position: fixed !important; }

        .myButton {
        	-moz-box-shadow: 0px 10px 14px -7px #000000;
        	-webkit-box-shadow: 0px 10px 14px -7px #000000;
        	box-shadow: 0px 10px 14px -7px #000000;
        	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #44c767), color-stop(1, #0b9e00));
        	background:-moz-linear-gradient(top, #44c767 5%, #0b9e00 100%);
        	background:-webkit-linear-gradient(top, #44c767 5%, #0b9e00 100%);
        	background:-o-linear-gradient(top, #44c767 5%, #0b9e00 100%);
        	background:-ms-linear-gradient(top, #44c767 5%, #0b9e00 100%);
        	background:linear-gradient(to bottom, #44c767 5%, #0b9e00 100%);
        	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#44c767', endColorstr='#0b9e00',GradientType=0);
        	background-color:#44c767;
        	-moz-border-radius:8px;
        	-webkit-border-radius:8px;
        	border-radius:8px;
        	display:inline-block;
        	cursor:pointer;
        	color:#ffffff;
        	font-family:Arial;
        	font-size:20px;
        	font-weight:bold;
        	padding:13px 32px;
        	text-decoration:none;
        	text-shadow:0px 1px 0px #2f6627;
        }
        .myButton:hover {
        	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #0b9e00), color-stop(1, #44c767));
        	background:-moz-linear-gradient(top, #0b9e00 5%, #44c767 100%);
        	background:-webkit-linear-gradient(top, #0b9e00 5%, #44c767 100%);
        	background:-o-linear-gradient(top, #0b9e00 5%, #44c767 100%);
        	background:-ms-linear-gradient(top, #0b9e00 5%, #44c767 100%);
        	background:linear-gradient(to bottom, #0b9e00 5%, #44c767 100%);
        	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#0b9e00', endColorstr='#44c767',GradientType=0);
        	background-color:#0b9e00;
        }
        .myButton:active {
        	position:relative;
        	top:1px;
        }

        </style>
    </head>
    <body>
        <table align="right">
              <tr>
                  <td><a href="login" >Sing Out</a>
                  </td>
                  <td><a href="registration">Register</a>
                  </td>
             </tr>
        </table>
        <td><h1 style="color:#36752D">Your Stats:</h1></td>

    <div class="datagrid"><table>
       <thead><tr><th>Subject Name</th><th>Marks</th><th>Average Mark</th></tr></thead>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tr class="alt"><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tr class="alt"><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tr class="alt"><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tr class="alt"><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tr class="alt"><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       <tbody><tr><td>Name</td><td>Marks</td><td>Average Mark</td></tr>
       </tbody>
       </table>
    </div>

    <h1> </h1>

    <a href="" class="myButton">Apply</a>


</body>
</html>