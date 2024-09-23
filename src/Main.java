package esconcessionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num=0;
        int indice2=0;
        int indice;
        String nuovomodello,nuovomarca;
        double nuovoprezzo;
        String ricmarca,ricmodello;
        String AggMarca, AggModello;
        double AggPrezzo;
        String [] modello = new String[100];
        double [] prezzo = new double[100];
        String [] marca = new String[100];
        do{
            System.out.println("1-aggiunta di una nuova auto");
            System.out.println("2-visualizzazione di tutte le auto");
            System.out.println("3-ricerca di un'auto tramite marca e modello");
            System.out.println("4-cancellazione di un'auto");
            System.out.println("5-modifica dei dati di un'auto");
            System.out.println("6-visualizzazione delle auto in ordine crescente");
            System.out.println("7-visualizzare tutti i modelli che diesel");
            System.out.println("8-ESCI");
            indice = t.nextInt();

            switch (indice) {
                    case 1:
                    System.out.println("dammi nuova marca");
                    AggMarca= t.nextLine();
                    System.out.println("dammi nuovo modello");
                    AggModello= t.nextLine();
                    System.out.println("dammi nuovo prezzo");
                    AggPrezzo= t.nextDouble();
                    funzionii.aggiunta(marca,modello,prezzo, AggMarca,AggPrezzo,AggModello,num);
                    num++;

                    break;
                    case 2:
                        System.out.println(funzionii.visualizzazione(num,marca,modello,prezzo));

                    break;
                    case 3:
                        System.out.println("che marca vuoi cercare?");
                        ricmarca= t.nextLine();
                        System.out.println("che modello vuoi cercare?");
                        ricmodello= t.nextLine();
                        if(funzionii.ricerca(marca,modello,ricmarca,ricmodello)==-1) {
                            System.out.println("non trovato");
                        }else {
                            System.out.println("l'auto si trova in posizione: " + funzionii.ricerca(marca,modello,ricmarca,ricmodello));
                        }
                    break;
                    case 4:

                    break;
                    case 5:
                        System.out.println("che marca vuoi cercare?");
                        ricmarca= t.nextLine();
                        System.out.println("che modello vuoi cercare?");
                        ricmodello= t.nextLine();
                        if(funzionii.ricerca(marca,modello,ricmarca,ricmodello)==-1) {
                            System.out.println("non trovato");
                        }else {
                            indice2=funzionii.ricerca(marca,modello,ricmarca,ricmodello);
                            System.out.println("auto trovata");
                            System.out.println("come vuoi modificare la marca?");
                            nuovomarca = t.nextLine();
                            System.out.println("come vuoi modificare il modello?");
                            nuovomodello = t.nextLine();
                            System.out.println("come vuoi modificare il prezzo?");
                            nuovoprezzo = t.nextDouble();
                            funzionii.modifica(indice2, nuovomodello, nuovomodello, nuovoprezzo, marca,modello,prezzo);
                        }
                    break;
                    case 6:

                    break;
                    case 7:

                    break;

            }
        }while(indice!=8);
    }
}
