public class Main {
    public static void main(String[] args) {
        Vocabulary vocabulary = new Vocabulary();

        vocabulary.addWords("Hello World all");
        vocabulary.addWords("the Best");

        System.out.println(vocabulary.getVocabulary());
    }
}