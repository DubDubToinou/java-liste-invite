package fr.eni.gestioninvitationvip;

import java.util.Arrays;
import java.util.Scanner;

public class InvitationVip {

	public static Scanner scan = new Scanner(System.in);

	public static String[] personnes = new String[6];
	// public static String tableauDesInvites;
	// Fonction Affichage du menu principal :

	public static void affichageMenu() {
		System.out.println("############################################");
		System.out.println("###### Menu: Gestion d'invitation VIP ######");
		System.out.println("############################################");
		System.out.println(" ");
		System.out.println("       Que souhaitez vous faire.");
		System.out.println("############################################");
		System.out.println("      1 : Ajouter une personne.");
		System.out.println("      2 : Supprimer une personne.");
		System.out.println("      3 : Afficher le tableau.");
		System.out.println("      4 : Arrêt du programme");
		// ChoixUtilisateur();
	}

	// Fonction Ajout personne.

	public static void fonctionAjout() {

		// on initialise le bool liste Plein à true.
		boolean listePleine = true;

		for (int i = 0; i < personnes.length; i++) {
			// on rentre dans le si, si l'emplacement est égale à null
			if (personnes[i] == null) {
				System.out.println("### Merci de saisir le nom et prénom de l'invité : ###\n");
				String nomPrenom = saisirLine();
				personnes[i] = nomPrenom;

				listePleine = false; // on met le bool liste pleine à false pour continuer
				System.out.println("### " + personnes[i] + " a été ajouté avec succes ###\n");
				break;
			}

		}

		System.out.println("\n### Appuyer sur une touche pour retourner au menu principal : ###");
		String retour1 = saisirLine();

		if (retour1 != null) {

		}

		// si le bool est true. alors je retour "la liste des invitée est pleine".
		if (listePleine)

		{
			System.out.println("#######################################");
			System.out.println("### la liste d'invitée est pleine ! ###");
			System.out.println("#######################################");

			System.out.println("\n### Appuyer sur une touche pour retourner au menu principal : ###");
			String retour = saisirLine();

			if (retour != null) {

			}
		}

	}

	// Fonction Suppression.
	public static void supprInvite() {

		int elementASuprr;

		System.out.println("### Quel invité souhaitez vous supprimer de la liste: ###\n");
		System.out.println("###########################");
		for (int i = 0; i < personnes.length; i++) {

			if (personnes[i] != null) {
				System.out.println("###  " + i + " : " + personnes[i]);
			}

		}
		System.out.println("###########################\n");
		System.out.println("choix : ");

		elementASuprr = saisirInt();
		for (int i = 0; i < personnes.length; i++) {
			if (elementASuprr == i) {
				System.out.println("### " + personnes[i] + " a été supprimé avec succes ###");
				personnes[i] = null;
			}
		}

	}
	
	// Fonction affichage de la liste des invités.
	public static void affichageInvite() {

		boolean listeVide = true;

		for (int i = 0; i < personnes.length; i++) {

			if (personnes[i] != null) {
				System.out.println("   " + i + " : " + personnes[i]);
				listeVide = false;
			}

		}
		if (listeVide) {
			System.out.println("### La liste est vide. ###");
		}

		System.out.println("\n### Appuyer sur une touche pour retourner au menu principal : ###");
		String retour = saisirLine();

		if (retour != null) {

		}
	}

	// Switch pour le choix utilisateurss
	public static void choixUtilisateur() {
		int saisie;

		do {

			affichageMenu();
			saisie = saisirInt();

			switch (saisie) {
			case 1: {

				fonctionAjout();
				break;
			}

			case 2: {
				supprInvite();
				break;
			}

			case 3: {
				affichageInvite();
				break;
			}

			case 4: {
				System.out.println("########################");
				System.out.println("## Merci et à bientôt ##");
				System.out.println("########################");
				break;
			}

			// default:
			// AffichageMenu();

			// throw new IllegalArgumentException("Merci de saisir un élèment du menu : " +
			// saisie);
			}

		} while (saisie != 4);
	}

	// Fonction Main !
	public static void main(String[] args) {

		// AffichageMenu();
		choixUtilisateur();

	}

	public static String saisirLine() {
		scan.nextLine();
		String result = scan.nextLine();
		return result;
	}

	public static int saisirInt() {
		int result = scan.nextInt();
		return result;
	}

}
