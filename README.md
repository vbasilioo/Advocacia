### - Sistema de Advocacia - 
            
Olá para todos, sejam bem-vindos ao Sistema de Advocacia.

### O que é o Sistema de Advocacia?
O Sistema de Advocacia é um sistema gerencial programado para atender as necessidades dos advogados de diversos escritórios do território brasileiro. O projeto é totalmente desenvolvido em Java, sem fins lucrativos.

### Utilizando o GIT: 

Estamos utilizando duas Branchs dentro desse projeto: 'master' e 'staging'.
> A branch 'master' será redirecionada para atualizações do código que estão completas e funcionando.

> A 'staging', diferentemente, servirá para atualizações que estão inacabadas ou não funcionando.

### Como subir um projeto para o GIT:
Se você tem uma atualização para subir para o repositório, você deve ser os seguintes comandos:

>1. Digite: git checkout master (Caso você queira subir para a master. Caso queira subir para a staging, substitua master por staging)
>2. Digite: git add . (O 'git add .' serve para adicionar todos os arquivos atualizados para o repositório. Caso você queira adicionar um específico, digite 'git add .nome')
>3. Digite: git commit -m "comentario" (Substitua o "comentário" com um pequeno resumo da atualização que foi subida para o repositório através do seu código)
>4. Digite: git push --set-upstream origin master (Caso você queira subir para a master. Caso queira subir para a staging, substitua master por staging)
>Pronto, aguarde a autorização dos administradores para aceitar as suas atualizações.

### Como unir os códigos (do staging para master)?

>1. Com o Git Bash aberto, você deve entrar na 'branch' que irá receber a atualização, no caso a master, com o comando: git checkout master
>2. Digite: git pull (Você estará verificando se há atualizações de outros membros que não foram incluidas no seu código, caso apareça [ Already up to date ] é porque está tudo certo)
>3. Depois, você deve unir os códigos com o comando: git merge staging     (Você quer passar da staging para master, por isso escolhemos a staging)
>4. Depois digite: git push
>E o seu código já irá ser redirecionado da staging para a master!
