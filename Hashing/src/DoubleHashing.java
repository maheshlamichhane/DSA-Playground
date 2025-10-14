import java.util.ArrayList;

public class DoubleHashing {

    String[] hashTable;
    int usedCelNumber;

    DoubleHashing(int size) {
        hashTable = new String[size];
        usedCelNumber = 0;

        // Time Complexity O(1),Space Complexity O(n)
    }

    public int modASCIIHashFunction(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int i,sum;
        for(sum=0,i=0; i<word.length();i++){
            sum = sum + ch[i];
        }
        return sum % M;

        // Time Complexity O(n),Space compexity O(1)
    }

    public double getLoadFactor(){
        return usedCelNumber * 1.0 / hashTable.length;
    }

    public void rehashKeys(String word){
        usedCelNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for(String s : hashTable){
            if(s != null){
                data.add(s);
            }
        }
        data.add(word);
        hashTable = new String[hashTable.length * 2];
        for(String s : data){
            insertInHashTable(s);
        }
    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        }

        int hash1 = modASCIIHashFunction(word, hashTable.length);
        int hash2 = secondHashFunction(word, hashTable.length);
        int index;

        for (int i = 0; i < hashTable.length; i++) {
            index = (hash1 + i * hash2) % hashTable.length;

            if (hashTable[index] == null) {
                hashTable[index] = word;
                usedCelNumber++;
                System.out.println("The " + word + " successfully inserted at location: " + index);
                return;
            } else {
                System.out.println("Collision at index " + index + ", trying next...");
            }
        }

        System.out.println("Unable to insert " + word + ". HashTable is full.");
    }


    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash table is not exists");
            return;
        } else {
            System.out.println("\n ------------ HashTable ---------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key: " + hashTable[i]);
            }
        }
    }


    public boolean searchHashTable(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for(int i=index; i<index+hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                System.out.println("The "+word+" found at location: "+newIndex);
                return true;
            }
        }
        System.out.println("The "+word+" not found");
        return false;
    }

    public void deleteKeyHashTable(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for(int i=index; i<index+hashTable.length; i++){
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)){
                hashTable[newIndex] = null;
                System.out.println("The "+word+" successfully deleted at location: "+newIndex);
                return;
            }
        }
        System.out.println("The "+word+" not found");

        //Time: O(1) avg, O(m) worst,Space: O(1)
    }

    private int addAllDigitsTogether(int sum){
        int value = 0;
        while(sum > 0){
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M){
        char ch[];
        ch = x.toCharArray();
        int i,sum;
        for(sum=0,i=0; i<x.length();i++){
            sum+= ch[i];
        }
        while(sum > hashTable.length){
            sum = addAllDigitsTogether(sum);
        }
        return sum % M;
    }
















}
