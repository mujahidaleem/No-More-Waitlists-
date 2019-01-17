# Selenium-Webdriver-Enrollment-Program
A script which automatically enrolls a student based on if there exists a spot in the enrollment of a particular course. The development is ongoing!

The script will first open ACORN, login into the user's profile and navigate towards the course selection tab. Then, the script will check continuously if there exists an enrolment spot for the student. This could be indicated by the lack of a waitlist, or key words such as "x spots remaining". The script will refresh the page until that condition is met, and then enroll the student automatically. 
