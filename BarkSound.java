import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BarkSound {

    public static void playBark() {
        try {

            // Specify the path to your barking sound file
            File soundFile = new File("bark.wav"); // Replace "bark.wav" with your actual file name and path

            // Create an AudioInputStream from the file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);

            // Get the audio format
            AudioFormat format = audioInputStream.getFormat();

            // Create a DataLine.Info object for the Clip
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Get the Clip
            Clip audioClip = (Clip) AudioSystem.getLine(info);

            // Open the audioInputStream to the clip
            audioClip.open(audioInputStream);

            // Start playing the sound
            audioClip.start();
            audioClip.start();
            try {
                Thread.sleep(200); // Add a small delay (adjust the value as needed, in milliseconds)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            // Optional: Keep the program running until the sound finishes
            while (audioClip.isRunning()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }

            // Close the clip and audioInputStream
            audioClip.close();
            audioInputStream.close();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file format: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error loading the audio file: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.out.println("Could not get an audio line: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        playBark(); // Call the method to play the bark sound
    }
}