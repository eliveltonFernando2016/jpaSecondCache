/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
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
@Cacheable(true)
@Entity
@Table(name = "escola")
@NamedQueries({
    @NamedQuery(name = "Escola.findAll", query = "SELECT e FROM Escola e")})
public class Escola implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nu_ano_censo")
    private int nuAnoCenso;
    @Id
    @Basic(optional = false)
    @Column(name = "co_entidade")
    private Integer coEntidade;
    @Column(name = "no_entidade")
    private String noEntidade;
    @Column(name = "co_orgao_regional")
    private String coOrgaoRegional;
    @Column(name = "tp_situacao_funcionamento")
    private Integer tpSituacaoFuncionamento;
    @Column(name = "dt_ano_letivo_inicio")
    private String dtAnoLetivoInicio;
    @Column(name = "dt_ano_letivo_termino")
    private String dtAnoLetivoTermino;
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
    @Column(name = "co_escola_sede_vinculada")
    private Integer coEscolaSedeVinculada;
    @Column(name = "co_ies_ofertante")
    private Integer coIesOfertante;
    @Column(name = "tp_regulamentacao")
    private Integer tpRegulamentacao;
    @Column(name = "in_local_func_predio_escolar")
    private Integer inLocalFuncPredioEscolar;
    @Column(name = "tp_ocupacao_predio_escolar")
    private Integer tpOcupacaoPredioEscolar;
    @Column(name = "in_local_func_salas_empresa")
    private Integer inLocalFuncSalasEmpresa;
    @Column(name = "in_local_func_socioeducativo")
    private Integer inLocalFuncSocioeducativo;
    @Column(name = "in_local_func_unid_prisional")
    private Integer inLocalFuncUnidPrisional;
    @Column(name = "in_local_func_prisional_socio")
    private Integer inLocalFuncPrisionalSocio;
    @Column(name = "in_local_func_templo_igreja")
    private Integer inLocalFuncTemploIgreja;
    @Column(name = "in_local_func_casa_professor")
    private Integer inLocalFuncCasaProfessor;
    @Column(name = "in_local_func_galpao")
    private Integer inLocalFuncGalpao;
    @Column(name = "tp_ocupacao_galpao")
    private Integer tpOcupacaoGalpao;
    @Column(name = "in_local_func_salas_outra_esc")
    private Integer inLocalFuncSalasOutraEsc;
    @Column(name = "in_local_func_outros")
    private Integer inLocalFuncOutros;
    @Column(name = "in_predio_compartilhado")
    private Integer inPredioCompartilhado;
    @Column(name = "in_agua_filtrada")
    private Integer inAguaFiltrada;
    @Column(name = "in_agua_rede_publica")
    private Integer inAguaRedePublica;
    @Column(name = "in_agua_poco_artesiano")
    private Integer inAguaPocoArtesiano;
    @Column(name = "in_agua_cacimba")
    private Integer inAguaCacimba;
    @Column(name = "in_agua_fonte_rio")
    private Integer inAguaFonteRio;
    @Column(name = "in_agua_inexistente")
    private Integer inAguaInexistente;
    @Column(name = "in_energia_rede_publica")
    private Integer inEnergiaRedePublica;
    @Column(name = "in_energia_gerador")
    private Integer inEnergiaGerador;
    @Column(name = "in_energia_outros")
    private Integer inEnergiaOutros;
    @Column(name = "in_energia_inexistente")
    private Integer inEnergiaInexistente;
    @Column(name = "in_esgoto_rede_publica")
    private Integer inEsgotoRedePublica;
    @Column(name = "in_esgoto_fossa")
    private Integer inEsgotoFossa;
    @Column(name = "in_esgoto_inexistente")
    private Integer inEsgotoInexistente;
    @Column(name = "in_lixo_coleta_periodica")
    private Integer inLixoColetaPeriodica;
    @Column(name = "in_lixo_queima")
    private Integer inLixoQueima;
    @Column(name = "in_lixo_joga_outra_area")
    private Integer inLixoJogaOutraArea;
    @Column(name = "in_lixo_recicla")
    private Integer inLixoRecicla;
    @Column(name = "in_lixo_enterra")
    private Integer inLixoEnterra;
    @Column(name = "in_lixo_outros")
    private Integer inLixoOutros;
    @Column(name = "in_sala_diretoria")
    private Integer inSalaDiretoria;
    @Column(name = "in_sala_professor")
    private Integer inSalaProfessor;
    @Column(name = "in_laboratorio_informatica")
    private Integer inLaboratorioInformatica;
    @Column(name = "in_laboratorio_ciencias")
    private Integer inLaboratorioCiencias;
    @Column(name = "in_sala_atendimento_especial")
    private Integer inSalaAtendimentoEspecial;
    @Column(name = "in_quadra_esportes_coberta")
    private Integer inQuadraEsportesCoberta;
    @Column(name = "in_quadra_esportes_descoberta")
    private Integer inQuadraEsportesDescoberta;
    @Column(name = "in_quadra_esportes")
    private Integer inQuadraEsportes;
    @Column(name = "in_cozinha")
    private Integer inCozinha;
    @Column(name = "in_biblioteca")
    private Integer inBiblioteca;
    @Column(name = "in_sala_leitura")
    private Integer inSalaLeitura;
    @Column(name = "in_biblioteca_sala_leitura")
    private Integer inBibliotecaSalaLeitura;
    @Column(name = "in_parque_infantil")
    private Integer inParqueInfantil;
    @Column(name = "in_bercario")
    private Integer inBercario;
    @Column(name = "in_banheiro_fora_predio")
    private Integer inBanheiroForaPredio;
    @Column(name = "in_banheiro_dentro_predio")
    private Integer inBanheiroDentroPredio;
    @Column(name = "in_banheiro_ei")
    private Integer inBanheiroEi;
    @Column(name = "in_banheiro_pne")
    private Integer inBanheiroPne;
    @Column(name = "in_dependencias_pne")
    private Integer inDependenciasPne;
    @Column(name = "in_secretaria")
    private Integer inSecretaria;
    @Column(name = "in_banheiro_chuveiro")
    private Integer inBanheiroChuveiro;
    @Column(name = "in_refeitorio")
    private Integer inRefeitorio;
    @Column(name = "in_despensa")
    private Integer inDespensa;
    @Column(name = "in_almoxarifado")
    private Integer inAlmoxarifado;
    @Column(name = "in_auditorio")
    private Integer inAuditorio;
    @Column(name = "in_patio_coberto")
    private Integer inPatioCoberto;
    @Column(name = "in_patio_descoberto")
    private Integer inPatioDescoberto;
    @Column(name = "in_alojam_aluno")
    private Integer inAlojamAluno;
    @Column(name = "in_alojam_professor")
    private Integer inAlojamProfessor;
    @Column(name = "in_area_verde")
    private Integer inAreaVerde;
    @Column(name = "in_lavanderia")
    private Integer inLavanderia;
    @Column(name = "in_dependencias_outras")
    private Integer inDependenciasOutras;
    @Column(name = "nu_salas_existentes")
    private Integer nuSalasExistentes;
    @Column(name = "nu_salas_utilizadas")
    private Integer nuSalasUtilizadas;
    @Column(name = "in_equip_tv")
    private Integer inEquipTv;
    @Column(name = "in_equip_videocassete")
    private Integer inEquipVideocassete;
    @Column(name = "in_equip_dvd")
    private Integer inEquipDvd;
    @Column(name = "in_equip_parabolica")
    private Integer inEquipParabolica;
    @Column(name = "in_equip_copiadora")
    private Integer inEquipCopiadora;
    @Column(name = "in_equip_retroprojetor")
    private Integer inEquipRetroprojetor;
    @Column(name = "in_equip_impressora")
    private Integer inEquipImpressora;
    @Column(name = "in_equip_impressora_mult")
    private Integer inEquipImpressoraMult;
    @Column(name = "in_equip_som")
    private Integer inEquipSom;
    @Column(name = "in_equip_multimidia")
    private Integer inEquipMultimidia;
    @Column(name = "in_equip_fax")
    private Integer inEquipFax;
    @Column(name = "in_equip_foto")
    private Integer inEquipFoto;
    @Column(name = "in_computador")
    private Integer inComputador;
    @Column(name = "nu_equip_tv")
    private Integer nuEquipTv;
    @Column(name = "nu_equip_videocassete")
    private Integer nuEquipVideocassete;
    @Column(name = "nu_equip_dvd")
    private Integer nuEquipDvd;
    @Column(name = "nu_equip_parabolica")
    private Integer nuEquipParabolica;
    @Column(name = "nu_equip_copiadora")
    private Integer nuEquipCopiadora;
    @Column(name = "nu_equip_retroprojetor")
    private Integer nuEquipRetroprojetor;
    @Column(name = "nu_equip_impressora")
    private Integer nuEquipImpressora;
    @Column(name = "nu_equip_impressora_mult")
    private Integer nuEquipImpressoraMult;
    @Column(name = "nu_equip_som")
    private Integer nuEquipSom;
    @Column(name = "nu_equip_multimidia")
    private Integer nuEquipMultimidia;
    @Column(name = "nu_equip_fax")
    private Integer nuEquipFax;
    @Column(name = "nu_equip_foto")
    private Integer nuEquipFoto;
    @Column(name = "nu_computador")
    private Integer nuComputador;
    @Column(name = "nu_comp_administrativo")
    private Integer nuCompAdministrativo;
    @Column(name = "nu_comp_aluno")
    private Integer nuCompAluno;
    @Column(name = "in_internet")
    private Integer inInternet;
    @Column(name = "in_banda_larga")
    private Integer inBandaLarga;
    @Column(name = "nu_funcionarios")
    private Integer nuFuncionarios;
    @Column(name = "in_alimentacao")
    private Integer inAlimentacao;
    @Column(name = "tp_aee")
    private Integer tpAee;
    @Column(name = "tp_atividade_complementar")
    private Integer tpAtividadeComplementar;
    @Column(name = "in_fundamental_ciclos")
    private Integer inFundamentalCiclos;
    @Column(name = "tp_localizacao_diferenciada")
    private Integer tpLocalizacaoDiferenciada;
    @Column(name = "in_material_esp_quilombola")
    private Integer inMaterialEspQuilombola;
    @Column(name = "in_material_esp_indigena")
    private Integer inMaterialEspIndigena;
    @Column(name = "in_material_esp_nao_utiliza")
    private Integer inMaterialEspNaoUtiliza;
    @Column(name = "in_educacao_indigena")
    private Integer inEducacaoIndigena;
    @Column(name = "tp_indigena_lingua")
    private Integer tpIndigenaLingua;
    @Column(name = "co_lingua_indigena")
    private Integer coLinguaIndigena;
    @Column(name = "in_brasil_alfabetizado")
    private Integer inBrasilAlfabetizado;
    @Column(name = "in_final_semana")
    private Integer inFinalSemana;
    @Column(name = "in_formacao_alternancia")
    private Integer inFormacaoAlternancia;
    @Column(name = "in_mediacao_presencial")
    private Integer inMediacaoPresencial;
    @Column(name = "in_mediacao_semipresencial")
    private Integer inMediacaoSemipresencial;
    @Column(name = "in_mediacao_ead")
    private Integer inMediacaoEad;
    @Column(name = "in_especial_exclusiva")
    private Integer inEspecialExclusiva;
    @Column(name = "in_regular")
    private Integer inRegular;
    @Column(name = "in_eja")
    private Integer inEja;
    @Column(name = "in_profissionalizante")
    private Integer inProfissionalizante;
    @Column(name = "in_comum_creche")
    private Integer inComumCreche;
    @Column(name = "in_comum_pre")
    private Integer inComumPre;
    @Column(name = "in_comum_fund_ai")
    private Integer inComumFundAi;
    @Column(name = "in_comum_fund_af")
    private Integer inComumFundAf;
    @Column(name = "in_comum_medio_medio")
    private Integer inComumMedioMedio;
    @Column(name = "in_comum_medio_integrado")
    private Integer inComumMedioIntegrado;
    @Column(name = "in_comum_medio_normal")
    private Integer inComumMedioNormal;
    @Column(name = "in_esp_exclusiva_creche")
    private Integer inEspExclusivaCreche;
    @Column(name = "in_esp_exclusiva_pre")
    private Integer inEspExclusivaPre;
    @Column(name = "in_esp_exclusiva_fund_ai")
    private Integer inEspExclusivaFundAi;
    @Column(name = "in_esp_exclusiva_fund_af")
    private Integer inEspExclusivaFundAf;
    @Column(name = "in_esp_exclusiva_medio_medio")
    private Integer inEspExclusivaMedioMedio;
    @Column(name = "in_esp_exclusiva_medio_integr")
    private Integer inEspExclusivaMedioIntegr;
    @Column(name = "in_esp_exclusiva_medio_normal")
    private Integer inEspExclusivaMedioNormal;
    @Column(name = "in_comum_eja_fund")
    private Integer inComumEjaFund;
    @Column(name = "in_comum_eja_medio")
    private Integer inComumEjaMedio;
    @Column(name = "in_comum_eja_prof")
    private Integer inComumEjaProf;
    @Column(name = "in_esp_exclusiva_eja_fund")
    private Integer inEspExclusivaEjaFund;
    @Column(name = "in_esp_exclusiva_eja_medio")
    private Integer inEspExclusivaEjaMedio;
    @Column(name = "in_esp_exclusiva_eja_prof")
    private Integer inEspExclusivaEjaProf;
    @Column(name = "in_comum_prof")
    private Integer inComumProf;
    @Column(name = "in_esp_exclusiva_prof")
    private Integer inEspExclusivaProf;
    @OneToMany(mappedBy = "coEntidade")
    private List<Matricula> matriculaList;

    public Escola() {
    }

    public Escola(Integer coEntidade) {
        this.coEntidade = coEntidade;
    }

    public Escola(Integer coEntidade, int nuAnoCenso) {
        this.coEntidade = coEntidade;
        this.nuAnoCenso = nuAnoCenso;
    }

    public int getNuAnoCenso() {
        return nuAnoCenso;
    }

    public void setNuAnoCenso(int nuAnoCenso) {
        this.nuAnoCenso = nuAnoCenso;
    }

    public Integer getCoEntidade() {
        return coEntidade;
    }

    public void setCoEntidade(Integer coEntidade) {
        this.coEntidade = coEntidade;
    }

    public String getNoEntidade() {
        return noEntidade;
    }

    public void setNoEntidade(String noEntidade) {
        this.noEntidade = noEntidade;
    }

    public String getCoOrgaoRegional() {
        return coOrgaoRegional;
    }

    public void setCoOrgaoRegional(String coOrgaoRegional) {
        this.coOrgaoRegional = coOrgaoRegional;
    }

    public Integer getTpSituacaoFuncionamento() {
        return tpSituacaoFuncionamento;
    }

    public void setTpSituacaoFuncionamento(Integer tpSituacaoFuncionamento) {
        this.tpSituacaoFuncionamento = tpSituacaoFuncionamento;
    }

    public String getDtAnoLetivoInicio() {
        return dtAnoLetivoInicio;
    }

    public void setDtAnoLetivoInicio(String dtAnoLetivoInicio) {
        this.dtAnoLetivoInicio = dtAnoLetivoInicio;
    }

    public String getDtAnoLetivoTermino() {
        return dtAnoLetivoTermino;
    }

    public void setDtAnoLetivoTermino(String dtAnoLetivoTermino) {
        this.dtAnoLetivoTermino = dtAnoLetivoTermino;
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

    public Integer getCoEscolaSedeVinculada() {
        return coEscolaSedeVinculada;
    }

    public void setCoEscolaSedeVinculada(Integer coEscolaSedeVinculada) {
        this.coEscolaSedeVinculada = coEscolaSedeVinculada;
    }

    public Integer getCoIesOfertante() {
        return coIesOfertante;
    }

    public void setCoIesOfertante(Integer coIesOfertante) {
        this.coIesOfertante = coIesOfertante;
    }

    public Integer getTpRegulamentacao() {
        return tpRegulamentacao;
    }

    public void setTpRegulamentacao(Integer tpRegulamentacao) {
        this.tpRegulamentacao = tpRegulamentacao;
    }

    public Integer getInLocalFuncPredioEscolar() {
        return inLocalFuncPredioEscolar;
    }

    public void setInLocalFuncPredioEscolar(Integer inLocalFuncPredioEscolar) {
        this.inLocalFuncPredioEscolar = inLocalFuncPredioEscolar;
    }

    public Integer getTpOcupacaoPredioEscolar() {
        return tpOcupacaoPredioEscolar;
    }

    public void setTpOcupacaoPredioEscolar(Integer tpOcupacaoPredioEscolar) {
        this.tpOcupacaoPredioEscolar = tpOcupacaoPredioEscolar;
    }

    public Integer getInLocalFuncSalasEmpresa() {
        return inLocalFuncSalasEmpresa;
    }

    public void setInLocalFuncSalasEmpresa(Integer inLocalFuncSalasEmpresa) {
        this.inLocalFuncSalasEmpresa = inLocalFuncSalasEmpresa;
    }

    public Integer getInLocalFuncSocioeducativo() {
        return inLocalFuncSocioeducativo;
    }

    public void setInLocalFuncSocioeducativo(Integer inLocalFuncSocioeducativo) {
        this.inLocalFuncSocioeducativo = inLocalFuncSocioeducativo;
    }

    public Integer getInLocalFuncUnidPrisional() {
        return inLocalFuncUnidPrisional;
    }

    public void setInLocalFuncUnidPrisional(Integer inLocalFuncUnidPrisional) {
        this.inLocalFuncUnidPrisional = inLocalFuncUnidPrisional;
    }

    public Integer getInLocalFuncPrisionalSocio() {
        return inLocalFuncPrisionalSocio;
    }

    public void setInLocalFuncPrisionalSocio(Integer inLocalFuncPrisionalSocio) {
        this.inLocalFuncPrisionalSocio = inLocalFuncPrisionalSocio;
    }

    public Integer getInLocalFuncTemploIgreja() {
        return inLocalFuncTemploIgreja;
    }

    public void setInLocalFuncTemploIgreja(Integer inLocalFuncTemploIgreja) {
        this.inLocalFuncTemploIgreja = inLocalFuncTemploIgreja;
    }

    public Integer getInLocalFuncCasaProfessor() {
        return inLocalFuncCasaProfessor;
    }

    public void setInLocalFuncCasaProfessor(Integer inLocalFuncCasaProfessor) {
        this.inLocalFuncCasaProfessor = inLocalFuncCasaProfessor;
    }

    public Integer getInLocalFuncGalpao() {
        return inLocalFuncGalpao;
    }

    public void setInLocalFuncGalpao(Integer inLocalFuncGalpao) {
        this.inLocalFuncGalpao = inLocalFuncGalpao;
    }

    public Integer getTpOcupacaoGalpao() {
        return tpOcupacaoGalpao;
    }

    public void setTpOcupacaoGalpao(Integer tpOcupacaoGalpao) {
        this.tpOcupacaoGalpao = tpOcupacaoGalpao;
    }

    public Integer getInLocalFuncSalasOutraEsc() {
        return inLocalFuncSalasOutraEsc;
    }

    public void setInLocalFuncSalasOutraEsc(Integer inLocalFuncSalasOutraEsc) {
        this.inLocalFuncSalasOutraEsc = inLocalFuncSalasOutraEsc;
    }

    public Integer getInLocalFuncOutros() {
        return inLocalFuncOutros;
    }

    public void setInLocalFuncOutros(Integer inLocalFuncOutros) {
        this.inLocalFuncOutros = inLocalFuncOutros;
    }

    public Integer getInPredioCompartilhado() {
        return inPredioCompartilhado;
    }

    public void setInPredioCompartilhado(Integer inPredioCompartilhado) {
        this.inPredioCompartilhado = inPredioCompartilhado;
    }

    public Integer getInAguaFiltrada() {
        return inAguaFiltrada;
    }

    public void setInAguaFiltrada(Integer inAguaFiltrada) {
        this.inAguaFiltrada = inAguaFiltrada;
    }

    public Integer getInAguaRedePublica() {
        return inAguaRedePublica;
    }

    public void setInAguaRedePublica(Integer inAguaRedePublica) {
        this.inAguaRedePublica = inAguaRedePublica;
    }

    public Integer getInAguaPocoArtesiano() {
        return inAguaPocoArtesiano;
    }

    public void setInAguaPocoArtesiano(Integer inAguaPocoArtesiano) {
        this.inAguaPocoArtesiano = inAguaPocoArtesiano;
    }

    public Integer getInAguaCacimba() {
        return inAguaCacimba;
    }

    public void setInAguaCacimba(Integer inAguaCacimba) {
        this.inAguaCacimba = inAguaCacimba;
    }

    public Integer getInAguaFonteRio() {
        return inAguaFonteRio;
    }

    public void setInAguaFonteRio(Integer inAguaFonteRio) {
        this.inAguaFonteRio = inAguaFonteRio;
    }

    public Integer getInAguaInexistente() {
        return inAguaInexistente;
    }

    public void setInAguaInexistente(Integer inAguaInexistente) {
        this.inAguaInexistente = inAguaInexistente;
    }

    public Integer getInEnergiaRedePublica() {
        return inEnergiaRedePublica;
    }

    public void setInEnergiaRedePublica(Integer inEnergiaRedePublica) {
        this.inEnergiaRedePublica = inEnergiaRedePublica;
    }

    public Integer getInEnergiaGerador() {
        return inEnergiaGerador;
    }

    public void setInEnergiaGerador(Integer inEnergiaGerador) {
        this.inEnergiaGerador = inEnergiaGerador;
    }

    public Integer getInEnergiaOutros() {
        return inEnergiaOutros;
    }

    public void setInEnergiaOutros(Integer inEnergiaOutros) {
        this.inEnergiaOutros = inEnergiaOutros;
    }

    public Integer getInEnergiaInexistente() {
        return inEnergiaInexistente;
    }

    public void setInEnergiaInexistente(Integer inEnergiaInexistente) {
        this.inEnergiaInexistente = inEnergiaInexistente;
    }

    public Integer getInEsgotoRedePublica() {
        return inEsgotoRedePublica;
    }

    public void setInEsgotoRedePublica(Integer inEsgotoRedePublica) {
        this.inEsgotoRedePublica = inEsgotoRedePublica;
    }

    public Integer getInEsgotoFossa() {
        return inEsgotoFossa;
    }

    public void setInEsgotoFossa(Integer inEsgotoFossa) {
        this.inEsgotoFossa = inEsgotoFossa;
    }

    public Integer getInEsgotoInexistente() {
        return inEsgotoInexistente;
    }

    public void setInEsgotoInexistente(Integer inEsgotoInexistente) {
        this.inEsgotoInexistente = inEsgotoInexistente;
    }

    public Integer getInLixoColetaPeriodica() {
        return inLixoColetaPeriodica;
    }

    public void setInLixoColetaPeriodica(Integer inLixoColetaPeriodica) {
        this.inLixoColetaPeriodica = inLixoColetaPeriodica;
    }

    public Integer getInLixoQueima() {
        return inLixoQueima;
    }

    public void setInLixoQueima(Integer inLixoQueima) {
        this.inLixoQueima = inLixoQueima;
    }

    public Integer getInLixoJogaOutraArea() {
        return inLixoJogaOutraArea;
    }

    public void setInLixoJogaOutraArea(Integer inLixoJogaOutraArea) {
        this.inLixoJogaOutraArea = inLixoJogaOutraArea;
    }

    public Integer getInLixoRecicla() {
        return inLixoRecicla;
    }

    public void setInLixoRecicla(Integer inLixoRecicla) {
        this.inLixoRecicla = inLixoRecicla;
    }

    public Integer getInLixoEnterra() {
        return inLixoEnterra;
    }

    public void setInLixoEnterra(Integer inLixoEnterra) {
        this.inLixoEnterra = inLixoEnterra;
    }

    public Integer getInLixoOutros() {
        return inLixoOutros;
    }

    public void setInLixoOutros(Integer inLixoOutros) {
        this.inLixoOutros = inLixoOutros;
    }

    public Integer getInSalaDiretoria() {
        return inSalaDiretoria;
    }

    public void setInSalaDiretoria(Integer inSalaDiretoria) {
        this.inSalaDiretoria = inSalaDiretoria;
    }

    public Integer getInSalaProfessor() {
        return inSalaProfessor;
    }

    public void setInSalaProfessor(Integer inSalaProfessor) {
        this.inSalaProfessor = inSalaProfessor;
    }

    public Integer getInLaboratorioInformatica() {
        return inLaboratorioInformatica;
    }

    public void setInLaboratorioInformatica(Integer inLaboratorioInformatica) {
        this.inLaboratorioInformatica = inLaboratorioInformatica;
    }

    public Integer getInLaboratorioCiencias() {
        return inLaboratorioCiencias;
    }

    public void setInLaboratorioCiencias(Integer inLaboratorioCiencias) {
        this.inLaboratorioCiencias = inLaboratorioCiencias;
    }

    public Integer getInSalaAtendimentoEspecial() {
        return inSalaAtendimentoEspecial;
    }

    public void setInSalaAtendimentoEspecial(Integer inSalaAtendimentoEspecial) {
        this.inSalaAtendimentoEspecial = inSalaAtendimentoEspecial;
    }

    public Integer getInQuadraEsportesCoberta() {
        return inQuadraEsportesCoberta;
    }

    public void setInQuadraEsportesCoberta(Integer inQuadraEsportesCoberta) {
        this.inQuadraEsportesCoberta = inQuadraEsportesCoberta;
    }

    public Integer getInQuadraEsportesDescoberta() {
        return inQuadraEsportesDescoberta;
    }

    public void setInQuadraEsportesDescoberta(Integer inQuadraEsportesDescoberta) {
        this.inQuadraEsportesDescoberta = inQuadraEsportesDescoberta;
    }

    public Integer getInQuadraEsportes() {
        return inQuadraEsportes;
    }

    public void setInQuadraEsportes(Integer inQuadraEsportes) {
        this.inQuadraEsportes = inQuadraEsportes;
    }

    public Integer getInCozinha() {
        return inCozinha;
    }

    public void setInCozinha(Integer inCozinha) {
        this.inCozinha = inCozinha;
    }

    public Integer getInBiblioteca() {
        return inBiblioteca;
    }

    public void setInBiblioteca(Integer inBiblioteca) {
        this.inBiblioteca = inBiblioteca;
    }

    public Integer getInSalaLeitura() {
        return inSalaLeitura;
    }

    public void setInSalaLeitura(Integer inSalaLeitura) {
        this.inSalaLeitura = inSalaLeitura;
    }

    public Integer getInBibliotecaSalaLeitura() {
        return inBibliotecaSalaLeitura;
    }

    public void setInBibliotecaSalaLeitura(Integer inBibliotecaSalaLeitura) {
        this.inBibliotecaSalaLeitura = inBibliotecaSalaLeitura;
    }

    public Integer getInParqueInfantil() {
        return inParqueInfantil;
    }

    public void setInParqueInfantil(Integer inParqueInfantil) {
        this.inParqueInfantil = inParqueInfantil;
    }

    public Integer getInBercario() {
        return inBercario;
    }

    public void setInBercario(Integer inBercario) {
        this.inBercario = inBercario;
    }

    public Integer getInBanheiroForaPredio() {
        return inBanheiroForaPredio;
    }

    public void setInBanheiroForaPredio(Integer inBanheiroForaPredio) {
        this.inBanheiroForaPredio = inBanheiroForaPredio;
    }

    public Integer getInBanheiroDentroPredio() {
        return inBanheiroDentroPredio;
    }

    public void setInBanheiroDentroPredio(Integer inBanheiroDentroPredio) {
        this.inBanheiroDentroPredio = inBanheiroDentroPredio;
    }

    public Integer getInBanheiroEi() {
        return inBanheiroEi;
    }

    public void setInBanheiroEi(Integer inBanheiroEi) {
        this.inBanheiroEi = inBanheiroEi;
    }

    public Integer getInBanheiroPne() {
        return inBanheiroPne;
    }

    public void setInBanheiroPne(Integer inBanheiroPne) {
        this.inBanheiroPne = inBanheiroPne;
    }

    public Integer getInDependenciasPne() {
        return inDependenciasPne;
    }

    public void setInDependenciasPne(Integer inDependenciasPne) {
        this.inDependenciasPne = inDependenciasPne;
    }

    public Integer getInSecretaria() {
        return inSecretaria;
    }

    public void setInSecretaria(Integer inSecretaria) {
        this.inSecretaria = inSecretaria;
    }

    public Integer getInBanheiroChuveiro() {
        return inBanheiroChuveiro;
    }

    public void setInBanheiroChuveiro(Integer inBanheiroChuveiro) {
        this.inBanheiroChuveiro = inBanheiroChuveiro;
    }

    public Integer getInRefeitorio() {
        return inRefeitorio;
    }

    public void setInRefeitorio(Integer inRefeitorio) {
        this.inRefeitorio = inRefeitorio;
    }

    public Integer getInDespensa() {
        return inDespensa;
    }

    public void setInDespensa(Integer inDespensa) {
        this.inDespensa = inDespensa;
    }

    public Integer getInAlmoxarifado() {
        return inAlmoxarifado;
    }

    public void setInAlmoxarifado(Integer inAlmoxarifado) {
        this.inAlmoxarifado = inAlmoxarifado;
    }

    public Integer getInAuditorio() {
        return inAuditorio;
    }

    public void setInAuditorio(Integer inAuditorio) {
        this.inAuditorio = inAuditorio;
    }

    public Integer getInPatioCoberto() {
        return inPatioCoberto;
    }

    public void setInPatioCoberto(Integer inPatioCoberto) {
        this.inPatioCoberto = inPatioCoberto;
    }

    public Integer getInPatioDescoberto() {
        return inPatioDescoberto;
    }

    public void setInPatioDescoberto(Integer inPatioDescoberto) {
        this.inPatioDescoberto = inPatioDescoberto;
    }

    public Integer getInAlojamAluno() {
        return inAlojamAluno;
    }

    public void setInAlojamAluno(Integer inAlojamAluno) {
        this.inAlojamAluno = inAlojamAluno;
    }

    public Integer getInAlojamProfessor() {
        return inAlojamProfessor;
    }

    public void setInAlojamProfessor(Integer inAlojamProfessor) {
        this.inAlojamProfessor = inAlojamProfessor;
    }

    public Integer getInAreaVerde() {
        return inAreaVerde;
    }

    public void setInAreaVerde(Integer inAreaVerde) {
        this.inAreaVerde = inAreaVerde;
    }

    public Integer getInLavanderia() {
        return inLavanderia;
    }

    public void setInLavanderia(Integer inLavanderia) {
        this.inLavanderia = inLavanderia;
    }

    public Integer getInDependenciasOutras() {
        return inDependenciasOutras;
    }

    public void setInDependenciasOutras(Integer inDependenciasOutras) {
        this.inDependenciasOutras = inDependenciasOutras;
    }

    public Integer getNuSalasExistentes() {
        return nuSalasExistentes;
    }

    public void setNuSalasExistentes(Integer nuSalasExistentes) {
        this.nuSalasExistentes = nuSalasExistentes;
    }

    public Integer getNuSalasUtilizadas() {
        return nuSalasUtilizadas;
    }

    public void setNuSalasUtilizadas(Integer nuSalasUtilizadas) {
        this.nuSalasUtilizadas = nuSalasUtilizadas;
    }

    public Integer getInEquipTv() {
        return inEquipTv;
    }

    public void setInEquipTv(Integer inEquipTv) {
        this.inEquipTv = inEquipTv;
    }

    public Integer getInEquipVideocassete() {
        return inEquipVideocassete;
    }

    public void setInEquipVideocassete(Integer inEquipVideocassete) {
        this.inEquipVideocassete = inEquipVideocassete;
    }

    public Integer getInEquipDvd() {
        return inEquipDvd;
    }

    public void setInEquipDvd(Integer inEquipDvd) {
        this.inEquipDvd = inEquipDvd;
    }

    public Integer getInEquipParabolica() {
        return inEquipParabolica;
    }

    public void setInEquipParabolica(Integer inEquipParabolica) {
        this.inEquipParabolica = inEquipParabolica;
    }

    public Integer getInEquipCopiadora() {
        return inEquipCopiadora;
    }

    public void setInEquipCopiadora(Integer inEquipCopiadora) {
        this.inEquipCopiadora = inEquipCopiadora;
    }

    public Integer getInEquipRetroprojetor() {
        return inEquipRetroprojetor;
    }

    public void setInEquipRetroprojetor(Integer inEquipRetroprojetor) {
        this.inEquipRetroprojetor = inEquipRetroprojetor;
    }

    public Integer getInEquipImpressora() {
        return inEquipImpressora;
    }

    public void setInEquipImpressora(Integer inEquipImpressora) {
        this.inEquipImpressora = inEquipImpressora;
    }

    public Integer getInEquipImpressoraMult() {
        return inEquipImpressoraMult;
    }

    public void setInEquipImpressoraMult(Integer inEquipImpressoraMult) {
        this.inEquipImpressoraMult = inEquipImpressoraMult;
    }

    public Integer getInEquipSom() {
        return inEquipSom;
    }

    public void setInEquipSom(Integer inEquipSom) {
        this.inEquipSom = inEquipSom;
    }

    public Integer getInEquipMultimidia() {
        return inEquipMultimidia;
    }

    public void setInEquipMultimidia(Integer inEquipMultimidia) {
        this.inEquipMultimidia = inEquipMultimidia;
    }

    public Integer getInEquipFax() {
        return inEquipFax;
    }

    public void setInEquipFax(Integer inEquipFax) {
        this.inEquipFax = inEquipFax;
    }

    public Integer getInEquipFoto() {
        return inEquipFoto;
    }

    public void setInEquipFoto(Integer inEquipFoto) {
        this.inEquipFoto = inEquipFoto;
    }

    public Integer getInComputador() {
        return inComputador;
    }

    public void setInComputador(Integer inComputador) {
        this.inComputador = inComputador;
    }

    public Integer getNuEquipTv() {
        return nuEquipTv;
    }

    public void setNuEquipTv(Integer nuEquipTv) {
        this.nuEquipTv = nuEquipTv;
    }

    public Integer getNuEquipVideocassete() {
        return nuEquipVideocassete;
    }

    public void setNuEquipVideocassete(Integer nuEquipVideocassete) {
        this.nuEquipVideocassete = nuEquipVideocassete;
    }

    public Integer getNuEquipDvd() {
        return nuEquipDvd;
    }

    public void setNuEquipDvd(Integer nuEquipDvd) {
        this.nuEquipDvd = nuEquipDvd;
    }

    public Integer getNuEquipParabolica() {
        return nuEquipParabolica;
    }

    public void setNuEquipParabolica(Integer nuEquipParabolica) {
        this.nuEquipParabolica = nuEquipParabolica;
    }

    public Integer getNuEquipCopiadora() {
        return nuEquipCopiadora;
    }

    public void setNuEquipCopiadora(Integer nuEquipCopiadora) {
        this.nuEquipCopiadora = nuEquipCopiadora;
    }

    public Integer getNuEquipRetroprojetor() {
        return nuEquipRetroprojetor;
    }

    public void setNuEquipRetroprojetor(Integer nuEquipRetroprojetor) {
        this.nuEquipRetroprojetor = nuEquipRetroprojetor;
    }

    public Integer getNuEquipImpressora() {
        return nuEquipImpressora;
    }

    public void setNuEquipImpressora(Integer nuEquipImpressora) {
        this.nuEquipImpressora = nuEquipImpressora;
    }

    public Integer getNuEquipImpressoraMult() {
        return nuEquipImpressoraMult;
    }

    public void setNuEquipImpressoraMult(Integer nuEquipImpressoraMult) {
        this.nuEquipImpressoraMult = nuEquipImpressoraMult;
    }

    public Integer getNuEquipSom() {
        return nuEquipSom;
    }

    public void setNuEquipSom(Integer nuEquipSom) {
        this.nuEquipSom = nuEquipSom;
    }

    public Integer getNuEquipMultimidia() {
        return nuEquipMultimidia;
    }

    public void setNuEquipMultimidia(Integer nuEquipMultimidia) {
        this.nuEquipMultimidia = nuEquipMultimidia;
    }

    public Integer getNuEquipFax() {
        return nuEquipFax;
    }

    public void setNuEquipFax(Integer nuEquipFax) {
        this.nuEquipFax = nuEquipFax;
    }

    public Integer getNuEquipFoto() {
        return nuEquipFoto;
    }

    public void setNuEquipFoto(Integer nuEquipFoto) {
        this.nuEquipFoto = nuEquipFoto;
    }

    public Integer getNuComputador() {
        return nuComputador;
    }

    public void setNuComputador(Integer nuComputador) {
        this.nuComputador = nuComputador;
    }

    public Integer getNuCompAdministrativo() {
        return nuCompAdministrativo;
    }

    public void setNuCompAdministrativo(Integer nuCompAdministrativo) {
        this.nuCompAdministrativo = nuCompAdministrativo;
    }

    public Integer getNuCompAluno() {
        return nuCompAluno;
    }

    public void setNuCompAluno(Integer nuCompAluno) {
        this.nuCompAluno = nuCompAluno;
    }

    public Integer getInInternet() {
        return inInternet;
    }

    public void setInInternet(Integer inInternet) {
        this.inInternet = inInternet;
    }

    public Integer getInBandaLarga() {
        return inBandaLarga;
    }

    public void setInBandaLarga(Integer inBandaLarga) {
        this.inBandaLarga = inBandaLarga;
    }

    public Integer getNuFuncionarios() {
        return nuFuncionarios;
    }

    public void setNuFuncionarios(Integer nuFuncionarios) {
        this.nuFuncionarios = nuFuncionarios;
    }

    public Integer getInAlimentacao() {
        return inAlimentacao;
    }

    public void setInAlimentacao(Integer inAlimentacao) {
        this.inAlimentacao = inAlimentacao;
    }

    public Integer getTpAee() {
        return tpAee;
    }

    public void setTpAee(Integer tpAee) {
        this.tpAee = tpAee;
    }

    public Integer getTpAtividadeComplementar() {
        return tpAtividadeComplementar;
    }

    public void setTpAtividadeComplementar(Integer tpAtividadeComplementar) {
        this.tpAtividadeComplementar = tpAtividadeComplementar;
    }

    public Integer getInFundamentalCiclos() {
        return inFundamentalCiclos;
    }

    public void setInFundamentalCiclos(Integer inFundamentalCiclos) {
        this.inFundamentalCiclos = inFundamentalCiclos;
    }

    public Integer getTpLocalizacaoDiferenciada() {
        return tpLocalizacaoDiferenciada;
    }

    public void setTpLocalizacaoDiferenciada(Integer tpLocalizacaoDiferenciada) {
        this.tpLocalizacaoDiferenciada = tpLocalizacaoDiferenciada;
    }

    public Integer getInMaterialEspQuilombola() {
        return inMaterialEspQuilombola;
    }

    public void setInMaterialEspQuilombola(Integer inMaterialEspQuilombola) {
        this.inMaterialEspQuilombola = inMaterialEspQuilombola;
    }

    public Integer getInMaterialEspIndigena() {
        return inMaterialEspIndigena;
    }

    public void setInMaterialEspIndigena(Integer inMaterialEspIndigena) {
        this.inMaterialEspIndigena = inMaterialEspIndigena;
    }

    public Integer getInMaterialEspNaoUtiliza() {
        return inMaterialEspNaoUtiliza;
    }

    public void setInMaterialEspNaoUtiliza(Integer inMaterialEspNaoUtiliza) {
        this.inMaterialEspNaoUtiliza = inMaterialEspNaoUtiliza;
    }

    public Integer getInEducacaoIndigena() {
        return inEducacaoIndigena;
    }

    public void setInEducacaoIndigena(Integer inEducacaoIndigena) {
        this.inEducacaoIndigena = inEducacaoIndigena;
    }

    public Integer getTpIndigenaLingua() {
        return tpIndigenaLingua;
    }

    public void setTpIndigenaLingua(Integer tpIndigenaLingua) {
        this.tpIndigenaLingua = tpIndigenaLingua;
    }

    public Integer getCoLinguaIndigena() {
        return coLinguaIndigena;
    }

    public void setCoLinguaIndigena(Integer coLinguaIndigena) {
        this.coLinguaIndigena = coLinguaIndigena;
    }

    public Integer getInBrasilAlfabetizado() {
        return inBrasilAlfabetizado;
    }

    public void setInBrasilAlfabetizado(Integer inBrasilAlfabetizado) {
        this.inBrasilAlfabetizado = inBrasilAlfabetizado;
    }

    public Integer getInFinalSemana() {
        return inFinalSemana;
    }

    public void setInFinalSemana(Integer inFinalSemana) {
        this.inFinalSemana = inFinalSemana;
    }

    public Integer getInFormacaoAlternancia() {
        return inFormacaoAlternancia;
    }

    public void setInFormacaoAlternancia(Integer inFormacaoAlternancia) {
        this.inFormacaoAlternancia = inFormacaoAlternancia;
    }

    public Integer getInMediacaoPresencial() {
        return inMediacaoPresencial;
    }

    public void setInMediacaoPresencial(Integer inMediacaoPresencial) {
        this.inMediacaoPresencial = inMediacaoPresencial;
    }

    public Integer getInMediacaoSemipresencial() {
        return inMediacaoSemipresencial;
    }

    public void setInMediacaoSemipresencial(Integer inMediacaoSemipresencial) {
        this.inMediacaoSemipresencial = inMediacaoSemipresencial;
    }

    public Integer getInMediacaoEad() {
        return inMediacaoEad;
    }

    public void setInMediacaoEad(Integer inMediacaoEad) {
        this.inMediacaoEad = inMediacaoEad;
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

    public Integer getInComumCreche() {
        return inComumCreche;
    }

    public void setInComumCreche(Integer inComumCreche) {
        this.inComumCreche = inComumCreche;
    }

    public Integer getInComumPre() {
        return inComumPre;
    }

    public void setInComumPre(Integer inComumPre) {
        this.inComumPre = inComumPre;
    }

    public Integer getInComumFundAi() {
        return inComumFundAi;
    }

    public void setInComumFundAi(Integer inComumFundAi) {
        this.inComumFundAi = inComumFundAi;
    }

    public Integer getInComumFundAf() {
        return inComumFundAf;
    }

    public void setInComumFundAf(Integer inComumFundAf) {
        this.inComumFundAf = inComumFundAf;
    }

    public Integer getInComumMedioMedio() {
        return inComumMedioMedio;
    }

    public void setInComumMedioMedio(Integer inComumMedioMedio) {
        this.inComumMedioMedio = inComumMedioMedio;
    }

    public Integer getInComumMedioIntegrado() {
        return inComumMedioIntegrado;
    }

    public void setInComumMedioIntegrado(Integer inComumMedioIntegrado) {
        this.inComumMedioIntegrado = inComumMedioIntegrado;
    }

    public Integer getInComumMedioNormal() {
        return inComumMedioNormal;
    }

    public void setInComumMedioNormal(Integer inComumMedioNormal) {
        this.inComumMedioNormal = inComumMedioNormal;
    }

    public Integer getInEspExclusivaCreche() {
        return inEspExclusivaCreche;
    }

    public void setInEspExclusivaCreche(Integer inEspExclusivaCreche) {
        this.inEspExclusivaCreche = inEspExclusivaCreche;
    }

    public Integer getInEspExclusivaPre() {
        return inEspExclusivaPre;
    }

    public void setInEspExclusivaPre(Integer inEspExclusivaPre) {
        this.inEspExclusivaPre = inEspExclusivaPre;
    }

    public Integer getInEspExclusivaFundAi() {
        return inEspExclusivaFundAi;
    }

    public void setInEspExclusivaFundAi(Integer inEspExclusivaFundAi) {
        this.inEspExclusivaFundAi = inEspExclusivaFundAi;
    }

    public Integer getInEspExclusivaFundAf() {
        return inEspExclusivaFundAf;
    }

    public void setInEspExclusivaFundAf(Integer inEspExclusivaFundAf) {
        this.inEspExclusivaFundAf = inEspExclusivaFundAf;
    }

    public Integer getInEspExclusivaMedioMedio() {
        return inEspExclusivaMedioMedio;
    }

    public void setInEspExclusivaMedioMedio(Integer inEspExclusivaMedioMedio) {
        this.inEspExclusivaMedioMedio = inEspExclusivaMedioMedio;
    }

    public Integer getInEspExclusivaMedioIntegr() {
        return inEspExclusivaMedioIntegr;
    }

    public void setInEspExclusivaMedioIntegr(Integer inEspExclusivaMedioIntegr) {
        this.inEspExclusivaMedioIntegr = inEspExclusivaMedioIntegr;
    }

    public Integer getInEspExclusivaMedioNormal() {
        return inEspExclusivaMedioNormal;
    }

    public void setInEspExclusivaMedioNormal(Integer inEspExclusivaMedioNormal) {
        this.inEspExclusivaMedioNormal = inEspExclusivaMedioNormal;
    }

    public Integer getInComumEjaFund() {
        return inComumEjaFund;
    }

    public void setInComumEjaFund(Integer inComumEjaFund) {
        this.inComumEjaFund = inComumEjaFund;
    }

    public Integer getInComumEjaMedio() {
        return inComumEjaMedio;
    }

    public void setInComumEjaMedio(Integer inComumEjaMedio) {
        this.inComumEjaMedio = inComumEjaMedio;
    }

    public Integer getInComumEjaProf() {
        return inComumEjaProf;
    }

    public void setInComumEjaProf(Integer inComumEjaProf) {
        this.inComumEjaProf = inComumEjaProf;
    }

    public Integer getInEspExclusivaEjaFund() {
        return inEspExclusivaEjaFund;
    }

    public void setInEspExclusivaEjaFund(Integer inEspExclusivaEjaFund) {
        this.inEspExclusivaEjaFund = inEspExclusivaEjaFund;
    }

    public Integer getInEspExclusivaEjaMedio() {
        return inEspExclusivaEjaMedio;
    }

    public void setInEspExclusivaEjaMedio(Integer inEspExclusivaEjaMedio) {
        this.inEspExclusivaEjaMedio = inEspExclusivaEjaMedio;
    }

    public Integer getInEspExclusivaEjaProf() {
        return inEspExclusivaEjaProf;
    }

    public void setInEspExclusivaEjaProf(Integer inEspExclusivaEjaProf) {
        this.inEspExclusivaEjaProf = inEspExclusivaEjaProf;
    }

    public Integer getInComumProf() {
        return inComumProf;
    }

    public void setInComumProf(Integer inComumProf) {
        this.inComumProf = inComumProf;
    }

    public Integer getInEspExclusivaProf() {
        return inEspExclusivaProf;
    }

    public void setInEspExclusivaProf(Integer inEspExclusivaProf) {
        this.inEspExclusivaProf = inEspExclusivaProf;
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
        hash += (coEntidade != null ? coEntidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Escola)) {
            return false;
        }
        Escola other = (Escola) object;
        if ((this.coEntidade == null && other.coEntidade != null) || (this.coEntidade != null && !this.coEntidade.equals(other.coEntidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Escola{" + "coEntidade=" + coEntidade + ", noEntidade=" + noEntidade + '}';
    }
    
}
