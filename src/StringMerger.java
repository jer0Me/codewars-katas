public class StringMerger {

    public static boolean isMerge(String text, String partOne, String partTwo) {
        if (partsMergedHasTheSameLengthThanText(text, partOne, partTwo)) {
            return  arePartsMergedEqualText(text, partOne, partTwo) || (
                    textStartsWithFirstPartCharacter(text, partOne) && isMerge(text.substring(1), partOne.substring(1), partTwo)
                            || textStartsWithFirstPartCharacter(text, partTwo) && isMerge(text.substring(1), partOne, partTwo.substring(1))
            );
        }
        return false;
    }

    private static boolean arePartsMergedEqualText(String text, String partOne, String partTwo) {
        return text.equals(partOne + partTwo);
    }

    private static boolean partsMergedHasTheSameLengthThanText(String text, String partOne, String partTwo) {
        return text.length() == partOne.length() + partTwo.length();
    }

    private static boolean textStartsWithFirstPartCharacter(String text, String part) {
        return !part.isEmpty() && text.startsWith(part.substring(0, 1));
    }

}