function circle(hankei,ensyuritsu=3.14){
    return "半径"+hankei+"cmの円の面積は"+hankei*hankei*ensyuritsu+"cm²です。";
}
document.write(circle(5));
document.write("<br>");
document.write(circle(7));
document.write("<br>");
document.write(circle(10));
document.write("<br>");
document.write("<br>");

function ryokin(group,a1,b1,otona=500,kodomo=200){
    return group+"グループの合計金額は"+(otona*a1+kodomo*b1)+"円です。";
}
document.write(ryokin("A",2,4));
document.write("<br>");
document.write(ryokin("B",1,5));
document.write("<br>");
document.write(ryokin("C",3,7));