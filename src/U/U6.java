package U;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class U6 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Nurs\\Documents\\EPAM\\JavaBasicCodes\\src\\sometext.text");
        parseCvFile(path);
    }

    private static ArrayList<RowDto> parseCvFile(Path path) throws IOException {
        final List<String> lines = Files.readAllLines(path);
        final ArrayList<RowDto> dtos = new ArrayList<>();
        for (String line : lines) {
            final String[] split = line.split(",");
            final RowDto dto = new RowDto(
                    Integer.parseInt(split[0]),
                    split[1],
                    Double.parseDouble(split[2]),
                    Boolean.parseBoolean(split[3])
            );
            dtos.add(dto);
        }
        return dtos;
    }

    static class RowDto {
        int intValues;
        String StringValues;
        double DoubleValues;
        boolean aBoolean;

        public RowDto(int intValues, String stringValues, double doubleValues, boolean aBoolean) {
            this.intValues = intValues;
            StringValues = stringValues;
            DoubleValues = doubleValues;
            this.aBoolean = aBoolean;
            System.out.println(intValues + " " + stringValues + " " + doubleValues + " " + aBoolean);
        }
    }
}