
















org apach common math linear











calcul eigen decomposit strong symmetr strong matrix
eigen decomposit matrix set matric
time
matric
support strong symmetr strong matric
comput real real eigenvalu realeigenvalu impli matrix return
link getd diagon imaginari valu return link
imag eigenvalu getimageigenvalu link imag eigenvalu getimageigenvalu
call link real matrix realmatrix argument implement
upper part matrix part diagon access
eigenvalu comput matrix decompos eigenvector
comput requir link eigenvector geteigenvector
link getv link getvt link solver getsolv method call
implement base inderjit singh dhillon thesi
href http www utexa user inderjit paper thesi pdf
algorithm symmetr tridiagon eigenvalu eigenvector
problem beresford parlett osni marqu paper
href http www netlib org lapack lawnspdf lawn155 pdf implement
dqd algorithm posit case lapack routin dlarr
dlasq2 dlazq3 dlazq4 dlasq5 dlasq6
author beresford parlett univers california berkelei usa fortran version
author jim demmel univers california berkelei usa fortran version
author inderjit dhillon univers texa austin usa fortran version
author osni marqu lbnl nersc usa fortran version
author christof voemel univers california berkelei usa fortran version
version revis date


eigen decomposit impl eigendecompositionimpl eigen decomposit eigendecomposit






































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































perform dqd step
implement translat lapack routin dlasq6
param start start index
param end end index

dqd start end

min emin work start ping pong pingpong
work start ping pong pingpong
min dmin

ping pong pingpong
start end
work work
work
work
work
min dmin
min emin
math util mathutil safe min work work
math util mathutil safe min work work
tmp work work
work work tmp
tmp

work work work work
work work

min dmin math min min dmin
min emin math min min emin work


start end
work work
work
work
work
min dmin
min emin
math util mathutil safe min work work
math util mathutil safe min work work
tmp work work
work work tmp
tmp

work work work work
work work

min dmin math min min dmin
min emin math min min emin work



unrol step
dn2
min2 dmin2 min dmin
end ping pong pingpong
j4p2 ping pong pingpong
work dn2 work j4p2
work
work
dn1 work j4p2
min dmin dn1
min emin
math util mathutil safe min work j4p2 work
math util mathutil safe min work work j4p2
tmp work j4p2 work
work work j4p2 tmp
dn1 dn2 tmp

work work j4p2 work j4p2 work
dn1 work j4p2 dn2 work

min dmin math min min dmin dn1

min1 dmin1 min dmin

j4p2 ping pong pingpong
work dn1 work j4p2
work
work
work j4p2
min dmin
min emin
math util mathutil safe min work j4p2 work
math util mathutil safe min work work j4p2
tmp work j4p2 work
work work j4p2 tmp
dn1 tmp

work work j4p2 work j4p2 work
work j4p2 dn1 work

min dmin math min min dmin

work
work end ping pong pingpong min emin
































































































































































































































































































































































































































