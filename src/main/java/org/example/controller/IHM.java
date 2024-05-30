package org.example.controller;

import org.example.entity.Article;
import org.example.service.ArticleService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IHM {
    private static ArticleService articleService = new ArticleService();
    private static Scanner scanner = new Scanner(System.in);

    public void start (){
        int choix ;
        do {
            System.out.println("1 Ajouter un article");
            System.out.println("2 Modifier un article");
            System.out.println("3 Supprimer un article");
            System.out.println("4 Consulter un article");
            System.out.println("5 Consulter tous les articles");
            System.out.println("6 Quitter");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterArticle();
                    break;
                case 2:
                    modifierArticle();
                    break;
                case 3:
                    supprimerArticle();
                    break;
                case 4:
                    consulterArticle();
                    break;
                case 5:
                    consulterTousLesArticles();
                    break;
                case 6:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        }while (choix != 6);
        }

        private static void ajouterArticle(){
            System.out.println("Description");
            String description = scanner.nextLine();

            System.out.println("Catégorie(homme, femme, enfant)");
            String categorie = scanner.nextLine();

            System.out.println("Taille");
            String taille = scanner.nextLine();

            System.out.println("Prix");
            double prix = scanner.nextDouble();

            System.out.println("Stock");
            int stock = scanner.nextInt();
            scanner.nextLine();

            Article article = new Article();
            article.setDescription(description);
            article.setCategorie(categorie);
            article.setTaille(taille);
            article.setPrix(prix);
            article.setStock(stock);

            articleService.create(article);

    }

    private static void modifierArticle(){
        System.out.println("Id de l'article à modifier");
        int id = scanner.nextInt();
        scanner.nextLine();

        Article article = articleService.findById(id);
        if (article != null){
            System.out.println("nouvelle description");
            article.setDescription(scanner.nextLine());

            System.out.println("nouvelle categorie (homme, femme, enfant)");
            article.setCategorie(scanner.nextLine());

            System.out.println("nouvelle taille(S,M,L,XL");
            article.setTaille(scanner.nextLine());

            System.out.println("nouveau prix");
            article.setPrix(scanner.nextDouble());

            System.out.println("nouveau stock");
            article.setStock(scanner.nextInt());

            articleService.update(article);

        } else {
            System.out.println("Pas d'article trouvé");
        }
    }

    private static void supprimerArticle(){
        System.out.println("supprimer un article");
        int id = scanner.nextInt();
        scanner.nextLine();
        articleService.delete(articleService.findById(id));
    }

    private static void consulterArticle(){
        System.out.println("id de l'article à consulter");
        int id = scanner.nextInt();
        scanner.nextLine();
        Article article = articleService.findById(id);
        {
            if (article != null){
                afficherArticle(article);
            } else {
                System.out.println("Article non trouvé");
            }
        }
    }

    private static void consulterTousLesArticles(){
        for (Article article : articleService.findAll()){
            afficherArticle(article);
        }
    }

    private static void afficherArticle(Article article){
        System.out.println("Id" + article.getId());
        System.out.println("description : " + article.getDescription());
        System.out.println("catégorie : " + article.getCategorie());
        System.out.println("taille : " + article.getTaille());
        System.out.println("prix : " + article.getPrix());
        System.out.println("stock : "+ article.getStock());

    }
}
