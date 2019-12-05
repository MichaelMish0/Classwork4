package btu;

public class Main {

    public static void main(String[] args) {
        String language;
        String parameters;
        language = "en";
        parameters = "p-2-s-5-17-w-3-9";
        Generator generator = new Generator(language, parameters);
        generator.parseStringToarray();
        System.out.println(generator.generateAlpha('a', 'z'));
        System.out.println(generator.generateRandomChar());
    }
}