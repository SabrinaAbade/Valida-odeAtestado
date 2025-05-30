SISTEMA DE VALIDAÇÃO DE ATESTADO

Este sistema realiza o cadastro e a validação de colaboradores que enviam atestados médicos. Foi desenvolvido com base na modelagem orientada a objetos e inclui:
- Diagrama de classes 
- CRUD completo via console
- Validação de dados (CPF, e-mail, nome)
- Código em Java.

Estrutura de Classes
- `Colaborador.java` — representa os dados do colaborador
- `Persistencia.java` — leitura/escrita de dados em arquivo `.txt`
- `ValidacaoException.java` — exceção customizada para entrada inválida
- `Main.java` — interface de console e execução principal
