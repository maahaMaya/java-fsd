<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Vaccination Center</title>
</head>
<body>
<form method="get" action="addNewVc">
    <div style="width: 50vw; height: 46vh;; border: 1px solid black;">
        <div style="width: 48vw; height: 42vh;; border: 1px solid black; margin: 1vw;">
            <div style="text-align: center; border-bottom: 1px solid black;">
                <h2>Add new vaccination Center</h2>
            </div>
            <div style="border-bottom: 1px solid black; height: 28%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Center Name
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <input style="width: 25vw; height: 3vh;" name="centerName"/>
                </div>
            </div>
            <div style="border-bottom: 1px solid black; height: 28%; display: flex; flex-direction: row;">
                <div style="width: 30%; border-right: 1px solid black; height: 100%; display: flex; justify-content: center; align-items: center;">
                    Center City
                </div>
                <div style="display: flex; justify-content: center; align-items: center; margin-left: 3vw;">
                    <select name="centerCity" id="centerCity" style="width: 25vw; height: 3vh;">
                        <option value="Bangalore">Bangalore</option>
                        <option value="Mumbai">Mumbai</option>
                        <option value="Pune">Pune</option>
                        <option value="Delhi">Delhi</option>
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