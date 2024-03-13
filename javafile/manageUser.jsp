<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="your.package.name.OnlineShoppingUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manage Users</title>
</head>
<body>
    <h1>Manage Users</h1>
    <% 
        // 사용자 정보를 저장하는 리스트
        List<OnlineShoppingUser> userList = (List<OnlineShoppingUser>) request.getAttribute("userList");
    %>

    <h2>User List</h2>
    <table border="1">
        <tr>
            <th>User ID</th>
            <th>Password</th>
            <th>Full Name</th>
            <th>Phone Number</th>
            <th>Address</th>
        </tr>
        <% for (OnlineShoppingUser user : userList) { %>
            <tr>
                <td><%= user.getUserId() %></td>
                <td><%= user.getPassword() %></td>
                <td><%= user.getFullName() %></td>
                <td><%= user.getPhoneNumber() %></td>
                <td><%= user.getAddress() %></td>
            </tr>
        <% } %>
    </table>

    <!-- 여기에 등록, 수정, 삭제 폼 및 기능 추가 -->

</body>
</html>