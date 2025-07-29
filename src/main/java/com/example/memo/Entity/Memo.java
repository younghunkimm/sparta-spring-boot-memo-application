package com.example.memo.Entity;

import com.example.memo.dto.MemoRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memo {

    private Long id;
    private String title;
    private String contents;

    public void update(MemoRequestDto memo) {

        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }

}
