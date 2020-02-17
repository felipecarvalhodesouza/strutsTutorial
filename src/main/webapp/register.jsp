<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Register</title>
  </head>
  <body>
    <h3>Register for a prize by completing this form.</h3>

    <s:form action="register">
      <s:textfield name="personBean.firstName" label="First name" />
      <s:textfield name="personBean.lastName" label="Last name" />
      <s:textfield name="personBean.email"  label ="Email"/>  
      <s:textfield name="personBean.age"  label="Age"  />
      <s:submit/>
    </s:form>	
  </body>
  
  <%--
       Como estamos usando as tags Struts 2, na parte superior da página, 
       precisamos da declaração da biblioteca de tags Struts.
	   O formulário do Struts 2 será submetido a uma Action chamada register.
	   Precisamos definir essa ação em nosso arquivo struts.xml.
	   Observe as quatro tags do campo de texto do Struts 2. Cada tag tem um valor
	   de nome que inclui um atributo da classe Person (por exemplo, firstName).
	   O valor do atributo name também tem uma referência a um objeto chamado personBean.
	   Este objeto é do tipo Pessoa. Quando criamos a classe Action que lida com esse
	   envio de formulário, precisamos especificar esse objeto nessa classe Action.
	   O valor completo do nome, personBean.firstName, instrui o Struts 2 a usar o
	   valor de entrada para esse campo de texto como argumento para o método
	   setFirstName do objeto personBean. Portanto, se o usuário digitar "Bruce"
	   no campo de texto que possui o rótulo "Nome", o campo de instância firstName
	   do personBean terá o valor "Bruce". Observe que temos um campo de texto do Struts 2
	   para cada campo de instância da classe Person. Lembre-se de que o atributo de idade
	   da classe Person é do tipo inteiro. Todos os valores de entrada do campo de formulário são Strings.
	   O Struts 2 converterá automaticamente o valor do String (“25”) que o usuário inseriu no
	   campo do formulário de idade para 25 ao chamar o método setAge do objeto personBean.  --%>
</html>