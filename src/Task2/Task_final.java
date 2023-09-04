package Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task_final {
    public static void main(String[] args) {
        String str = "12.04.1991,375237756546456482342,m,Иванов Иван Иванович";
        String[] data = str.split(",");
        String[] dataCorrectPosition = new String[4];
        int requiredSize = 4;
        String name;
        String dateBirthday;
        String number;
        String gender;

        messageAboutSize(sizeCheck(data, requiredSize));
        if (sizeCheck(data, requiredSize) == 0) {
            try {
                name = getName(data);
                dateBirthday = getDate(data);
                number = getNumber(data);
                gender = getGender(data);

                dataCorrectPosition[0] = name;
                dataCorrectPosition[1] = dateBirthday;
                dataCorrectPosition[2] = number;
                dataCorrectPosition[3] = gender;

                try {
                    fileWriterAdd(dataCorrectPosition);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }

    }

    public static int sizeCheck(String[] data, int requiredSize) {
        int sizeArray = data.length;
        if (sizeArray == 0) {
            return 1;
        } else if (sizeArray < requiredSize) {
            return 2;
        } else if (sizeArray > requiredSize) {
            return 3;
        } else {
            return 0;
        }

    }

    public static void messageAboutSize(int errorCode) {
        switch (errorCode) {
            case 1:
                System.out.println("Данные не введены или введены без запятых");
                break;
            case 2:
                System.out.println("Данный меньше чем надо или некорректно введены");
                break;
            case 3:
                System.out.println("Данных больше чем надо или некорректно введены");
            default:
                System.out.println("Данные введены верно");
        }
    }

    public static String getName(String[] array) {
        String name;
        for (String i : array) {
            String[] iArray = i.split(" ");
            if (iArray.length == 3) {
                name = i;
                return name;
            }

        }
        throw new InvalidNameFormat();

    }

    public static String getDate(String[] array) {
        String date;
        for (String i : array) {
            String[] iArray = i.split("\\.");
            if (iArray.length == 3) {
                date = i;
                return date;
            }

        }
        throw new InvalidDateFormat();
    }

    public static String getNumber(String[] array) {
        String number;
        for (String i : array) {
            if (i.matches("[0-9]+")) {
                number = i;
                return number;
            }
        }
        throw new InvalidNumberFormat();
    }

    public static String getGender(String[] array) {
        String gender;
        for (String i : array) {
            if (i.matches("\\w") && i.equals("f") | i.equals("m")) {
                gender = i;
                return gender;
            }
        }
        throw new InvalidGenderFormat();

    }

    public static void fileWriterAdd(String[] array) throws IOException {
        String fileName = array[0];
        String[] array2 = fileName.split(" ");
        String surname = array2[0];
        String fileWay = "C:\\Users\\User\\ExceptionJava\\src\\Task2\\";

        File file = new File(fileWay + surname + ".txt");
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter
                    (fileWay + surname + ".txt", true)) {
                for (String i : array) {
                    writer.write(i);
                    writer.write("\n");
                }
            }

        } else {
            try (FileWriter writer = new FileWriter
                    (fileWay + surname + ".txt", true)) {
                for (String i : array) {
                    writer.write(i);
                    writer.write("\n");
                }
            }


        }
    }
}
