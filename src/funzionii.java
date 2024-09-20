package esconcessionario;

public class funzionii {

    //aggiunta di una nuova auto
    public int aggiunta(String [] marca, String[] modello, int [] prezzo, String maarca, int preezzo, String moodello, int num){
        marca[num]=maarca;
        modello[num]=moodello;
        prezzo[num]=preezzo;
        num++;
        return num;
    }
    //visualizzazione di tutte le auto
    public int visualizzazione (int num){
        num++;
        return num;
    }
    //ricerca di un'auto tramite marca e modello;
    public int ricerca(int num, String [] marca, String [] modello, String maarca, String moodello){
        for(int i=0; i< modello.length; i++){
            if(moodello==modello[i]){
                num=i;
            }
        }
        return num;
    }
    //cancellazione di un'auto;
    public void cancellazione(){

    }
    //modifica dei dati di un'auto;
    public void modifica(String modellonuovo, String marcanuova, String prezzonuovo, String [] marca, String [] modello, String [] prezzo, int num){
        marca[num]=marcanuova;
        modello[num]=modellonuovo;
        prezzo[num]=prezzonuovo;

    }
    //visualizzazione delle auto in ordine crescente;
    public String crescente(){

    }
    //visualizzare tutti i modelli che diesel;
    public String diesel(){

    }
}
