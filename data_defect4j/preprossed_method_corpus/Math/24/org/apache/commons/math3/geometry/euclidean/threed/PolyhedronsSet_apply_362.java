















org apach common math3 geometri euclidean threed























repres region set polyhedron
version


polyhedron set polyhedronsset abstract region abstractregion euclidean3 euclidean3d euclidean2 euclidean2d



























































































































































































































































































































inherit doc inheritdoc
hyperplan subhyperplan euclidean2 euclidean2d appli hyperplan subhyperplan euclidean2 euclidean2d
hyperplan euclidean3 euclidean3d origin
hyperplan euclidean3 euclidean3d transform
origin cach origin cachedorigin
chang hyperplan reset hyperplan transform

plane plane oplan plane origin
plane plane tplane plane transform
vector3 vector3d p00 plane oplan origin getorigin
vector3 vector3d p10 plane oplan space tospac vector2 vector2d
vector3 vector3d p01 plane oplan space tospac vector2 vector2d
vector2 vector2d p00 tp00 plane tplane space tosubspac appli p00
vector2 vector2d p10 tp10 plane tplane space tosubspac appli p10
vector2 vector2d p01 tp01 plane tplane space tosubspac appli p01
affin transform affinetransform
affin transform affinetransform p10 tp10 getx p00 tp00 getx p10 tp10 geti p00 tp00 geti
p01 tp01 getx p00 tp00 getx p01 tp01 geti p00 tp00 geti
p00 tp00 getx p00 tp00 geti

cach origin cachedorigin plane origin

cach transform cachedtransform org apach common math3 geometri euclidean twod line transform gettransform
math illeg argument except mathillegalargumentexcept miae
happen transform built p00 p10 p01 invert
math intern error mathinternalerror miae



line sublin appli transform applytransform cach transform cachedtransform









































































