CREATE TABLE public.docente(
  nu_ano_censo integer,
  co_pessoa_fisica bigint NOT NULL,
  nu_dia integer,
  nu_mes integer,
  nu_ano integer,
  nu_idade_referencia integer,
  nu_idade integer,
  tp_sexo integer,
  tp_cor_raca integer,
  tp_nacionalidade integer,
  co_pais_origem integer,
  co_uf_nasc integer,
  co_municipio_nasc integer,
  co_uf_end integer,
  co_municipio_end integer,
  tp_zona_residencial integer,
  in_necessidade_especial integer,
  in_cegueira integer,
  in_baixa_visao integer,
  in_surdez integer,
  in_def_auditiva integer,
  in_surdocegueira integer,
  in_def_fisica integer,
  in_def_intelectual integer,
  in_def_multipla integer,
  tp_escolaridade integer,
  tp_normal_magisterio integer,
  tp_situacao_curso_1 integer,
  co_area_curso_1 integer,
  co_curso_1 character varying(6),
  in_licenciatura_1 integer,
  in_com_pedagogica_1 integer,
  nu_ano_inicio_1 integer,
  nu_ano_conclusao_1 integer,
  tp_tipo_ies_1 integer,
  co_ies_1 integer,
  tp_situacao_curso_2 integer,
  co_area_curso_2 integer,
  co_curso_2 character varying(6),
  in_licenciatura_2 integer,
  in_com_pedagogica_2 integer,
  nu_ano_inicio_2 integer,
  nu_ano_conclusao_2 integer,
  tp_tipo_ies_2 integer,
  co_ies_2 integer,
  tp_situacao_curso_3 integer,
  co_area_curso_3 integer,
  co_curso_3 character varying(6),
  in_licenciatura_3 integer,
  in_com_pedagogica_3 integer,
  nu_ano_inicio_3 integer,
  nu_ano_conclusao_3 integer,
  tp_tipo_ies_3 integer,
  co_ies_3 integer,
  in_disc_quimica integer,
  in_disc_fisica integer,
  in_disc_matematica integer,
  in_disc_biologia integer,
  in_disc_ciencias integer,
  in_disc_lingua_portuguesa integer,
  in_disc_lingua_ingles integer,
  in_disc_lingua_espanhol integer,
  in_disc_lingua_frances integer,
  in_disc_lingua_outra integer,
  in_disc_lingua_indigena integer,
  in_disc_artes integer,
  in_disc_educacao_fisica integer,
  in_disc_historia integer,
  in_disc_geografia integer,
  in_disc_filosofia integer,
  in_disc_ensino_religioso integer,
  in_disc_estudos_sociais integer,
  in_disc_sociologia integer,
  in_disc_est_sociais_sociologia integer,
  in_disc_informatica_computacao integer,
  in_disc_profissionalizante integer,
  in_disc_atendimento_especiais integer,
  in_disc_diver_socio_cultural integer,
  in_disc_libras integer,
  in_disc_pedagogicas integer,
  in_disc_outras integer,
  in_especializacao integer,
  in_mestrado integer,
  in_doutorado integer,
  in_pos_nenhum integer,
  in_especifico_creche integer,
  in_especifico_pre_escola integer,
  in_especifico_anos_iniciais integer,
  in_especifico_anos_finais integer,
  in_especifico_ens_medio integer,
  in_especifico_eja integer,
  in_especifico_ed_especial integer,
  in_especifico_ed_indigena integer,
  in_especifico_campo integer,
  in_especifico_ambiental integer,
  in_especifico_dir_humanos integer,
  in_especifico_div_sexual integer,
  in_especifico_dir_adolesc integer,
  in_especifico_afro integer,
  in_especifico_outros integer,
  in_especifico_nenhum integer,
  tp_tipo_docente integer,
  tp_tipo_contratacao integer,
  id_turma integer NOT NULL,
  tp_tipo_turma integer,
  tp_mediacao_didatico_pedago integer,
  in_especial_exclusiva integer,
  in_regular integer,
  in_eja integer,
  in_profissionalizante integer,
  tp_etapa_ensino integer,
  co_curso_educ_profissional integer,
  co_entidade integer NOT NULL,
  co_regiao integer,
  co_mesorregiao integer,
  co_microrregiao integer,
  co_uf integer,
  co_municipio integer,
  co_distrito integer,
  tp_dependencia integer,
  tp_localizacao integer,
  tp_categoria_escola_privada integer,
  in_conveniada_pp integer,
  tp_convenio_poder_publico integer,
  in_mant_escola_privada_emp integer,
  in_mant_escola_privada_ong integer,
  in_mant_escola_privada_sind integer,
  in_mant_escola_privada_sist_s integer,
  in_mant_escola_privada_s_fins integer,
  tp_regulamentacao integer,
  tp_localizacao_diferenciada integer,
  in_educacao_indigena integer,
  CONSTRAINT docente_pkey PRIMARY KEY (co_pessoa_fisica, co_entidade, id_turma),
  CONSTRAINT co_entidade FOREIGN KEY (co_entidade)
      REFERENCES public.escola (co_entidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT docente_co_entidade_fkey FOREIGN KEY (co_entidade)
      REFERENCES public.escola (co_entidade) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT docente_id_turma_fkey FOREIGN KEY (id_turma)
      REFERENCES public.turma (id_turma) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.docente
  OWNER TO postgres;