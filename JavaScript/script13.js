var myoji=["田中","高橋","斉藤"];
myoji.unshift("鈴木");
document.write(myoji);
document.write("<br>");

var abc=["高知","愛媛","香川"];
abc.unshift("徳島");
document.write(abc);
document.write("<br>");

var xyz1=["名前","住所","電話番号"];
xyz1.push("アドレス");
document.write(xyz1);
document.write("<br>");

var rech=["good","bad","nice"];
rech.push("lucky");
document.write(rech);
document.write("<br>");

var xyz2=["名前","住所","電話番号"];
xyz2.pop();
document.write(xyz2);
document.write("<br>");

var def=["関東","東北","九州","四国"];
def.pop();
document.write(def);
document.write("<br>");

var myozi=["田中","高橋","斉藤"];
document.write(myozi.slice(0,2));
document.write("<br>");

var age=[18,26,33,41,50]
document.write(age.slice(1,4));