# Num: Vowel Reducer

Simple REST service that reduces a name to its vowels, and then reduces 
those vowels to a single digit, associating a single value to each
character and then performing sum and rest calculations. The result must
be a single number between 1 and 9.

The following table is applied in calculations:

|1|2|3|4|5|6|7|8|9
|---|---|---|---|---|---|---|---|---|
|A|B|C|D|E|F|G|H|I|
|J|K|L|M|N|O|P|Q|R|
|S|T|U|V|W|X|Y|Z||

# Example

	GET /vowel-reducer/Daniel

calculation: AIE => 191 => 1+9+1 => 15 => 1+5 => 6

