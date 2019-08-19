var myouji=["高木","田中","山本"];
document.write(myouji);
document.write("<br>");

var color=["赤","白","黒"];
document.write(color);
document.write("<br>");

document.write(color[0]);
document.write(color[1]);
document.write(color[2]);
document.write("<br>");

var num=["No1","No2","No3"];
delete num[0];
document.write(num);
document.write("<br>");

var pre1=["東京","神奈川","埼玉"];
pre1[3]="千葉";
document.write(pre1);
document.write("<br>");

var pre2=["東京","神奈川","埼玉"];
delete pre2[0];
pre2[0]="千葉";
document.write(pre2);
document.write("<br>");

var month=["1月","2月","3月"];
month[2]="誕生日";
document.write(month);
document.write(month[2]);
document.write("<br>");

var myozi={"A組":"田中","B組":"高橋","C組":"斉藤"};
document.write(myozi["A組"]);
document.write("<br>");

var number={"1番":"佐藤","2番":"山田","3番":"斉藤"};
document.write(number["1番"]);
document.write("<br>");