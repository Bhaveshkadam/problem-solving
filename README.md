# problem-solving

# problem-solving

## **Given a string str, the task is to check whether the string is valid time in 24-hour format**

* It should start from 0-23 or 00-23.
* It should be followed by a ‘:'(colon).
* It should be followed by two digits from 00 to 59.
* It should not end with ‘am’, ‘pm’ or ‘AM’, ‘PM’.

## Soluction

1. Get the string.
* Create a regular expression to check time in 24-hour format as mentioned below:
``
regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
``

* represents the start of the group.
* [01]?[0-9] represents the time starts with 0-9, 1-9, 00-09, 10-19.
* | represents or.
* 2[0-3] represents the time starts with 20-23.
* ) represents the end of the group.
* : represents the time should be followed by a colon(:).
* [0-5][0-9] represents the time followed by 00 to 59

2. Match the given string with the regex, in Java this can be done by using Pattern.matcher().
3. Return true if the string matches with the given regex, else return false.
