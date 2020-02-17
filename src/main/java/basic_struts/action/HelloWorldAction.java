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
    Como o código funciona
     
	Seu navegador envia ao servidor da Web uma solicitação para o URL 
	http: //localhost:8080/basic_struts/hello.action.

	O contêiner recebe do servidor da Web uma solicitação para o recurso hello.action.
	De acordo com as configurações carregadas do web.xml, o contêiner descobre que todas
	as solicitações estão sendo roteadas para 
	org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter,
	incluindo as solicitações * .action.
	
	O StrutsPrepareAndExecuteFilter é o ponto de entrada na estrutura.
	A estrutura procura um mapeamento de ação chamado "hello" e descobre que esse mapeamento
	corresponde à classe HelloWorldAction.
	
	A estrutura instancia a ação e chama o método de "execute" da Action.
	
	O método execute cria o objeto MessageStore e retorna SUCCESS (= "success").
	A estrutura verifica o mapeamento de ações para ver qual página carregar se SUCCESS for retornado.
	
	A estrutura instrui o contêiner a renderizar como resposta à solicitação, o recurso HelloWorld.jsp.

	Enquanto a página HelloWorld.jsp está sendo processada, a tag 
	<s: property value = "messageStore.message" />
	chama o getter getMessageStore da ação HelloWorld e chama o getMessage do objeto MessageStore 
	retornado por getMessageStore. A tag mescla o valor do atributo de mensagem na resposta.
	Uma resposta HTML pura é enviada de volta ao navegador.
	
	O que lembrar
	
	A estrutura usa Actions para processar formulários HTML e outras solicitações.
	A classe Action retorna um nome de resultado como SUCCESS, ERROR ou INPUT.
	Com base nos mapeamentos carregados a partir do struts.xml, um determinado resultado-nome 
	pode selecionar uma página (como neste exemplo), outra Action ou outro recurso da Web (imagem, PDF).

	Quando uma página do servidor é renderizada, na maioria das vezes ela inclui dados dinâmicos 
	fornecidos pela Action. Para facilitar a exibição de dados dinâmicos, a estrutura fornece
	um conjunto de tags que podem ser usadas junto com a marcação HTML para criar uma página 
	do servidor. 
     
     */
}