package basic_struts.action;

import com.opensymphony.xwork2.ActionSupport;

import basic_struts.model.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private static int helloCount = 0;
	
	private MessageStore messageStore;
	
    public String execute() {
        messageStore = new MessageStore() ;
        helloCount++;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
	
    public int getHelloCount() {
        return helloCount;
    }
    
    /*
    Como o c�digo funciona
     
	Seu navegador envia ao servidor da Web uma solicita��o para o URL 
	http: //localhost:8080/basic_struts/hello.action.

	O cont�iner recebe do servidor da Web uma solicita��o para o recurso hello.action.
	De acordo com as configura��es carregadas do web.xml, o cont�iner descobre que todas
	as solicita��es est�o sendo roteadas para 
	org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter,
	incluindo as solicita��es * .action.
	
	O StrutsPrepareAndExecuteFilter � o ponto de entrada na estrutura.
	A estrutura procura um mapeamento de a��o chamado "hello" e descobre que esse mapeamento
	corresponde � classe HelloWorldAction.
	
	A estrutura instancia a a��o e chama o m�todo de "execute" da Action.
	
	O m�todo execute cria o objeto MessageStore e retorna SUCCESS (= "success").
	A estrutura verifica o mapeamento de a��es para ver qual p�gina carregar se SUCCESS for retornado.
	
	A estrutura instrui o cont�iner a renderizar como resposta � solicita��o, o recurso HelloWorld.jsp.

	Enquanto a p�gina HelloWorld.jsp est� sendo processada, a tag 
	<s: property value = "messageStore.message" />
	chama o getter getMessageStore da a��o HelloWorld e chama o getMessage do objeto MessageStore 
	retornado por getMessageStore. A tag mescla o valor do atributo de mensagem na resposta.
	Uma resposta HTML pura � enviada de volta ao navegador.
	
	O que lembrar
	
	A estrutura usa Actions para processar formul�rios HTML e outras solicita��es.
	A classe Action retorna um nome de resultado como SUCCESS, ERROR ou INPUT.
	Com base nos mapeamentos carregados a partir do struts.xml, um determinado resultado-nome 
	pode selecionar uma p�gina (como neste exemplo), outra Action ou outro recurso da Web (imagem, PDF).

	Quando uma p�gina do servidor � renderizada, na maioria das vezes ela inclui dados din�micos 
	fornecidos pela Action. Para facilitar a exibi��o de dados din�micos, a estrutura fornece
	um conjunto de tags que podem ser usadas junto com a marca��o HTML para criar uma p�gina 
	do servidor. 
     
     */
}