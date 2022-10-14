### Utilizando o GIT: 

Estamos utilizando duas Branchs dentro desse projeto: 'master' e 'staging'.
> A branch 'master' será redirecionada para atualizações do código que estão completas e funcionando.
> A 'staging', diferentemente, servirá para atualizações que estão inacabadas ou não funcionando.

### 1. O que fazer para ir atualizando o projeto?

> Primeiramente, instale o GIT no seu computador. 
> Configure ele com esses dois comandos: 
> 1. Digite: git config --global user.name "nome sobrenome" 
> 2. Digite: git config --global user.email "email"
>
> Após ter configurado essas duas coisas, vamos começar um clone do repositório principal.
> Acesse o link - ( https://github.com/vbasilioo/Advocacia )
> Clique em FORK ( https://www.upload.ee/image/14581421/fork.png ) e depois em 'Create Fork'

> Após criar a Fork, vamos clonar esse repositório.
> 1. Vá até o seu repositório do Fork, vá até 'Code' (botão verde) e copie o link disponível no HTTPS.
> 2. Depois, inicie o GIT no seu computador e digite:
> 3. cd .. ( Isso retornará o GIT para o Disco Local C: do seu computador )
> 4. Digite: git clone LINK ( Substitua LINK pela URL do seu repositório FORK ) e pressione Enter.

> Após clonar, vamos sincronizar o Fork com o repositório original
> 1. Vá até o seu repositório do projeto original, vá até 'Code' (botão verde) e copie o link disponível no HTTPS.
> 2. Abra o Git Bash.
> 3. Digite: cd ..
> 4. Digite: cd Advocacia
> 5. Digite: ls
> 6. Digite: git remote -v 
> 7. Digite: git remote add upstream URL ( URL copiada do repositório original )
> Para verificar se a sincronziação está certa, digite novamente: git remove -v
> Se aparecer 'Origin' e 'Upstream' é porque a sincronização foi um sucesso!

### 2. Como subir um projeto para o GitHub pelo GIT:
Se você tem uma atualização para subir para o repositório, você deve ser os seguintes comandos:

>Abra a pasta do projeto, clique com o botão direito do mouse em qualquer lugar e clique em Git Bash, depois siga os passos abaixo:
>1. Digite: git checkout master (Caso você queira subir para a master. Caso queira subir para a staging, substitua master por staging)
>2. Digite: git add . (O 'git add .' serve para adicionar todos os arquivos atualizados para o repositório. Caso você queira adicionar um específico, digite 'git add .nome')
>3. Digite: git commit -m "comentario" (Substitua o "comentário" com um pequeno resumo da atualização que foi subida para o repositório através do seu código)
>4. Digite: git push --set-upstream origin master (Caso você queira subir para a master. Caso queira subir para a staging, substitua master por staging)
>5. Atualize o repositório do projeto no GitHub. Irá aparecer pra você uma 'recente atualização' com o nome da sua brunch. Clique em 'Compare & Pull Request'
>6. A seguinte imagem irá aparecer pra você ( https://www.upload.ee/image/14581339/aaa.png )
>7. A brancha da direita, no exemplo 'Sistema de Login' irá redirecionar os arquivos atualizados para a 'Master'
>8. No campo de baixo ( https://www.upload.ee/image/14581341/bbb.png ) coloque o título da atualização, e nos comentários, o que foi atualizado
>9. Clique em 'Create pull request'

>Pronto, aguarde o seu projeto ser enviado para o repositório acompanhando pela tela do GIT. Após finalizar, um administrador aceitará seu pull request e os arquivos do repositório serão atualizados.

### 3. Como unir os códigos (do staging para master)?

>1. Com o Git Bash aberto, você deve entrar na 'branch' que irá receber a atualização, no caso a master, com o comando: git checkout master
>2. Digite: git pull (Você estará verificando se há atualizações de outros membros que não foram incluidas no seu código, caso apareça [ Already up to date ] é porque está tudo certo)
>3. Depois, você deve unir os códigos com o comando: git merge staging     (Você quer passar da staging para master, por isso escolhemos a staging)
>4. Depois digite: git push
>E o seu código já irá ser redirecionado da staging para a master!
