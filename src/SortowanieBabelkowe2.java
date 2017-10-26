import java.util.Scanner;

public class SortowanieBabelkowe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablica = stworzTablice();
		sortuj(tablica);
	}

	public static int wstaw() {
		Scanner scanner = new Scanner(System.in);
		int liczba = scanner.nextInt();
		return liczba;
	}

	public static int[] stworzTablice() {
		System.out.println("ile elementow?");
		int ilosc = wstaw();
		int[] tablica = new int[ilosc];
		System.out.println("uzupelnij tablice");
		for (int i = 0; i < tablica.length; i++) {
			tablica[i] = wstaw();
		}

		return tablica;
	}

	public static void sortuj(int[] tab) {

		int n = tab.length;
		do {
			for (int i = 0; i < n - 1; i++) {
				if (tab[i] > tab[i + 1]) {
					zamiana(tab, i, i + 1);
				}
			}
			n = n - 1;
		} while (n > 1);

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public static void zamiana(int[] tablica, int miejsce1, int miejsce2) {
		int wartosc1 = tablica[miejsce1];
		int wartosc2 = tablica[miejsce2];

		tablica[miejsce1] = wartosc2;
		tablica[miejsce2] = wartosc1;

	}

}
