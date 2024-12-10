# Sistema de Universidade
![image](https://github.com/user-attachments/assets/ce971048-569b-40b7-9c34-cdc2e4742780)


## Descrição
Este projeto é um sistema de gestão de universidade em Java utilizando Programação Orientada a Objetos (POO). Ele modela a estrutura de uma universidade, incluindo os relacionamentos entre universidades, departamentos, professores e disciplinas.

## Estrutura do Projeto
- **Classe Universidade**:
  - **Atributos**: 
    - `nome`: Nome da universidade.
    - `departamentos`: Lista de objetos do tipo `Departamento`.

- **Classe Departamento**:
  - **Atributos**: 
    - `nome`: Nome do departamento.
    - `professores`: Lista de objetos do tipo `Professor`.

- **Classe Professor**:
  - **Atributos**: 
    - `nome`: Nome do professor.
    - `disciplinas`: Lista de objetos do tipo `Disciplina`.

- **Classe Disciplina**:
  - **Atributos**: 
    - `nome`: Nome da disciplina.

## Funcionalidades
- Adição de departamentos a uma universidade.
- Adição de professores a um departamento.
- Adição de disciplinas a um professor.

## Como Executar
1. Clone o repositório do GitHub:
   ```bash
   git clone https://github.com/teofilonicolau/sistema_universidade.git

   ```
2. Navegue até o diretório do projeto:

    ```bash
   cd sistema_universidade


   ```
3. Compile e execute o projeto utilizando o IntelliJ IDEA ou os seguintes comandos Maven:
   - mvn clean install
   - mvn exec:java -Dexec.mainClass="com.example.universidadesistema.Main"

## Tecnologias Utilizadas
 - Java

 - Maven

- IntelliJ IDEA

  
    
   
