<html>
<head>
<title></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="./degree.js"></script>
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
                    <a class="nav-link active text-white fs-3" href="./ComputerPart.html"></a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<form action="degree" method="post" name="degreePercentage">




    <div class="container mt-5 mb-5 d-flex justify-content-center">
        <div class="card px-5 py-4 bg-primary">
            <div class="card-body">
                <h6 class="card-title mb-3 text-white fs-1">Degree Details</h6>

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
                            <div class="mb-1">

                                <label for="mail" class="form-label text-white">Email</label>
                                <input type="email" class="form-control" name="mail" id="mail" aria-describedby="modelHelp" onblur="setMail()" >
                                <span id="mailError"></span>
                            </div>
                        </div>
                    </div>
                </div>

 <div class="row">
                    <div class="col-sm-12">
                        <div class="form-group">
                            <div class="input-group mb-4 mt-5">
                                <label class="input-group-text" for="college">College</label>
                                <select class="form-select" id="college" name="college" onblur="setCollege()">
                                    <option selected value="0">Choose...</option>
                                    <option value="Harvard University">Harvard University</option>
                                    <option value="Stanford University">Stanford University</option>
                                    <option value="Massachusetts Institute of Technology (MIT) ">Massachusetts Institute of Technology (MIT) </option>
                                    <option value="University of Oxford">University of Oxford</option>
                                    <option value="University of Cambridge">University of Cambridge</option>
                                    <option value="ETH Zurich">ETH Zurich</option>
                                    <option value="University of Tokyo">University of Tokyo</option>
                                    <option value="National University of Singapore (NUS)">National University of Singapore (NUS)</option>
                                    <option value="McGill University">McGill University</option>
                                </select>

                                <span id="collegeError"></span>
                            </div>
                        </div>
                    </div>
                </div>

                 <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <div class="input-group mb-4 mt-5">
                                                <label class="input-group-text" for="deg">Degree</label>
                                                <select class="form-select" id="deg" name="deg" onblur="setDegree()">
                                                    <option selected value="0">Choose...</option>
                                                    <option value="Harvard University">BA</option>
                                                    <option value="Stanford University">BE</option>
                                                    <option value="National University of Singapore (NUS)">BCA</option>
                                                    <option value="McGill University">Bsc</option>
                                                    <option value="McGill University">MCA</option>
                                                    <option value="McGill University">M.Tech</option>
                                                </select>

                                                <span id="degreeError"></span>
                                            </div>
                                        </div>
                                    </div>


                                </div>

                                 <div class="row">
                                                                    <div class="col-sm-12">
                                                                        <div class="form-group">
                                                                            <div class="input-group mb-4 mt-5">
                                                                                <label class="input-group-text" for="stream">Stream</label>
                                                                                <select class="form-select" id="stream" name="stream" onblur="setStream()">
                                                                                    <option selected value="0">Choose...</option>

                                                                                    <option value="Aerospace Engineering">Aerospace Engineering</option>
                                                                                     <option value="Biology">Biology</option>
                                                                                     <option value="Chemistry">Chemistry</option>
                                                                                    <option value="Civil Engineering">Civil Engineering</option>
                                                                                     <option value="Computer Applications">Computer Applications</option>
                                                                                    <option value="Computer Science Engineering">Computer Science Engineering</option>
                                                                                     <option value="Electrical Engineering">Electrical Engineering</option>

                                                                                      <option value="Mathematics">Mathematics</option>
                                                                                    <option value="Mechanical Engineering">Mechanical Engineering</option>
                                                                                    <option value="others">Others</option>
                                                                                </select>

                                                                                <span id="streamError"></span>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    </div>
                                 <div class="row">
                                                                    <div class="col-sm-12">
                                                                        <div class="form-group">
                                                                            <div class="input-group mb-4 mt-5">
                                                                                <label class="input-group-text" for="branch">Branch</label>
                                                                                <select class="form-select" id="branch" name="branch" onblur="setBranch()">
                                                                                    <option selected value="0">Choose...</option>

                                                                                    <option value="Aerospace Engineering">Aerospace</option>
                                                                                     <option value="Biology">Biology</option>
                                                                                     <option value="Chemistry">Chemistry</option>
                                                                                    <option value="Civil Engineering">Civil</option>
                                                                                     <option value="Computer Applications">MCA</option>
                                                                                    <option value="Computer Science Engineering">CS</option>
                                                                                     <option value="Electrical Engineering">EC</option>

                                                                                      <option value="Mathematics">Mathematics</option>
                                                                                    <option value="Mechanical Engineering">ME</option>
                                                                                    <option value="others">Others</option>
                                                                                </select>

                                                                                <span id="branchError"></span>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    </div>

 <div class="row">
                    <div class="col-sm-12 mb-5">
                        <div class="form-group">
                            <div class="mb-1">

                                <label for="percentage" class="form-label text-white">Percentage</label>
                                <input type="text" class="form-control" name="percentage" id="percentage" aria-describedby="modelHelp" onblur="setPercentage()" >

                                <span id="percentageError"></span>
                            </div>
                        </div>
                    </div>
                    </div>
   <div class="row">
                            <div class="col-sm-12">
                                 <div class="form-group">

                                   <button type="submit" disabled id="btn"  class="me-5 ms-5">Send</button>

                                                     </div></div>

                                             </div>


                </form>
                </div></div></div>
</body>
</html>