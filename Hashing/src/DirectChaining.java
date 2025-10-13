import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];

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


    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<>();
        }
        hashTable[newIndex].add(word);

        // Time Compexity O(1) avg,O(n) worst,Space complexity O(n)
    }

    public void displayHashTable(){
        if(hashTable == null){
            System.out.println("Hash table is not exists");
            return;
        }
        else{
            System.out.println("\n ------------ HashTable ---------");
            for(int i=0; i<hashTable.length;i++){
                System.out.println("Index "+i+", key: "+hashTable[i]);
            }
        }

        // Time Complexity O(n),Space Complexity O(1)

    }

    public boolean searchHashTable(String word){
        if(hashTable == null){
            System.out.println("Hash table is not exists");
            return false;
        }
        else{
            int newIndex = modASCIIHashFunction(word,hashTable.length);
            if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)){
                System.out.println("\n"+"\""+ word + "\""+" found in Hashtabe at location: "+newIndex);
                return true;
            }
            else{
                System.out.println("\n" + "\""+ word + "\""+ " not found in Hashtable");
                return false;
            }
        }

        // Time: O(1) avg, O(n) worst, Space: O(1)
    }

    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        boolean result  = searchHashTable(word);
        if(result){
            hashTable[newIndex].remove(word);
            System.out.println(word+ " has been deleted from HashTable");
        }

        // Time: O(1) avg, O(n) worst, Space: O(1)
    }
}
