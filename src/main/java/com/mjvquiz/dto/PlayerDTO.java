package com.mjvquiz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private Long id;
    private String nickName;
    private Integer score;
    private String theme;
    private UserDTO userDTO;
    private QuestionDTO currentPlayerQuestionDTO;
    private Long currentQuestionID;
    private AlternativeDTO selectedQuestionAlternative;

    private Long selectedQuestionAlternativeID;

    private ArrayList<QuestionDTO> playerQuestionsDTOList;


    public PlayerDTO(String nickName, Integer score, String theme, UserDTO userDTO) {
        this.nickName = nickName;
        this.score = score;
        this.theme = theme;
        this.userDTO = userDTO;
    }

    @Override
    public String toString() {
        return "\n\nPlayerDTO - id: " + id +
                "\nNickName='" + nickName +
                "\nScore=" + score +
                "\nUserDTO=" + userDTO +
                "\nTheme=" + theme +
                "\nCurrent Question: " + currentPlayerQuestionDTO +
                "\nSelectedQuestionAlternative: " + selectedQuestionAlternative +
                "\ncurrentQuestionID: " + currentQuestionID +
                "\nselectedQuestionAlternativeID = " + selectedQuestionAlternativeID;
    }
}
