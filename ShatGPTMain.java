public class ShatGPTMain {

    public static void main(String[] args) {
        // Create face object and pass to ShatGPT class
        ShatGPTFace face = new ShatGPTFace();
        ShatGPT shatGPT = new ShatGPT(face);

        // ShatGPT title screen
        face.loadingFace();
        System.out.println("Miter Gig : 2025 : AP CS : Java 21 \n ShatGPT (Version 3) is a '''chatbot''' parody of ChatGPT\n\n");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("""
                 _____ _           _   _____ ______ _____     _____\s
                /  ___| |         | | |  __ \\| ___ \\_   _|   |____ |
                \\ `--.| |__   __ _| |_| |  \\/| |_/ / | |______   / /
                 `--. \\ '_ \\ / _` | __| | __ |  __/  | |______|  \\ \\
                /\\__/ / | | | (_| | |_| |_\\ \\| |     | |     .___/ /
                \\____/|_| |_|\\__,_|\\__|\\____/\\_|     \\_/     \\____/\s
                """);
        ShatGPT.slowPrint("\nShatGPT: \nheyyo i am ShatGPT-3, am very smarert. i answr all quesiton u could evr ask.", 40);
        ShatGPT.slowPrint("\nask ur quesiatin dopwn ther  ... ", 50);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // Start chatbot
        ShatGPT.respond();

    }
}
