/**
 * Created by RobertBarber on 4/7/16.
 */


/*Copy the Countries files. Parse each line and store the contents into a data structure.
Ask the user to type a letter and save a file that lists only the countries starting with it.
Requirements
Create a Country class to store both the name and abbreviation.
Read and parse the "countries.txt" file into an
HashMap<String,ArrayList<Country>>where the key is a single letter
and the value is a list of countries whose names start with that letter.
Ask the user to type a letter (if they don't type a single letter, throw an exception).
Save an "X_countries.txt" file, where X is the letter they typed,
which only lists the countries starting with that letter.

Optional tasks
Break your code into separate methods,
especially the for loop that loops over each line in the file,
and the code under it that reads the user's input and writes the file.
Encode the output as JSON instead of building a string manually.
You should be able to take the ArrayList you pulled out of your HashMap
and directly pass it to the serialize method. Remember to add getters to your Country class.
Override the toString method in your Country class
so when you print your HashMap you can see the country abbreviations and names.
Recall that, by default, Java prints out objects like this: Country@21345362.

AF|afghanistan
AL|albania
DZ|algeria
AS|american samoa
AD|andorra
AO|angola
AI|anguilla
AQ|antarctica
AG|antigua and barbuda
AR|argentina
AM|armenia
AW|aruba
AU|australia
AT|austria
AZ|azerbaijan
BS|bahamas
BH|bahrain
BD|bangladesh
BB|barbados
BY|belarus
BE|belgium
BZ|belize
BJ|benin
BM|bermuda
BT|bhutan
BO|bolivia
BA|bosnia and herzegovina
BW|botswana
BV|bouvet island
BR|brazil
IO|british indian ocean territory
BN|brunei darussalam
BG|bulgaria
BF|burkina faso
BI|burundi
KH|cambodia
CM|cameroon
CA|canada
CV|cape verde
KY|cayman islands
CF|central african republic
TD|chad
CL|chile
CN|china
CX|christmas island
CC|cocos (keeling) islands
CO|colombia
KM|comoros
CG|congo
CD|congo, the democratic republic of the
CK|cook islands
CR|costa rica
CI|cote d'ivoire
HR|croatia
CU|cuba
CY|cyprus
CZ|czech republic
DK|denmark
DJ|djibouti
DM|dominica
DO|dominican republic
TP|east timor
EC|ecuador
EG|egypt
SV|el salvador
GQ|equatorial guinea
ER|eritrea
EE|estonia
ET|ethiopia
FK|falkland islands (malvinas)
FO|faroe islands
FJ|fiji
FI|finland
FR|france
GF|french guiana
PF|french polynesia
TF|french southern territories
GA|gabon
GM|gambia
GE|georgia
DE|germany
GH|ghana
GI|gibraltar
GR|greece
GL|greenland
GD|grenada
GP|guadeloupe
GU|guam
GT|guatemala
GN|guinea
GW|guinea-bissau
GY|guyana
HT|haiti
HM|heard island and mcdonald islands
VA|holy see (vatican city state)
HN|honduras
HK|hong kong
HU|hungary
IS|iceland
IN|india
ID|indonesia
IR|iran, islamic republic of
IQ|iraq
IE|ireland
IL|israel
IT|italy
JM|jamaica
JP|japan
JO|jordan
KZ|kazakstan
KE|kenya
KI|kiribati
KP|korea, democratic people's republic of
KR|korea, republic of
KV|kosovo
KW|kuwait
KG|kyrgyzstan
LA|lao people's democratic republic
LV|latvia
LB|lebanon
LS|lesotho
LR|liberia
LY|libyan arab jamahiriya
LI|liechtenstein
LT|lithuania
LU|luxembourg
MO|macau
MK|macedonia, the former yugoslav republic of
MG|madagascar
MW|malawi
MY|malaysia
MV|maldives
ML|mali
MT|malta
MH|marshall islands
MQ|martinique
MR|mauritania
MU|mauritius
YT|mayotte
MX|mexico
FM|micronesia, federated states of
MD|moldova, republic of
MC|monaco
MN|mongolia
MS|montserrat
ME|montenegro
MA|morocco
MZ|mozambique
MM|myanmar
NA|namibia
NR|nauru
NP|nepal
NL|netherlands
AN|netherlands antilles
NC|new caledonia
NZ|new zealand
NI|nicaragua
NE|niger
NG|nigeria
NU|niue
NF|norfolk island
MP|northern mariana islands
NO|norway
OM|oman
PK|pakistan
PW|palau
PS|palestinian territory, occupied
PA|panama
PG|papua new guinea
PY|paraguay
PE|peru
PH|philippines
PN|pitcairn
PL|poland
PT|portugal
PR|puerto rico
QA|qatar
RE|reunion
RO|romania
RU|russian federation
RW|rwanda
SH|saint helena
KN|saint kitts and nevis
LC|saint lucia
PM|saint pierre and miquelon
VC|saint vincent and the grenadines
WS|samoa
SM|san marino
ST|sao tome and principe
SA|saudi arabia
SN|senegal
RS|serbia
SC|seychelles
SL|sierra leone
SG|singapore
SK|slovakia
SI|slovenia
SB|solomon islands
SO|somalia
ZA|south africa
GS|south georgia and the south sandwich islands
ES|spain
LK|sri lanka
SD|sudan
SR|suriname
SJ|svalbard and jan mayen
SZ|swaziland
SE|sweden
CH|switzerland
SY|syrian arab republic
TW|taiwan, province of china
TJ|tajikistan
TZ|tanzania, united republic of
TH|thailand
TG|togo
TK|tokelau
TO|tonga
TT|trinidad and tobago
TN|tunisia
TR|turkey
TM|turkmenistan
TC|turks and caicos islands
TV|tuvalu
UG|uganda
UA|ukraine
AE|united arab emirates
GB|united kingdom
US|united states
UM|united states minor outlying islands
UY|uruguay
UZ|uzbekistan
VU|vanuatu
VE|venezuela
VN|viet nam
VG|virgin islands, british
VI|virgin islands, u.s.
WF|wallis and futuna
EH|western sahara
YE|yemen
ZM|zambia
ZW|zimbabwe
*/