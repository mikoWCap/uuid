package com.uuid.uuid;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemDto implements Serializable {
    private String name;
}
