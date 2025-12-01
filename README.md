# PsC-A3_2
Trabalho A3 de: Kalil, Igor Araujo, Sandro Gustavo, Lucas de Borba e Luiz Loch

## Sistema de Gestão de Estoque de Produtos

Sistema CRUD completo para gerenciamento de estoque de produtos desenvolvido em Java com interface gráfica Swing e banco de dados MySQL.

### Funcionalidades

- ✅ **CRUD Completo de Produtos**
  - Cadastro de produtos
  - Listagem de produtos
  - Edição de produtos
  - Exclusão de produtos

- ✅ **Campos do Produto**
  - ID do Produto (auto-increment)
  - Nome do Produto
  - Descrição do Produto
  - Quantidade em Estoque
  - Preço
  - Data de Cadastro

### Pré-requisitos

1. **Java JDK 8 ou superior**
2. **MySQL Server** (versão 5.7 ou superior)
3. **MySQL Connector/J** (driver JDBC para MySQL)
   - Download: https://dev.mysql.com/downloads/connector/j/
   - Versão recomendada: 8.0.x ou 9.4.x

### Configuração do Banco de Dados

1. **Criar o banco de dados:**
   ```sql
   CREATE DATABASE db_produtos;
   ```

2. **Executar o script de criação da tabela:**
   ```sql
   USE db_produtos;
   
   CREATE TABLE IF NOT EXISTS tb_produtos (
       id_produto INT AUTO_INCREMENT PRIMARY KEY,
       nome_produto VARCHAR(100) NOT NULL,
       descricao_produto VARCHAR(255),
       quantidade_estoque INT DEFAULT 0,
       preco DECIMAL(10, 2) DEFAULT 0.00,
       data_cadastro DATE
   );
   ```
   
   Ou execute o arquivo `create_table.sql` que está na raiz do projeto.

3. **Configurar credenciais do banco:**
   
   Edite o arquivo `src/DAO/ProdutoDAO.java` e ajuste as seguintes constantes conforme sua configuração:
   ```java
   private static final String SERVER = "localhost";
   private static final String DATABASE = "db_produtos";
   private static final String USER = "root";        // Seu usuário MySQL
   private static final String PASS = "bcd127";     // Sua senha MySQL
   ```

### Configuração do Projeto

1. **Adicionar MySQL Connector ao projeto:**
   
   - Baixe o MySQL Connector/J (arquivo .jar)
   - No NetBeans:
     - Clique com botão direito no projeto → Properties
     - Libraries → Add JAR/Folder
     - Selecione o arquivo mysql-connector-j-x.x.x.jar
   
   - Ou copie o JAR para uma pasta `lib` no projeto e adicione ao classpath

2. **Compilar o projeto:**
   - No NetBeans: Build → Build Project (F11)
   - Ou via linha de comando:
     ```bash
     javac -cp ".:mysql-connector-j-x.x.x.jar" src/**/*.java
     ```

### Como Executar

1. **Certifique-se de que o MySQL está rodando**

2. **Execute a classe Principal:**
   - No NetBeans: Run → Run Project (F6)
   - Ou execute: `src/Principal/Principal.java`
   - Ou via linha de comando:
     ```bash
     java -cp ".:mysql-connector-j-x.x.x.jar:build/classes" Principal.Principal
     ```

3. **Login no sistema:**
   - Usuário: `admin`
   - Senha: `1234`

4. **Navegação:**
   - Após o login, clique em "Produto" no menu principal
   - Escolha entre "Cadastrar Produto" ou "Gerenciar Produtos"

### Estrutura do Projeto

```
PsC-A3_2/
├── src/
│   ├── DAO/              # Camada de acesso a dados
│   │   ├── ProdutoDAO.java
│   │   └── ClienteDAO.java
│   ├── Model/             # Modelos de dados
│   │   ├── Produto.java
│   │   └── Cliente.java
│   ├── View/              # Interface gráfica
│   │   ├── TelaLogin.java
│   │   ├── MainTela.java
│   │   ├── ProdutoCadTela.java
│   │   ├── ProdutoEscTela.java
│   │   └── ProdutoGerTela.java
│   └── Principal/         # Classe principal
│       └── Principal.java
├── create_table.sql       # Script SQL para criar a tabela
└── README.md
```

### Solução de Problemas

**Erro: "Driver JDBC não encontrado!"**
- Verifique se o MySQL Connector/J está adicionado ao classpath do projeto

**Erro: "Não foi possível conectar ao banco"**
- Verifique se o MySQL está rodando
- Confirme as credenciais (usuário e senha) no ProdutoDAO.java
- Verifique se o banco `db_produtos` foi criado
- Verifique se a tabela `tb_produtos` existe

**Erro ao inserir produto:**
- Verifique se todos os campos obrigatórios estão preenchidos
- Verifique se os tipos de dados estão corretos (estoque = inteiro, preço = decimal)

### Notas

- O ID do produto é gerado automaticamente pelo banco de dados (AUTO_INCREMENT)
- A data de cadastro é preenchida automaticamente com a data atual
- O sistema possui validação básica de campos numéricos

### Desenvolvedores

Kalil, Igor Araujo, Sandro Gustavo, Lucas de Borba e Luiz Loch