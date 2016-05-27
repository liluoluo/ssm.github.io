function getCentext(){
	
	var localObj = window.location;

	var basePath = localObj.protocol+"//"+localObj.host+"/"+localObj.pathname.split("/")[1];
	
	return basePath;
}
	
