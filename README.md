Bem vindo ao Projeto de cadastro de produtos e registro de pedidos

Abaixo, será feito um tutorial para os ajustes necessarios para cada ambiente que desejar rodar

Docker:

1) Realize o git clone em sua maquina
2) Abra o projeto em sua IDE, seja ela Eclipse ou Intellij
3) Navegue até o diretorio do microsserviço DB e execute o seguinte comando: docker-compose up --build, em caso de erro ou restart, utilize docker compose down 
4) Ajuste os arquivos Application.properties localizados em src/main/resources e altere
  - spring.datasource.url=jdbc:mysql://my-sql:3306/AtDevOPS
  - PARA
  - spring.datasource.url=jdbc:mysql://localhost:3306/AtDevOPS com intuito de conectar-se ao banco de dados no container
6) Ajuste a url localizada classe ProdutoClient, do microsserviço TP1Pedido, de  http://produto-service:8080 PARA http://localhost:8080
7) Aplicações prontas para rodar Localmente!

Minikube (Ambiente Simulado de Produção):

1) Não é necessario alterar nenhuma url e configuração no application properties, após dar um git clone, basta seguir os passos abaixo

2) Instalar minikube, a instalação pode ser via chocolatey (execute o comando Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1')) no POWERSHELL ) e após isso, execute choco install minikube para instalar o minikube e choco install kubernetes-cli para instalar o cluster kubernetes
   
3) Executar minikube start no terminal da IDE, por exemplo
   
4) Execute os 3 comandos abaixo para dar apply no kubernetes:
   - kubectl apply -f pedido-service-at-deployment.yaml
   - kubectl apply -f produto-service-deployment.yaml
   - kubectl apply -f mysql-deployment.yaml
  

5) Verifique se os deployments foram feitos com sucesso com: minikube dashboard
 
6) Por fim, execute os comandos para criar um túnel entre a máquina que está simulando o ambiente de produção e o serviço no cluster Kubernetes:
   - kubectl port-forward svc/pedido-service-at 8081:8081
   - kubectl port-forward svc/produto-service 8080:8080

7) Execute as chamados da mesmo forma que localmente, através do localhost e as aplicações estarão deployadas e funcionais no kubernetes!
