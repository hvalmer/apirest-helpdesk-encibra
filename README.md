# Desafio Helpdesk Encibra
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/hvalmer/apirest-helpdesk-encibra/blob/master/LICENSE) 

# Sobre o projeto

https://github.com/hvalmer/apirest-helpdesk-encibra

Desenvolver uma central de ajuda (Helpdesk) com uma API construída em Java 17 utilizando o framework Spring para atender às histórias de usuário mencionadas requer a criação de várias classes, endpoints, e serviços.

# Tecnologias utilizadas
## Back end
- Java 17
- Spring Boot
- Spring Web
- Spring Security
- JPA / Hibernate
- Maven

## Fluxo do desenvolvimento
- criado um pacote domain com as classes que compõem o sistema
- e dentro desse pacote os DTO´s e enums com perfil, prioridade e status.
- pacote de acesso a dados com a camada repository.
- carga inicial do BD para testes e ajustes no pom.
- criado padrão DTO para Tecnico e Cliente e implantação das properties específicas.
- algumas exceptions para objetos não encontrados e CPF e email já cadastrados.
- CRUD completo para Cliente e Chamado.
- Nesse ponto, é tratado a autenticação JWT e classe JWTUtil para gerar o Token
- Autenticação e autorização com JWT
- implementação da classe de testes
 
## Implantação em produção

- Banco de dados: H2 embutido no Spring Boot

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/hvalmer/apirest-helpdesk-encibra.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Harlan Goyana

https://www.linkedin.com/in/harlan-goyana-83ba42125/
