import java.util.UUID;

public class UUIDGenerator {

    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static void main(String[] args) {
        String generatedUUID = generateUUID();
        System.out.println("Generated UUID: " + generatedUUID);
    }
}