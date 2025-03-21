import java.util.ArrayList;

class PoliceThieves {
    public static int policeThieves (char [] arr, int k) {
        int n = arr.length;
        int result= 0;
        ArrayList<Integer> thieves = new ArrayList<> ();
        ArrayList<Integer> police = new ArrayList<> ();
        for (int i = 0; i < n; i ++) {
            if (arr[i] == 'T')
                thieves.add(i);
            if (arr[i] == 'P')
                police.add(i);
        }
        int trackthieves = 0;
        int trackpolice = 0;
        while (trackthieves < thieves.size() && trackpolice < police.size()) {
            if (Math.abs(thieves.get(trackthieves) - police.get(trackpolice)) <= k) {
                result += 1;
                trackthieves += 1;
                trackpolice += 1;
            }
            else if (thieves.get(trackthieves) < police.get(trackpolice)) {
                trackthieves += 1;
            }
            else {
                trackpolice += 1;
            }
        }
        return result;
    }
}
class Main{
    public static void main(String[] args) {
        int k, n;

        char policeTheifArray[] = {'P', 'T', 'T', 'P', 'T'};
        k = 2;

        System.out.println("Maximum thieves caught for {P, T, T, P, T}: " + PoliceThieves.policeThieves(policeTheifArray,k));

        char policeTheifArray1[] = {'T', 'T', 'P', 'P', 'T', 'P'};
        k = 2;

        System.out.println("Maximum thieves caught for {T, T, P, P, T,P}: " + PoliceThieves.policeThieves(policeTheifArray1, k));

    }
}