public class WordFrequency {

    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int frequency = 0;
        for (int i = 0; i < listSize; i++) {
            if (wordsList[i].equalsIgnoreCase(currWord)) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numWords = sc.nextInt();
        sc.nextLine();

        String[] words = new String[numWords];

        for (int i = 0; i < numWords; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < numWords; i++) {
            int frequency = getWordFrequency(words, numWords, words[i]);
            System.out.println(words[i] + " " + frequency);
        }

        sc.close();
    }
}
