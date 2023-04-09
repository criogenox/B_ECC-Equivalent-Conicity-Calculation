[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<div align="center">
  <a align="center">
    <img src="https://user-images.githubusercontent.com/53323058/230743599-f2161db5-6e12-447e-87eb-08ee696a7f65.png" alt="Logo" width="500">
  </a>
  <h3 align="center">Railway applications &#x300A; A &#x300B;</h3>
  <p align="center">
    Equivalent Conicity Calculation (Benchmark Program)
  </p>
</div>

<!-- MOTIVATIONS -->

## Project's motivations

<div align="justify">
Back in 2013, when I started my PhD, I would have liked to have access to more information and resources. Everything done was the product of sailing in a storm, with a boat and only 1 oar. I'm not complaining about anything, I just pretend that if someone is interested in the information, they have access to help that I didn't have.

 <p align="right">
   Stay strong. don't give up.
   
   Emilio Tamburini
  </p> 
   <div>

<!-- ABOUT THE PROJECT -->
## About the project

<div align="justify">

### Introduction

The wheel-rail contact geometry is a fundamental topic to be analized to explain the dynamic running behaviour of a railway vehicle. The EN15302 (UIC 519) European Standard establishes an evaluation procedure for determining equivalent conicity and a benchmark calculation is specified to achieve comparable results on a consistent basis.
  
This project aims to code that procedure and test it under reference cases with the conditions mentioned in the Annex E, and verify the obtained values against the tolerance data given in Annex F. 

According to the EN15302 Standard, we can summarize the importance of the entire study thus:

> Among the parameters by which the dynamic behaviour of a rail vehicle is characterised, the conicity plays an essential role since it allows the satisfactory appreciation of the wheel-rail contact on tangent track and on very large-radius curves (when operated with low cant deficiencies). Klingel’s theory states that the wavelength described by a wheelset, with conical profiles while running on a track, depends on the cone angle of the wheel profile and the distance between contact patches. For practical wheel profiles with changing cone angles along the profile it is possible to evaluate the wavelength of the wheelsets movement by integration of the function of rolling radius difference depending on the lateral movement of the wheelset on the track. Equivalent conicity is evaluated by comparison of this wavelength with the one evaluated according to Klingel's theory.

Nevertheless, It is necessary to follow a clear and concise procedure for the evaluation of equivalent conicity and results must to be consistent. To achieve this purpose, it's possible to use different evaluation procedures (given in this European Standard), and verify the obtained results in accordance with the calculation ones using reference profiles specified in Annex D.
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

<div style="display: flex; flex-direction: row; align=center">
  <a href="https://openjfx.io/">
    <img class="img"src="https://user-images.githubusercontent.com/53323058/230740541-3d3ee950-7f4c-4399-9275-9795ea7c4f37.png" alt="Logo" width="160" height="65"/>
  </a>
  <a href="https://www.w3.org/TR/CSS/#css">
    <img class="img"src="https://user-images.githubusercontent.com/53323058/230694275-351e4257-7cbf-4dc7-a1b6-42079b9b37aa.png" alt="Logo" width="160" height="65"/>
  </a>
  <a href="https://netbeans.apache.org/">
    <img class="img"src="https://user-images.githubusercontent.com/53323058/230740868-4ac4dc6c-dc63-494b-8817-01ce016d8347.png" alt="Logo" width="160" height="65"/>
  </a> 
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- SUMMARY -->
## Background & Details

<div align="justify"> 
  <!-- <img align="right" src="https://user-images.githubusercontent.com/53323058/230650942-4c2e0ad4-2d52-46fe-aa67-8860c642e5f6.png" width="500"> -->
<div  align="justify">
To confirm whether an alternative evaluation procedure can achieve the results specified in this European
Standard, three aspects of the process need to be evaluated in a benchmark process given in this European
Standard and outlined below in Steps 1, 2 and 3:

In Step 1, tables of reference profiles in Annex D are applied to the interpolation and calculation algorithm
which allows the location of the contact points in order to calculate the rolling radius difference as a function of
the lateral position of the wheelset. Starting from this function the equivalent conicity is calculated as a
function of the amplitude of the oscillation. A comparison of the achieved results with the reference results in
Annex E and a defined field of allowed tolerances in Annex F determine the acceptance or rejection of the
assessed evaluation procedure (see Figure 1).

1 Scope
This European Standard establishes an evaluation procedure for determining equivalent conicity. A
benchmark calculation is specified to achieve comparable results on a consistent basis for the equivalent
conicity, which may be calculated by different methods not given in this European Standard. This European
Standard also proposes possible calculation methods. Informative examples of the use of the Klingel formula
(see Annex B) and linear regression of the ∆r-function (see Annex C) are included in this European Standard.
This European Standard includes reference profiles, profile combinations, tolerances and reference results
with tolerance limits, which allow the user to assess the acceptability of a measuring and calculation system
including random- and grid- errors of the measuring system. It sets down the principles of calculation that
need to be followed but does not impose any particular numerical calculation method.
This European Standard does not define limits for the equivalent conicity and gives no tolerances for the rail
profile and the wheel profile to achieve acceptable results for the conicity.
For purposes outside the scope of this European Standard (e.g. simulation of vehicle behaviour) it can be
useful or necessary to use more sophisticated theories. These methods are not within the scope of this
European Standard.
For the application of this European Standard some general recommendations are given in Annex I. 

This project was born as an aditional work to fullfil a personal pending asignature from my PhD days. Nothing more, nothing less.
  
As the software name says: the program is capable of characterise the wheel-rail contact, useful in railway sector dynamics analyses. 
  
The equivalent conicity acts as a safety parameter which describes the behavior and dynamic interaction between rails & wheels running on a straight or large radius (curved) track. This way, the equivalent conicity could indicate the presence of instable movement leading to a derailment event, therefore It can be used to determine a critical speed of a train at any type of track.
  
This crucial parameter could be calculated based on two standards, namely **UIC 519** and **EN 15302**. The non-linear method described in the last one is used by the giving software.

This European Standard establishes an evaluation procedure for determining equivalent conicity. A
benchmark calculation is specified to achieve comparable results on a consistent basis for the equivalent
conicity, which may be calculated by different methods not given in this European Standard. This European
Standard also proposes possible calculation methods. Informative examples of the use of the Klingel formula
(see Annex B) and linear regression of the ∆r-function (see Annex C) are included in this European Standard.
This European Standard includes reference profiles, profile combinations, tolerances and reference results
with tolerance limits, which allow the user to assess the acceptability of a measuring and calculation system
including random- and grid- errors of the measuring system. It sets down the principles of calculation that
need to be followed but does not impose any particular numerical calculation method.


The approach used in the giving program is based on the method described in Annex B for determining the equivalent conicity by integration of the nonlinear differential equation. Based on the function ∆r = f(y), and finding the wavelength λ of the wheelset's kinematic motion for a given lateral movement, It is feasible to obtain the value conicity applying the Klingel formula.


Annex D
(normative)
Reference profiles

D.1.3 Cartesian coordinates

Wheel profiles: R-UIC 519-A/B/H/I
Rail profile: S-UIC 519-A
Gauge: 1435.16 mm
Wheels diameter: 920 mm (unless otherwise indicated)



Annex E
(normative)
Calculation results with reference profiles

|Test Case|  Right / Left / Rail Profiles Combination  | Right / Left Wheels' Diameters [mm]| Gauge Track [mm]  | Testing Status |
|:------:|:------------------------------------------:|:-----------------------------------:|:-----------------:|:---------------:|
|   E1   |                  A / A / A                 |           920 / 920                 |      1435.16      |       ✔        |
|   E2   |                  B / B / A                 |               "                     |         "         |       ✔        |
|   E3   |                  H / H / A                 |               "                     |         "         |       ✔        |
|   E4   |                  I / I / A                 |               "                     |         "         |       ✔        |
|   E5   |                  A / A / A                 |           920 / 918                 |         "         |       ✔        |
|   E6   |                  B / B / A                 |               "                     |         "         |       ✔        |
|   E7   |                  H / H / A                 |               "                     |         "         |       ✔        |
|   E8   |                  I / I / A                 |               "                     |         "         |       ✔        |
|   E9   |                  A / B / A                 |           920 / 920                 |         "         |       ✔        |


Annex F
(normative)
Tolerances on equivalent conicity
The tolerances given in this annex are based on the following equation:
∆(tanγe) = ± min (0,05; 0,5tanγe)
  
  1 Scope

  This European Standard . 
  
  for the equivalent conicity, which may be calculated by different methods not given in this European Standard. This European

  Standard also proposes possible calculation methods. Informative examples of the use of the Klingel formula (see Annex B) and linear regression of the ∆r-function (see Annex C) are included in this European Standard.

  This European Standard includes reference profiles, profile combinations, tolerances and reference results with tolerance limits, which allow the user to assess the acceptability of a measuring and calculation system including random- and grid- errors of the measuring system. It sets down the principles of calculation that need to be followed but does not impose any particular numerical calculation method.

  This European Standard does not define limits for the equivalent conicity and gives no tolerances for the rail profile and the wheel profile to achieve acceptable results for the conicity.

  For purposes outside the scope of this European Standard (e.g. simulation of vehicle behaviour) it can be
useful or necessary to use more sophisticated theories. These methods are not within the scope of this
European Standard.
For the application of this European Standard some general recommendations are given in Annex I. 
  </div>
  
Both the theoretical and the real profiles (including worn ones) cannot be described by a linear function as in the case of wheels with a conical profile, therefore, the difference between the rolling radii of each wheel for different values of lateral displacement brings a nonlinear function ∆r. To linearize this function, the concept of equivalent conicity originally defined by the UIC 519 standard (EN 15302) is used, approximating the relationship between ∆r and the amplitude of the lateral displacement.

For a wheel with a conical profile, the equivalent conicity is simply the half-angle of the tread of the cone. For wheels with arbitrary profiles, the equivalent conicity is defined as the tangent of the angle of the cone of a purely conical profile whose lateral movement produces a kinematic oscillation with the same wavelength as the pair mounted with arbitrary profiles. This definition is only applicable in the analysis on straight paths and large radius curves (Rc ≥ 2500m).

In this way, the equivalent conicity is a parameter used to characterize the geometry of the wheel-rail contact and establishes the criterion for assessing the influence of the contact on the vehicle's driving stability on a straight track. 

<img align="right" width="500" src="https://user-images.githubusercontent.com/53323058/230752262-5618d19f-664f-42c6-b850-0fdd1890bf77.png">
  
The value of the wheel conicity provides quantitative information on the influence of the wheel-rail interaction on the quality of ride comfort and the dynamic stability of the rail vehicle.
  
High taper conicity (shortest wavelength at comparative constant speed):
  * Greater compensation of the centrifugal force on curved paths, reducing the risk of derailment.
  * Reduced driving comfort on a straight track due to the presence of greater lateral accelerations.
  
Low taper conicity (longer wavelength at comparative constant speed):
  * Increase in the frequency of occurrence of the flange hit during circulation in slight curves, causing excessive wear on the wheel profile.
  * Decreased lateral acceleration, increasing ride quality on straight paths.
  
The method proposed by the EN 15302 standard is based on the analysis of the kinetic movement of a pair mounted on a straight track or large radius curved paths. The determination of the equivalent conicity is performed by numerically integrating the function ∆r, representing the longitudinal distance traveled in terms of lateral displacement, x = f(y). From the latter, the wavelength λ is obtained for lateral displacements in the interval [1-7 mm] with increments ∆y ≤ 0.1mm, to finally determine the equivalent conicity by using the Klingel's formula for a conical profile whose kinematic movement presents the same wavelength.
  
<img align="right" src="https://user-images.githubusercontent.com/53323058/230752237-ac9932c3-0450-4b93-bc66-ae3b8b6b104e.png" width="500">
 
The software capabilities focuses on the characterization of wheel-rail rigid contact through the aid of following specific calculations:

* Potential wheel-rail contact points detection by mean of rigid profiles penetration comparision.
* tan(γa) --> angle of the tangent to the point of contact between wheel and rail.
* ∆r --> rolling-radius difference function, at the predefined lateral amplitude interval. 
* tan(γc)=f(λ) --> Determination of the equivalent conicity for each movement wavelength of an (equivalente) conical profile, at a specific lateral displacement (wave amplitude).
  
The included parameters that influence the determination of the equivalent conicity are the geometry of the profiles, the gauge of the track, the inclination of the rail and the active gauge of the mounted pair. Other factors, not implemented up to the present time, that increase the complexity of the process calculation are the wear of the profiles and the deviations present in the track layout, such as the unevenness, gauge difference and alignment. 

From the processed conicity value, the stability of the vehicle can be evaluated depending on longitudinal running velocity, ensuring the generation of the required restoring forces when the formation goes through a open curve, increasing safety against derailment. Nevertheless, for real profiles and after a long period of use, the equivalent taper conicity can be reach values in a higher range due to excessive wear, and must be critically evaluated by a trained professional.       
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [x] Improve Potential Contact Points Detection 
- [x] Asymetric Cases Implementation
- [x] Stand-alone Unified Version
- [ ] Improve Error Events Handling
- [ ] Increse Profiles Data Base (Extending to APTA/ARR Standards)
- [ ] More & More Testing (Including Worn Cases)
- [ ] Implementation of Output Options (PDFBox library)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-shield]: https://user-images.githubusercontent.com/53323058/230575198-fa1acbf4-8f82-4d8e-b245-3979276bc240.png
[linkedin-url]: https://linkedin.com/in/
 
