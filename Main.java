package isep.redede;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("entrez 1 pour la fonction discriminant");
        System.out.println("entrez 2 pour la fonction parite");
        System.out.println("entrez 3 pour la fonction max");
        System.out.println("entrez 4 pour la fonction min");
        System.out.println("entrez 5 pour la fonction egaliteStr");
        System.out.println("entrez 6 pour la fonction factorielle");
        System.out.println("entrez 7 pour la fonction countdown");
        System.out.println("entrez 8 pour la fonction carres");
        System.out.println("entrez 9 pour la fonction tableMultiplication");
        System.out.println("entrez 10 pour la fonction division");
        System.out.println("entrez 11 pour la fonction regle");
        System.out.println("entrez 12 pour la fonction nombrePremier");
        System.out.println("entrez 13 pour la fonction initialisationTableau");
        System.out.println("entrez 14 pour la fonction inverseTableau");
        System.out.println("entrez le numéros de la recherche pour poursuivre");
        Scanner scanner = new Scanner(System.in);
        int entier = scanner.nextInt();
        switch (entier){
            case 1 :
                discriminant();
                break;
            case 2 :
                parite();
                break;
            case 3 :
                max();
                break;
            case 4 :
                min();
                break;
            case 5 :
                egaliteStr();
                break;
            case 6 :
                factorielle();
                break;
            case 7 :
                countdown();
                break;
            case 8 :
                carres();
                break;
            case 9 :
                tableMultiplication();
                break;
            case 10 :
                division();
                break;
            case 11:
                regle();
                break;
            case 12:
                nombrePremier();
                break;
            case 13:
                initialisationTableau();
                break;
            case 14:
            int[] tableau = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
            inverseTableau(tableau);
                break;
        }
    }

    private static void inverseTableau(int[] tableau) {
        int[] invtableau = new int[20];
        for (int i = 0; i < tableau.length; i++) {
            int entier = tableau[tableau.length - 1 -i];
            invtableau[i] = entier;
        }
        for (int i = 0; i < invtableau.length; i++) {
            System.out.print(invtableau[i]);}
    }
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        int max = tableau[0];
        int min = tableau[0];
        int somme = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (max < tableau[i]){
                max = tableau[i];
            }
            if (min > tableau[i]) {
                min = tableau[i];
            }
            if(tableau[i]%2==0){
                System.out.println(tableau[i] + " est pair et on la place"+ i + " dans le tableau" );
            }
            somme += tableau[i];
        }
        System.out.println("le max du tableau est : " + max + " et le minimun est : " + min);
        System.out.println("la somme des éléments du tableau donne :" + somme);
    }
    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int entier;
        do {
            System.out.println("Veuillez saisir un entier strictement positif");
            entier = scanner.nextInt();
        } while (entier <= 0);
        int diviseur = 2;
        for (int i = 2; i< entier; i++ ) {
            if (entier % i == 0) {
                diviseur += 1;
            }
        }
        if(diviseur==2){
            System.out.println(entier + " est un nombre premier");
        }else{
            System.out.println(entier + " n'est pas un nombre premier et possede "+ diviseur +" diviseurs");
        }
    }
    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la taille de la règle");
        int n = scanner.nextInt();
        System.out.print("|");
        for (int i=1;i<=n;i++){
            if (i%10==0) {
                System.out.print("|");
            }else{
                System.out.print("-");
            }
        }
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le numérateur");
        int n = scanner.nextInt();
        int entier;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul comme nominateur");
            entier = scanner.nextInt();
        } while (entier <= 0);
        System.out.println("la division de "+n+" par "+entier+" vaut "+ n/entier);
    }
    public static void tableMultiplication() {
        for (int j=1;j<=10;j++) {
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + " ");
            }
        }
    }

    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        int n = scanner.nextInt();
        System.out.println(n +" au carres donne :"+ n * n);
    }

    public static void countdown() {
        for (int i = 0; i <= 10; i++){
            if (i==10){
                System.out.println("BOOM");
            }
            else{
                System.out.println(10-i);
            }
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("verifie si deux chaines de caractères sont identiques, entrez pour continuer");
        scanner.nextLine();
        System.out.println("merci de rentrer une premiere chaine de caractère");
        String chair1 = scanner.nextLine();
        System.out.println("merci de rentrer une seconde chaine de caractère");
        String chair2 = scanner.nextLine();
        boolean test = chair1.equals(chair2);
        System.out.println(test);
    }
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("calcule le max entre deux entiers");
        System.out.println("merci de rentrer un premier entier");
        int entier1 = scanner.nextInt();
        System.out.println("merci de rentrer un second entier");
        int entier2 = scanner.nextInt();
        if (entier1>entier2){
            System.out.println(entier1 +" est le plus grand entier");
        }else{
            System.out.println(entier2 + " est le plus grand entier");
        }
    }
    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("calcule le min entre deux entiers");
        System.out.println("merci de rentrer un premier entier");
        int entier1 = scanner.nextInt();
        System.out.println("merci de rentrer un second entier");
        int entier2 = scanner.nextInt();
        if (entier1>entier2){
            System.out.println(entier2 +" est le plus petit entier");
        }else{
            System.out.println(entier1 + " est le plus petit entier");
        }
    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("merci de rentrer un entier");
        int entier = scanner.nextInt();
        if (entier %2 ==0){
            System.out.println(entier + " est pair");
        } else {
        System.out.println(entier + " est impair");}
    }

    public static void discriminant() {
        // Contenu de la fonction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println(-b+ "+/- i"+ delta +"/ 2*"+a);
        }
        else if (delta == 0){
            float racine = -b/(2*a);
            System.out.println("la solution du polynome est la racine : " + racine);
        }
        else if(delta > 0){
            double racine1 = (- b + Math.sqrt(delta))/(2*a);
            double racine2 = (- b - Math.sqrt(delta))/(2*a);
            System.out.println("la solution du polynome sont les racines : " + racine1 +"et"+ racine2);
        }
    }
}