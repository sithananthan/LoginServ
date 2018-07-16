function validate() {
    
    var uname = document.getElementById("name");
    var pwd = document.getElementById("pwd");
    
    if (uname.value.length == 0) {
        uname.focus();
        uname.style.border = "solid red 3px";
        return false;
    }
    
    if (pwd.value.length == 0) {
        pwd.focus();
        pwd.style.border = "solid red 3px";
        return false;
    }
}