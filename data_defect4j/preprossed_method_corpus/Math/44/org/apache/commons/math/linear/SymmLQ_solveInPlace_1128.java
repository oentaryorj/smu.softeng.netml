















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
link solv real linear oper reallinearoper invert real linear oper invertiblereallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper invert real linear oper invertiblereallinearoper real vector realvector real vector realvector
link solv place solveinplac real linear oper reallinearoper invert real linear oper invertiblereallinearoper real vector realvector real vector realvector

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



















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































return estim solut linear system shift
middot middot solut comput place

solut expect larg multipl code
rayleigh quotient iter precis
achiev code goodb set code requir
extra call precondition


code shift system middot
solv approxim eigenvalu
rayleigh quotient middot middot
middot vector
suffici eigenvector eigenvalu
shift comput larg compon
normal closer eigenvector


param linear oper system
param precondition code
param hand side vector
param vector updat solut code
consid initi guess href initguess
param goodb code code expect
larg multipl code
param shift amount subtract diagon element
refer code shallow copi
null argument except nullargumentexcept paramet code
squar oper except nonsquareoperatorexcept code code
squar
dimens mismatch except dimensionmismatchexcept code code code
dimens inconsist code
adjoint oper except nonselfadjointoperatorexcept link check getcheck
code code code adjoint
posit definit oper except nonpositivedefiniteoperatorexcept code posit
definit
ill condit oper except illconditionedoperatorexcept code ill condit
max count exceed except maxcountexceededexcept exhaust iter count
custom link max count exceed callback maxcountexceededcallback callback set
construct

real vector realvector solv place solveinplac real linear oper reallinearoper
invert real linear oper invertiblereallinearoper
real vector realvector real vector realvector
goodb shift
null argument except nullargumentexcept squar oper except nonsquareoperatorexcept
dimens mismatch except dimensionmismatchexcept adjoint oper except nonselfadjointoperatorexcept
posit definit oper except nonpositivedefiniteoperatorexcept ill condit oper except illconditionedoperatorexcept
max count exceed except maxcountexceededexcept
check paramet checkparamet

iter manag iterationmanag manag iter manag getiterationmanag
initi count iter
manag reset iter count resetiterationcount
manag increment iter count incrementiterationcount

state state state goodb shift
iter linear solver event iterativelinearsolverev event creat event createev state
state beta1
stop
manag fire termin event fireterminationev event


termin beta essenti
earli stop earlystop
earli stop earlystop state beta mach prec state converg hasconverg
manag fire initi event fireinitializationev event
earli stop earlystop

manag increment iter count incrementiterationcount
manag fire iter start event fireiterationstartedev event
state updat
manag fire iter perform event fireiterationperformedev event
state converg hasconverg

state refin

line hack state refin
call state refin event solut getsolut
alter state

state bstep
state gamma zeta gammazeta
manag fire termin event fireterminationev event
































































