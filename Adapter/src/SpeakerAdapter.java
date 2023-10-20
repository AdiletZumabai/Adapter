
class SpeakerAdapter implements Smartphone {
    private OldSpeaker speaker;

    public SpeakerAdapter(OldSpeaker speaker) {
        this.speaker = speaker;
    }


    @Override
    public void playAudio() {
        System.out.println("Adapter: Converting audio from USB-C to 3.5mm");
        speaker.playAudioWith3_5mmJack();
    }
}