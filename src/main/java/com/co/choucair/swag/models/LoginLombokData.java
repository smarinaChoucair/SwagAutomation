package com.co.choucair.swag.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class LoginLombokData {

    private String user;
    private String pass;

    public static List<LoginLombokData> setLoginData(DataTable table){
        List<LoginLombokData> data =new ArrayList<>();
        List<Map<String, String>> mapInfo = table.asMaps();
        for (Map<String, String> map : mapInfo){
            data.add(new ObjectMapper().convertValue(map, LoginLombokData.class));
        }

        return data;
    }
}
