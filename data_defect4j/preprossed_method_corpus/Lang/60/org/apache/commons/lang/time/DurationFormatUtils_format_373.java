















org apach common lang time








durat format util constant tabl describ token
pattern languag format
tabl border
charact durat element
year
month
dai
hour
minut
second
millisecond
tabl

author apach ant date util dateutil
author href mailto sbailliez apach org stephan bailliez
author href mailto stefan bodewig epost stefan bodewig
author stephen colebourn
author href mailto ggregori seagullsw gari gregori
author henri yandel

version

durat format util durationformatutil























































































































































































































































































































intern method format

param token token
param year number year
param month number month
param dai number dai
param hour number hour
param minut number minut
param second number second
param millisecond number milli
param pad zero padwithzero pad
format string

string format token token year month dai hour minut second
millisecond pad zero padwithzero
string buffer stringbuff buffer string buffer stringbuff
output second lastoutputsecond
token length

token token token
object token getvalu
count token count getcount
string buffer stringbuff
buffer append string tostr


buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr year count '0' integ
string tostr year
output second lastoutputsecond

buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr month count '0' integ
string tostr month
output second lastoutputsecond

buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr dai count '0' integ
string tostr dai
output second lastoutputsecond

buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr hour count '0' integ
string tostr hour
output second lastoutputsecond

buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr minut count '0' integ
string tostr minut
output second lastoutputsecond

buffer append pad zero padwithzero string util stringutil left pad leftpad integ string tostr second count '0' integ
string tostr second
output second lastoutputsecond

output second lastoutputsecond
millisecond
string str pad zero padwithzero
string util stringutil left pad leftpad integ string tostr millisecond count '0'
integ string tostr millisecond
buffer append str substr

buffer append pad zero padwithzero
string util stringutil left pad leftpad integ string tostr millisecond count '0'
integ string tostr millisecond

output second lastoutputsecond



buffer string tostr

































































































































































































