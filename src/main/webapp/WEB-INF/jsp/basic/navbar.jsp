<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


    <!-- Static navbar -->
    <nav class="">
      <div class="container">
    
        <div id="navbar" class="">
          <ul class="">
            <li><a href="#home">Home</a></li>
            <li><a href="#about">User</a></li>
            <li><a href="#contact">Words</a></li>
          </ul>
        </div><!--/.nav-collapse -->
        
        <div>
        	<a href="?language=en">English</a> | <a href="?language=np">Nepali</a>
        </div>
        
         <a href="<c:url value='j_spring_security_logout' />">Logout</a>
         
      </div>
    </nav>

