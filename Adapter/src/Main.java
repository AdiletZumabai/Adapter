public class Main {
    public static void main(String[] args) {

        OldSpeaker oldSpeaker = new OldSpeaker();


        Smartphone smartphone = new SpeakerAdapter(oldSpeaker);


        smartphone.playAudio();
    }
}