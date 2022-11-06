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
>2. Digite: git pull origin master
>3. Digite: git add . (O 'git add .' serve para adicionar todos os arquivos atualizados para o repositório. Caso você queira adicionar um específico, digite 'git add .nome')
>4. Digite: git commit -m "comentario" (Substitua o "comentário" com um pequeno resumo da atualização que foi subida para o repositório através do seu código)
>5. Digite: git push --set-upstream origin master (Caso você queira subir para a master. Caso queira subir para a staging, substitua master por staging)
>6. Atualize o repositório e veja se há alterações recentes. Se sim, as alterações foram um sucesso!

>Pronto, aguarde o seu projeto ser enviado para o repositório acompanhando pela tela do GIT. Após finalizar, um administrador aceitará seu pull request e os arquivos do repositório serão atualizados.
> Lembrando que este código será enviado para o seu repositório 'Fork'. Logo abaixo, estará o processo para enviar para o repositório original.

### 3. Como fazer um pull request?
>1. Vá até o seu repositório 'Fork'. O seu commit irá aparecer logo acima dos arquivos do seu código (caso o upload tenha dado certo)
>2. Na linha em que fala que o seu commit foi adicionado na master (ou staging), clique em 'Pull request'
>3. Depois disso, você irá escolher de qual dos seus repositórios ( Fork Advocacia ) e de qual branch ( Master ou Staging ) sairá o que você quer mandar para o repositório original
>4. Você tem que saber para qual repositório os novos arquivos vão ( Advocacia ) e de qual branch sairá ( Master ou Staging )
>5. Digite um título do que foi alterado e alguns comentários com as atualizações, remoções e alterações
>6. Envie o pull request para o repositório original e aguarde ser aprovado
