import java.util.HashMap;

public class ChatBotEngine {

    private HashMap<String, String> responses;

    public ChatBotEngine() {

        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there!");
        responses.put("how are you", "I'm doing great!");
        responses.put("java", "Java is an object-oriented programming language.");
        responses.put("ai", "Artificial Intelligence enables machines to mimic human intelligence.");
        responses.put("bye", "Goodbye! Have a nice day.");
        responses.put("college", "A college is an educational institution.");
        responses.put("project", "Projects help students apply practical knowledge.");
    }

    public String getResponse(String input) {

    input = input.toLowerCase().trim();

    if(input.contains("name"))
        return "My name is AI ChatBot.";

    if(input.contains("time"))
        return java.time.LocalTime.now().toString();

    if(input.contains("date"))
        return java.time.LocalDate.now().toString();

    if(input.contains("java"))
        return "Java is a high-level programming language.";

    if(input.contains("college"))
        return "College helps students gain knowledge.";

    if(input.contains("project"))
        return "Projects improve practical skills.";

    return "I don't understand. Please ask another question.";
}
}
