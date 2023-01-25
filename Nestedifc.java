class Nestedifc {
public static void main (String[]args){
String address = "Ghaziabad, India";

if (address.endsWith("India")) { //true

if (address.contains("Ghaziabad")) { //false
System.out.println("Welcome to Ghaziabad");
}
 else if (address.contains("Newtown")) { //false
System.out.println("Your city is Newtown");
}
else { 
System.out.println(address.split(",")[0]);
}
}
else {
System.out.println("you are not living in India");
}
}
}