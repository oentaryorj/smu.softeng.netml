















org apach common math3 analysi interpol












gener bicub interpol function
prior gener interpol function input smooth
polynomi fit

version


smooth polynomi bicub spline interpol smoothingpolynomialbicubicsplineinterpol


















































inherit doc inheritdoc

overrid
bicub spline interpol function bicubicsplineinterpolatingfunct interpol xval
yval
fval
data except nodataexcept
dimens mismatch except dimensionmismatchexcept
xval length yval length fval length
data except nodataexcept

xval length fval length
dimens mismatch except dimensionmismatchexcept xval length fval length


len xlen xval length
len ylen yval length

len xlen
fval length len ylen
dimens mismatch except dimensionmismatchexcept fval length len ylen



math arrai matharrai check order checkord xval
math arrai matharrai check order checkord yval

line len ylen construct polynomi
respect variabl fit arrai fval
polynomi function polynomialfunct poli ypolyx polynomi function polynomialfunct len ylen
len ylen
fitter xfitter clear observ clearobserv
len xlen
fitter xfitter add observ point addobservedpoint xval fval


initi guess fit coeffici
degre xdegre
poli ypolyx polynomi function polynomialfunct fitter xfitter fit degre xdegre


knot xval yval grid calcul correct
valu fval
fval len xlen len ylen
len ylen
polynomi function polynomialfunct poli ypolyx
len xlen
fval xval



line len xlen construct polynomi
respect variabl fit arrai fval
polynomi function polynomialfunct poli xpolyi polynomi function polynomialfunct len xlen
len xlen
fitter yfitter clear observ clearobserv
len ylen
fitter yfitter add observ point addobservedpoint yval fval


initi guess fit coeffici
degre ydegre
poli xpolyi polynomi function polynomialfunct fitter yfitter fit degre ydegre


knot xval yval grid calcul correct
valu fval
fval len xlen len ylen
len xlen
polynomi function polynomialfunct poli xpolyi
len ylen
fval yval



interpol xval yval fval


