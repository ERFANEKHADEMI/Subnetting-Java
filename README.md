# Subnet Solver Java

Soluzione software per la risoluzione degli esercizi sulle reti.

> [!TIP]
> Corretto funzionamento dell'UI garantito

> [!WARNING]
> Corretto funzionamento degli algoritmi di calcolo della FLSM e della VLSM non garantito


## Funzionalità

 - Identifica IP
 - Verifica Stessa Rete
 - Subnet a Maschera Fissa - FLSM
 - Subnet a Maschera Variabile - VLSM

## Ispirazione

La grafica del sito web è stata ispirata e **sviluppata indipendentemente** riproponendo l'interfaccia utente offerta da [Scheduling Solver](https://process-scheduling-solver.boonsuen.com/)


## Preview

Video di Test [(link)](https://drive.google.com/file/d/17XctjTlS7LYgrnKikc7BHBkw4H3vvMtA/view?usp=sharing)


---

<img src="https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/screenshots/vlsm.png" />


## Screenshots


|<img src="https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/screenshots/ip.png" /> | <img src="https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/screenshots/net.png" />|
|-|-|
|<img src="https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/screenshots/flsm.png" />|<img src="https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/screenshots/vlsm.png" />|


## Distribuzione

 - Mac o Windows
 - openjdk `v.21.0.3`
 - Avviare il file `.jar`



## Licenze

| Componente          | Versione         | Copyright                                      | Licenza                                                                                            |
|---------------------|------------------|------------------------------------------------|----------------------------------------------------------------------------------------------------|
| Subnet Solver       | v1.0.0           | 2024 Vittorio Piotti                           | [GPL-3.0 License](https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/LICENSE.md)       |
| batik-all           | v1.17            | 2024 The Apache Software Foundation            | [Apache License 2.0](https://xmlgraphics.apache.org/batik/license.html)                            |
| FlatLaf             | v3.2.5           | 2024 JFormDesigner GmbH                        | [Apache License 2.0](https://github.com/JFormDesigner/FlatLaf/blob/main/LICENSE)                   |
| xml-apis-ext        | v1.3.04          | 2024 The Apache Software Foundation            | [Apache License 2.0](https://xmlgraphics.apache.org/batik/license.html)                            |
| xmlgraphics-commons | v2.9             | 2024 The Apache Software Foundation            | [Apache License 2.0](https://xmlgraphics.apache.org/batik/license.html)                            |
| Bootstrap           | v5.3.0-alpha3    | 2011-2023 The Bootstrap Authors                | [MIT License](https://github.com/twbs/bootstrap/blob/main/LICENSE)                                 |



## Albero di Path


```bash
$ tree
.
├── assets * contiene file.svg
├── bin * contiene i file binari
├── lib
│   ├── batik-all-1.17.jar 
│   ├── flatlaf-3.2.5.jar 
│   ├── xml-apis-ext-1.3.04.jar
│   └── xmlgraphics-commons-2.9.jar
└── src
    ├── AnimatedButton.java 
    ├── AnimatedLabel.java 
    ├── AnimatedModal.java 
    ├── AnimatedOpacityPanel.java 
    ├── AnimatedRoundedLabel.java
    ├── AnimatedSVG.java
    ├── CalcFLSM.java
    ├── CalcIP.java
    ├── CalcManager.java
    ├── CalcNetIDs.java
    ├── CalcVLSM.java
    ├── GUI.java * main del progetto
    ├── LayoutTable.java
    ├── ObjIP.java
    ├── ObjNetIDs.java
    ├── ObjSM.java
    ├── RoundedButton.java
    ├── RoundedLabel.java
    ├── RoundedPanel.java
    ├── RoundedPanelApp.java
    └── RoundedTextField.java
```

