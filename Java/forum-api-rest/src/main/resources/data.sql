INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$L54qEOSfQAv9EceLsBYNceHRHUYyh5/TkR8F7NtzgPpr/zmBseHLa');
INSERT INTO USUARIO(nome, email, senha) VALUES('Adm', 'adm@email.com', '$2a$10$P9M.9.yaANhZBumRuCtm9u3PWcipSnFKyBdeWEZGD6Z/YF.zli5Um');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_ADM');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);