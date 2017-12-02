/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.netbeans;

import Entidades.Escola;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author elivelton
 */
public class main {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UP");
    public static EntityManager em = emf.createEntityManager();

    /**
     * @param args the command line arguments
     */
    private static Query criarQuery(){
        Query query = em.createQuery("Select e from Escola e WHERE e.inEspecialExclusiva=1 AND e.inComumCreche = 0 AND\n" +
                                                            "e.inComumCreche = 0 AND e.inComumFundAi = 0 AND\n" +
                                                            "e.inComumFundAf = 0 AND e.inComumMedioMedio = 0 AND\n" +
                                                            "e.inComumMedioIntegrado = 0 AND e.inComumMedioNormal = 0\n" +
                                                            "AND e.inComumEjaFund = 0 AND e.inComumEjaMedio=0 AND\n" +
                                                            "e.inComumEjaProf = 0 AND e.inComumProf = 0");
        return query;
    }
    
    private static List<Escola> retornaListaResultado(Query query, int quantidade){
        List<Escola> qtdResultado = new ArrayList<Escola>();
        if(quantidade <= 1000){
            qtdResultado = query.setMaxResults(quantidade).getResultList();
        }
        else{
            qtdResultado = query.getResultList();
        }
        return qtdResultado;
    }
    
    private static long retornaTempoAtual(){
        return System.currentTimeMillis();
    }
    
    private static long diferencaTempo(long inicio, long fim){
        return fim - inicio;
    }
    
    private static void printaDifTempo(long inicio, long fim){
        System.out.println("Diferença de tempo: " + diferencaTempo(inicio,fim));
    }
    
    public static void main(String[] args) {
        //Cache cache = emf.getCache();
        Query query = criarQuery();
        List<Escola> qtdResultado;
        long inicio;
        long fim;
        
        Cache cache = emf.getCache();
        
        //Chamada para MAX
        inicio = retornaTempoAtual();
        qtdResultado = retornaListaResultado(query, 1001);
        fim = retornaTempoAtual();
        printaDifTempo(inicio,fim);
        
        //Chamada para 1000
        inicio = retornaTempoAtual();
        qtdResultado = retornaListaResultado(query, 1000);
        fim = retornaTempoAtual();
        printaDifTempo(inicio,fim);
        
        //Chamada para 100
        inicio = retornaTempoAtual();
        qtdResultado = retornaListaResultado(query, 100);
        fim = retornaTempoAtual();
        printaDifTempo(inicio,fim);
        
        //Chamada para 10
        inicio = retornaTempoAtual();
        qtdResultado = retornaListaResultado(query, 10);
        fim = retornaTempoAtual();
        printaDifTempo(inicio,fim);
        
//        for(int i=0; i < qtdResultado.size(); i++){
//            System.out.println(qtdResultado.get(i).toString());
//        }
    }

}
