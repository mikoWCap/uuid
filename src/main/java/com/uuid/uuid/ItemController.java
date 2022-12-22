package com.uuid.uuid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/items")
    List<Item> getItems(){
        return itemRepository.findAll();
    }

    @GetMapping("/items/{uuid}")
    Item getItem(@PathVariable UUID uuid){
        System.out.println(uuid);
        return itemRepository.findByUuid(uuid).get();
    }

    @PostMapping("/items")
    Item postItem(@RequestBody ItemDto dto){
        Item i = itemRepository.save(new Item(dto.getName()));

        return i;
    }
}
