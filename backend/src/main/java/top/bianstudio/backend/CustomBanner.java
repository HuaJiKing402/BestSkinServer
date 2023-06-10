package top.bianstudio.backend;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class CustomBanner implements Banner {
    private static final String[] BANNER = { "",
            " /$$$$$$$                        /$$      /$$$$$$  /$$       /$$          ",
            "| $$__  $$                      | $$     /$$__  $$| $$      |__/          ",
            "| $$  \\ $$  /$$$$$$   /$$$$$$$ /$$$$$$  | $$  \\__/| $$   /$$ /$$ /$$$$$$$ ",
            "| $$$$$$$  /$$__  $$ /$$_____/|_  $$_/  |  $$$$$$ | $$  /$$/| $$| $$__  $$",
            "| $$__  $$| $$$$$$$$|  $$$$$$   | $$     \\____  $$| $$$$$$/ | $$| $$  \\ $$",
            "| $$  \\ $$| $$_____/ \\____  $$  | $$ /$$ /$$  \\ $$| $$_  $$ | $$| $$  | $$",
            "| $$$$$$$/|  $$$$$$$ /$$$$$$$/  |  $$$$/|  $$$$$$/| $$ \\  $$| $$| $$  | $$",
            "|_______/  \\_______/|_______/    \\___/   \\______/ |__/  \\__/|__/|__/  |__/"};

    private static final String SPRING_BOOT = " :: BestSkin for Spring Boot :: ";
    private static final int STRAP_LINE_SIZE = 42;


    @Override
    public void printBanner(Environment environment, Class<?> sourceClass,
                            PrintStream printStream) {
        for (String line : BANNER) {
            printStream.println(line);
        }
        String version = SpringBootVersion.getVersion();

        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("git.properties"));
            version = (version != null & properties.get("git.build.version") != null & properties.get("git.commit.id.abbrev") != null) ? " (v"+properties.get("git.build.version")+"-"+properties.get("git.commit.id.abbrev")+" for v"+version+")" : "";
            StringBuilder padding = new StringBuilder();
            while (padding.length() < STRAP_LINE_SIZE
                    - (version.length() + SPRING_BOOT.length())) {
                padding.append(" ");
            }

            printStream.println(AnsiOutput.toString(AnsiColor.GREEN, SPRING_BOOT,
                    AnsiColor.BRIGHT_YELLOW, padding.toString(), AnsiStyle.FAINT, version));
            printStream.println();
        } catch (IOException e) {
            printStream.println(e.getMessage());
        }
    }
}
