

public class MorseCodeDecoderTest {

    public static void main(String[] args) {

        String morseCode = ".... . -.--   .--- ..- -.. .";
        System.out.println("Morse code: " + morseCode);
        System.out.println("Decoded message: " + MorseCodeDecoder.decode(morseCode));

    }
}
