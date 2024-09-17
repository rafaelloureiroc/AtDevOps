Bem vindo ao Projeto de cadastro de produtos e registro de pedidos

Abaixo, será feito um tutorial para os ajustes necessarios para cada ambiente que desejar rodar


Localmente (Docker):

1) Realize o git clone em sua maquina
2) Abra o projeto em sua IDE, seja ela Eclipse ou Intellij
3) Navegue até o diretorio do microsserviço DB e execute o seguinte comando: docker-compose up --build, em caso de erro ou restart, utilize docker compose down 
4) Ajuste os arquivos Application.properties localizados em src/mainc/resources e altere spring.datasource.url=jdbc:mysql://my-sql:3306/AtDevOPS PARA spring.datasource.url=jdbc:mysql://localhost:3306/AtDevOPS com intuito de conectar-se ao banco de dados no container
5) Ajuste a url localizada classe ProdutoClient, do microsserviço TP1Pedido, de  http://produto-service:8080 PARA http://localhost:8080]
6) Aplicações prontas para rodar Localmente!

Minikube (Ambiente Simulado de Produção):

