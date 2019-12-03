/*
* Indica as variáveis que o servidor irá usar
* reuire('http') é a forma do Node.js carregar o seu módulo http 
* que contém as funções para criar o servidor
*/
var http = require('http'),
host ='127.0.0.1',
port = '8080';

/*
* Aqui é criado o servidor, colocando-o numa variável server
* ainda criamos um callback para cada requisição recebida
*/
var server = http.createServer(function(req, res) {

    //res é a variavel que indica a nossa resposta que iremos enviar oa usuário
    //com esta variável, definimos no header, com writeHead, que a requisição foi um sucesso
    //(código 200) e o tipo de conteúdo da resposta
    //o html é a mensagem que enviaos ao usuário
    res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
    res.end('<h1>Hello world. Trying start with Node.js<h1>');

    //a função listen é usada para receber as requisições no endereço e no porto 
    //definidos como as nossas variáveis
    //com isto, irá chamar uma outra callback e logar a mensagem
}).listen(port, host, function() {
    console.log('Server in http://' + host + ': ' + port);
});