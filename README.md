A small java software to configure a VBox start on boot

Prerequisite:
1. Application must verify that virtual box installed.
1.1	Verification done via searching for a windows PATH. In case its missing a user may point to the virtual box installation manually.
2. The application must have admin rights.

Application flow:
1. Preload [Behind the scene]:
	1.1 Verify admin right.
	1.2	Search for virtual box installed.
		1.2.1	Flag if found.
	1.3	Search if application was executed before on the computer [reg ?]
2.	UI [Virtual box found]:
	2.1	List all VMs.
	2.2	Choose which VM to star on boot
3.	UI [Virtual box not found]:
	3.1	Suggest user to search for the virtual box manually.
	3.2	Suggest user to download the latest virtual box software.
4.	PostLoad [Behind the scene]:
	4.1	Update startup files as required.
	
	
Project folder structure:
We will implement an MVC model. Review readme file found in each of the folders. 
