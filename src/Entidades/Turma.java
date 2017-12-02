/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author elivelton
 */
@Entity
@Table(name = "turma")
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t")})
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nu_ano_censo")
    private Integer nuAnoCenso;
    @Id
    @Basic(optional = false)
    @Column(name = "id_turma")
    private Integer idTurma;
    @Column(name = "no_turma")
    private String noTurma;
    @Column(name = "tx_hr_inicial")
    private String txHrInicial;
    @Column(name = "tx_mi_inicial")
    private String txMiInicial;
    @Column(name = "nu_duracao_turma")
    private Integer nuDuracaoTurma;
    @Column(name = "nu_matriculas")
    private Integer nuMatriculas;
    @Column(name = "tp_mediacao_didatico_pedago")
    private Integer tpMediacaoDidaticoPedago;
    @Column(name = "in_especial_exclusiva")
    private Integer inEspecialExclusiva;
    @Column(name = "in_regular")
    private Integer inRegular;
    @Column(name = "in_eja")
    private Integer inEja;
    @Column(name = "in_profissionalizante")
    private Integer inProfissionalizante;
    @Column(name = "tp_etapa_ensino")
    private Integer tpEtapaEnsino;
    @Column(name = "co_curso_educ_profissional")
    private Integer coCursoEducProfissional;
    @Column(name = "tp_tipo_turma")
    private Integer tpTipoTurma;
    @Column(name = "in_mais_educacao")
    private Integer inMaisEducacao;
    @Column(name = "nu_dias_atividade")
    private Integer nuDiasAtividade;
    @Column(name = "in_dia_semana_domingo")
    private Integer inDiaSemanaDomingo;
    @Column(name = "in_dia_semana_segunda")
    private Integer inDiaSemanaSegunda;
    @Column(name = "in_dia_semana_terca")
    private Integer inDiaSemanaTerca;
    @Column(name = "in_dia_semana_quarta")
    private Integer inDiaSemanaQuarta;
    @Column(name = "in_dia_semana_quinta")
    private Integer inDiaSemanaQuinta;
    @Column(name = "in_dia_semana_sexta")
    private Integer inDiaSemanaSexta;
    @Column(name = "in_dia_semana_sabado")
    private Integer inDiaSemanaSabado;
    @Column(name = "co_tipo_atividade_1")
    private Integer coTipoAtividade1;
    @Column(name = "co_tipo_atividade_2")
    private Integer coTipoAtividade2;
    @Column(name = "co_tipo_atividade_3")
    private Integer coTipoAtividade3;
    @Column(name = "co_tipo_atividade_4")
    private Integer coTipoAtividade4;
    @Column(name = "co_tipo_atividade_5")
    private Integer coTipoAtividade5;
    @Column(name = "co_tipo_atividade_6")
    private Integer coTipoAtividade6;
    @Column(name = "in_braille")
    private Integer inBraille;
    @Column(name = "in_recursos_baixa_visao")
    private Integer inRecursosBaixaVisao;
    @Column(name = "in_processos_mentais")
    private Integer inProcessosMentais;
    @Column(name = "in_orientacao_mobilidade")
    private Integer inOrientacaoMobilidade;
    @Column(name = "in_sinais")
    private Integer inSinais;
    @Column(name = "in_comunicacao_alt_aument")
    private Integer inComunicacaoAltAument;
    @Column(name = "in_enriq_curricular")
    private Integer inEnriqCurricular;
    @Column(name = "in_soroban")
    private Integer inSoroban;
    @Column(name = "in_informatica_acessivel")
    private Integer inInformaticaAcessivel;
    @Column(name = "in_port_escrita")
    private Integer inPortEscrita;
    @Column(name = "in_autonomia_escolar")
    private Integer inAutonomiaEscolar;
    @Column(name = "in_disc_quimica")
    private Integer inDiscQuimica;
    @Column(name = "in_disc_fisica")
    private Integer inDiscFisica;
    @Column(name = "in_disc_matematica")
    private Integer inDiscMatematica;
    @Column(name = "in_disc_biologia")
    private Integer inDiscBiologia;
    @Column(name = "in_disc_ciencias")
    private Integer inDiscCiencias;
    @Column(name = "in_disc_lingua_portuguesa")
    private Integer inDiscLinguaPortuguesa;
    @Column(name = "in_disc_lingua_ingles")
    private Integer inDiscLinguaIngles;
    @Column(name = "in_disc_lingua_espanhol")
    private Integer inDiscLinguaEspanhol;
    @Column(name = "in_disc_lingua_frances")
    private Integer inDiscLinguaFrances;
    @Column(name = "in_disc_lingua_outra")
    private Integer inDiscLinguaOutra;
    @Column(name = "in_disc_lingua_indigena")
    private Integer inDiscLinguaIndigena;
    @Column(name = "in_disc_artes")
    private Integer inDiscArtes;
    @Column(name = "in_disc_educacao_fisica")
    private Integer inDiscEducacaoFisica;
    @Column(name = "in_disc_historia")
    private Integer inDiscHistoria;
    @Column(name = "in_disc_geografia")
    private Integer inDiscGeografia;
    @Column(name = "in_disc_filosofia")
    private Integer inDiscFilosofia;
    @Column(name = "in_disc_ensino_religioso")
    private Integer inDiscEnsinoReligioso;
    @Column(name = "in_disc_estudos_sociais")
    private Integer inDiscEstudosSociais;
    @Column(name = "in_disc_sociologia")
    private Integer inDiscSociologia;
    @Column(name = "in_disc_est_sociais_sociologia")
    private Integer inDiscEstSociaisSociologia;
    @Column(name = "in_disc_informatica_computacao")
    private Integer inDiscInformaticaComputacao;
    @Column(name = "in_disc_profissionalizante")
    private Integer inDiscProfissionalizante;
    @Column(name = "in_disc_atendimento_especiais")
    private Integer inDiscAtendimentoEspeciais;
    @Column(name = "in_disc_diver_socio_cultural")
    private Integer inDiscDiverSocioCultural;
    @Column(name = "in_disc_libras")
    private Integer inDiscLibras;
    @Column(name = "in_disc_pedagogicas")
    private Integer inDiscPedagogicas;
    @Column(name = "in_disc_outras")
    private Integer inDiscOutras;
    @Column(name = "co_entidade")
    private Integer coEntidade;
    @Column(name = "co_regiao")
    private Integer coRegiao;
    @Column(name = "co_mesorregiao")
    private Integer coMesorregiao;
    @Column(name = "co_microrregiao")
    private Integer coMicrorregiao;
    @Column(name = "co_uf")
    private Integer coUf;
    @Column(name = "co_municipio")
    private Integer coMunicipio;
    @Column(name = "co_distrito")
    private Integer coDistrito;
    @Column(name = "tp_dependencia")
    private Integer tpDependencia;
    @Column(name = "tp_localizacao")
    private Integer tpLocalizacao;
    @Column(name = "tp_categoria_escola_privada")
    private Integer tpCategoriaEscolaPrivada;
    @Column(name = "in_conveniada_pp")
    private Integer inConveniadaPp;
    @Column(name = "tp_convenio_poder_publico")
    private Integer tpConvenioPoderPublico;
    @Column(name = "in_mant_escola_privada_emp")
    private Integer inMantEscolaPrivadaEmp;
    @Column(name = "in_mant_escola_privada_ong")
    private Integer inMantEscolaPrivadaOng;
    @Column(name = "in_mant_escola_privada_sind")
    private Integer inMantEscolaPrivadaSind;
    @Column(name = "in_mant_escola_privada_sist_s")
    private Integer inMantEscolaPrivadaSistS;
    @Column(name = "in_mant_escola_privada_s_fins")
    private Integer inMantEscolaPrivadaSFins;
    @Column(name = "tp_regulamentacao")
    private Integer tpRegulamentacao;
    @Column(name = "tp_localizacao_diferenciada")
    private Integer tpLocalizacaoDiferenciada;
    @Column(name = "in_educacao_indigena")
    private Integer inEducacaoIndigena;
    @OneToMany(mappedBy = "idTurma")
    private List<Matricula> matriculaList;

    public Turma() {
    }

    public Turma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public Integer getNuAnoCenso() {
        return nuAnoCenso;
    }

    public void setNuAnoCenso(Integer nuAnoCenso) {
        this.nuAnoCenso = nuAnoCenso;
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public String getNoTurma() {
        return noTurma;
    }

    public void setNoTurma(String noTurma) {
        this.noTurma = noTurma;
    }

    public String getTxHrInicial() {
        return txHrInicial;
    }

    public void setTxHrInicial(String txHrInicial) {
        this.txHrInicial = txHrInicial;
    }

    public String getTxMiInicial() {
        return txMiInicial;
    }

    public void setTxMiInicial(String txMiInicial) {
        this.txMiInicial = txMiInicial;
    }

    public Integer getNuDuracaoTurma() {
        return nuDuracaoTurma;
    }

    public void setNuDuracaoTurma(Integer nuDuracaoTurma) {
        this.nuDuracaoTurma = nuDuracaoTurma;
    }

    public Integer getNuMatriculas() {
        return nuMatriculas;
    }

    public void setNuMatriculas(Integer nuMatriculas) {
        this.nuMatriculas = nuMatriculas;
    }

    public Integer getTpMediacaoDidaticoPedago() {
        return tpMediacaoDidaticoPedago;
    }

    public void setTpMediacaoDidaticoPedago(Integer tpMediacaoDidaticoPedago) {
        this.tpMediacaoDidaticoPedago = tpMediacaoDidaticoPedago;
    }

    public Integer getInEspecialExclusiva() {
        return inEspecialExclusiva;
    }

    public void setInEspecialExclusiva(Integer inEspecialExclusiva) {
        this.inEspecialExclusiva = inEspecialExclusiva;
    }

    public Integer getInRegular() {
        return inRegular;
    }

    public void setInRegular(Integer inRegular) {
        this.inRegular = inRegular;
    }

    public Integer getInEja() {
        return inEja;
    }

    public void setInEja(Integer inEja) {
        this.inEja = inEja;
    }

    public Integer getInProfissionalizante() {
        return inProfissionalizante;
    }

    public void setInProfissionalizante(Integer inProfissionalizante) {
        this.inProfissionalizante = inProfissionalizante;
    }

    public Integer getTpEtapaEnsino() {
        return tpEtapaEnsino;
    }

    public void setTpEtapaEnsino(Integer tpEtapaEnsino) {
        this.tpEtapaEnsino = tpEtapaEnsino;
    }

    public Integer getCoCursoEducProfissional() {
        return coCursoEducProfissional;
    }

    public void setCoCursoEducProfissional(Integer coCursoEducProfissional) {
        this.coCursoEducProfissional = coCursoEducProfissional;
    }

    public Integer getTpTipoTurma() {
        return tpTipoTurma;
    }

    public void setTpTipoTurma(Integer tpTipoTurma) {
        this.tpTipoTurma = tpTipoTurma;
    }

    public Integer getInMaisEducacao() {
        return inMaisEducacao;
    }

    public void setInMaisEducacao(Integer inMaisEducacao) {
        this.inMaisEducacao = inMaisEducacao;
    }

    public Integer getNuDiasAtividade() {
        return nuDiasAtividade;
    }

    public void setNuDiasAtividade(Integer nuDiasAtividade) {
        this.nuDiasAtividade = nuDiasAtividade;
    }

    public Integer getInDiaSemanaDomingo() {
        return inDiaSemanaDomingo;
    }

    public void setInDiaSemanaDomingo(Integer inDiaSemanaDomingo) {
        this.inDiaSemanaDomingo = inDiaSemanaDomingo;
    }

    public Integer getInDiaSemanaSegunda() {
        return inDiaSemanaSegunda;
    }

    public void setInDiaSemanaSegunda(Integer inDiaSemanaSegunda) {
        this.inDiaSemanaSegunda = inDiaSemanaSegunda;
    }

    public Integer getInDiaSemanaTerca() {
        return inDiaSemanaTerca;
    }

    public void setInDiaSemanaTerca(Integer inDiaSemanaTerca) {
        this.inDiaSemanaTerca = inDiaSemanaTerca;
    }

    public Integer getInDiaSemanaQuarta() {
        return inDiaSemanaQuarta;
    }

    public void setInDiaSemanaQuarta(Integer inDiaSemanaQuarta) {
        this.inDiaSemanaQuarta = inDiaSemanaQuarta;
    }

    public Integer getInDiaSemanaQuinta() {
        return inDiaSemanaQuinta;
    }

    public void setInDiaSemanaQuinta(Integer inDiaSemanaQuinta) {
        this.inDiaSemanaQuinta = inDiaSemanaQuinta;
    }

    public Integer getInDiaSemanaSexta() {
        return inDiaSemanaSexta;
    }

    public void setInDiaSemanaSexta(Integer inDiaSemanaSexta) {
        this.inDiaSemanaSexta = inDiaSemanaSexta;
    }

    public Integer getInDiaSemanaSabado() {
        return inDiaSemanaSabado;
    }

    public void setInDiaSemanaSabado(Integer inDiaSemanaSabado) {
        this.inDiaSemanaSabado = inDiaSemanaSabado;
    }

    public Integer getCoTipoAtividade1() {
        return coTipoAtividade1;
    }

    public void setCoTipoAtividade1(Integer coTipoAtividade1) {
        this.coTipoAtividade1 = coTipoAtividade1;
    }

    public Integer getCoTipoAtividade2() {
        return coTipoAtividade2;
    }

    public void setCoTipoAtividade2(Integer coTipoAtividade2) {
        this.coTipoAtividade2 = coTipoAtividade2;
    }

    public Integer getCoTipoAtividade3() {
        return coTipoAtividade3;
    }

    public void setCoTipoAtividade3(Integer coTipoAtividade3) {
        this.coTipoAtividade3 = coTipoAtividade3;
    }

    public Integer getCoTipoAtividade4() {
        return coTipoAtividade4;
    }

    public void setCoTipoAtividade4(Integer coTipoAtividade4) {
        this.coTipoAtividade4 = coTipoAtividade4;
    }

    public Integer getCoTipoAtividade5() {
        return coTipoAtividade5;
    }

    public void setCoTipoAtividade5(Integer coTipoAtividade5) {
        this.coTipoAtividade5 = coTipoAtividade5;
    }

    public Integer getCoTipoAtividade6() {
        return coTipoAtividade6;
    }

    public void setCoTipoAtividade6(Integer coTipoAtividade6) {
        this.coTipoAtividade6 = coTipoAtividade6;
    }

    public Integer getInBraille() {
        return inBraille;
    }

    public void setInBraille(Integer inBraille) {
        this.inBraille = inBraille;
    }

    public Integer getInRecursosBaixaVisao() {
        return inRecursosBaixaVisao;
    }

    public void setInRecursosBaixaVisao(Integer inRecursosBaixaVisao) {
        this.inRecursosBaixaVisao = inRecursosBaixaVisao;
    }

    public Integer getInProcessosMentais() {
        return inProcessosMentais;
    }

    public void setInProcessosMentais(Integer inProcessosMentais) {
        this.inProcessosMentais = inProcessosMentais;
    }

    public Integer getInOrientacaoMobilidade() {
        return inOrientacaoMobilidade;
    }

    public void setInOrientacaoMobilidade(Integer inOrientacaoMobilidade) {
        this.inOrientacaoMobilidade = inOrientacaoMobilidade;
    }

    public Integer getInSinais() {
        return inSinais;
    }

    public void setInSinais(Integer inSinais) {
        this.inSinais = inSinais;
    }

    public Integer getInComunicacaoAltAument() {
        return inComunicacaoAltAument;
    }

    public void setInComunicacaoAltAument(Integer inComunicacaoAltAument) {
        this.inComunicacaoAltAument = inComunicacaoAltAument;
    }

    public Integer getInEnriqCurricular() {
        return inEnriqCurricular;
    }

    public void setInEnriqCurricular(Integer inEnriqCurricular) {
        this.inEnriqCurricular = inEnriqCurricular;
    }

    public Integer getInSoroban() {
        return inSoroban;
    }

    public void setInSoroban(Integer inSoroban) {
        this.inSoroban = inSoroban;
    }

    public Integer getInInformaticaAcessivel() {
        return inInformaticaAcessivel;
    }

    public void setInInformaticaAcessivel(Integer inInformaticaAcessivel) {
        this.inInformaticaAcessivel = inInformaticaAcessivel;
    }

    public Integer getInPortEscrita() {
        return inPortEscrita;
    }

    public void setInPortEscrita(Integer inPortEscrita) {
        this.inPortEscrita = inPortEscrita;
    }

    public Integer getInAutonomiaEscolar() {
        return inAutonomiaEscolar;
    }

    public void setInAutonomiaEscolar(Integer inAutonomiaEscolar) {
        this.inAutonomiaEscolar = inAutonomiaEscolar;
    }

    public Integer getInDiscQuimica() {
        return inDiscQuimica;
    }

    public void setInDiscQuimica(Integer inDiscQuimica) {
        this.inDiscQuimica = inDiscQuimica;
    }

    public Integer getInDiscFisica() {
        return inDiscFisica;
    }

    public void setInDiscFisica(Integer inDiscFisica) {
        this.inDiscFisica = inDiscFisica;
    }

    public Integer getInDiscMatematica() {
        return inDiscMatematica;
    }

    public void setInDiscMatematica(Integer inDiscMatematica) {
        this.inDiscMatematica = inDiscMatematica;
    }

    public Integer getInDiscBiologia() {
        return inDiscBiologia;
    }

    public void setInDiscBiologia(Integer inDiscBiologia) {
        this.inDiscBiologia = inDiscBiologia;
    }

    public Integer getInDiscCiencias() {
        return inDiscCiencias;
    }

    public void setInDiscCiencias(Integer inDiscCiencias) {
        this.inDiscCiencias = inDiscCiencias;
    }

    public Integer getInDiscLinguaPortuguesa() {
        return inDiscLinguaPortuguesa;
    }

    public void setInDiscLinguaPortuguesa(Integer inDiscLinguaPortuguesa) {
        this.inDiscLinguaPortuguesa = inDiscLinguaPortuguesa;
    }

    public Integer getInDiscLinguaIngles() {
        return inDiscLinguaIngles;
    }

    public void setInDiscLinguaIngles(Integer inDiscLinguaIngles) {
        this.inDiscLinguaIngles = inDiscLinguaIngles;
    }

    public Integer getInDiscLinguaEspanhol() {
        return inDiscLinguaEspanhol;
    }

    public void setInDiscLinguaEspanhol(Integer inDiscLinguaEspanhol) {
        this.inDiscLinguaEspanhol = inDiscLinguaEspanhol;
    }

    public Integer getInDiscLinguaFrances() {
        return inDiscLinguaFrances;
    }

    public void setInDiscLinguaFrances(Integer inDiscLinguaFrances) {
        this.inDiscLinguaFrances = inDiscLinguaFrances;
    }

    public Integer getInDiscLinguaOutra() {
        return inDiscLinguaOutra;
    }

    public void setInDiscLinguaOutra(Integer inDiscLinguaOutra) {
        this.inDiscLinguaOutra = inDiscLinguaOutra;
    }

    public Integer getInDiscLinguaIndigena() {
        return inDiscLinguaIndigena;
    }

    public void setInDiscLinguaIndigena(Integer inDiscLinguaIndigena) {
        this.inDiscLinguaIndigena = inDiscLinguaIndigena;
    }

    public Integer getInDiscArtes() {
        return inDiscArtes;
    }

    public void setInDiscArtes(Integer inDiscArtes) {
        this.inDiscArtes = inDiscArtes;
    }

    public Integer getInDiscEducacaoFisica() {
        return inDiscEducacaoFisica;
    }

    public void setInDiscEducacaoFisica(Integer inDiscEducacaoFisica) {
        this.inDiscEducacaoFisica = inDiscEducacaoFisica;
    }

    public Integer getInDiscHistoria() {
        return inDiscHistoria;
    }

    public void setInDiscHistoria(Integer inDiscHistoria) {
        this.inDiscHistoria = inDiscHistoria;
    }

    public Integer getInDiscGeografia() {
        return inDiscGeografia;
    }

    public void setInDiscGeografia(Integer inDiscGeografia) {
        this.inDiscGeografia = inDiscGeografia;
    }

    public Integer getInDiscFilosofia() {
        return inDiscFilosofia;
    }

    public void setInDiscFilosofia(Integer inDiscFilosofia) {
        this.inDiscFilosofia = inDiscFilosofia;
    }

    public Integer getInDiscEnsinoReligioso() {
        return inDiscEnsinoReligioso;
    }

    public void setInDiscEnsinoReligioso(Integer inDiscEnsinoReligioso) {
        this.inDiscEnsinoReligioso = inDiscEnsinoReligioso;
    }

    public Integer getInDiscEstudosSociais() {
        return inDiscEstudosSociais;
    }

    public void setInDiscEstudosSociais(Integer inDiscEstudosSociais) {
        this.inDiscEstudosSociais = inDiscEstudosSociais;
    }

    public Integer getInDiscSociologia() {
        return inDiscSociologia;
    }

    public void setInDiscSociologia(Integer inDiscSociologia) {
        this.inDiscSociologia = inDiscSociologia;
    }

    public Integer getInDiscEstSociaisSociologia() {
        return inDiscEstSociaisSociologia;
    }

    public void setInDiscEstSociaisSociologia(Integer inDiscEstSociaisSociologia) {
        this.inDiscEstSociaisSociologia = inDiscEstSociaisSociologia;
    }

    public Integer getInDiscInformaticaComputacao() {
        return inDiscInformaticaComputacao;
    }

    public void setInDiscInformaticaComputacao(Integer inDiscInformaticaComputacao) {
        this.inDiscInformaticaComputacao = inDiscInformaticaComputacao;
    }

    public Integer getInDiscProfissionalizante() {
        return inDiscProfissionalizante;
    }

    public void setInDiscProfissionalizante(Integer inDiscProfissionalizante) {
        this.inDiscProfissionalizante = inDiscProfissionalizante;
    }

    public Integer getInDiscAtendimentoEspeciais() {
        return inDiscAtendimentoEspeciais;
    }

    public void setInDiscAtendimentoEspeciais(Integer inDiscAtendimentoEspeciais) {
        this.inDiscAtendimentoEspeciais = inDiscAtendimentoEspeciais;
    }

    public Integer getInDiscDiverSocioCultural() {
        return inDiscDiverSocioCultural;
    }

    public void setInDiscDiverSocioCultural(Integer inDiscDiverSocioCultural) {
        this.inDiscDiverSocioCultural = inDiscDiverSocioCultural;
    }

    public Integer getInDiscLibras() {
        return inDiscLibras;
    }

    public void setInDiscLibras(Integer inDiscLibras) {
        this.inDiscLibras = inDiscLibras;
    }

    public Integer getInDiscPedagogicas() {
        return inDiscPedagogicas;
    }

    public void setInDiscPedagogicas(Integer inDiscPedagogicas) {
        this.inDiscPedagogicas = inDiscPedagogicas;
    }

    public Integer getInDiscOutras() {
        return inDiscOutras;
    }

    public void setInDiscOutras(Integer inDiscOutras) {
        this.inDiscOutras = inDiscOutras;
    }

    public Integer getCoEntidade() {
        return coEntidade;
    }

    public void setCoEntidade(Integer coEntidade) {
        this.coEntidade = coEntidade;
    }

    public Integer getCoRegiao() {
        return coRegiao;
    }

    public void setCoRegiao(Integer coRegiao) {
        this.coRegiao = coRegiao;
    }

    public Integer getCoMesorregiao() {
        return coMesorregiao;
    }

    public void setCoMesorregiao(Integer coMesorregiao) {
        this.coMesorregiao = coMesorregiao;
    }

    public Integer getCoMicrorregiao() {
        return coMicrorregiao;
    }

    public void setCoMicrorregiao(Integer coMicrorregiao) {
        this.coMicrorregiao = coMicrorregiao;
    }

    public Integer getCoUf() {
        return coUf;
    }

    public void setCoUf(Integer coUf) {
        this.coUf = coUf;
    }

    public Integer getCoMunicipio() {
        return coMunicipio;
    }

    public void setCoMunicipio(Integer coMunicipio) {
        this.coMunicipio = coMunicipio;
    }

    public Integer getCoDistrito() {
        return coDistrito;
    }

    public void setCoDistrito(Integer coDistrito) {
        this.coDistrito = coDistrito;
    }

    public Integer getTpDependencia() {
        return tpDependencia;
    }

    public void setTpDependencia(Integer tpDependencia) {
        this.tpDependencia = tpDependencia;
    }

    public Integer getTpLocalizacao() {
        return tpLocalizacao;
    }

    public void setTpLocalizacao(Integer tpLocalizacao) {
        this.tpLocalizacao = tpLocalizacao;
    }

    public Integer getTpCategoriaEscolaPrivada() {
        return tpCategoriaEscolaPrivada;
    }

    public void setTpCategoriaEscolaPrivada(Integer tpCategoriaEscolaPrivada) {
        this.tpCategoriaEscolaPrivada = tpCategoriaEscolaPrivada;
    }

    public Integer getInConveniadaPp() {
        return inConveniadaPp;
    }

    public void setInConveniadaPp(Integer inConveniadaPp) {
        this.inConveniadaPp = inConveniadaPp;
    }

    public Integer getTpConvenioPoderPublico() {
        return tpConvenioPoderPublico;
    }

    public void setTpConvenioPoderPublico(Integer tpConvenioPoderPublico) {
        this.tpConvenioPoderPublico = tpConvenioPoderPublico;
    }

    public Integer getInMantEscolaPrivadaEmp() {
        return inMantEscolaPrivadaEmp;
    }

    public void setInMantEscolaPrivadaEmp(Integer inMantEscolaPrivadaEmp) {
        this.inMantEscolaPrivadaEmp = inMantEscolaPrivadaEmp;
    }

    public Integer getInMantEscolaPrivadaOng() {
        return inMantEscolaPrivadaOng;
    }

    public void setInMantEscolaPrivadaOng(Integer inMantEscolaPrivadaOng) {
        this.inMantEscolaPrivadaOng = inMantEscolaPrivadaOng;
    }

    public Integer getInMantEscolaPrivadaSind() {
        return inMantEscolaPrivadaSind;
    }

    public void setInMantEscolaPrivadaSind(Integer inMantEscolaPrivadaSind) {
        this.inMantEscolaPrivadaSind = inMantEscolaPrivadaSind;
    }

    public Integer getInMantEscolaPrivadaSistS() {
        return inMantEscolaPrivadaSistS;
    }

    public void setInMantEscolaPrivadaSistS(Integer inMantEscolaPrivadaSistS) {
        this.inMantEscolaPrivadaSistS = inMantEscolaPrivadaSistS;
    }

    public Integer getInMantEscolaPrivadaSFins() {
        return inMantEscolaPrivadaSFins;
    }

    public void setInMantEscolaPrivadaSFins(Integer inMantEscolaPrivadaSFins) {
        this.inMantEscolaPrivadaSFins = inMantEscolaPrivadaSFins;
    }

    public Integer getTpRegulamentacao() {
        return tpRegulamentacao;
    }

    public void setTpRegulamentacao(Integer tpRegulamentacao) {
        this.tpRegulamentacao = tpRegulamentacao;
    }

    public Integer getTpLocalizacaoDiferenciada() {
        return tpLocalizacaoDiferenciada;
    }

    public void setTpLocalizacaoDiferenciada(Integer tpLocalizacaoDiferenciada) {
        this.tpLocalizacaoDiferenciada = tpLocalizacaoDiferenciada;
    }

    public Integer getInEducacaoIndigena() {
        return inEducacaoIndigena;
    }

    public void setInEducacaoIndigena(Integer inEducacaoIndigena) {
        this.inEducacaoIndigena = inEducacaoIndigena;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurma != null ? idTurma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.idTurma == null && other.idTurma != null) || (this.idTurma != null && !this.idTurma.equals(other.idTurma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Turma[ idTurma=" + idTurma + " ]";
    }
    
}
