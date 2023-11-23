package controlstr.test

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(string: String): Boolean {
    if (string.isEmpty() || string[0].isDigit()) {
        return false;
    }

    for (char in string) {
        if (!char.isLetterOrDigit() && char != '_') {
            return false
        }
    }

    return true;
}