import java.util.Locale;
import java.util.jar.Attributes;

public enum CrosswalkManager {
    //
    StartScenario,
    EndScenario,
    BuildCrosswalk,
    IAmCrossingOver,
    IAmWaitingAWhile,
    PedestrianArgAppear,
    PedestrianTrafficSignalAreHere,
    GreenLightsOnNow,
    RedLightOnNow,
    GreenLightsOffNow,
    RedLightIsOffNow,
    StateGreenOnRedOn,
    WaitArgSecond

    public String englishMessage;
    public String koreanMessage;
    public Local defaultLocale = Locale.KOREA;

    CrosswalkManager(Attributes attributes) {
        this.attributes = attributes;
    }




}
