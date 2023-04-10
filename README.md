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

## Global project's motivations

<div align="justify">
  <p>
Back in 2013, when I started my PhD, I would have appreciated to have access to more information and resources. Everything done was the product of sailing in a storm, alone, with a boat and only 1 oar. I learned from experience, but the learning path doesn't need to be like this. I'm not complaining about anything, I just pretend that if someone is interested in the information, they have access to help that I didn't have.
   </p>
 <p align="right">
    :muscle: don't let anyone get you down :muscle:
  </p> 
   <div>

<!-- ABOUT THE PROJECT -->
## About the project

<div align="justify">

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
  
Benchmark process aspects needs:

The approach used in the given program is based on the method described in Annex B for determining the equivalent conicity by integration of the nonlinear differential equation. Based on the function ∆r = f(y), and finding the wavelength λ of the wheelset's kinematic motion for a given lateral movement, It is feasible to obtain the value conicity applying the Klingel formula.
  
As validation procedure to determine the acceptance or rejection of the coded algorithm, the comparison of the achieved results with the reference results in Annex E has been used, taking into acount the defined field of allowed tolerances in Annex F.

  
 
#### Concise summary of the EN15302 Standard scope:
  
> * This European Standard sets down the principles of calculation that need to be followed but does not impose any particular numerical calculation method.
>  * It establishes an evaluation procedure for determining equivalent conicity. A benchmark calculation is specified to achieve comparable results on a consistent basis for the equivalent conicity, which may be calculated by different methods not given in this European Standard.
>  * It includes reference profiles, profile combinations, tolerances and reference results with tolerance limits, which allow the user to assess the acceptability of a measuring and calculation system including random- and grid- errors of the measuring system.
>  * Also this European Standard proposes possible calculation methods. Informative examples of the use of the Klingel formula
(see Annex B) and linear regression of the ∆r-function (see Annex C) are included in this European Standard.




6 Benchmark calculation
6.1 Overview
It is necessary to validate the method to be used by means of a benchmark calculation with defined test
profiles for the whole evaluation system for the equivalent conicity because the following are not defined when
using this European Standard in practice:
 sample rate of the profile measurement;
 smoothing procedure;
 integration method for the evaluation of the wavelength.
Both the method of determination of the equivalent conicity and the smoothing procedure for profile data shall
be validated by a benchmark calculation with defined reference-profiles combined with random- and griderrors. This is achieved by a three step process:
 step 1 checks the interpolation and calculation algorithm;
 when Step 1 has been successfully passed, Step 2 applies defined errors to the data of Step 1;
 when Step 2 has been successfully passed Step 3 then checks the whole candidate system.
6.2 Validation of evaluation method
For all steps the calculations shall be done for all combinations of the reference profiles given in Annex E
including the influence of asymmetrical ∆r -functions produced by different wheel diameters or different wheel
profiles on both wheels as given from E.5 to E.9.
If the equivalent conicity is considered at certain amplitude when applying EN 14363 and at this amplitude a
rapid change in conicity occurs, further measurements and/or calculations in order to determine the
sensitivities and trends of the rapid change shall be carried out. The further measurements will then be
included in the assessment of the candidate technique consisting of measuring and calculation algorithm.
NOTE 1 The reference profiles given in Annex D are only defined for benchmark calculations to test the algorithm in a
wide range of conditions; they have no practical meaning for a design of a real profile.
BS EN 15302:2008+A1:2010
EN 15302:2008+A1:2010 (E)
20
Step 1
In Step 1, the interpolation and calculation algorithm to be tested shall be applied to the reference profiles in
Annex D. The achieved results shall be compared with the reference results in Annex E and the defined field
of allowed tolerances in Annex F. The achieved results shall be within the tolerance field given in Annex F in
order for the calculation algorithm to successfully pass Step 1 (see Figure 1).
Step 2
The purpose of Step 2 is to assess the smoothing procedure. It repeats the calculations of Step 1. In Step 2,
the smoothing, interpolation and calculation algorithm shall be applied to the reference profiles in Annex D
with all errors given in Annex G superimposed.
The effect of a random error and a grid shall be proven by separate calculations for the cases by which an
error occurs only at the wheel, only at the rail and at both wheel and rail.
The effects shall be quantified in z-, y- and (z + y)-directions depending on the measuring system. For non
Cartesian measuring systems appropriate coordinates should be used.
For each case a sufficient number of calculations (≥ 20) shall be done for different randomized errors related
to the grid origin position and random limit (see Annex H).
The assessment of the evaluation procedure (see Figure 2) shall be performed by a comparison of the
achieved results with the reference results including the field of tolerances in Annex F.
NOTE 2 The illustrations given in Annex G represent results of typical calculations. These results are considered
acceptable.
Step 3
Step 3 checks that the whole system and process of the candidate technique will generate results that are
sufficiently accurate. It repeats the calculations of Step 2 using the tolerances of the measuring and digitizing
system to be assessed instead of the prescribed errors in Step 2.
NOTE 3 The illustrations given in Annex G represent results of typical calculations. These results are considered
acceptable.

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
  
  </div>

<img align="right" width="500" src="https://user-images.githubusercontent.com/53323058/230752262-5618d19f-664f-42c6-b850-0fdd1890bf77.png">

  
The method proposed by the EN 15302 standard is based on the analysis of the kinetic movement of a pair mounted on a straight track or large radius curved paths. The determination of the equivalent conicity is performed by numerically integrating the function ∆r, representing the longitudinal distance traveled in terms of lateral displacement, x = f(y). From the latter, the wavelength λ is obtained for lateral displacements in the interval [1-7 mm] with increments ∆y ≤ 0.1mm, to finally determine the equivalent conicity by using the Klingel's formula for a conical profile whose kinematic movement presents the same wavelength.
  
<img align="right" src="https://user-images.githubusercontent.com/53323058/230752237-ac9932c3-0450-4b93-bc66-ae3b8b6b104e.png" width="500">
 
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
