for(var i=1; i<=5 ; i++){
    document.write("★");
}
document.write("<br>");
document.write("<br>");


for(var s=1; s<=2 ; s++){
    for(var i=1; i<=3 ; i++){
        document.write("★");       
    }
    document.write("<br>");
}
document.write("<br>");


for(var s=1; s<=2 ; s++){
    for(var t=1; t<=5 ; t++){
        document.write("☆");       
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=4 ; s++){
    for(var t=1; t<=5 ; t++){
        document.write("★");       
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=4 ; s++){
    for(var t=1; t<=3 ; t++){
        document.write("★");       
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=3 ; s++){
    for(var t=1; t<=3 ; t++){
        if(t%2==0){
            document.write("☆")
        }else{
         document.write("★");      
        }   
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=4 ; s++){
    for(var t=1; t<=5 ; t++){
        if(t%2==0){
            document.write("☆")
        }else{
         document.write("★");      
        }   
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=s ; t++){
         document.write("★");
        }
    document.write("<br>");
}
document.write("<br>");


document.write("<br>");
document.write("上級編");
document.write("<br>");
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=5 ; t++){
         document.write("★");
        }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=5; t++){
        if(s%2==0 && t%2==1){
            document.write("☆")
        }else if(s%2==1 && t%2==0){
         document.write("☆"); 
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=5 ; t++){
        if(s==t){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=s ; t++){
         document.write("★");
        }
    document.write("<br>");
}
document.write("<br>");

for(var s=1; s<=5 ; s++){
    for(var t=1; t<=s ; t++){
        if(s==t){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}