<html>
<head>
<title></title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body class="bg-white">


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

 <li class="nav-item">
                    <a class="nav-link active text-white fs-3" href="./Market.jsp">Market</a>
                </li>


            </ul>
        </div>
    </div>
</nav>


    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1 d-flex justify-content-center">Your Details</h6>

                <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Name : <%=request.getAttribute("name")%></h3>
                        </div>
                    </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Location : <%=request.getAttribute("location")%></h3>
                        </div>
                    </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">City :<%=request.getAttribute("city")%></h3>
                        </div>
                    </div>
                    </div>
                </div>


  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Pincode : <%=request.getAttribute("pincode")%></h3>
                        </div>
                    </div>
                    </div>
                </div>


  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Area :<%=request.getAttribute("area")%></h3>
                        </div>
                    </div>
                    </div>
                </div>


  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Type : <%=request.getAttribute("type")%></h3>
                        </div>
                    </div>
                    </div>
                </div>

  <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Stall : <%=request.getAttribute("stall")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">itemName : <%=request.getAttribute("itemName")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">itemQuality : <%=request.getAttribute("itemQuality")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">itemQuantity : <%=request.getAttribute("itemQuantity")%></h3>
                        </div>
                    </div>
                    </div>
                </div>


 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">itemCost : <%=request.getAttribute("itemCost")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Stall Owner : <%=request.getAttribute("stallOwner")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Stall KEB No : <%=request.getAttribute("keb")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Owner GST : <%=request.getAttribute("gst")%></h3>
                        </div>
                    </div>
                    </div>
                </div>

 <div class="row">
                    <div class="col-sm-12">
                    <div class="container mb-5 mt-5">
                        <div class="container">
                            <h3 class="text-white">Weekly Transaction : <%=request.getAttribute("transaction")%></h3>
                        </div>
                    </div>
                    </div>
                </div>



</div></div></div>

</body>
</html>
