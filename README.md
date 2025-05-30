SISTEMA DE VALIDAÇÃO DE ATESTADO

A entidade central escolhida pelo grupo é a Validação de Atestado. Essa entidade representa o processo automatizado no qual o sistema recebe, verifica e armazena atestados médicos enviados por colaboradores de uma empresa.

O objetivo principal é garantir que as declarações médicas sejam submetidas de forma correta e dentro dos prazos estabelecidos, proporcionando um processo padronizado, rápido e com validação automática de critérios obrigatórios.

A validação de atestados é uma etapa crítica na gestão de afastamentos. Um sistema que automatize esse processo contribui para:
•	Evitar atrasos na entrega e análise dos documentos.
•	Garantir que apenas documentos válidos (com nome, CID, assinatura, carimbo, sem rasuras) sejam aceitos.
•	Minimizar erros humanos na verificação manual de atestados.
•	Agilizar o contato entre colaborador e os setores de RH e saúde da empresa.

Atributos Principais

- CPF do colaborador
- Nome completo
- Empresa
- E-mail
- Cidade
- E-mail do gestor ou RH
- Arquivo do atestado (PDF ou imagem)
- Campos do atestado: assinatura, carimbo, CID, legibilidade, rasura

Este sistema realiza o cadastro e a validação de colaboradores que enviam atestados médicos. Foi desenvolvido com base na modelagem orientada a objetos e inclui:
- Diagrama de Caso de USO, Classes, Sequência e Atividades
- CRUD completo via console
- Validação de dados (CPF, e-mail, nome)
- Código em Java.

Estrutura de Classes
- `Colaborador.java` — representa os dados do colaborador
- `Persistencia.java` — leitura/escrita de dados em arquivo `.txt`
- `ValidacaoException.java` — exceção customizada para entrada inválida
- `Main.java` — interface de console e execução principal
