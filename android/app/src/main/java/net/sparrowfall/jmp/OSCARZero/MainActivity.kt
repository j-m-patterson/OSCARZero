package net.sparrowfall.jmp.OSCARZero

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convertString(@Suppress("UNUSED_PARAMETER")ignored: View) {
        val chardict = mapOf(
            '0' to "Zero",
            '1' to "One",
            '2' to "Two",
            '3' to "Three",
            '4' to "Four",
            '5' to "Five",
            '6' to "Six",
            '7' to "Seven",
            '8' to "Eight",
            '9' to "Nine",
            'a' to "alfa",
            'b' to "bravo",
            'c' to "charlie",
            'd' to "delta",
            'e' to "echo",
            'f' to "foxtrot",
            'g' to "golf",
            'h' to "hotel",
            'i' to "india",
            'j' to "juliett",
            'k' to "kilo",
            'l' to "lima",
            'm' to "mike",
            'n' to "november",
            'o' to "oscar",
            'p' to "papa",
            'q' to "quebec",
            'r' to "romeo",
            's' to "sierra",
            't' to "tango",
            'u' to "uniform",
            'v' to "victor",
            'w' to "whiskey",
            'x' to "x-ray",
            'y' to "yankee",
            'z' to "zulu",
            'A' to "ALFA",
            'B' to "BRAVO",
            'C' to "CHARLIE",
            'D' to "DELTA",
            'E' to "ECHO",
            'F' to "FOXTROT",
            'G' to "GOLF",
            'H' to "HOTEL",
            'I' to "INDIA",
            'J' to "JULIETT",
            'K' to "KILO",
            'L' to "LIMA",
            'M' to "MIKE",
            'N' to "NOVEMBER",
            'O' to "OSCAR",
            'P' to "PAPA",
            'Q' to "QUEBEC",
            'R' to "ROMEO",
            'S' to "SIERRA",
            'T' to "TANGO",
            'U' to "UNIFORM",
            'V' to "VICTOR",
            'W' to "WHISKEY",
            'X' to "X-RAY",
            'Y' to "YANKEE",
            'Z' to "ZULU",
            '!' to "Exclamation",
            '"' to "Double_quote",
            '#' to "Hash",
            '$' to "Dollar_sign",
            '%' to "Percent",
            '&' to "Ampersand",
            '\'' to "Single_quote",
            '(' to "Left_parenthesis",
            ')' to "Right_parenthesis",
            '*' to "Asterisk",
            '+' to "Plus",
            ',' to "Comma",
            '-' to "Minus",
            '.' to "Period",
            '/' to "Slash",
            ':' to "Colon",
            ';' to "Semicolon",
            '<' to "Less_than",
            '=' to "Equal_sign",
            '>' to "Greater_than",
            '?' to "Question_mark",
            '@' to "At_sign",
            '[' to "Left_bracket",
            '\\' to "Backslash",
            ']' to "Right_bracket",
            '^' to "Caret",
            '_' to "Underscore",
            '`' to "Backtick",
            '{' to "Left_brace",
            '|' to "Vertical_bar",
            '}' to "Right_brace",
            '~' to "Tilde",
            ' ' to "Space")
        val outputField = findViewById<TextView>(R.id.TextView)
        val userInputValue = findViewById<EditText>(R.id.plain_text_input)
        val textToConv = userInputValue.text.toString()
        val outputString = StringBuilder()
        for (c in textToConv) {
            outputString.append(chardict[c]).append(" ")
        }
        outputField.movementMethod = ScrollingMovementMethod()
        outputField.text = outputString.toString()
    }
}
