package efub.insta.controller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageForm {

    private int ChatRoomId;
    private String receiver;
    private String sender;
    private String message;
}