# Projeto CRUD Spring Boot

## Projeto de aprendizado utilizando Java, Spring Boot e Hibernates

Um sistema web simples para praticar meus aprendizados de Spring Boot, um CRUD de produtos sendo separados por categoria, guardando os dados em um banco de dados MariaDB, utilizando a tecnologia JPA Hibernates para conectar os dois, utilizei HTML, CSS, JavaScript e Thymeleaf para fazer o front-end básico para uma interface amigável.

## Como utilizar

- Você precisará do JDK (Java Developer Kit) para rodar o projeto, em uma IDE de sua preferência. [Download](https://www.oracle.com/java/technologies/downloads/).

- Clone o repositório
  ```bash
    git clone [https://github.com/annajulia-dev/CRUD.git](https://github.com/annajulia-dev/CRUD.git)
    cd CRUD
    ```
  
- Para o banco de dados o MariaDB foi utilizado e você precisará colocar as informar os dados para linkar o banco de dados em /src/main/java/com/base/base/resources/application.properties, substituindo nessa parte:
<img width="350" height="68" alt="image" src="https://github.com/user-attachments/assets/ca9b9775-796e-4984-b519-861a262512f0" />

E o banco de dados será criado automaticamente graças ao Hibernates JPA, não se preocupe com isso.
[Download MariaDB](https://mariadb.org/download/?t=mariadb&p=mariadb&r=12.1.2&os=Linux&cpu=x86_64&pkg=tar_gz&i=systemd&mirror=fder)

- De resto o projeto utiliza Maven, então todas as dependências são instalada sozinhas.
