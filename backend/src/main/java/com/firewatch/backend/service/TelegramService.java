package com.firewatch.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class TelegramService {

    private final RestTemplate restTemplate;

    @Value("${TELEGRAM_BOT_TOKEN}")
    private String botToken;

    @Value("${TELEGRAM_CHANNEL_ID}")
    private String chatId;

    public TelegramService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String sendMessage(String text) {
        String url = "https://api.telegram.org/bot" + botToken + "/sendMessage";

        Map<String, Object> request = Map.of(
                "chat_id", chatId,
                "text", text,
                "parse_mode", "Markdown"
        );

        Map response = restTemplate.postForObject(url, request, Map.class);
        if (response != null && response.containsKey("result")) {
            Map result = (Map) response.get("result");
            // Telegram message ID, needed for edits
            return result.get("message_id") + "";
        }

        throw new RuntimeException("Error sending Telegram message.");
    }

    public void editMessage(Long messageId, String newText) {
        if (messageId == null) return;

        String url = "https://api.telegram.org/bot" + botToken + "/editMessageText";

        Map<String, Object> request = Map.of(
                "chat_id", chatId,
                "message_id", messageId,
                "text", newText,
                "parse_mode", "Markdown"
        );

        restTemplate.postForObject(url, request, Map.class);
    }
}
