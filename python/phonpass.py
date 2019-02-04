#!/usr/bin/env python

import sys

chardict = {
'0':'Zero', '1':'One', '2':'Two', '3':'Three', '4':'Four', '5':'Five', '6':'Six', '7':'Seven', '8':'Eight', '9':'Nine',
'a':'alfa', 'b':'bravo', 'c':'charlie', 'd':'delta', 'e':'echo', 'f':'foxtrot', 'g':'golf', 'h':'hotel', 'i':'india', 'j':'juliett',
'k':'kilo', 'l':'lima', 'm':'mike', 'n':'november', 'o':'oscar', 'p':'papa', 'q':'quebec', 'r':'romeo', 's':'sierra', 't':'tango',
'u':'uniform', 'v':'victor', 'w':'whiskey', 'x':'x-ray', 'y':'yankee', 'z':'zulu', 'A':'ALFA', 'B':'BRAVO', 'C':'CHARLIE', 'D':'DELTA',
'E':'ECHO', 'F':'FOXTROT', 'G':'GOLF', 'H':'HOTEL', 'I':'INDIA', 'J':'JULIETT', 'K':'KILO', 'L':'LIMA', 'M':'MIKE', 'N':'NOVEMBER',
'O':'OSCAR', 'P':'PAPA', 'Q':'QUEBEC', 'R':'ROMEO', 'S':'SIERRA', 'T':'TANGO', 'U':'UNIFORM', 'V':'VICTOR', 'W':'WHISKEY', 'X':'X-RAY',
'Y':'YANKEE', 'Z':'ZULU', '!':'Exclamation', '"':'Double_quote', '#':'Hash', '$':'Dollar_sign', '%':'Percent', '&':'Ampersand', "'":'Single_quote', '(':'Left_parenthesis',
')':'Right_parenthesis', '*':'Asterisk', '+':'Plus', ',':'Comma', '-':'Minus', '.':'Period', '/':'Slash', ':':'Colon', ';':'Semicolon', '<':'Less_than',
'=':'Equal_sign', '>':'Greater_than', '?':'Question_mark', '@':'At_sign', '[':'Left_bracket', '\\':'Backslash', ']':'Right_bracket', '^':'Caret', '_':'Underscore', '`':'Backtick',
'{':'Left_brace', '|':'Vertical_bar', '}':'Right_brace', '~':'Tilde', ' ':'Space'
}
while True:
        line = sys.stdin.readline()
        if line == '': break
        output = ""
        for char in list(line.rstrip()):
                output+=chardict[char]+" "
        print(output)
