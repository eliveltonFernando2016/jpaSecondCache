/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author elivelton
 */
@Cacheable(true)
@Entity
@Table(name = "matricula")
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m")})
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nu_ano_censo")
    private Integer nuAnoCenso;
    @Id
    @Basic(optional = false)
    @Column(name = "id_matricula")
    private Integer idMatricula;
    @Column(name = "co_pessoa_fisica")
    private BigInteger coPessoaFisica;
    @Column(name = "nu_dia")
    private Integer nuDia;
    @Column(name = "nu_mes")
    private Integer nuMes;
    @Column(name = "nu_ano")
    private Integer nuAno;
    @Column(name = "nu_idade_referencia")
    private Integer nuIdadeReferencia;
    @Column(name = "nu_idade")
    private Integer nuIdade;
    @Column(name = "nu_duracao_turma")
    private Integer nuDuracaoTurma;
    @Column(name = "nu_dur_ativ_comp_mesma_rede")
    private Integer nuDurAtivCompMesmaRede;
    @Column(name = "nu_dur_ativ_comp_outras_redes")
    private Integer nuDurAtivCompOutrasRedes;
    @Column(name = "nu_dur_aee_mesma_rede")
    private Integer nuDurAeeMesmaRede;
    @Column(name = "nu_dur_aee_outras_redes")
    private Integer nuDurAeeOutrasRedes;
    @Column(name = "nu_dias_atividade")
    private Integer nuDiasAtividade;
    @Column(name = "tp_sexo")
    private Integer tpSexo;
    @Column(name = "tp_cor_raca")
    private Integer tpCorRaca;
    @Column(name = "tp_nacionalidade")
    private Integer tpNacionalidade;
    @Column(name = "co_pais_origem")
    private Integer coPaisOrigem;
    @Column(name = "co_uf_nasc")
    private Integer coUfNasc;
    @Column(name = "co_municipio_nasc")
    private Integer coMunicipioNasc;
    @Column(name = "co_uf_end")
    private Integer coUfEnd;
    @Column(name = "co_municipio_end")
    private Integer coMunicipioEnd;
    @Column(name = "tp_zona_residencial")
    private Integer tpZonaResidencial;
    @Column(name = "tp_outro_local_aula")
    private Integer tpOutroLocalAula;
    @Column(name = "in_transporte_publico")
    private Integer inTransportePublico;
    @Column(name = "tp_responsavel_transporte")
    private Integer tpResponsavelTransporte;
    @Column(name = "in_transp_vans_kombi")
    private Integer inTranspVansKombi;
    @Column(name = "in_transp_micro_onibus")
    private Integer inTranspMicroOnibus;
    @Column(name = "in_transp_onibus")
    private Integer inTranspOnibus;
    @Column(name = "in_transp_bicicleta")
    private Integer inTranspBicicleta;
    @Column(name = "in_transp_tr_animal")
    private Integer inTranspTrAnimal;
    @Column(name = "in_transp_outro_veiculo")
    private Integer inTranspOutroVeiculo;
    @Column(name = "in_transp_embar_ate5")
    private Integer inTranspEmbarAte5;
    @Column(name = "in_transp_embar_5a15")
    private Integer inTranspEmbar5a15;
    @Column(name = "in_transp_embar_15a35")
    private Integer inTranspEmbar15a35;
    @Column(name = "in_transp_embar_35")
    private Integer inTranspEmbar35;
    @Column(name = "in_transp_trem_metro")
    private Integer inTranspTremMetro;
    @Column(name = "in_necessidade_especial")
    private Integer inNecessidadeEspecial;
    @Column(name = "in_cegueira")
    private Integer inCegueira;
    @Column(name = "in_baixa_visao")
    private Integer inBaixaVisao;
    @Column(name = "in_surdez")
    private Integer inSurdez;
    @Column(name = "in_def_auditiva")
    private Integer inDefAuditiva;
    @Column(name = "in_surdocegueira")
    private Integer inSurdocegueira;
    @Column(name = "in_def_fisica")
    private Integer inDefFisica;
    @Column(name = "in_def_intelectual")
    private Integer inDefIntelectual;
    @Column(name = "in_def_multipla")
    private Integer inDefMultipla;
    @Column(name = "in_autismo")
    private Integer inAutismo;
    @Column(name = "in_sindrome_asperger")
    private Integer inSindromeAsperger;
    @Column(name = "in_sindrome_rett")
    private Integer inSindromeRett;
    @Column(name = "in_transtorno_di")
    private Integer inTranstornoDi;
    @Column(name = "in_superdotacao")
    private Integer inSuperdotacao;
    @Column(name = "in_recurso_ledor")
    private Integer inRecursoLedor;
    @Column(name = "in_recurso_transcricao")
    private Integer inRecursoTranscricao;
    @Column(name = "in_recurso_interprete")
    private Integer inRecursoInterprete;
    @Column(name = "in_recurso_libras")
    private Integer inRecursoLibras;
    @Column(name = "in_recurso_labial")
    private Integer inRecursoLabial;
    @Column(name = "in_recurso_braille")
    private Integer inRecursoBraille;
    @Column(name = "in_recurso_ampliada_16")
    private Integer inRecursoAmpliada16;
    @Column(name = "in_recurso_ampliada_20")
    private Integer inRecursoAmpliada20;
    @Column(name = "in_recurso_ampliada_24")
    private Integer inRecursoAmpliada24;
    @Column(name = "in_recurso_nenhum")
    private Integer inRecursoNenhum;
    @Column(name = "tp_ingresso_federais")
    private Integer tpIngressoFederais;
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
    @Column(name = "tp_unificada")
    private Integer tpUnificada;
    @Column(name = "tp_tipo_turma")
    private Integer tpTipoTurma;
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
    @JoinColumn(name = "co_entidade", referencedColumnName = "co_entidade")
    @ManyToOne
    private Escola coEntidade;
    @JoinColumn(name = "id_turma", referencedColumnName = "id_turma")
    @ManyToOne
    private Turma idTurma;

    public Matricula() {
    }

    public Matricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Integer getNuAnoCenso() {
        return nuAnoCenso;
    }

    public void setNuAnoCenso(Integer nuAnoCenso) {
        this.nuAnoCenso = nuAnoCenso;
    }

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public BigInteger getCoPessoaFisica() {
        return coPessoaFisica;
    }

    public void setCoPessoaFisica(BigInteger coPessoaFisica) {
        this.coPessoaFisica = coPessoaFisica;
    }

    public Integer getNuDia() {
        return nuDia;
    }

    public void setNuDia(Integer nuDia) {
        this.nuDia = nuDia;
    }

    public Integer getNuMes() {
        return nuMes;
    }

    public void setNuMes(Integer nuMes) {
        this.nuMes = nuMes;
    }

    public Integer getNuAno() {
        return nuAno;
    }

    public void setNuAno(Integer nuAno) {
        this.nuAno = nuAno;
    }

    public Integer getNuIdadeReferencia() {
        return nuIdadeReferencia;
    }

    public void setNuIdadeReferencia(Integer nuIdadeReferencia) {
        this.nuIdadeReferencia = nuIdadeReferencia;
    }

    public Integer getNuIdade() {
        return nuIdade;
    }

    public void setNuIdade(Integer nuIdade) {
        this.nuIdade = nuIdade;
    }

    public Integer getNuDuracaoTurma() {
        return nuDuracaoTurma;
    }

    public void setNuDuracaoTurma(Integer nuDuracaoTurma) {
        this.nuDuracaoTurma = nuDuracaoTurma;
    }

    public Integer getNuDurAtivCompMesmaRede() {
        return nuDurAtivCompMesmaRede;
    }

    public void setNuDurAtivCompMesmaRede(Integer nuDurAtivCompMesmaRede) {
        this.nuDurAtivCompMesmaRede = nuDurAtivCompMesmaRede;
    }

    public Integer getNuDurAtivCompOutrasRedes() {
        return nuDurAtivCompOutrasRedes;
    }

    public void setNuDurAtivCompOutrasRedes(Integer nuDurAtivCompOutrasRedes) {
        this.nuDurAtivCompOutrasRedes = nuDurAtivCompOutrasRedes;
    }

    public Integer getNuDurAeeMesmaRede() {
        return nuDurAeeMesmaRede;
    }

    public void setNuDurAeeMesmaRede(Integer nuDurAeeMesmaRede) {
        this.nuDurAeeMesmaRede = nuDurAeeMesmaRede;
    }

    public Integer getNuDurAeeOutrasRedes() {
        return nuDurAeeOutrasRedes;
    }

    public void setNuDurAeeOutrasRedes(Integer nuDurAeeOutrasRedes) {
        this.nuDurAeeOutrasRedes = nuDurAeeOutrasRedes;
    }

    public Integer getNuDiasAtividade() {
        return nuDiasAtividade;
    }

    public void setNuDiasAtividade(Integer nuDiasAtividade) {
        this.nuDiasAtividade = nuDiasAtividade;
    }

    public Integer getTpSexo() {
        return tpSexo;
    }

    public void setTpSexo(Integer tpSexo) {
        this.tpSexo = tpSexo;
    }

    public Integer getTpCorRaca() {
        return tpCorRaca;
    }

    public void setTpCorRaca(Integer tpCorRaca) {
        this.tpCorRaca = tpCorRaca;
    }

    public Integer getTpNacionalidade() {
        return tpNacionalidade;
    }

    public void setTpNacionalidade(Integer tpNacionalidade) {
        this.tpNacionalidade = tpNacionalidade;
    }

    public Integer getCoPaisOrigem() {
        return coPaisOrigem;
    }

    public void setCoPaisOrigem(Integer coPaisOrigem) {
        this.coPaisOrigem = coPaisOrigem;
    }

    public Integer getCoUfNasc() {
        return coUfNasc;
    }

    public void setCoUfNasc(Integer coUfNasc) {
        this.coUfNasc = coUfNasc;
    }

    public Integer getCoMunicipioNasc() {
        return coMunicipioNasc;
    }

    public void setCoMunicipioNasc(Integer coMunicipioNasc) {
        this.coMunicipioNasc = coMunicipioNasc;
    }

    public Integer getCoUfEnd() {
        return coUfEnd;
    }

    public void setCoUfEnd(Integer coUfEnd) {
        this.coUfEnd = coUfEnd;
    }

    public Integer getCoMunicipioEnd() {
        return coMunicipioEnd;
    }

    public void setCoMunicipioEnd(Integer coMunicipioEnd) {
        this.coMunicipioEnd = coMunicipioEnd;
    }

    public Integer getTpZonaResidencial() {
        return tpZonaResidencial;
    }

    public void setTpZonaResidencial(Integer tpZonaResidencial) {
        this.tpZonaResidencial = tpZonaResidencial;
    }

    public Integer getTpOutroLocalAula() {
        return tpOutroLocalAula;
    }

    public void setTpOutroLocalAula(Integer tpOutroLocalAula) {
        this.tpOutroLocalAula = tpOutroLocalAula;
    }

    public Integer getInTransportePublico() {
        return inTransportePublico;
    }

    public void setInTransportePublico(Integer inTransportePublico) {
        this.inTransportePublico = inTransportePublico;
    }

    public Integer getTpResponsavelTransporte() {
        return tpResponsavelTransporte;
    }

    public void setTpResponsavelTransporte(Integer tpResponsavelTransporte) {
        this.tpResponsavelTransporte = tpResponsavelTransporte;
    }

    public Integer getInTranspVansKombi() {
        return inTranspVansKombi;
    }

    public void setInTranspVansKombi(Integer inTranspVansKombi) {
        this.inTranspVansKombi = inTranspVansKombi;
    }

    public Integer getInTranspMicroOnibus() {
        return inTranspMicroOnibus;
    }

    public void setInTranspMicroOnibus(Integer inTranspMicroOnibus) {
        this.inTranspMicroOnibus = inTranspMicroOnibus;
    }

    public Integer getInTranspOnibus() {
        return inTranspOnibus;
    }

    public void setInTranspOnibus(Integer inTranspOnibus) {
        this.inTranspOnibus = inTranspOnibus;
    }

    public Integer getInTranspBicicleta() {
        return inTranspBicicleta;
    }

    public void setInTranspBicicleta(Integer inTranspBicicleta) {
        this.inTranspBicicleta = inTranspBicicleta;
    }

    public Integer getInTranspTrAnimal() {
        return inTranspTrAnimal;
    }

    public void setInTranspTrAnimal(Integer inTranspTrAnimal) {
        this.inTranspTrAnimal = inTranspTrAnimal;
    }

    public Integer getInTranspOutroVeiculo() {
        return inTranspOutroVeiculo;
    }

    public void setInTranspOutroVeiculo(Integer inTranspOutroVeiculo) {
        this.inTranspOutroVeiculo = inTranspOutroVeiculo;
    }

    public Integer getInTranspEmbarAte5() {
        return inTranspEmbarAte5;
    }

    public void setInTranspEmbarAte5(Integer inTranspEmbarAte5) {
        this.inTranspEmbarAte5 = inTranspEmbarAte5;
    }

    public Integer getInTranspEmbar5a15() {
        return inTranspEmbar5a15;
    }

    public void setInTranspEmbar5a15(Integer inTranspEmbar5a15) {
        this.inTranspEmbar5a15 = inTranspEmbar5a15;
    }

    public Integer getInTranspEmbar15a35() {
        return inTranspEmbar15a35;
    }

    public void setInTranspEmbar15a35(Integer inTranspEmbar15a35) {
        this.inTranspEmbar15a35 = inTranspEmbar15a35;
    }

    public Integer getInTranspEmbar35() {
        return inTranspEmbar35;
    }

    public void setInTranspEmbar35(Integer inTranspEmbar35) {
        this.inTranspEmbar35 = inTranspEmbar35;
    }

    public Integer getInTranspTremMetro() {
        return inTranspTremMetro;
    }

    public void setInTranspTremMetro(Integer inTranspTremMetro) {
        this.inTranspTremMetro = inTranspTremMetro;
    }

    public Integer getInNecessidadeEspecial() {
        return inNecessidadeEspecial;
    }

    public void setInNecessidadeEspecial(Integer inNecessidadeEspecial) {
        this.inNecessidadeEspecial = inNecessidadeEspecial;
    }

    public Integer getInCegueira() {
        return inCegueira;
    }

    public void setInCegueira(Integer inCegueira) {
        this.inCegueira = inCegueira;
    }

    public Integer getInBaixaVisao() {
        return inBaixaVisao;
    }

    public void setInBaixaVisao(Integer inBaixaVisao) {
        this.inBaixaVisao = inBaixaVisao;
    }

    public Integer getInSurdez() {
        return inSurdez;
    }

    public void setInSurdez(Integer inSurdez) {
        this.inSurdez = inSurdez;
    }

    public Integer getInDefAuditiva() {
        return inDefAuditiva;
    }

    public void setInDefAuditiva(Integer inDefAuditiva) {
        this.inDefAuditiva = inDefAuditiva;
    }

    public Integer getInSurdocegueira() {
        return inSurdocegueira;
    }

    public void setInSurdocegueira(Integer inSurdocegueira) {
        this.inSurdocegueira = inSurdocegueira;
    }

    public Integer getInDefFisica() {
        return inDefFisica;
    }

    public void setInDefFisica(Integer inDefFisica) {
        this.inDefFisica = inDefFisica;
    }

    public Integer getInDefIntelectual() {
        return inDefIntelectual;
    }

    public void setInDefIntelectual(Integer inDefIntelectual) {
        this.inDefIntelectual = inDefIntelectual;
    }

    public Integer getInDefMultipla() {
        return inDefMultipla;
    }

    public void setInDefMultipla(Integer inDefMultipla) {
        this.inDefMultipla = inDefMultipla;
    }

    public Integer getInAutismo() {
        return inAutismo;
    }

    public void setInAutismo(Integer inAutismo) {
        this.inAutismo = inAutismo;
    }

    public Integer getInSindromeAsperger() {
        return inSindromeAsperger;
    }

    public void setInSindromeAsperger(Integer inSindromeAsperger) {
        this.inSindromeAsperger = inSindromeAsperger;
    }

    public Integer getInSindromeRett() {
        return inSindromeRett;
    }

    public void setInSindromeRett(Integer inSindromeRett) {
        this.inSindromeRett = inSindromeRett;
    }

    public Integer getInTranstornoDi() {
        return inTranstornoDi;
    }

    public void setInTranstornoDi(Integer inTranstornoDi) {
        this.inTranstornoDi = inTranstornoDi;
    }

    public Integer getInSuperdotacao() {
        return inSuperdotacao;
    }

    public void setInSuperdotacao(Integer inSuperdotacao) {
        this.inSuperdotacao = inSuperdotacao;
    }

    public Integer getInRecursoLedor() {
        return inRecursoLedor;
    }

    public void setInRecursoLedor(Integer inRecursoLedor) {
        this.inRecursoLedor = inRecursoLedor;
    }

    public Integer getInRecursoTranscricao() {
        return inRecursoTranscricao;
    }

    public void setInRecursoTranscricao(Integer inRecursoTranscricao) {
        this.inRecursoTranscricao = inRecursoTranscricao;
    }

    public Integer getInRecursoInterprete() {
        return inRecursoInterprete;
    }

    public void setInRecursoInterprete(Integer inRecursoInterprete) {
        this.inRecursoInterprete = inRecursoInterprete;
    }

    public Integer getInRecursoLibras() {
        return inRecursoLibras;
    }

    public void setInRecursoLibras(Integer inRecursoLibras) {
        this.inRecursoLibras = inRecursoLibras;
    }

    public Integer getInRecursoLabial() {
        return inRecursoLabial;
    }

    public void setInRecursoLabial(Integer inRecursoLabial) {
        this.inRecursoLabial = inRecursoLabial;
    }

    public Integer getInRecursoBraille() {
        return inRecursoBraille;
    }

    public void setInRecursoBraille(Integer inRecursoBraille) {
        this.inRecursoBraille = inRecursoBraille;
    }

    public Integer getInRecursoAmpliada16() {
        return inRecursoAmpliada16;
    }

    public void setInRecursoAmpliada16(Integer inRecursoAmpliada16) {
        this.inRecursoAmpliada16 = inRecursoAmpliada16;
    }

    public Integer getInRecursoAmpliada20() {
        return inRecursoAmpliada20;
    }

    public void setInRecursoAmpliada20(Integer inRecursoAmpliada20) {
        this.inRecursoAmpliada20 = inRecursoAmpliada20;
    }

    public Integer getInRecursoAmpliada24() {
        return inRecursoAmpliada24;
    }

    public void setInRecursoAmpliada24(Integer inRecursoAmpliada24) {
        this.inRecursoAmpliada24 = inRecursoAmpliada24;
    }

    public Integer getInRecursoNenhum() {
        return inRecursoNenhum;
    }

    public void setInRecursoNenhum(Integer inRecursoNenhum) {
        this.inRecursoNenhum = inRecursoNenhum;
    }

    public Integer getTpIngressoFederais() {
        return tpIngressoFederais;
    }

    public void setTpIngressoFederais(Integer tpIngressoFederais) {
        this.tpIngressoFederais = tpIngressoFederais;
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

    public Integer getTpUnificada() {
        return tpUnificada;
    }

    public void setTpUnificada(Integer tpUnificada) {
        this.tpUnificada = tpUnificada;
    }

    public Integer getTpTipoTurma() {
        return tpTipoTurma;
    }

    public void setTpTipoTurma(Integer tpTipoTurma) {
        this.tpTipoTurma = tpTipoTurma;
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

    public Escola getCoEntidade() {
        return coEntidade;
    }

    public void setCoEntidade(Escola coEntidade) {
        this.coEntidade = coEntidade;
    }

    public Turma getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Turma idTurma) {
        this.idTurma = idTurma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMatricula != null ? idMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.idMatricula == null && other.idMatricula != null) || (this.idMatricula != null && !this.idMatricula.equals(other.idMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula{" + "nuAnoCenso=" + nuAnoCenso + ", idMatricula=" + idMatricula + ", coPessoaFisica=" + coPessoaFisica + ", nuDia=" + nuDia + ", nuMes=" + nuMes + ", nuAno=" + nuAno + '}';
    }
}
