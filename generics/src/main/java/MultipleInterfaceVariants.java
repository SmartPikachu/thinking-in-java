// generics/MultipleInterfaceVariants.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

interface Payable<T> {
}

//class Employee implements Payable<Employee> {
//}

class Hourly extends Employee
        implements Payable<Hourly> {
}
