package esconcessionario;

public class funzionii {

    //aggiunta di una nuova auto
    public static void aggiunta(String [] marca, String[] modello, double [] prezzo, String maarca, double preezzo, String moodello, int num){
        marca[num]=maarca;
        modello[num]=moodello;
        prezzo[num]=preezzo;
    }
    //visualizzazione di tutte le auto
    public static String visualizzazione(int num, String[] marca, String[] modello, double[] prezzo){
        String macchina="";
        for(int i=0; i<num; i++){
            macchina= macchina+marca[i]+"\t"+modello[i]+"\t"+prezzo[i]+"\t\n";
        }
        return macchina;
    }
    //ricerca di un'auto tramite marca e modello;
    public static int ricerca( String [] marca, String [] modello, String maarca, String moodello){
        for(int i=0; i< modello.length; i++){
            if(moodello==modello[i]&& maarca==marca[i]){
                return i;
            }
        }
        return -1;
    }
    //cancellazione di un'auto;
    public static void cancellazione(){

    }
    //modifica dei dati di un'auto;
    public static void modifica(int num,String modellonuovo, String marcanuova, double prezzonuovo, String [] marca, String [] modello, double [] prezzo){
        marca[num]=marcanuova;
        modello[num]=modellonuovo;
        prezzo[num]=prezzonuovo;

    }
    //visualizzazione delle auto in ordine crescente;
    public static String crescente(){

    }
    //visualizzare tutti i modelli che diesel;
    public static String diesel( String [] marca, String [] modello, double [] prezzo, int num){
        String diesel="";
        for(int i=0;i<num;i++){
            String [] paole =modello
        }
    }
}
