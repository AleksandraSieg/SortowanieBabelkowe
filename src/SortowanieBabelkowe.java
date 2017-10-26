import java.util.Scanner;

public class SortowanieBabelkowe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortowanieBabelkowe();
	}

	public static int wstaw() {
		Scanner sc = new Scanner(System.in);
		int nowaLiczba = sc.nextInt();
		return nowaLiczba;
	}

	public static int[] tworzymyTablice() {
		System.out.println("ile elementow tablicy?");
		int iloscElementow = wstaw();
		int[] tablica = new int[iloscElementow];
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = wstaw();
		}

		// for(int i = 0; i<tablica.length; i++){
		// System.out.println(tablica[i]);
		// }
		return tablica;
	}

	public static void pokazTablice(int[] tablica, String wiadomosc) {
		System.out.println(wiadomosc);
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(tablica[i]);
		}
	}

	public static void zamiana(int[] nowaTablica, int miejsce1, int miejsce2) {
		int wartosc1 = nowaTablica[miejsce1];
		int wartosc2 = nowaTablica[miejsce2];

		nowaTablica[miejsce1] = wartosc2;
		nowaTablica[miejsce2] = wartosc1;
	}

	public static void sortowanieBabelkowe() {
		int[] tab = tworzymyTablice();
		pokazTablice(tab, "tablica przed sortowaniem");
		int n = tab.length;
		do {
			for (int i = 0; i < n - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					zamiana(tab, i, i + 1);
				}
			}n = n - 1;
		} while (n > 1);

		pokazTablice(tab, "tablica po sortowaniu");
	}

}
