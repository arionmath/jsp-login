Esta mensagem é para ajudar a fixar o funcionamento do projeto até agora.

Primeiro o usuario inputa seus dados no index.jsp e ao submeter o resultado
o servlet LoginServlet avalia se os valores batem com root e toor.

Se bater então será puxada a sessão do request e posto o atributo {"Login":"Yes"}
e então usar o método sendRedirect no objeto response para o dash.
Usei o path relativo e deu certo (só o nome do arquivo por estar na mesma pasta.)

Na página do dash será puxada da sessão o atributo login 
e se o valor desse atributo ("login") não for yes será redirecionado ao google.

Se for yes então a pessoa terá permissão de ler a mensagem.

Por enquanto não foi usada nenhuma classe.