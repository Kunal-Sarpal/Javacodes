public class gen5<T> {

    static <T> void show(T[] arr){
        for(T i: arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        gen5<Integer> obj = new gen5<>();

        show(new Integer[]{1,2,3,4,5,6,7});
        System.out.println("");
        show(new String[]{"Kunal","Sarpal","is ","Great"});

    }
}


// https://lpuin-my.sharepoint.com/personal/om_singh_lpu_in/_layouts/15/onedrive.aspx?ga=1&id=%2Fpersonal%2Fom_singh_lpu_in%2FDocuments%2FApna%20College%20ALPHA%20Full%20Course