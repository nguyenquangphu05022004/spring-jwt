package com.example.news.api;


import io.jsonwebtoken.Claims;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
interface hi extends Map<String, Object> {
    String getName(String name);
    Date date();
}


public class test {
    public static void main(String[] args) {
        Function<String, Date> function = new Function<String, Date>() {
            @Override
            public Date apply(String string) {
                try {
                    return new SimpleDateFormat("dd-MM-yyyy").parse(string);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        Date date = dm(function, "05-02-2004");
        System.out.println(date.toString());
    }

    public static <T> T  dm(Function<String, T> function, String data) {
        return function.apply(data);
    }


}
