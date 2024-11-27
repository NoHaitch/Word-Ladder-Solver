<!-- Back to Top Link-->
<a name="readme-top"></a>


<br />
<div align="center">
  <h1 align="center">Word Ladder Solver</h1>

  <p align="center">
    <h3>Tucil 3 - Stima</h3>
    <h4>Using UCS, Greedy Best First Search, and A*</h4>
    <br/>
    <a href="https://github.com/NoHaitch/Word-Ladder-Solver/issues">Report Bug</a>
    ·
    <a href="https://github.com/NoHaitch/Word-Ladder-Solver/issues">Request Feature</a>
<br>
<br>

[![MIT License][license-shield]][license-url]

  </p>
</div>

<!-- CONTRIBUTOR -->
<div align="center" id="contributor">
  <strong>
    <h3>Made By:</h3>
    <h3>13522091</h3>
    <h3>Raden Francisco Trianto Bratadiningrat</h3>
  </strong>
  <br>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#instruction">Instruction</a></li>
        <li>
        <details>
          <summary><a href="#features">Features</a></summary>
          <ol>
            <li><a href="#1-feature-x">Features - 1</a></li>
            <li><a href="#2-feature-y">Features - 2</a></li>
            <li><a href="#3-feature-z">Features - 3</a></li>
          <ol>
        </details>
        </li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
  </ol>
</details>

## External Links

- [Spesifikasi](https://bit.ly/spektucil3stima24)
- [QNA](https://bit.ly/qnastima24)
- [Laporan](https://github.com/NoHaitch/Word-Ladder-Solver/blob/main/doc/Word-Ladder-Solver.pdf)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ABOUT THE PROJECT -->
## About The Project

For Tugas Kecil 3 IF2211 Strategi Algoritma, I was tasked to make a solver for Word [Ladder Game](https://en.wikipedia.org/wiki/Word_ladder). I made 3 algorithm of choice to solve the problem. Uniform Cost Search (UCS), Greedy Best First Search (GBFS) and A* (A star). I used Java Swing to make a simple GUI with input validation to make solver better.  

I learned a lot through this project, especially regarding pros and cons of each algorithm. I also learnt many similarities between these algorithms and their differences as well.

<!-- OPTIONAL LINK OR REFERENCE -->
<!-- <p align="center">
You can explore more on this link ... 
<br>
<a href="https://example.com"> <Strong>THIS LINK</Strong>
</a>
</p> -->

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

Project dependencies  

* Java 22  
  https://www.java.com/en/download/

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/NoHaitch/Word-Ladder-Solver
   ```
2. Build java file
   ```sh
   cd src
   javac Main.java -d ../bin
   ```
3. Run the program
   ```sh
   cd ../bin
   java Main
   ```

Note:  
Use run-bat.bat or run-sh.sh for ease of use


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- INSTURCTION -->
## Instruction
Note: Program will use dictionary.txt in the dictionary directory for the English dictionary representation. Dictionary.txt is not a perfect dictionary and may loss some English words.

1. Use run-bat.bat or run-sh.sh to run and build the program
2. Input Source Word
3. Input Target Word
4. Press one of the three buttons:
   - Uniform Cost Search
   - Greedy Best First Search
   - A*
5. Result is shown in a new window 


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- FEATURES -->
## Features

### 1. Input source and target word
### 2. Use Uniform Cost Search
### 3. Use Greedy Best First Search
### 4. Use A* Search
### 5. Shows time taken
### 6. Shows amount of node visited
### 7. Shows memory used (inaccurate)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTRIBUTING -->
## Contributing

If you want to contribute or further develop the program, please fork this repository using the branch feature.  
Pull Request is **permited and warmly welcomed**

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## Licensing

The code in this project is licensed under MIT license.


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<br>
<h3 align="center"> THANK YOU! </h3>

<!-- MARKDOWN LINKS & IMAGES -->
[issues-url]: https://github.com/NoHaitch/Word-Ladder-Solver/issues
[license-shield]: https://img.shields.io/badge/License-MIT-yellow
[license-url]: https://github.com/NoHaitch/Word-Ladder-Solver/blob/main/LICENSE
