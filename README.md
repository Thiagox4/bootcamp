

# 🐶 MeuPetshop_bootcamp

## 📌 Sobre o projeto

Este projeto é uma **API de PetShop desenvolvida em Java usando Spring Boot**.
O objetivo do sistema é gerenciar **clientes, cães e agendamentos de serviços**, como banho e tosa.

A aplicação segue o padrão **CRUD**, permitindo criar, listar, atualizar e excluir informações no sistema. Esse tipo de operação é comum em APIs REST feitas com Spring Boot. ([GeeksforGeeks][1])

---

# 🛠 Tecnologias utilizadas

Neste projeto utilizei as seguintes tecnologias:

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Maven
* H2 Database (banco em memória)

Essas tecnologias permitem criar **APIs REST, acessar banco de dados e organizar o sistema em camadas**. ([BezKoder][2])

---

# 📂 Estrutura do projeto

O projeto está organizado em pacotes para separar responsabilidades:

```
controller
model
repository
service
validation
email
```

### Função de cada pasta

**controller**
Responsável por receber as requisições HTTP da API.

**service**
Contém as regras de negócio do sistema.

**repository**
Responsável por acessar o banco de dados.

**model**
Contém as classes que representam os dados do sistema.

**validation**
Contém validações de dados.

**email**
Responsável por envio de e-mails do sistema.

Essa separação ajuda a manter o código mais organizado e fácil de manter.

---

# ⚙️ Funcionalidades do sistema

O sistema permite realizar as seguintes operações:

* cadastrar cliente
* cadastrar cão
* listar clientes
* listar cães
* criar agendamento
* listar agendamentos
* alterar agendamento
* excluir agendamento

Essas operações fazem parte do padrão **CRUD (Create, Read, Update, Delete)** usado em APIs. ([GeeksforGeeks][1])

---

# ▶️ Como executar o projeto

1️⃣ Clonar o repositório

```
git clone URL_DO_REPOSITORIO
```

2️⃣ Entrar na pasta do projeto

```
cd meupetshop
```

3️⃣ Rodar a aplicação

```
mvn spring-boot:run
```

4️⃣ Acessar no navegador ou Postman

```
http://localhost:8080
```

---

# 🌐 Endpoints principais

### Clientes

```
GET /clientes
POST /clientes
PUT /clientes/{id}
DELETE /clientes/{id}
```

### Cães

```
GET /caos
POST /caos
PUT /caos/{id}
DELETE /caos/{id}
```

### Agendamentos

```
GET /agendamentos
POST /agendamentos
PUT /agendamentos/{id}
DELETE /agendamentos/{id}
```

---


[1]: https://www.geeksforgeeks.org/springboot/spring-mvc-crud-with-example/?utm_source=chatgpt.com "Spring MVC CRUD with Example - GeeksforGeeks"
[2]: https://www.bezkoder.com/spring-boot-thymeleaf-example/?utm_source=chatgpt.com "Spring Boot Thymeleaf CRUD example - BezKoder"
