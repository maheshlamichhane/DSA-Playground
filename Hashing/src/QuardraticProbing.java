import java.util.ArrayList;

public class QuardraticProbing {

    String[] hashTable;
    int usedCelNumber;

    QuardraticProbing(int size) {
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

    public void insertInHashTable(String word){
        int counter = 0;
        int index = modASCIIHashFunction(word, hashTable.length);
        int newIndex = index;
        while (counter < hashTable.length) {
            newIndex = (index + counter * counter) % hashTable.length;
            if (hashTable[newIndex] == null) {
                hashTable[newIndex] = word;
                usedCelNumber++;
                System.out.println("The " + word + " successfully inserted at location: " + newIndex);
                return;
            } else {
                System.out.println(newIndex + " is already occupied. Trying next...");
            }
            counter++;
        }
        System.out.println("Unable to insert " + word + ". HashTable is full.");


        //Time: O(1) avg, O(m) worst,Space: O(1)
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
















}
