<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--    Created by IntelliJ IDEA.
  User: DELL
  Date: 2/10/2023
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-6">
            <a class="btn btn-primary" href="/student?actionUser=create">Thêm mới</a>
        </div>
        <div class="col-6">
            <form action="/student" method="get">
                <div class="form-group float-left w-75">
                    <input type="text"
                           class="form-control" name="search" id="search" placeholder="Name" value="${search}">

                </div>
                <div class="float-left w-25">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </form>
        </div>
    </div>
</div>


<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Điểm</th>
        <th>Xếp loại</th>
        <th>Tên lớp học</th>
        <th>Xóa</th>
        <th>Edit</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${studentList}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><c:out value="${student.getName()}"/></td>
<%--            <td><c:out value="${student.getScore()}"/></td>--%>
<%--            <td>${student.getScore()}</td>--%>
            <td>${student.score}</td>
            <td>
<%--                <c:if test="${student.score < 5}">--%>
<%--                    Yếu--%>
<%--                </c:if>--%>
<%--                <c:if test="${student.score >= 5 && student.score < 7}">--%>
<%--                    Trung Bình--%>
<%--                </c:if>--%>
<%--                <c:if test="${student.score >= 7}">--%>
<%--                    Out Trình--%>
<%--                </c:if>--%>
                <c:choose>
                    <c:when test="${student.score < 5}">
                        Yếu
                    </c:when>
                    <c:when test="${student.score < 7}">
                        Yếu
                    </c:when>
                    <c:otherwise>
                        Out Trình
                    </c:otherwise>
                </c:choose>
            </td>
            <td>${student.className}</td>
            <td><!-- Button trigger modal -->
                <button onclick="getDeleteId(${student.id})" type="button" class="btn btn-danger btn-lg" data-toggle="modal" data-target="#modelId">
                    Xóa
                </button></td>
            <td><!-- Button trigger modal -->
                <a class="btn btn-primary"
                   href="/student?actionUser=edit&id=${student.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="modelId" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Bạn có chắc chắn muốn xóa hay không?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <form action="/student" method="get">
                    <input type="hidden" value="delete" name="actionUser">
                    <input type="hidden" id="deleteId" name="deleteId">
                    <button type="submit" class="btn btn-primary">Save</button>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

<script>
    function getDeleteId(id) {
        document.getElementById("deleteId").value = id;
    }
</script>
</body>
</html>