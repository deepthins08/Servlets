<html>
<head>
<title></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="./market.js"></script>
</head>
<body class="bg-light">


<nav class="navbar navbar-expand-lg navbar-primary bg-primary">
    <div class="container">

        <a class="navbar-brand" href="#"></a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div  id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active text-white fs-3 " href="./index.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active text-white fs-3" href="./DegreePercentage.jsp">DegreePercentage</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<form action="market" method="post" name="Market">




    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1">Market Details</h6>

                <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="cname" class="form-label text-white">Name</label>
                                <input type="text" class="form-control" name="cname" id="cname" aria-describedby="modelHelp" onblur="setName()" >

                                <span id="nameError"></span>
                            </div>
                        </div>
                    </div>
                </div>


 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="location">Location</label>
                                <select class="form-select" id="location" name="location" onblur="setLocation()">
                                    <option selected value="0">Choose...</option>
                                    <option value="BTM">BTM</option>
                                    <option value="APMC Market">APMC Market</option>
                                    <option value="Banashankari  ">Banashankari </option>
                                    <option value="Veg Market">Veg Market</option>
                                    <option value="Mejestic">Mejestic</option>

                                </select>

                                <span id="locationError"></span>
                            </div>
                        </div>
                    </div>
                </div>


<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="city">City</label>
                                <select class="form-select" id="city" name="city" onblur="setCity()">
                                    <option selected value="0">Choose...</option>
                                    <option value="BTM">Bengaluru</option>
                                    <option value="MG Road">Davangere</option>
                                    <option value="Bengaluru  ">Bengaluru </option>
                                    <option value="Jayanagara">Davangere</option>
                                    <option value="Bengaluru">Bengaluru</option>

                                </select>

                                <span id="cityError"></span>
                            </div>
                        </div>
                    </div>
                </div>



                <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="pincode" class="form-label text-white">Pincode</label>
                                <input type="text" class="form-control" name="pincode" id="pincode" aria-describedby="modelHelp" onblur="setPincode()" >
                                <span id="pincodeError"></span>
                            </div>
                        </div>
                    </div>
                </div>

 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="area" class="form-label text-white">Area</label>
                                <input type="text" class="form-control" name="area" id="area" aria-describedby="modelHelp" onblur="setArea()" >

                                <span id="areaError"></span>
                            </div>
                        </div>
                    </div>
                </div>


 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="type">Type</label>
                                <select class="form-select" id="type" name="type" onblur="setType()">
                                    <option selected value="0">Choose...</option>
                                    <option value="Vegetable Stall">Vegetable Stall</option>
                                    <option value="Fruits Stall">Fruits Stall</option>
                                    <option value="Cuisine Stall">Cuisine Stall </option>
                                    <option value="Onions stall">Onions stall</option>
                                    <option value="Spices stall">Spices stall</option>
                                    <option value="All type stall">All type stall</option>

                                </select>

                                <span id="typeError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="stall" class="form-label text-white">Stall No</label>
                                <input type="text" class="form-control" name="stall" id="stall" aria-describedby="modelHelp" onblur="setStall()" >

                                <span id="stallError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="itemName" class="form-label text-white">Item Name</label>
                                <input type="text" class="form-control" name="itemName" id="itemName" aria-describedby="modelHelp" onblur="setItemName()" >

                                <span id="itemNameError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="itemQuality" class="form-label text-white">Item Quality</label>
                                <input type="text" class="form-control" name="itemQuality" id="itemQuality" aria-describedby="modelHelp" onblur="setItemQuality()" >

                                <span id="itemQualityError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="itemQuantity" class="form-label text-white">Item Quantity</label>
                                <input type="text" class="form-control" name="itemQuantity" id="itemQuantity" aria-describedby="modelHelp" onblur="setItemQuantity()" >

                                <span id="itemQuantityError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="itemCost" class="form-label text-white">Item Cost</label>
                                <input type="text" class="form-control" name="itemCost" id="itemCost" aria-describedby="modelHelp" onblur="setItemCost()" >

                                <span id="itemCostError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="stallOwner" class="form-label text-white">Stall Owner</label>
                                <input type="text" class="form-control" name="stallOwner" id="stallOwner" aria-describedby="modelHelp" onblur="setStallOwner()" >

                                <span id="stallOwnerError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="keb" class="form-label text-white">Stall KEB No</label>
                                <input type="text" class="form-control" name="keb" id="keb" aria-describedby="modelHelp" onblur="setKEB()" >

                                <span id="kebError"></span>
                            </div>
                        </div>
                    </div>
                </div>


<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="gst" class="form-label text-white">GST</label>
                                <input type="text" class="form-control" name="gst" id="gst" aria-describedby="modelHelp" onblur="setGST()" >

                                <span id="gstError"></span>
                            </div>
                        </div>
                    </div>
                </div>

<div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="transaction" class="form-label text-white">Weekly Transaction</label>
                                <input type="text" class="form-control" name="transaction" id="transaction" aria-describedby="modelHelp" onblur="setTransaction()" >

                                <span id="transactionError"></span>
                            </div>
                        </div>
                    </div>
                </div>


   <div class="row">
                            <div class="col-sm-12">
                                 <div class="form-group">

                                   <button type="submit" disabled id="btn"  class="me-5 ms-5">Submit</button>

                                                     </div></div>

                                             </div>


                </form>
                </div></div></div>
</body>
</html>