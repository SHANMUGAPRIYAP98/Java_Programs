<%-- 
    Document   : OrderForm
    Created on : 13 Jul, 2021, 6:57:40 PM
    Author     : shanmugapriyap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="OrderData.jsp" %>
<%@include file="Display.jsp" %>
<%@include file="UpdateOrder.jsp" %>
<%@include file="DeleteOrder.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Form</title>
        <style>
            td{
                color:white;
            }
            fieldset
            {
                width:600px;
                
            }
            legend
            {
                color:white;
            }
        </style>
    </head>
    <body style="background-image: url('D:\\Training2_JavaExercise\\PizzaOrder\\web\\WEB-INF\\pizzas.jpg')">
        <form>
            <fieldset>
                <legend>Pizza Order Form</legend>
                
                <table>
                    <tr><td>Customer Name</td><td><input type="text" name="cname" /></td></tr>
                    <tr><td>Address</td><td><textarea name="addr"></textarea></td></tr>
                    <tr><td>Zipcode </td><td><input type="text" name="zip" maxlength="6" /></td></tr>
                    <tr><td>Phone Number</td><td><input type="text" name="phone" maxlength="10" /></td></tr>
                    <tr><td>Pizza Size</td><td><input type="radio" name="rb" value="small" />small</td>
                    <td><input type="radio" name="rb" value="medium" />medium</td><td><input type="radio" name="rb" value="large" />large</td></tr>
                    <tr><td>Crust Type</td><td><input type="checkbox" name="cb1" value="Sausage" />Sausage</td>
                    <td><input type="checkbox" name="cb2" value="Olives" />Olives</td>
                    <td><input type="checkbox" name="cb3" value="Paneer" />Paneer</td>
                    <td><input type="checkbox" name="cb4" value="Extra Cheese" />Extra Cheese</td></tr>
                    <tr><td>Select Payment</td><td><select name="pay">
                                <option value="Credit Card">Credit Card</option>
                                <option value="Debit Card">Debit Card</option>
                                <option value="Cash on Delivery">Cash on Delivery</option>
                            </select></td></tr>
                    <tr><td><input type="submit" name="but1" value="Place Order"/></td>
                        <td><input type="submit" name="display" value="Display Order"></td>
                        <td><input type="submit" name="but2" value="Clear Order"/></td>
                        <td><input type="submit" name="but3" value="Update Order"/></td>
                        <td><input type="submit" name="but4" value="Delete Order"/></td>
                    </tr>       
                </table>
            </fieldset>
        </form>
    </body>
</html>
