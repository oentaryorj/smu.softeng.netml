















org apach common math linear











implement symmlq iter linear solver propos
href paig1975 paig saunder implement
larg base fortran code michael saunder
href http www stanford group sol softwar symmlq f77


symmlq design solv system linear equat middot
time adjoint linear oper defin
link real linear oper reallinearoper vector oper
requir posit definit definit method
conjug gradient prefer requir
number iter symmlq slightli work iter


symmlq design solv system shift middot middot
shift scalar shift suitabl chosen
comput vector approxim unnorm eigenvector
method invers iter rayleigh quotient iter
linear oper shift middot posit
definit adjoint work iter
slightli shift

precondit

precondit reduc number iter requir solver
provid posit definit precondition middot
approxim shift middot sens
system form middot solv effici symmlq
implicitli solv system equat middot shift middot
middot middot xhat middot ahat middot
xhat bhat ahat middot shift middot
middot bhat middot solut
middot xhat residu rhat bhat ahat
middot xhat middot shift middot middot
middot

stopcrit default stop criterion

stop criterion implement iter stop rhat
delta ahat xhat xhat current estim
solut transform system rhat current estim
residu delta user toler

iter count

present context iter understood evalu
matrix vector product middot initi phase
count iter user requir check symmetri
entail matrix vector product initi phase
product account iter count
word number iter requir reach converg
ident check requir


present definit iter count differ adopt
origin fotran code initi phase
account

initguess initi guess solut

code paramet

link solv real linear oper reallinearoper real vector realvector real vector realvector
link solv real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real linear oper reallinearoper real vector realvector real vector realvector

consid initi guess set
initi phase good approxim
comput middot solv middot
set

context except context

standard link dimens mismatch except dimensionmismatchexcept
link adjoint oper except nonselfadjointoperatorexcept linear oper
precondition symmetr link except context exceptioncontext
inform

kei code oper point offend linear oper
kei code vector1 point offend vector
kei code vector2 point offend vector
middot middot middot
middot accuraci



link posit definit oper except nonpositivedefiniteoperatorexcept thrown
precondition posit definit relev kei
link except context exceptioncontext

kei code oper point offend linear oper

kei code vector point offend vector
middot middot


refer

paig1975 paig saunder
paig saunder
href http www stanford group sol softwar symmlq ps75 pdf
solut spars indefinit system linear equat siam
journal numer analysi


version


symm symmlq






























































































































































































































































































































































perform iter algorithm iter count
increment prior call method
state variabl code object correspond
current iter count code

updat
real vector realvector map multipli mapmultipli beta
oper
daxpbypz shift beta oldb
alpha dot product dotproduct

point

shift beta
alpha shift
beta
shift
beta
alpha

daxpi alpha beta

point
shift alpha
beta
shift alpha
beta
beta
paig saunder equat

watch line work longer
updat end present iter
reiniti begin iter



minv
minv oper

oldb beta
beta dot product dotproduct
beta
npdlo except thrownpdloexcept minv

beta fast math fastmath sqrt beta

point
beta
beta
beta
oldb beta
beta beta

tnorm alpha alpha oldb oldb beta beta

comput plane rotat paig saunder
equat
gamma gamma



gamma fast math fastmath sqrt gbar gbar oldb oldb
gbar gamma
oldb gamma

relat
gbar beta alpha
dbar alpha
delta dbar alpha
state paig saunder retriev
expand coeffici matrix
equat

deltak dbar alpha
gbar dbar alpha
ep beta
dbar beta
zeta gamma zeta gammazeta gamma

point
gbar gbar
deltak delta
ep ep
dbar dbar
zeta zeta

zeta zetac zeta
zeta zeta zeta
dimens getdimens

entri getentri
entri getentri
wbar entri getentri
set entri setentri zeta zetac zeta zeta
wbar set entri setentri


point

ptwbar wbar
paig saunder equat

bstep snprod zeta
snprod
gmax fast math fastmath max gmax gamma
gmin fast math fastmath min gmin gamma
ynorm2 zeta zeta
gamma zeta gammazeta minu ep zeta minusepszeta deltak zeta
minu ep zeta minusepszeta ep zeta

point
snprod
gmax max alpha gamma gamma
gmin min alpha gamma gamma
ynorm2 zeta zeta
gamma zeta gammazeta gamma zeta
minu ep zeta minusepszeta ep zeta
relat gamma zeta gammazeta retriev paig
saunder equat line vector
gbar zbar ep zeta delta zeta

updat norm updatenorm






























































































































































































































































































































































































































































































































































































