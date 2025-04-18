class MylistTest{
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("elements 1 " + list.get(1));
        System.out.println("elements 2 " + list.get(2));
        System.out.println("elements 3 " + list.get(3));
        System.out.println("elements 4 " + list.get(4));
        System.out.println("elements 5 " + list.get(5));
        list.add(-1);
        System.out.println("elements -1 " + list.get(-1 ));
    }}