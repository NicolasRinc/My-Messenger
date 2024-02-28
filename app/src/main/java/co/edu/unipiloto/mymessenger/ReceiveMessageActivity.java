package co.edu.unipiloto.mymessenger;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import java.util.List;
import android.view.View;
public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        displayMessages();
    }

    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.messageInput);
        String messageText = messageView.getText().toString();
        Message message = new Message(messageText, "Propietario de carga");
        MessageStorage.getInstance().addMessage(message);
        displayMessages();
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
    }

    private void displayMessages() {
        LinearLayout layout = findViewById(R.id.messagesLayout);
        layout.removeAllViews();
        List<Message> msgs = MessageStorage.getInstance().getMessages();

        for (Message message : msgs) {
            TextView textView = new TextView(this);
            textView.setText(String.format("%s: %s", message.getUser(), message.getMsg()));
            layout.addView(textView);
        }
    }
}
