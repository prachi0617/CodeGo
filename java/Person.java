class Person {
String name;
int age;
	
Person(String n, int a) {
name = n;
age = a;
}

void printDetails(){
System.out.println("Name:" + name);
System.out.println("Age:" + age);
}

boolean isAdult(){
return age >= 18;
}

void haveBirthday() {
age = age + 1;
System.out.println("Happy Birthday! " + name + "is now " + age);
}
}


