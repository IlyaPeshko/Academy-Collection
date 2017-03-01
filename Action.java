package com.sort.collection.service;
import com.sort.collection.comparator.AuthorBook;
import com.sort.collection.comparator.Birth;
import com.sort.collection.comparator.QuantityCategory;
import com.sort.collection.domain.Book;
import com.sort.collection.domain.Category;
import com.sort.collection.domain.Student;

import java.util.*;

public class Action {

    public List <Student> listLinkedGenerate () {
        List <Student> list = new LinkedList<>();
        Calendar cal = Calendar.getInstance();  // student1
        cal.set(1984, Calendar.FEBRUARY, 7);
        Date date1 = cal.getTime();
        cal.set(1975, Calendar.JUNE, 12);
        Date date2 = cal.getTime();
        cal.set(1978, Calendar.SEPTEMBER, 15);
        Date date3 = cal.getTime();
        cal.set(1977, Calendar.OCTOBER, 11);
        Date date4 = cal.getTime();
        cal.set(1992, Calendar.SEPTEMBER, 15);
        Date date5 = cal.getTime();
        cal.set(1977, Calendar.NOVEMBER, 14);
        Date date6 = cal.getTime();
        cal.set(1993, Calendar.MARCH, 24);
        Date date7 = cal.getTime();
        cal.set(1988, Calendar.MAY, 23);
        Date date8 = cal.getTime();
        cal.set(1974, Calendar.DECEMBER, 27);
        Date date9 = cal.getTime();
        cal.set(1995, Calendar.JANUARY, 8);
        Date date10 = cal.getTime();
        cal.set(1985, Calendar.FEBRUARY, 13);
        Date date11 = cal.getTime();
        cal.set(1977, Calendar.OCTOBER, 15);
        Date date12 = cal.getTime();

        Student student1 = new Student("John Smith", date1, "Java", "OOP", "Male");
        Student student2 = new Student("Mike Smith", date2, "Java", "D", "Male");
        Student student3 = new Student("George Smith", date3, "Java", "F", "Male");
        Student student4 = new Student("Mary Smith", date4, "С++", "OOP", "Female");
        Student student5 = new Student("Katy Smith", date5, "С++", "V", "Female");
        Student student6 = new Student("Carl Smith", date6, "Ruby", "D", "Male");
        Student student7 = new Student("Bred Smith", date7, "C#", "OOP", "Male");
        Student student8 = new Student("Tiffany Smith", date8, "Object C", "OOP", "Female");
        Student student9 = new Student("Peter Smith", date9, "Swift", "OOP", "Male");
        Student student10 = new Student("Jessica Smith", date10, "Java", "OOP", "Female");
        Student student11 = new Student("Arnold Smith", date11, "Java", "OOP", "Male");
        Student student12 = new Student("Jessie Smith", date12, "Java", "OOP", "Male");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        return list;
    }

    public List<Student> listArrayGenerate () {
        List<Student> list = new ArrayList<>();

        Calendar cal = Calendar.getInstance();  // student1
        cal.set(1984, Calendar.FEBRUARY, 7);
        Date date1 = cal.getTime();
        cal.set(1975, Calendar.JUNE, 12);
        Date date2 = cal.getTime();
        cal.set(1978, Calendar.SEPTEMBER, 15);
        Date date3 = cal.getTime();
        cal.set(1977, Calendar.OCTOBER, 11);
        Date date4 = cal.getTime();
        cal.set(1992, Calendar.SEPTEMBER, 15);
        Date date5 = cal.getTime();
        cal.set(1977, Calendar.NOVEMBER, 14);
        Date date6 = cal.getTime();
        cal.set(1993, Calendar.MARCH, 24);
        Date date7 = cal.getTime();
        cal.set(1988, Calendar.MAY, 23);
        Date date8 = cal.getTime();
        cal.set(1974, Calendar.DECEMBER, 27);
        Date date9 = cal.getTime();
        cal.set(1995, Calendar.JANUARY, 8);
        Date date10 = cal.getTime();
        cal.set(1985, Calendar.FEBRUARY, 13);
        Date date11 = cal.getTime();
        cal.set(1977, Calendar.OCTOBER, 15);
        Date date12 = cal.getTime();

        Student student1 = new Student("John Smith", date1, "Java", "OOP", "Male");
        Student student2 = new Student("Mike Smith", date2, "Java", "D", "Male");
        Student student3 = new Student("George Smith", date3, "Java", "F", "Male");
        Student student4 = new Student("Mary Smith", date4, "С++", "OOP", "Female");
        Student student5 = new Student("Katy Smith", date5, "С++", "V", "Female");
        Student student6 = new Student("Carl Smith", date6, "Ruby", "D", "Male");
        Student student7 = new Student("Bred Smith", date7, "C#", "OOP", "Male");
        Student student8 = new Student("Tiffany Smith", date8, "Object C", "OOP", "Female");
        Student student9 = new Student("Peter Smith", date9, "Swift", "OOP", "Male");
        Student student10 = new Student("Homer Smith", date10, "Java", "OOP", "Male");
        Student student11 = new Student("Arnold Smith", date11, "Java", "OOP", "Male");
        Student student12 = new Student("Jessie Smith", date12, "Java", "OOP", "Male");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);

        return list;
    }

    public HashSet<Book> listHashSetGenerate () {
        HashSet <Book> list = new HashSet<>();

        Book book1 = new Book("ULYSSES", "by James Joyce");
        Book book2 = new Book("THE GREAT GATSBY", "by F. Scott Fitzgerald");
        Book book3 = new Book("A PORTRAIT OF THE ARTIST AS A YOUNG MAN", "by James Joyce");
        Book book4 = new Book("LOLITA", "by Vladimir Nabokov");
        Book book5 = new Book("BRAVE NEW WORLD", "by Aldous Huxley");
        Book book6 = new Book("THE SOUND AND THE FURY", "by William Faulkner");
        Book book7 = new Book("Java", "by Java School");
        Book book8 = new Book("DARKNESS AT NOON", "by Arthur Koestler");
        Book book9 = new Book("SONS AND LOVERS", "by D.H. Lawrence");
        Book book10 = new Book("THE GRAPES OF WRATH", "by John Steinbeck");
        Book book11 = new Book("UNDER THE VOLCANO", "by Malcolm Lowry");
        Book book12 = new Book("Java", "by Java School");
        Book book13 = new Book("1984", "by George Orwell");
        Book book14 = new Book("Java", "by Java School");
        Book book15 = new Book("I, CLAUDIUS", "by Robert Graves");
        Book book16 = new Book("Java", "by Java School");
        Book book17 = new Book("TO THE LIGHTHOUSE", "by Virginia Woolf");
        Book book18 = new Book("Java", "by Java School");
        Book book19 = new Book("AN AMERICAN TRAGEDY", "by Theodore Dreiser");
        Book book20 = new Book("Java", "by Java School");
        Book book21 = new Book("THE HEART IS A LONELY HUNTER", "by Carson McCullers");
        Book book22 = new Book("SLAUGHTERHOUSE-FIVE", "by Kurt Vonnegut");
        Book book23 = new Book("INVISIBLE MAN", "by Ralph Ellison");
        Book book24 = new Book("NATIVE SON", "by Richard Wright");
        Book book25 = new Book("HENDERSON THE RAIN KING", "by Saul Bellow");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);
        list.add(book11);
        list.add(book12);
        list.add(book13);
        list.add(book14);
        list.add(book15);
        list.add(book16);
        list.add(book17);
        list.add(book18);
        list.add(book19);
        list.add(book20);
        list.add(book21);
        list.add(book22);
        list.add(book23);
        list.add(book24);
        list.add(book25);

      return list;
    }

    public TreeSet<Book> listTreeSetGenerate () {
        TreeSet <Book> list = new TreeSet<>();

        Book book1 = new Book("ULYSSES", "by James Joyce");
        Book book2 = new Book("THE GREAT GATSBY", "by F. Scott Fitzgerald");
        Book book3 = new Book("A PORTRAIT OF THE ARTIST AS A YOUNG MAN", "by James Joyce");
        Book book4 = new Book("LOLITA", "by Vladimir Nabokov");
        Book book5 = new Book("BRAVE NEW WORLD", "by Aldous Huxley");
        Book book6 = new Book("THE SOUND AND THE FURY", "by William Faulkner");
        Book book7 = new Book("Java", "by Java School");
        Book book8 = new Book("DARKNESS AT NOON", "by Arthur Koestler");
        Book book9 = new Book("SONS AND LOVERS", "by D.H. Lawrence");
        Book book10 = new Book("THE GRAPES OF WRATH", "by John Steinbeck");
        Book book11 = new Book("UNDER THE VOLCANO", "by Malcolm Lowry");
        Book book12 = new Book("Java", "by Java School");
        Book book13 = new Book("1984", "by George Orwell");
        Book book14 = new Book("Java", "by Java School");
        Book book15 = new Book("I, CLAUDIUS", "by Robert Graves");
        Book book16 = new Book("Java", "by Java School");
        Book book17 = new Book("TO THE LIGHTHOUSE", "by Virginia Woolf");
        Book book18 = new Book("Java", "by Java School");
        Book book19 = new Book("AN AMERICAN TRAGEDY", "by Theodore Dreiser");
        Book book20 = new Book("Java", "by Java School");
        Book book21 = new Book("THE HEART IS A LONELY HUNTER", "by Carson McCullers");
        Book book22 = new Book("SLAUGHTERHOUSE-FIVE", "by Kurt Vonnegut");
        Book book23 = new Book("INVISIBLE MAN", "by Ralph Ellison");
        Book book24 = new Book("NATIVE SON", "by Richard Wright");
        Book book25 = new Book("HENDERSON THE RAIN KING", "by Saul Bellow");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);
        list.add(book11);
        list.add(book12);
        list.add(book13);
        list.add(book14);
        list.add(book15);
        list.add(book16);
        list.add(book17);
        list.add(book18);
        list.add(book19);
        list.add(book20);
        list.add(book21);
        list.add(book22);
        list.add(book23);
        list.add(book24);
        list.add(book25);

        return list;
    }

    public HashMap <String, String> catalogHashMapGenerate () {
        HashMap <String, String> catalog = new HashMap();
        catalog.put("TV", "12");
        return catalog;
    }

    public void sortDateArrayList () {
        Action action = new Action();
        List <Student> toSort = action.listArrayGenerate();
        Collections.sort(toSort, new Birth());

        for (Student a : toSort){
            System.out.println(a);
        }
    }

    public void sortGenderListLinked () {
        Action action = new Action();
        List <Student> list = action.listLinkedGenerate();
        Iterator<Student> iter = list.iterator();

        while (iter.hasNext()){
            Student s = iter.next();
            String gender = s.getGender();
            if (gender.equals("Male")){         //if((String)s.getGender() == "male"
                iter.remove();
            }
        }
        System.out.println("Female list:");
        for (Student a : list){
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Sort list:");
        for (int i = 1; i<list.size();i+=2){
            System.out.println(list.get(i));
        }

    }

    public void sortJavaHashSet () {
        Action action = new Action();
        HashSet <Book> books = action.listHashSetGenerate();

        for (Book a : books){
            String temp = a.getTitle();
            if (temp.equals("Java")){
                System.out.println(a);
            }
        }
    }

    public void sortByTitleJavaHashSet () {
        Action action = new Action();
        HashSet <Book> toSort = action.listHashSetGenerate();

        Object[] tempArray = toSort.toArray();
        List <Book> books = new ArrayList<>();
        for (Object a : tempArray){
            Book book = (Book) a;
            books.add(book);
        }
        Collections.sort(books, new AuthorBook());
        for (Book a: books){
            System.out.println(a);
        }
    }

    public void sortByOddTreeSetTask9 (){
        Action action = new Action();
        TreeSet <Book> toSort = action.listTreeSetGenerate();

        int step = 1;
        int bystep = 2;
        Iterator <Book> iter = toSort.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            step++;
            if (step == bystep){
                System.out.println("DELETED  "+iter.next());
                iter.remove();
                bystep++;
                if (bystep == toSort.size()){
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("sorted");
        for (Book book : toSort) {
            System.out.println(book);

        }

    }

    public void sortTreeMap () {
        HashMap<String, Integer> catalog = new HashMap();

        catalog.put("TV", 12);
        catalog.put("Microwave", 15);
        catalog.put("Grill", 23);
        catalog.put("Cell phones",42);
        catalog.put("Tablets",21);
        catalog.put("Notebooks",33);
        catalog.put("Cameras",26);
        catalog.put("Car",28);
        catalog.put("Refrigerators",7);
        catalog.put("Monitors",42);
        catalog.put("Headphones",33);

        ArrayList <Category> onliner = new ArrayList<>();

        for (Map.Entry <String, Integer> map : catalog.entrySet()){
            String category = map.getKey();
            Integer item = map.getValue();
            Category categoryQTY = new Category(category,item);
            onliner.add(categoryQTY);
        }
        Collections.sort(onliner, new QuantityCategory());
        for (Category category : onliner) {
            System.out.println(category);
        }
    }
}


