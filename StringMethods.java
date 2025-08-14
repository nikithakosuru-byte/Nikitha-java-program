class StringMethods{
    public static void main(String[] args) {
        String m="Krishna";
        String college="Annamacharya Institute of technology";
        String rollNumber="23701A3079";
        System.out.println("Length of the String "+m.length());
        System.out.println("Length of the String "+college.length());
        System.out.println("Length of the String "+rollNumber.length());
        System.out.println("Returns character at given "+m.charAt(1));
        System.out.println("Returns character at given "+college.charAt(3));
        System.out.println("Returns character at given "+rollNumber.charAt(4));
        System.out.println(m.substring(1,5));
        System.out.println(m.contains("ish"));
        System.out.println(m.equals("krishna"));
        System.out.println(m.equalsIgnoreCase("Krishna"));
    }

}