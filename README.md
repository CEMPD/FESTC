Version 2.0 Updates:
1) Use EPIC1102 modular code instead of EPIC0409
2) Update soil match utility
3) Update manageCreate utility
3) Update festc interface

Version 1.4 Updates:
1) Added "EPIC to SWAT" in festc java codes, including EPIC daily, nitrogen deposition, daily weather file
processing, and SWAT input preparing parts.
2) Modified java code to use allSites_info.txt in MCIP2EPIC and EPIC2SWAT tools.
3) Fixed a bug related with directory browser.
4) print warning messages if configuration file is not in right directory

FEST-C Version 1.2 - compiled in the 64-bit Linux environment
	First release:  05/30/2014
	Update release: 09/12/2014.  Bug fix in scenario management
        Update release: 09/30/2015.  Enhancement on N input and many others

        Update release: 02/03/2016
		(1) Enhanced FEST-C  interface options for spinup and app simulations
		(2) Modified daily and annual output to include wind erosion and phosphorus variables
		(3) Added more utility tools to process EPIC output data              
                (4) Elevation bug fix

        Update release: 05/31/2016
		(1) Corrected elevation in site files
		(2) Modified random number seed (gridID and crop number) for planting date adjustment	
		(3) Updated EPIC model (without CO2 trend)

1. Version 1.2 Updates:

        1) Additional N deposition input selections (EPIC parameter, 
           2002-2006 CMAQ average, 2006-2010 CMAQ average, CMAQ) 
        
        2) Added CO2 level input option for EPIC runs

        3) Added tile drain options for crops (except rice, hay, alfalfa, and other grass) 
      
        4) Added a yield time trend defined from a file during spinup

        5) Modified HARGREVES PET method for its parameters to vary dynamically in response to local climate

        6) Updated management programs for hay and other grass and eliminated fertilizer adjustments for these crops 

	7) Modified output format (.DAT to .csv) and  variable name definitions for CMAQ output 
  
        8) Added utilities for the BELD4 data to CMAQ bi-directional input conversion and 
           for the extracted EPIC output summary by crops and regions under epic/util/misc directory
           (to use R codes, users need to have installed open source R libraries)


2. Installation:

   1) untar FESTC 1.2 package under a working directory by:
      tar -xzvf festc1_2_09302015.tar.gz  

   2) Update FESTC_HOME in file "festc1_2/festc/festc" to have correct directory path for your system
      
   3) Install Spatial Allocator 4.2

   4) Update {SA_HOME}/bin/sa_setup.csh

   5) Update FESTC_HOME and SA_HOME in festc1_2/festc_setup.csh

   6) Source festc1_2/festc_setup.csh file in users' .cshrc file

   7) Update festc1_2/config.properties based on the system and installtion directories

   8) Make a directory "festc" under user's home
  
   9) Copy festc1_2/config.properties to {user's home}/festc directory
 
   10) Type festc to launch the system from any directory


3. Troubleshooting for Spatial Allocator

   The SA Raster Tools have compiled tools which are stored under ${SA_HOME}/bin/64bits.  
   Those executable files may not work depending on the system configuration.  
   If there is a library error in running the SA Raster Tools within FEST-C, users should:

	1) Recompile all libraries under ${SA_HOME}/src/libs following instructions in the ${SA_HOME}/src/libs/README file.

	2) Modiy ${SA_HOME}/src/raster/Makefile for correct paths.

        3) Type "make clean" to clean previous compiled programs.

	4) Type "make" to compile the tools.

	5) Type "make -B install" or "make install" to install compiled tools.

