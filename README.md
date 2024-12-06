[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<div align="center">
  <a align="center">
    <img src="https://user-images.githubusercontent.com/53323058/230838012-86cdc9cd-a410-43d1-86ab-0c32ce5c35f7.png" alt="Logo" width="500">
  </a>
  <h3 align="center">Railway applications &#x300A; B &#x300B;</h3>
  <p align="center">
    Equivalent Conicity Calculation (Benchmark Program)
  </p>
</div>

<!-- MOTIVATIONS -->
## Global project's motivations

<div align="justify">
  <p>
Quoting my own words:
    
> Back in time, when I decided to enter these unfamiliar waters, I would have appreciated having access to more information and resources. Everything done was the product of sailing through a storm, on a old boat with only 1 oar. I learned from experience, but the learning path doesn't need to be like this. I'm not complaining about anything, I just pretend that if someone is interested in the information, they have access to help that I didn't have.
   </p>
 <p align="right">
    :muscle: don't let anyone get you down :muscle:
  </p> 
   <div>

<!-- ABOUT THE PROJECT -->
## About the project

<div align="justify">

The wheel-rail contact geometry is a fundamental topic to be analyzed to explain the dynamic running behavior of a railway vehicle. The EN15302 (UIC 519) European Standard establishes an evaluation procedure for determining equivalent conicity and a benchmark calculation is specified to achieve comparable results on a consistent basis.
  
This project aims to code that procedure and test it under reference cases with the conditions mentioned in the Annex E, and verify the obtained values against the tolerance data given in Annex F. 

According to the EN15302 Standard, we can summarize the importance of the entire study thus:

> Among the parameters by which the dynamic behaviour of a rail vehicle is characterised, the conicity plays an essential role since it allows the satisfactory appreciation of the wheel-rail contact on tangent track and on very large-radius curves (when operated with low cant deficiencies). Klingel’s theory states that the wavelength described by a wheelset, with conical profiles while running on a track, depends on the cone angle of the wheel profile and the distance between contact patches. For practical wheel profiles with changing cone angles along the profile it is possible to evaluate the wavelength of the wheelsets movement by integration of the function of rolling radius difference depending on the lateral movement of the wheelset on the track. Equivalent conicity is evaluated by comparison of this wavelength with the one evaluated according to Klingel's theory.

Nevertheless, It is necessary to follow a clear and concise procedure for the evaluation of equivalent conicity and results must be consistent. To achieve this purpose, it's possible to use different evaluation procedures (given in this European Standard), and verify the obtained results in accordance with the calculation ones using reference profiles specified in Annex D.
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Built With

<div style="display: flex; flex-direction: column; align=center">
    <img class="img"src="https://user-images.githubusercontent.com/53323058/230740541-3d3ee950-7f4c-4399-9275-9795ea7c4f37.png" alt="Logo" width="160" height="65"/>
    <img class="img"src="https://user-images.githubusercontent.com/53323058/230694275-351e4257-7cbf-4dc7-a1b6-42079b9b37aa.png" alt="Logo" width="160" height="65"/>
    <img src="https://user-images.githubusercontent.com/53323058/230741096-33c1b8ab-1ec8-4364-b877-09aaa7df0fcd.png" alt="Logo" width="160" height="65"/>
    <img src="https://user-images.githubusercontent.com/53323058/273762946-9cd1d557-5ac2-4dd4-898f-9e0e369ecd72.png" alt="Logo" width="160" height="65"/>

### Additional info

* Manual GUI design & implementation. No fxml file was used in this project (SceneBuilder). Good practice to really understand what you actually are doing.
  
* Using Maven wrapper v3.1.0 (maven v3.8.5), no extra IDE configurations needed. Tested with JavaFX v20 & JDK v21.

* For a more in-depth understanding of the implemented equations, formulas, and algorithms, as many comments as possible have been included.
</div>
     
<p align="right">(<a href="#readme-top">back to top</a>)</p>
  
<!-- SUMMARY -->
## Background & Details 

<div align="justify"> 

<img align="right" width="500" src="https://user-images.githubusercontent.com/53323058/243652738-ff93181a-faad-43fd-9815-9b0cf20a7b7d.png">

### Concise summary of the EN15302 Standard scope:
  
> * This European Standard sets down the principles of calculation that need to be followed but does not impose any particular numerical calculation method.
> * It establishes an evaluation procedure for determining equivalent conicity. A benchmark calculation is specified to achieve comparable results on a consistent basis for the equivalent conicity, which may be calculated by different methods not given in this European Standard.
> * It includes reference profiles, profile combinations, tolerances and reference results with tolerance limits, which allow the user to assess the acceptability of a measuring and calculation system including random- and grid- errors of the measuring system.
> * Also this European Standard proposes possible calculation methods. Informative examples of the use of the Klingel formula
(see Annex B) and linear regression of the ∆r-function (see Annex C) are included in this European Standard.
  
### Computing processes main aspects
  
 <img align="right" src="https://user-images.githubusercontent.com/53323058/243652858-2d963d02-34be-43b6-92ab-0fdcdd125991.png" width="500">

* The `approach` used in the given program is based on the method described in Annex B for determining the equivalent conicity by `integration of the nonlinear differential equation`. Based on the function ∆r = f(y), and finding the wavelength λ of the wheelset's kinematic motion for a given lateral movement, It is feasible to obtain the value conicity applying the Klingel formula.

* As a validation procedure to determine the acceptance or rejection of the coded algorithm, the comparison of the achieved results with the reference results in Annex E has been used, considering the defined field of allowed tolerances in Annex F, following the equation: ∆(tanγe) = ± min (0,05; 0,5tanγe).

* All the calculations have been done for the 9 combinations of the reference profiles given in Annex E (symmetrics cases E1-4 & asymmetric ones E5-9), and using the tabulated data of the following types: Wheel profiles: R-UIC 519-A/B/H/I, Rail profile: S-UIC 519-A.

Regarding the steps of the procedure, the key of success lies in the `proper approximation` of the integrals, that is:
  
* The S(y) = - ∫ ∆rdy function of step b),
  
* The angle of the movement in the x-y-plane: Ψ&#x00B2; = (-2/er0) * [∫ ∆rdy − C], and

* The abscissa of the wheelset movement: x = f(y) = ∫ dy/Ψ, both showed in step e).

All these approximations were performed by a `Riemann sum` for the step interval of 0.1 mm. In the particular case of S(y) function, it was done in two different stages depending on the sign of the lateral displacement for ∆r = 0 reference, determined in step a).

### Benchmarks results 
The status of validation of the tests using the coded algorithm, for each ∆r function present in the Standard, is summarized in the following table.
  
|Test Case|  Right (W) / Left (W) / Rail Profiles Combination  | Right / Left Wheels' Diameters [mm]| Gauge Track [mm]  | Testing Status |
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
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [x] E1-3 symmetric cases implementation
- [x] Improved detection of ∆r = 0 point (case E4) 
- [x] E5-8 asymmetric cases implementation
- [x] Algorithm generalization for dissimilar r/l wheel profiles (case E9)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See [LICENSE.txt][license-url] for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-shield]: https://user-images.githubusercontent.com/53323058/230575198-fa1acbf4-8f82-4d8e-b245-3979276bc240.png
[linkedin-url]: https://www.linkedin.com/in/criogenox/
[license-url]: https://github.com/criogenox/B_ECC-Equivalent-Conicity-Calculation/tree/maven?tab=MIT-1-ov-file
