class Ifelseladderc {
public static void main (String[]args){
String name = "Mukul";
 if(name =="Meena") { //false
System.out.println("name is Meena");
}
 else if (name =="Neha") { //false
System.out.println("name is Neha");
}
else if (name =="Mukul") { //false
System.out.println("----Duplicate access found----");
}
else {
System.out.println(name);
}
}
}