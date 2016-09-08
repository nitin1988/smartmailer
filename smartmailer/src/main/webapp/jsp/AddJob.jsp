<html>
<head>
  <title>Smart Mailer</title>
</head>
<body>
  <h1>Add Job</h1>
  
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Add Job</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Job Name</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" type="text" placeholder="Enter your job name..." class="form-control input-md" required="true">
  <span class="help-block">Enter your job name</span>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="jobTime">Job Time</label>  
  <div class="col-md-4">
  <input id="jobTime" name="jobTime" type="text" placeholder="Enter your job time..." class="form-control input-md" required="true">
  <span class="help-block">Enter your job time in format dd/MM/YYYY HH:mm:ss</span>  
  </div>
</div>

<!-- Select Multiple -->
<div class="form-group">
  <label class="col-md-4 control-label" for="recepientsList">Recepients</label>
  <div class="col-md-4">
    <select id="recepientsList" name="recepientsList" class="form-control" multiple="multiple">
      <option value="mylife.arora@gmail.com">Nitin Arora</option>
      <option value="afreen.mca@gmail.com">Afreen Khan</option>
      <option value="moonis.hussain@gmail.com">Moonis Hussain</option>
      <option value="aarti.kohli@gmail.com">Aarti Kohli</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="attachmentPath">Attachment Path</label>  
  <div class="col-md-4">
  <input id="attachmentPath" name="attachmentPath" type="text" placeholder="Enter the path of attachment" class="form-control input-md">
  <span class="help-block">Enter the path of attachment</span>  
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="attachmentPath">Attachment Path</label>
  <div class="col-md-4">
    <input id="attachmentPath" name="attachmentPath" class="input-file" type="file">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="addjob"></label>
  <div class="col-md-4">
    <button id="addjob" name="addjob" class="btn btn-primary">Add Job</button>
  </div>
</div>

</fieldset>
</form>
</body>
</html>

