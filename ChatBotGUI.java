import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI extends JFrame {

    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    ChatBotEngine bot;

    public ChatBotGUI() {

        bot = new ChatBotEngine();

        setTitle("AI ChatBot");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        inputField = new JTextField();

        sendButton = new JButton("Send");

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                sendMessage();
            }
        });

        inputField.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                sendMessage();
            }
        });

        setVisible(true);
    }

    private void sendMessage() {

        String userText = inputField.getText();

        if(userText.trim().isEmpty())
            return;

        chatArea.append("You: "
                + userText + "\n");

        String response =
                bot.getResponse(userText);

        chatArea.append("Bot: "
                + response + "\n\n");

        inputField.setText("");
    }

    public static void main(String[] args) {

        new ChatBotGUI();
    }
}