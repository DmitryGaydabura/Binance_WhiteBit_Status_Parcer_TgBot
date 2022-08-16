package com.binance.api.client.app;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        long time = 3600000;
        if (update.hasMessage() && update.getMessage().hasText() && !update.getMessage().getText().equals("1")
                && !update.getMessage().getText().equals("2")
                && !update.getMessage().getText().equals("3")
                && !update.getMessage().getText().equals("4")
                && !update.getMessage().getText().equals("5")
                && !update.getMessage().getText().equals("6")
                && !update.getMessage().getText().equals("7")
                && !update.getMessage().getText().equals("8")
                && !update.getMessage().getText().equals("9")
                && !update.getMessage().getText().equals("10")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            try {
                message.setText(MarketDataEndpointsExample.startApp());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("1")) {

            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 1 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp1(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("2")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 2 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp2(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("3")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 3 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp3(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("4")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 4 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp4(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("5")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 5 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp5(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("6")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 6 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp6(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("7")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 7 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp7(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("8")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 8 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp8(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("9")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 9 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp9(time));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (update.hasMessage() && update.getMessage().hasText() && update.getMessage().getText().equals("10")) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());

            SendMessage start = new SendMessage();
            start.setChatId(update.getMessage().getChatId().toString());
            start.setText("I will send you a message if 10 will be true.");

            try {
                execute(start); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

            try {
                message.setText(MarketDataEndpointsExample.startApp10(time));

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }




    @Override
    public String getBotUsername() {
        // TODO
        return "";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "";
    }
}
