import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Objects;
import java.util.Map;

class ReadFile{
    //Чтение из файла
    ArrayList <String> ReadF() {
        ArrayList <String> arrayList = new ArrayList <>();

        //try – определяет блок кода, в котором может произойти исключение
        try (FileReader reader = new FileReader("C:/my_project/lesson_2_Collection/task_2/training_file")) {
            String myStr = "" ;
            char[] buf = new char[256];
            int c;
            //Проверка окончания строки и определение количества считанных байт
            while ((c = reader.read(buf)) > 0) {
                if (c < 256){
                    buf = Arrays.copyOf(buf, c);}//откидывает лишние значения(муссор) из массива.
                //Выделение слов из массива и последующая запись в arrayList
                for(int i = 0; c > i; i++) {
                        if ((buf[i] == ' ')) {
                            arrayList.add(myStr);
                            myStr = "";
                        }
                        else if(buf[i] != '\n') {myStr = myStr + buf[i];}
                }
            }
        }
        //Проверка на ошибки чтения
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return arrayList ;
    }
}

class ReadFileLineByLine{
    //Чтение из файла
    ArrayList <String> ReadF_L_B_L() {
        ArrayList <String> arrayList = new ArrayList <>();
        //try – определяет блок кода, в котором может произойти исключение
        try (FileReader reader = new FileReader("C:/my_project/lesson_2_Collection/task_2/training_file")) {
            String myStr = "" ;
            char[] buf = new char[256];
            int c;
            //Проверка окончания строки и определение количества считанных байт
            while ((c = reader.read(buf)) > 0) {
                if (c < 256){
                    buf = Arrays.copyOf(buf, c);}//откидывает лишние значения(муссор) из массива.
                //Выделение слов из массива и последующая запись в arrayList
                for(int i = 0; c > i; i++) {
                    if ((buf[i] == '\n')) {
                        arrayList.add(myStr);
                        myStr = "";
                    }
                    else if(buf[i] != '\n') {myStr = myStr + buf[i];}
                }
            }
        }
        //Проверка на ошибки чтения
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return arrayList ;
    }
}

class StringLengthSort implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else{
            if(o1.length() < o2.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }
}

class Unique {
        /*Отбор уникальных значений*/
        ArrayList <String> Unique_word(ArrayList arrayList) {
            Set<String> uniqueSet = new HashSet<String>(arrayList);
            ArrayList<String> UniqueWords = new ArrayList<>(uniqueSet);//Конвертация из Set в ArrayList
            return UniqueWords;
        }
}
class  UniqueCounter {
    /*Подсчет уникальных слов и дальнейшее сохранение в ArrayList*/
    int Cnt(ArrayList arrayList) {
        Set<String> uniqueSet = new HashSet<String>(arrayList);
        return (uniqueSet.size());
    }
}

class  CounterDuplication {

    ArrayList<String> buf1 = new ArrayList<>();
    ArrayList<String> buf2 = new ArrayList<>();
    Unique uniqueWord = new Unique();
    UniqueCounter uniqueCounter = new UniqueCounter();
    /*Подсчет повторений*/
    ArrayList <String> Cnt(ArrayList arrayList) {
        ArrayList <String> UniqueWords = new ArrayList <>();
        UniqueWords.addAll(uniqueWord.Unique_word(arrayList));
        ArrayList<String> numberMatches = new ArrayList<>();
        for (int i = 0; uniqueCounter.Cnt(UniqueWords) > i; i++) {
            buf2.clear();
            buf2.add(UniqueWords.get(i));
            numberMatches.addAll(buf2);
            buf1.addAll(arrayList);
            buf1.retainAll(buf2);
            numberMatches.add(Integer.toString(buf1.size()));
        }
        return (numberMatches);
    }
}

class Sorting {
    Comparator<String> stringLengthComparator = new StringLengthSort();
    /*Сортировка по длине*/
    ArrayList <String> Lenght(ArrayList arrayList) {
        Collections.sort(arrayList, stringLengthComparator); // применяем сортировку по длине
        //System.out.println(arrayList);
        return arrayList;
    }

    /*Сортировка по алфавиту*/
    ArrayList <String> Alphabet(ArrayList arrayList) {
        Collections.sort(arrayList); // применяем сортировку по алфавиту
        return arrayList;
    }

}

class ConverselyPrint{
    //Вывод на экран всех строк в обратном порядке
    ReadFileLineByLine readFileLineByLine = new ReadFileLineByLine();

    ArrayList <String>  Conversely(ArrayList arrayList){
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList = readFileLineByLine.ReadF_L_B_L();
        int lenght = arrayList.size()-1;
        for(int i = lenght;i >= 0 ;i--) {
            arrayList2.add((String) arrayList.get(i));
        }
      return  arrayList;
    }
}
//////////////////////////////////////////////////////////////////////////////
class OutputNumberLine {
    //Вывод на экран по номеру строки
    ReadFileLineByLine readFileLineByLine = new ReadFileLineByLine();
    void NumberLine(ArrayList arrayList){
        arrayList =readFileLineByLine.ReadF_L_B_L();
        System.out.println("Задайте номер строки для вывода строки на экран или любой символ для завершения просмотра строк\n");
        Scanner console = new Scanner(System.in);
        int lineNumber = 0;
        int completionFlag = 0;
        int lenght = arrayList.size() - 1;
        while(completionFlag ==0) {
            System.out.println("Введите номер строки в пределах от  0 до " + lenght + ":  ");
            String a = console.nextLine();
            try {
                lineNumber = Integer.parseInt(a);
            } catch (NumberFormatException e) {
                completionFlag = 1;
                System.out.println("Выход");
            } finally {
                if ((completionFlag == 0)) {
                    if (lineNumber > lenght)
                        System.out.println("Указанна не существующая строка");
                    else
                        System.out.println(arrayList.get(lineNumber));
                        }


                    }

                }
    }
}
/////////////////////
public class Collection_task {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Comparator<String> stringLengthComparator = new StringLengthSort();
        Unique uniqueWord = new Unique();
        UniqueCounter uniqueCounter = new UniqueCounter();
        Sorting sorting = new Sorting();
        CounterDuplication сounterDuplication = new CounterDuplication();
        ConverselyPrint converselyPrint = new ConverselyPrint();
        OutputNumberLine outputNumberLine = new OutputNumberLine();

        ReadFile readFile = new ReadFile();
        arrayList = readFile.ReadF();
        System.out.println("Вывести на экран прочитанный файл");
        System.out.println(arrayList);
        System.out.println("Отбор уникальных слов");
        System.out.println(uniqueWord.Unique_word(arrayList));
        System.out.println("Количество уникальных слов");
        System.out.println(uniqueCounter.Cnt(arrayList));
        System.out.println("Сортировка по длине");
        System.out.println(sorting.Lenght(arrayList));
        System.out.println("Сортировка по алфавиту");
        System.out.println(sorting.Alphabet(arrayList));
        System.out.println("Подсчет повторяющихся слов");
        System.out.println(сounterDuplication.Cnt(arrayList));
        System.out.println("Вывод на экран всех строк в обратном порядке");
        System.out.println(converselyPrint.Conversely(arrayList));
        System.out.println("Вывод на экран по номеру строки");
        outputNumberLine.NumberLine(arrayList);


//////////////////////////////////////////////////////////////////////
//        /*Подсчет уникальных слов и дальнейшее сохранение в ArrayList*/
//        Set<String> uniqueSet = new HashSet<String>(arrayList);
//        ArrayList<String> UniqueWords = new ArrayList<>(uniqueSet);//Конвертация из Set в ArrayList
//        System.out.println(uniqueSet.size());//Подсчет уникальных слов
//        //System.out.println(uniqueSet);//Уникальные слова
//        System.out.println("777777777777\n" + UniqueWords + "\n777777777777\n");//Уникальные слова

////////////////////////////////////////////////////////////////
//        /*Сортировка по длине*/
//        Collections.sort(arrayList, stringLengthComparator); // применяем сортировку по длине
//        System.out.println(arrayList);
//////////////////////////////////////////////////////////////////////////////
//        /*Сортировка по алфавиту*/
//        Collections.sort(arrayList); // применяем сортировку по алфавиту
//        System.out.println(arrayList);
/////////////////////////////////////////////////////////////////////////
//        /*Подсчет повторений*/
//        System.out.println("1111");
//        ArrayList<String> buf1 = new ArrayList<>();
//        ArrayList<String> buf2 = new ArrayList<>();
//        ArrayList<String> numberMatches = new ArrayList<>();
//
//        for (int i = 0; uniqueSet.size() > i; i++) {
//            buf2.clear();
//            buf2.add(0, UniqueWords.get(i));
//            numberMatches.addAll(buf2);
//            buf1.addAll(arrayList);
//            buf1.retainAll(buf2);
//            numberMatches.add(Integer.toString(buf1.size()));
//        }
//        System.out.println(numberMatches);

////////////////////////////////////////////////////////////////////////////////////
//        //Вывод на экран всех строк в обратном порядке
//        ReadFileLineByLine readFileLineByLine = new ReadFileLineByLine();
//        arrayList = readFileLineByLine.ReadF_L_B_L();
//        int lenght2 = arrayList.size()-1;
//        for(int i = lenght2;i >= 0 ;i--){
//            System.out.println(arrayList.get(i));
//        }


////////////////////////////////////////////////////////////////////////////////////
//        //Вывод на экран по номеру строки
//        //ReadFileLineByLine readFileLineByLine = new ReadFileLineByLine();
//        arrayList = readFileLineByLine.ReadF_L_B_L();
//        System.out.println(arrayList);
//        System.out.println("Задайте номер строки для вывода строки на экран или любой символ для завершения просмотра строк\n");
//        Scanner console = new Scanner(System.in);
//        int lineNumber = 0;
//        int completionFlag = 0;
//        int lenght = arrayList.size()-1;
//        while (completionFlag == 0) {
//            System.out.println("Введите номер строки в пределах от  0 до " + lenght + ":  ");
//            String a = console.nextLine();
//            try {
//               lineNumber = Integer.parseInt(a);
//
//            } catch (NumberFormatException e) {
//                completionFlag = 1;
//                System.out.println("Выход");
//            }finally {
//                if((completionFlag == 0)) {
//                    if(lineNumber > lenght)
//                        System.out.println("Указанна не существующая строка");
//                        else
//                        System.out.println(arrayList.get(lineNumber));
//                }
//
//
//            }
//
//        }

    }
}
