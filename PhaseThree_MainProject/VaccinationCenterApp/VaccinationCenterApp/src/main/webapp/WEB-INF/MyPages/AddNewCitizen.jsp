<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="width: 46vw; height: 8vh; border: 1px solid black; padding: 1vw;"> 
    <a href="${viewAll }">Vaccination Center</a> &nbsp; &nbsp; &nbsp; 
    <a href="${viewAllC }">Citizens</a>  &nbsp; &nbsp; &nbsp; 
    <a href="${s }">Logout</a> &nbsp; &nbsp; &nbsp; 
    Welcome Admin 
</div><br/><br/>


<form method="get" action="addNewCitizen">
    <div style="width: 50vw; height: 100vh;; border: 1px solid black;">
        <div style="width: 48vw; height: 95vh;; border: 1px solid black; margin: 1vw;">
            <div style="text-align: center; border-bottom: 1px solid black;">
                <h2>Add new Citizen</h2>
            </div>
            <div style="border-bottom: 1px solid black; height: 20%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Citizen Name
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <input style="width: 25vw; height: 3vh;" name="citizenName"/>
                </div>
            </div>
            <div style="border-bottom: 1px solid black; height: 20%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Citizen City
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <select name="citizenCity" id="city" style="width: 25vw; height: 3vh;">
                        <option value="Bangalore">Bangalore</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="Pune">Pune</option>
                        <option value="Delhi">Delhi</option>
                      </select>
                </div>
            </div>
            <div style="border-bottom: 1px solid black; height: 10%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Citizen Status
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <select name="status" id="city" style="width: 25vw; height: 3vh;">
                        <option value="Fully Vaccinated">Fully Vaccinated</option>
                        <option value="Not Vaccinated">Not Vaccinated</option>
                      </select>
                </div>
            </div>
            <div style="border-bottom: 1px solid black; height: 10%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Number of Dose
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <select name="VaccinationDose" id="city" style="width: 25vw; height: 3vh;">
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                      </select>
                </div>
            </div>
            <div style="border-bottom: 1px solid black; height: 20%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Citizen Vaccination Center
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <select name="citizenClinic" id="city" style="width: 25vw; height: 3vh;">
                        <option value="Galext Clinic">Galext Clinic</option>
                        <option value="Hari Clinic">Hari Clinic</option>
                        <option value="Pune Clinic">Pune Clinic</option>
                        <option value="Delhi Clinic">Delhi Clinic</option>
                        <option value="Day Clinic">Day Clinic</option>
                        <option value="Night Clinic">Night Clinic</option>
                    </select>
                </div>
            </div>
            <div style="display: flex; justify-content: center; align-items: center; align-content: center; height: 20%;">
                <button>Submit</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>