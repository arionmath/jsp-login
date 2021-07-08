Esta mensagem é para ajudar a fixar o funcionamento do projeto até agora.

Página index.JSP verifica se a requisição já possui algum erro, se sim o erro será analisado
e de acordo com ele a mensagem vai receber um determinado valor para ser exibido ,
se não a mensagem terá o valor " " e será printada do mesmo jeito.
Primeiro o usuario inputa seus dados no index.jsp e ao submeter o resultado
o servlet LoginServlet avalia se há algum campo em branco, nulo ou vazio se sim manda
para o login com o atributo erro = VALORES VAZIOS. Se não houver nenhum campo preenchido
o servlet vai criar um usuário @ com os dados recebidos do request e vai comparar este usuário
com cada elemento de uma lista criada momentaneamente para atuar como banco de dados.
 Se a iteração ter um objeto
da lista igual ao da requisição(username), então será capturado o objeto da lista e o ciclo será parado.
 
 Com o objeto puxado do banco de dados e o objeto puxado da requisição tendo o mesmo username,
 é necessário fazer a comparação da senha para ver se elas coincidem

Se coincidir então será puxada a sessão do request e posto o atributo {"Login":"Yes"}
e então usar o método sendRedirect no objeto response para o dash.
*Usei o path relativo e deu certo (só o nome do arquivo por estar na mesma pasta.)
Se não coincidir, a senha estará errada então precisamos redirecionar o user para  página de login
colocando  parametro error na sessão.

Na página do dash:
será puxada da sessão o atributo login 
e se o valor desse atributo ("login") não for yes será redirecionado ao google.

Se for yes então a pessoa terá permissão de ler a mensagem e ver o head.

*NÃO CONFUNDIR:
request.setAtributte() é DIFERENTE de request.getSession().setAtribute()