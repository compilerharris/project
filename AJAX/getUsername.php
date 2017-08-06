<?php
    try{
        $pdo = new PDO("mysql:host=localhost;dbname=erail","root","");
        $pdo->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);

        // get the q parameter from URL
        $q = $_REQUEST["q"];

        $userName = "";

        $query = "SELECT username FROM users";
        $stmt = $pdo->prepare($query);
        // $stmt->bindValue(":users","users",PDO::PARAM_STR);
        $stmt->execute();
        $result = $stmt->fetchAll(PDO::FETCH_ASSOC);

        // lookup all userNames from array if $q is different from "" 
        if ($q !== "") {
            $q = strtolower($q);
            $i = 0;
            foreach ($result as $key) {
                if ($q == $key['username']) {
                    $userName = $key['username'];
                    break;
                }
                $i += 1;
            }

            if ($i == $stmt->rowCount()) {
                $userName = "success";
            }


        }

        // Output "no suggestion" if no userName was found or output correct values 
        echo $userName;

    }catch(PDOException $e){
        echo "ERROR: ".$e->getMessage();
    }
?>