package lv.jg.lesson4;

public class LightColorDetector {

    public String detect(int lambda) {
        if (lambda < 380 && lambda > 0) {
            return "too small wave length";
        } else if (lambda >= 380 && lambda < 450) {
            return "This wavelength defines purple color";
        } else if (lambda >= 450 && lambda < 495) {
            return "This wavelength defines blue color";
        } else if (lambda >= 495 && lambda < 570) {
            return "This wavelength defines green color";
        } else if (lambda >= 570 && lambda < 590) {
            return "This wavelength defines yellow color";
        } else if (lambda >= 590 && lambda < 620) {
            return "This wavelength defines orange color";
        } else if (lambda >= 620 && lambda <= 750) {
            return "This wavelength defines red color";
        } else {
            return "This wavelength is too long for visible light";
        }
    }

    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();

        lightColorDetector.detect(390);
    }
}
