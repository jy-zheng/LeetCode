import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DetermineStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdktextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyuliotextbooasdfasdfasdfasdfasdfasferasdfasfasfwersdfafwergretyjyulioiyfdsdfgjkldfjsklajlfjklcvnekkljrkadsfnasdklfjkasdfasdjfklasfdk";
        System.out.println("Length:" + s.length());
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        long start = System.nanoTime();
        //String a = s.substring(0,s.length()/2);
        // String b = s.substring(s.length()/2,s.length());
        int result = 0;
        int mid = s.length() / 2;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.contains(s.charAt(i))) result++;
            if (vowels.contains(s.charAt(j))) result--;

        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;

        System.out.println("count:" + result);
        System.out.println("time used:" + timeElapsed);
    }
}
