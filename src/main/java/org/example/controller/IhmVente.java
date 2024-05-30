package org.example.controller;

import org.example.entity.Article;
import org.example.entity.RecuVente;
import org.example.entity.Vente;
import org.example.service.ArticleService;
import org.example.service.VenteService;
import org.hibernate.Session;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class IhmVente {
//    private static ArticleService articleService = new ArticleService();
//    private static VenteService venteService = new VenteService();
//    private static Scanner scanner = new Scanner(System.in);
//
//    public void start (){
//        int choix;
//        do {
//            System.out.println("1: Ajouter un vente");
//            System.out.println("2: Modifier une vente");
//            System.out.println("3 : Supprimer une vente");
//            System.out.println("4 : Consulter une vente");
//            System.out.println("5 : Consulter toutes les ventes");
//            System.out.println("6 : Quitter");
//
//            choix = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choix){
//                case 1:
//                    ajouterVente();
//                    break;
//                case 2:
//                    modifierVente();
//                    break;
//                case 3:
//                    supprimerVente();
//                    break;
//                case 4:
//                    consulterVente();
//                    break;
//                case 5:
//                    consulterTousLesVentes();
//                    break;
//                case 6:
//                    System.out.println("Au revoir");
//                    break;
//                default:
//                    System.out.println("choix invalide");
//            }
//        }while (choix != 6);
//    }
//
//    private void ajouterVente(Article article, int stock) {
//        Vente vente = new Vente();
//        vente.setDate(new Date());
//        vente.setEtat("en cours");
//        vente.setArticle(article);
//        vente.setStock(stock);
//        venteService.updateVente(vente);
//    }




}