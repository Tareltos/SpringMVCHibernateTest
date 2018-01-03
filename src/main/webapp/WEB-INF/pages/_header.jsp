<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div id="main_container">
 
<div class="header">
 
     <div class="header-bar">
        <c:if test="${pageContext.request.userPrincipal.name != null}">
         <div id="logo"><a href="/TestProject/"><img src="logoCar.png" alt="" title="" width="170" height="64" border="0" /></a></div>
        Hello
           <a href="${pageContext.request.contextPath}/accountInfo">
                ${pageContext.request.userPrincipal.name} </a>
         &nbsp;|&nbsp;
           <a href="${pageContext.request.contextPath}/logout">Logout</a>
 
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name == null}">
            <div id="logo"><a href="/PartsMall/"><img src="logoCar.png" alt="" title="" width="170" height="64" border="0" /></a></div>
         <br>   <a href="${pageContext.request.contextPath}/login">Login</a>
        </c:if>
    </div>
</div>
</div>