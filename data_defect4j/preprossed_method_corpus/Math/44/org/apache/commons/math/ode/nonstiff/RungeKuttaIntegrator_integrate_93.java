
















org apach common math od nonstiff










common part fix step rung kutta
integr ordinari differenti equat

method explicit rung kutta method butcher
arrai
pre

a21
a31 a32

as1 as2 ass


pre


euler integr eulerintegr
classic rung kutta integr classicalrungekuttaintegr
gill integr gillintegr
midpoint integr midpointintegr
version



rung kutta integr rungekuttaintegr abstract integr abstractintegr






































inherit doc inheritdoc
integr expand state od expandablestatefulod equat
math illeg state except mathillegalstateexcept math illeg argument except mathillegalargumentexcept

saniti check sanitycheck equat
set equat setequ equat
reset evalu resetevalu
forward equat time gettim

creat intern work arrai
equat complet state getcompletest
clone
stage length
dot ydotk stage
stage
dot ydotk length

tmp ytmp length
dot tmp ydottmp length

set interpol share integr arrai
rung kutta step interpol rungekuttastepinterpol interpol rung kutta step interpol rungekuttastepinterpol prototyp copi
interpol reiniti tmp ytmp dot ydotk forward
equat primari mapper getprimarymapp equat secondari mapper getsecondarymapp
interpol store time storetim equat time gettim

set integr control object
step start stepstart equat time gettim
step size stepsiz forward step step
step handler stephandl handler step handler stephandl
handler reset

set state initi setstateiniti

main integr loop
step islaststep


interpol shift

stage
comput deriv computederiv step start stepstart dot ydotk

stage
stage

length
sum dot ydotk

sum dot ydotk

tmp ytmp step size stepsiz sum


comput deriv computederiv step start stepstart step size stepsiz tmp ytmp dot ydotk



estim state end step
length
sum dot ydotk
stage
sum dot ydotk

tmp ytmp step size stepsiz sum


discret event handl
interpol store time storetim step start stepstart step size stepsiz
system arraycopi tmp ytmp length
system arraycopi dot ydotk stage dot tmp ydottmp length
step start stepstart accept step acceptstep interpol dot tmp ydottmp

step islaststep

prepar step
interpol store time storetim step start stepstart

stepsiz control step
nextt step start stepstart step size stepsiz
nextislast forward nextt nextt
nextislast
step size stepsiz step start stepstart



step islaststep

dispatch result
equat set time settim step start stepstart
equat set complet state setcompletest

step start stepstart doubl nan
step size stepsiz doubl nan




