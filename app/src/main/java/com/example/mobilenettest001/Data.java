package com.example.mobilenettest001;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private final Map<String, Object> Map;

    public Map<String, Object> getMap() {
        return Map;
    }

    public Data(int imageView, String theme, String content) {
        Map<String, Object> map = new HashMap<>();
        map.put("image",imageView);
        map.put("theme",theme);
        map.put("content",content);
        Map = map;
    }

    public Data(Map<String, Object> map) {
//        map.put("image",map.get("image"));
//        map.put("theme",map.get("theme"));
//        map.put("content",map.get("content"));
        Map = map;
    }
}
