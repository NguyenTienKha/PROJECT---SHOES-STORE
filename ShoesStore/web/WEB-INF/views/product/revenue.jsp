<%-- 
    Document   : revenue
    Created on : 13-Mar-2024, 23:55:37
    Author     : Trieu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Revenue and Sold Products</title>
</head>
<body>
    <div class="container mt-5">
        <h1>Revenue and Sold Products</h1>
        <div class="row">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Total Revenue</h5>
                        <p class="card-text">Total Revenue: ${totalRevenue}</p>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Total Sold Products</h5>
                        <p class="card-text">Total Sold Products: ${totalSoldProducts}</p>
                    </div>
                </div>
                <div class="card mt-3">
                    <div class="card-body">
                        <h5 class="card-title">Product Sales Details</h5>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Product Name</th>
                                    <th>Sold Quantity</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="detail" items="${productSaleDetails}">
                                    <tr>
                                        <td>${detail.productName}</td>
                                        <td>${detail.soldQuantity}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

